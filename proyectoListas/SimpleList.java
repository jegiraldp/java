/**
 * Clase que gestiona la vista cliente
 * @author Jorge E. Giraldo Plaza - jegiraldo@elpoli.edu.co
 * @version: 1.0 - 2014/07/26
 */

package pqtList;

import java.io.*;

public class SimpleList {
	//
	public static InputStreamReader isr;
	public static BufferedReader br;
	//
	
	/**
	 * Método que imprime el menú principal
	 * 
	 */
	public static void principalMenu(){
		System.out.println("\n\n-- //// Simple List Program //// --");
		System.out.println("1. Create List");
		System.out.println("2. Show List");
		System.out.println("3. Search Node");
		System.out.println("4. Insert Node");
		System.out.println("5. Delete Node");
		System.out.println("6. Exit");
		System.out.print("\n-> ");
	}
	//Principal Menu
	
	//search Menu
	
	/**
	 * Método que imprime el menú de opción Buscar
	 * 
	 */
	public static void searchMenu(){
		System.out.println("1. Insert node at head");
		System.out.println("2. Insert Node at the end");
		System.out.println("3. Insert Node between");		
		System.out.println("6. Back Home");
		System.out.print("\n-> ");
	}//searchMenu
	
	//main
	/**
	 * Método principal
	 * @param arg Argumento por defecto. Solo uso por consola
	 * 
	 */
	public static void main(String[] arg) {
		
		isr = new InputStreamReader(System.in);
		br = new BufferedReader(isr);
		String opt; //opcion
		
		while(true){
			principalMenu();
		try{
		opt=br.readLine();
		
		switch (opt){
		//Create Case
		case "1": 
			List.createList();
			break;
		
		//Show List Case
		case "2": 
			if(List.l1!=null){
			List.printList();
			}else{
				printMsg("Error: Create List !!");
			}
			break;
		
		//Search Case
		case "3": 
			if(List.l1!=null){
				System.out.print("Value to find ->");
				int value=Integer.parseInt(br.readLine());
				List.searchNode(value);
					
			}else{
				printMsg("Error: Create List !!");
			}
			break;

		//Insert Case
		case "4": 
			if(List.l1!=null){
					searchMenu();
					opt=br.readLine();
					System.out.print("Value to insert ->");
					int value=Integer.parseInt(br.readLine());
					
					
					switch (opt){
					//Insert at head
					case "1": 
						List.insertNodeHead(value);
						printMsg("New node at head: OK");
						break;
					
					//Insert at the end
					case "2": 
						List.insertNodeEnd(value);
						printMsg("New node at end: OK");
						break;
						
					//Insert between
					case "3": 
						printMsg("Complete codification");
					break;
					
					//Back
					case "6": 
					principalMenu();	
					break;
					
					default: 
						searchMenu();
					break;
					
					}//switch
						
				
			}else{
				printMsg("Error: Create List !!");
			}
			break;	
			
			//Delete case
		case "5": 
			if(List.l1!=null){
				printMsg("Complete codification");	
			}else{
				printMsg("Error: Create List !!");
			}
			break;
						
		//Caso Salir
		case "6": 
			printMsg(" Game Over ");
			System.exit(0);
	    	break;	
			
		}//switch
		
		}catch (IOException ioe){
			System.out.println("Error: Data I/O");
		}//catch
		
		}//while
		
		}//main
	
		//Principal Menu
	
	
	//print msg
	/**
	 * Método que imprime mensajes con un formato especial
	 * @param msg Mensaje a imprimir
	 * 
	 */
	public static void printMsg(String msg){
			System.out.println("\n--------------------");
			System.out.print(msg);
			System.out.println("\n--------------------");
		}//print msg
		
		
}//class
