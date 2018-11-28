/**
 * Clase Nodo. Contiene métodos para su gestión.
 * @author Jorge E. Giraldo Plaza - jegiraldo@elpoli.edu.co
 * @version: 1.0 - 2014/07/26
 */

package pqtList;

public class Node {
	
	int data;
	Node link;
	/**
	 * Metodo constructor.
	 * @param d Dato a ingresar.
	 * 
	 */
	public Node(int d) {
		data=d;
		link=null;
	}//head constructor
	
	/**
	 * Metodo constructor.
	 * @param d Dato a ingresar.
	 * @param l Nodo enlace.
	 * 
	 */
	public Node(int d, Node l) {
		data=d;
		link=l;
	}//links contructor
	
	
}//Node


