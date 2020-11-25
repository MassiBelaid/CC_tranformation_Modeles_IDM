package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EDataType.Internal.ConversionDelegate.Factory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;
import org.eclipse.uml2.uml.ActivityFinalNode;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ControlFlow;
import org.eclipse.uml2.uml.InitialNode;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.OpaqueAction;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.impl.InitialNodeImpl;

import process.Activity;
import process.End;
import process.Init;
import process.Process;
import process.ProcessPackage;
import process.PseudoState;

public class Main {

	public static void main(String[] args) {
		Resource ressource = chargerModele("instances/monProcessus.xmi",ProcessPackage.eINSTANCE);
		if (ressource == null) System.err.println(" Erreur de chargement du modèle");
		
		Process monProcess = (Process) ressource.getContents().get(0);
		System.out.println(monProcess);
		
		org.eclipse.uml2.uml.Model model = UMLFactory.eINSTANCE.createModel();	
		
		model.setName("process model");
		
		List<Activity> listActivitiesInProcess = new ArrayList<Activity>();
		listActivitiesInProcess = monProcess.getActivities();
		
		PseudoState etatInitial = monProcess.getBegining();
		PseudoState etatFinal = monProcess.getEnd();
		
		
		org.eclipse.uml2.uml.Activity myActivity = UMLFactory.eINSTANCE.createActivity();
		myActivity.setPackage(model);
		
		
		Map<String , ActivityNode> listAct = new HashMap<String , ActivityNode>();
		createActivityNode(listActivitiesInProcess.get(0), monProcess, myActivity,null);
		
		System.out.println(myActivity.getNodes().size());
		
		
				
		
		sauverModele("instances/sortie.uml", myActivity.getModel());
		
		

	}
	
	
	
	private static void createActivityNode(Activity act, Process monProcess, org.eclipse.uml2.uml.Activity myActivity, ActivityNode actNode) {
		
		ActivityNode newNode;
		
		if(monProcess.getBegining().getReferencedActivity() == act) {
			newNode = UMLFactory.eINSTANCE.createInitialNode();
			
		}else if (monProcess.getEnd().getReferencedActivity() == act) {
			newNode  = UMLFactory.eINSTANCE.createActivityFinalNode();
		}else {
			newNode  = UMLFactory.eINSTANCE.createOpaqueAction();
		}
		newNode.setName(act.getNom());
		myActivity.getNodes().add(newNode);
		myActivity.getOwnedNodes().add(newNode);
		
		
		if(act.getPrevious() != null) {
			ControlFlow controleFlow = UMLFactory.eINSTANCE.createControlFlow();
			controleFlow.setTarget(newNode);
			controleFlow.setSource(actNode);
			myActivity.getEdges().add(controleFlow);
			
		}
		
		if(act.getNext() != null) {
			ControlFlow controlFlow = UMLFactory.eINSTANCE.createControlFlow();
			createActivityNode(act.getNext(), monProcess,  myActivity,newNode);
		}
		
	}
	
	
	
	
	
	public static void sauverModele(String uri, EObject root) {
		   Resource resource = null;
		   try {
		      URI uriUri = URI.createURI(uri);
		      Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("uml", new XMIResourceFactoryImpl());
		      resource = (new ResourceSetImpl()).createResource(uriUri);
		      resource.getContents().add(root);
		      resource.save(null);
		   } catch (Exception e) {
		      System.err.println("ERREUR sauvegarde du modèle : "+e);
		      e.printStackTrace();
		   }
		}
	
	public static Resource chargerModele(String uri, EPackage pack) {
		   Resource resource = null;
		   try {
		      URI uriUri = URI.createURI(uri);
		      Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		      resource = (new ResourceSetImpl()).createResource(uriUri);
		      XMLResource.XMLMap xmlMap = new XMLMapImpl();
		      xmlMap.setNoNamespacePackage(pack);
		      java.util.Map options = new java.util.HashMap();
		      options.put(XMLResource.OPTION_XML_MAP, xmlMap);
		      resource.load(options);
		   }
		   catch(Exception e) {
		      System.err.println("ERREUR chargement du modèle : "+e);
		      e.printStackTrace();
		   }
		   return resource;
		}

}
