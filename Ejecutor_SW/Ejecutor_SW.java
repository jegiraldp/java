package ejecutor.interfaces;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import ejecutor.agentes.*;
import java.util.Vector;
import jade.gui.GuiAgent;

/*
 *Este es el contenedor principal de la interfaz del sistema ejecutor de Servicio Web, aqui esta contenida la ventana
 *de Configuracion y la ventana de Resultados
 *
 *@author ALBER ANDRES LEDESMA CASTILLO
 */

public class Ejecutor_SW extends JFrame {
	
	//Referencia al agente que atendera los eventos de usuario
	private Usuario myusuario;
	
	//Referencia al panel de configuracion del servicio
	private Configuracion configuracion;
	
	//Referencia al panel de resultados
	private Resultado resultado;
	
	//Referencia al contenedor de los panels del sistema
	JTabbedPane contenedor; 
	
	/**
	 *Constructor de la interfaz, aqui se añaden los otros dos contenedores y se selecciona el de configuracion como
	 *primera vista del sistema
	 *@param guiAgent referencia al agente Usuario que recibira los eventos de interfaz
	 */
	 
	public Ejecutor_SW(Usuario guiAgent) {
		
		//Se asigna la referencia del agente al agente propio
		myusuario = guiAgent;
		
		//Se crea la instancia del panel de configuracion del servicio
		configuracion = new Configuracion(410,430,myusuario,this);
		
		//Se crea la instancia del panel de resultado
		resultado = new Resultado(410,430,this);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
		
		//Se crea la estructura de Tabs que soportara los paneles del sistema
		String nombres[] = {"Configurar el Servicio a Ejecutar","Resultados de la Ejecucion"};
		contenedor = new JTabbedPane(); 
		contenedor.addTab(nombres[0],null,configuracion);
		contenedor.addTab(nombres[1],null,resultado);
		
		//Se añade el panel de configuracion
		getContentPane().add(contenedor);
	
	}
	
	/**
	 *Constructor por defecto
	 */
	
	public Ejecutor_SW(){
		//Se crea la instancia del panel de configuracion del servicio
		configuracion = new Configuracion(410,430,myusuario,this);
		
		//Se crea la instancia del panel de resultado
		resultado = new Resultado(410,430,this);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
		
		//Se crea la estructura de Tabs que soportara los paneles del sistema
		String nombres[] = {"Configurar el Servicio a Ejecutar","Resultados de la Ejecucion"};
		contenedor = new JTabbedPane(); 
		contenedor.addTab(nombres[0],null,configuracion);
		contenedor.addTab(nombres[1],null,resultado);
		
		//Se añade el panel de configuracion
		getContentPane().add(contenedor);
	
	}
	
	/**
	 *Este metodo retorna la cadena con la direccion del Servicio Web
	 *@return cadena con la direccion del servicio web
	 */
	
	public String getServicio(){
		return configuracion.getServicio();
	}
	
	/**
	 *Este metodo permite retornar el valor del campo de ontologia asociado a un Servicio Web, esto es para cuando un
	 *servicio tiene las entradas/salidas formateadas con alguna ontologia. Esta entrada es opcional
	 *@return cadena con la direccion de la ontologia asociada al Servicio Web, cadena vacia en caso de que el usuario
	 *no haya ingresado la opcion
	 */
	
	public String getOntologia(){
		return configuracion.getOntologia();
	}
	
	/**
	 *Este metodo permite recuperar las entradas que el usuario haya ingresado en la interfaz. Se debe de recordar que
	 *estas entradas deben de tener el formato Entrada:Valor para que sean validas
	 *@return vector con las entradas dadas por el usuario
	 */
	
	public Vector getEntradas(){
		return configuracion.getEntradas();
	}
	
	/**
	 *Este metodo permite seleccionar cualquiera de las dos vistas que tiene la interfaz de usuario
	 *@param indice Numero de pestaña a seleccionar
	 */
	
	public void setVentana(int indice){
		contenedor.setSelectedIndex(indice);
	}
	
	/**
	 *Este metodo permite mostrar los resultados en el campo de texto de la ventana de resultados
	 *@param result Resultado a mostrar en el campo de texto
	 */
	
	public void setResultado(String result){
		resultado.setResultado(result);
	}
	
	/**
	 *Este metodo permite que se muestre en la etiqueta del panel de resultados el valor de la direccion del servicio 
	 *Web
	 *@param str cadena con el valor de la direccion del Servicio Web
	 */
	
	public void setResultadoPres(String str){
		resultado.setPresentacion(str);
	}
	
	public static void main(String args[]) {
		System.out.println("Starting Ejecutor_SW...");
		Ejecutor_SW mainFrame = new Ejecutor_SW();
		mainFrame.setSize(410,440);
		mainFrame.setTitle("Ejecutor Servicios Web Especificados en OWL");
		mainFrame.setVisible(true);
	}
}
