package ejecutor.interfaces;

import javax .swing.*;
import java.awt.Font;
import javax.swing.text.*; 
import java.awt.event.*;
import javax.swing.text.DefaultStyledDocument;

/**
 *Esta clase es la encargada de contener los elementos que se muestran en la vista de resultados de ejecucion del 
 *servicio Web
 *
 *@author ALBER ANDRES LEDESMA CASTILLO 
 */

class Resultado extends JPanel{

	//Direccion del servicio web dado por el usuario
	private String servicio;
	
	//Se crea el documento sobre el que se escribiran los resultados de la ejecucion
	DefaultStyledDocument doc; 
	
	//Campo de texto que contiene los resultados de ejecucion del servicio Web
	JTextPane camporesultado;
	
	//Cadena que se muestra al usuario
	String cadena = new String("El servicio ");
	
	//Referencia a la interfaz de usuario del sistema
	Ejecutor_SW myinterfaz;
	
	//Etiqueta de presentacion
	JLabel pres; 
	
	/**
	 *Constructor del panel de resultados
	 *@param ancho Ancho de la ventana
	 *@param alto Alto de la ventana
	 *@param inter Referencia al panel contenedor
	 */
	
	public Resultado(int ancho, int alto,Ejecutor_SW inter){
		//Se asigna la referencia
		myinterfaz = inter;
			
		//Se configura el panel
		setSize(ancho,alto);
		setVisible(true);
		
		//La organizacion de los componentes se hace de manera manual
		setLayout(null);
		
		//Se crea la fuente estilizada para los label
		Font font = new Font("Serif", Font.BOLD|Font.ITALIC,14);
		
		//**Campo de presentacion
		
		pres = new JLabel(cadena + "xxxxxxxxxxx");
		JLabel presmas = new JLabel("arroja los siguientes resultados");
		
		//se asocia la fuente con el label de presentacion
		pres.setFont(font);
		presmas.setFont(font);
		
		//Se añaden los componentes
		pres.setBounds(10,18,380,20);
		add(pres);
		presmas.setBounds(10,38,380,25);
		add(presmas);
		
		//Se crea la fuente generica para la presentacion de resultados
		MutableAttributeSet attr = new SimpleAttributeSet();
		StyleConstants.setFontFamily(attr,"Serif");
		StyleConstants.setFontSize(attr,14);
		
		//**Campo de resultados
		
		//Se crea el documento
		doc = new DefaultStyledDocument();
		
		//Se crea el campo de texto para introducir la direccion del servicio
		camporesultado = new JTextPane(doc);
		
		camporesultado.setCharacterAttributes(attr,false);
		
		//se añaden los componentes
		JScrollPane jsp = new JScrollPane(camporesultado);
		jsp.setBounds(10,80,360,220);
		add(jsp);
		
		//**Campo para ejecutar un nuevo servicio
		JButton ejecutar = new JButton("Ejecutar un nuevo Servicio");
		ejecutar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent aevent){
				myinterfaz.setVentana(0);
			}
		});
		ejecutar.setBounds(170,340,200,25);
		add(ejecutar);
		
	}
	
	/**
	 *Este metodo permite que se visualice el valor de la direccion del Servicio Web
	 *@param presen valor de la direccion del Servicio Web
	 */
	public void setPresentacion(String presen){
		pres.setText(cadena + presen); 
	}
	
	
	/**
	 *Este metodo permite que se visualice el valor del resultado de la ejecucion del Servicio Web
	 *@param str resultado a visualizar en pantalla
	 */
	public void setResultado(String str){
		try{
			doc.insertString(doc.getLength(),str,null);
		}catch(Exception ex){}
	}

}