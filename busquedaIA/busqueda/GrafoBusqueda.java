/*package busqueda;

import java.util.*;
import javax.swing.event.*;
import java.awt.*;


class GrafoBusqueda extends Object{
	
	String name;
	Hashtable graph = new Hashtable();
	
	public GrafoBusqueda (String name){
		this.name=name;
	}
	
	public Hashtable getGraph(){
		return graph;
	}
	
	public BusquedaNodo getNode(String nodeName){
		return (BusquedaNodo) graph.get(nodeName);
	}
	
	void reset(){
	Enumeration enume = graph.elements();
		while (enume.hasMoreElements()){
			BusquedaNodo nextNode = (BusquedaNodo) enume.nextElement();
		}
	}
	
	void put (BusquedaNodo node){
	graph.put(node.label,node);
	}
	
	public BusquedaNodo depthFirstSearch(BusquedaNodo initialNode, Object goalState){
		Vector queue = new Vector();
		queue.addElement(initialNode);
		initialNode.setTested(true);
		while(queue.size()>0){
			BusquedaNodo testNode = (BusquedaNodo) queue.firstElement();
			queue.removeElementAt(0);
			testNode.trace();
			if(testNode.getState().equals(goalState)){
			return testNode;
			}
			if(!testNode.isExpanded()){
			testNode.expand(queue,BusquedaNodo.FRONT);
			}
		}
		return null;
	}
	
	public BusquedaNodo breathFirstSearch(BusquedaNodo initialNode, Object goalState){
	
		Vector queue = new Vector();
		queue.addElement(initialNode);
		initialNode.setTested(true);
		while(queue.size()>0){
			BusquedaNodo testNode = (BusquedaNodo)queue.firstElement();
			queue.removeElementAt(0);
			testNode.trace();
			if(testNode.getState().equals(goalState)){
			return testNode;
			}
			if(!testNode.isExpanded()){
			testNode.expand(queue, BusquedaNodo.BACK);
			}
		}
		return null;
	}

	public static GrafoBusqueda buildTestGraph(){
		GrafoBusqueda graph = new GrafoBusqueda("test");
		BusquedaNodo roch = new BusquedaNodo("Rochester", "Rochester");
		
		graph.put(roch);
		BusquedaNodo sfalls = new BusquedaNodo("Sioux Falls","Sioux Falls");
		
		graph.put(sfalls);
		BusquedaNodo mpls = new BusquedaNodo("Minneapolis","Minneapolis");
		
		graph.put(mpls);
		
		roch.addLinks(new BusquedaNodo[]{mpls,sfalls});
		
		
		roch.cost=0;
		sfalls.cost=232;
		
		return graph;		
	}
	
	void StartMenuItem_actionPerformed(ActionEvent e){
		runnit = new Thread(this);
		runnit.start();
		}
	
	public void run(){
		int method=0;
		BusquedaNodo answer = null;
		BusquedaNodo startNode;
		String start = (String)startComboBox.getSelectedItem();
		startNode = graph.getNode(start);
		String goal = (String) goalCombox.getSelectedItem();
		graph.reset();
		
		switch(searchAlgorithm){
		
		case Primero_Profundidad: {
			traceTextArea.append("\n\nAlgoritmo Primero en profundidad para "+goal+"\n\n");
			answer = graph.depthFirstSearch(startNode,goal);
			break;
		}
		
		case Primero_Anchura: {
			traceTextArea.append("\n\nAlgoritmo Primero en Anchura para "+goal+"\n\n");
			answer = graph.breathFirstSearch(startNode,goal);
			break;
		}
		
		}//switch
		
	}

}
	
	
*/