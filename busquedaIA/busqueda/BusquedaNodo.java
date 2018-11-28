package busqueda;

import java.util.*;
import javax.swing.*;

public class BusquedaNodo extends Object{
	
	protected String label;
	protected String state;
	protected Object oper;
	protected Vector links;
	protected int depth;
	protected boolean expanded;
	protected boolean tested;
	protected float cost=0;
	private static JTextArea traceTextArea;
	public static final int FRONT = 0;
	public static final int BACK = 1;
	public static final int INSERT = 2;
	
	
	BusquedaNodo(String label, Object state){
		label=label;
		state = state;
		depth = 0;
		links = new Vector();
		oper=null;
		expanded = false;
		tested = false;
		}
	
	public void addLink(BusquedaNodo node){
		links.addElement(node);
	}
	
	public void addLinks(BusquedaNodo[] node){
		for (int i=0; i<node.length; i++){
			links.addElement(node [i]);
		}
	}
	
	public boolean leaf(){
		return (links.size()==0);
		}
	
	public void setDepth(int depth){
		depth =depth;
		}
	
	public void setOperator(Object oper){
		oper =oper;
		}
	
	public void setExpanded(boolean state){
		expanded =state;
		}
	
	public boolean isExpanded(){
		return expanded;
		}
	
	public void setTested(){
		tested=true;
		}
	
	public void setTested(boolean state){
		tested=state;
		}
	public boolean isTested(){
		return tested;
		}
	static public void setDisplay(JTextArea textArea){
		traceTextArea =textArea;
		}
	public Object getState(){
		return state;
		}
	public void reset(){
		depth=0;
		expanded=false;
		tested=false;
		}
	public void trace(){
		String indent = new String();
		for(int i=0; i<depth;i++ ){
			indent+="  ";
		}
		traceTextArea.append(indent + "Buscando " + depth + ": "+label
				+" con estado = "+state+"\n");
		}
	
	public void expand(Vector queue, int position){
	
		setExpanded(true);
		for(int j=0; j<links.size();j++ ){
			BusquedaNodo nextNode = (BusquedaNodo) links.elementAt(j);
			
			if(!nextNode.tested){
				nextNode.setTested(true);
				nextNode.setDepth(depth+1);
				switch(position){
				case FRONT:
					queue.insertElementAt(nextNode, 0);
					break;
				case BACK:
					queue.addElement(nextNode);
					break;
				case INSERT:
					boolean inserted = false;
					float nextCost = nextNode.cost;
					for(int k=0; k<queue.size();k++ ){
						if(nextCost<((BusquedaNodo)queue.elementAt(k)).cost){
						queue.insertElementAt(nextNode, k);
						break;
						}
					}
					if(!inserted){
					queue.addElement(nextNode);
					}
					break;
				}
			}
		}
		
	}	
	
	
	public static void main(String[] args) {
		System.out.print("HOLA PARCERO");

	}

}
