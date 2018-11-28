/**
 * Clase Lista. Contiene métodos para su gestión.
 * @author Jorge E. Giraldo Plaza - jegiraldo@elpoli.edu.co
 * @version: 1.0 - 2014/07/26
 */

package pqtList;

import java.io.*;

public class List {
	
	static Node head, auxHead, theNode;
	static List l1;

	//constructor
	/**
	 * Método constructor
	 * 
	 */
	public List() {
		head = null;
	}//constructor
	
	//createList
	/**
	 * Método para crear lista
	 * @throws (@NumberFormatException)
	 * @throws (@IOException)
	 * 
	 */
	public static void createList() throws NumberFormatException, IOException{

		l1 = new List();
		
		int data;
		
		System.out.print("\nNumber of nodes? -> ");
		int NodeNum = Integer.parseInt(SimpleList.br.readLine());
		
		for (int i = 0; i < NodeNum; i++) {
			System.out.print("\nValue of node "+(i+1)+" -> ");
			data = Integer.parseInt(SimpleList.br.readLine());
			head= new Node(data,head);
		}//for
		
		SimpleList.printMsg("Simple List Created");
	}//createList
	
	//print List
	/**
	 * Método para imprimir lista
	 * 
	 */
	public static void printList(){
    	auxHead=head;
    	System.out.println("\n--------------------");
    	
    	while(head!=null){
    		if(head.link==null){
    		System.out.print(head.data);
    		}else{
    			System.out.print(head.data+"-");	
    		}
			head = head.link;
    	}//while
    	head=auxHead;
    	System.out.println("\n--------------------");
    }//printList

		
	//search Node
    /**
	 * Método para buscar un nodo en la lista
	 * @param theValue Valor del nodo a buscar
	 * 
	 */
	public static void searchNode (int theValue){
		int nodePosition=1;
		boolean sw=false;
		int posicion;
		
		auxHead = head;
		
		while(head!=null){
			if(head.data==theValue){
				System.out.println("Match Found in node: "+nodePosition);
				sw=true;
			}
			
			head= head.link;
			nodePosition++;
		}
		
		head=auxHead;		
		
		if(sw==false) SimpleList.printMsg("No match to: "+theValue);
		
	}//seachNode

	//insert Node at head
	/**
	 * Método para insertar nodo en la cabeza de la lista
	 * @param value Valor del nodo a insertar
	 * 
	 */
	public static void insertNodeHead(int value){
		head = new Node(value,head);
		printList();
	}//insert Node at head
    	
	//insert Node at the end
	/**
	 * Método para insertar nodo al final de la lista
	 * @param value Valor del nodo a insertar
	 * 
	 */
	public static void insertNodeEnd(int value){
			auxHead=head;
			while (head.link!=null)	{
				head=head.link;			
			}
			head.link= new Node(value);
			head=auxHead;
			printList();
		}//insert Node at the end
		
	//insert between
	/**
	 * Método para insertar nodo en la parte final de la lista
	 * @param value Valor del nodo a insertar
	 * @param value Valor del nodo ubicado en posición a la izquierda
	 * @param value Valor del nodo ubicado en posición a la derecha
	 * 
	 */
	public static void insertBetween(int value, int leftValue, int rigthValue){
		
	}//insert between
	
}//class List
