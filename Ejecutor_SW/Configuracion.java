package ejecutor.interfaces;

import java.awt.Font;
import java.util.Vector;
import javax .swing.*;
import java.awt.event.*;
import ejecutor.agentes.Usuario; 
import jade.gui.GuiEvent;
import ejecutor.interfaces.Terminos;

/**
 *Esta clase es la encargada de contener los elementos que se muestran en la vista de configuracion de ejecucion del 
 *servicio Web
 *
 *@author ALBER ANDRES LEDESMA CASTILLO 
 */

class Configuracion extends JPanel implements Terminos{

	//Direccion del servicio web dado por el usuario
	private String servicio;
	
	//Campo de texto que contiene la direccion del servicio Web
	JTextField camposervicio;
	
	//Campo de texto que contiene la direccion de la ontologia que usa el servicio Web
	JTextField campoontologia;
	
	//Campos de valores de entrada
	JTextField camentrada[] = new JTextField[10];	
	
	//Agente al cual se le transmite el evento de ejecucion del servicio
	Usuario myusuario;

	//Interfaz grafica de usuario
	Ejecutor_SW myinterfaz;

	/**
	 *Este es el constructor base de este panel de Configuracion
	 *@param ancho Ancho de este panel
	 *@param alto Alto de este panel
	 *@param guiAgent Agente al cual se le pasaran los eventos que se generen en este panel
	 *@param inter Interfaz que contendra este panel y a la cual se le pasaran los datos que se generen en esta vista
	 */

	public Configuracion(int ancho, int alto,Usuario guiAgent,Ejecutor_SW inter){
		
		//Se asigna el agente
		myusuario = guiAgent;
		
		//Se asigna la interfaz
		myinterfaz = inter;
		
		//Se configura el panel
		setSize(ancho,alto);
		setVisible(true);
		
		//La organizacion de los componentes se hace de manera manual
		setLayout(null);
		
		//Se crea la fuente estilizada para los label
		Font font = new Font("Serif", Font.BOLD|Font.ITALIC,15);
		
		//**Campo de presentacion
		
		JLabel pres = new JLabel("Sistema Multiagente Ejecutor Servicios Web");
		
		//se asocia la fuente con el label de presentacion
		pres.setFont(font);
		
		//Se crea el Icono de la universidad nacional
		Icon escudo = new ImageIcon("escudo.jpg");
		JLabel escudolabel = new JLabel();
		escudolabel.setIcon(escudo);
		
		//Se añaden los componentes
		pres.setBounds(10,18,280,50);
		add(pres);
		escudolabel.setBounds(295,5,75,75);
		add(escudolabel);
		
		//Se crea la fuente generica para las otras etiquetas
		Font gfont = new Font("Serif",Font.BOLD,12);
		
		//**Campo para la introduccion de la direccion del servicio
		
		//se crea el espacio para añadir la direccion del servicio Web
		JLabel ubic = new JLabel("Digite la ubicacion del Servicio Web");
		ubic.setFont(gfont);
		
		//Se crea el campo de texto para introducir la direccion del servicio
		camposervicio = new JTextField();
		
		//Se añaden estos componentes
		ubic.setBounds(10,90,250,20);
		add(ubic);
		camposervicio.setBounds(10,115,380,20);
		add(camposervicio);
		
		//**Campo para introducir la ontologia
		campoontologia = new JTextField();
		campoontologia.setEnabled(false);
		
		JRadioButton selecont = new JRadioButton("Usa el servicio alguna ontologia?");
		selecont.setFont(gfont);
		selecont.setSelected(false);
		selecont.addActionListener(new ActionListener(){
			boolean switche = true;
			public void actionPerformed(ActionEvent e){
				if(switche){
					campoontologia.setEnabled(true);
					switche = false;
				}
				else{
					campoontologia.setEnabled(false);
					switche = true;
				}
			}
		});
		
		selecont.setBounds(10,145,250,20);
		add(selecont);
		campoontologia.setBounds(10,170,380,20);
		add(campoontologia);
		
		//**Campo para el numero de parametros
		JLabel npar = new JLabel("Escoja el numero de parametros que recibe el servicio");
		npar.setFont(gfont);
		
		npar.setBounds(10,200,350,20);
		add(npar);
		
		JRadioButton entradas[] = new JRadioButton[10];
		
		String p = new String("Entrada ");
		
		int acumulado = 5;
		for(int index=0;index<10;index++){
			entradas[index] = new JRadioButton(p + index);
			entradas[index].setFont(gfont);
			camentrada[index] = new JTextField();
			camentrada[index].setEnabled(false);
			//Se añade el auditor de eventos para la paraja JRadioButton-JTextField
			if((index%2) == 0){
				entradas[index].setBounds((acumulado),225,75,20);
				add(entradas[index]);
				camentrada[index].setBounds((acumulado),250,75,20);
				add(camentrada[index]);
				acumulado += 78;
			}else{
				entradas[index].setBounds((acumulado-78),275,75,20);
				add(entradas[index]);
				camentrada[index].setBounds((acumulado-78),300,75,20);
				add(camentrada[index]);
			}
		}
		
		
		//**Campos para añadir auditores de eventos a los JRadioButton de manera que puede validar/invalidar la entrada
		//de parametros
		 
		entradas[0].addActionListener(new ActionListener(){
				boolean switche = true;
				public void actionPerformed(ActionEvent e){
					if(switche){
						camentrada[0].setEnabled(true);
						switche = false;
					}
					else{
						camentrada[0].setEnabled(false);
						switche = true;
					}
				}
		});
			
		entradas[1].addActionListener(new ActionListener(){
				boolean switche = true;
				public void actionPerformed(ActionEvent e){
					if(switche){
						camentrada[1].setEnabled(true);
						switche = false;
					}
					else{
						camentrada[1].setEnabled(false);
						switche = true;
					}
				}
		});
			
		entradas[2].addActionListener(new ActionListener(){
				boolean switche = true;
				public void actionPerformed(ActionEvent e){
					if(switche){
						camentrada[2].setEnabled(true);
						switche = false;
					}
					else{
						camentrada[2].setEnabled(false);
						switche = true;
					}
				}
		});
		
		entradas[3].addActionListener(new ActionListener(){
				boolean switche = true;
				public void actionPerformed(ActionEvent e){
					if(switche){
						camentrada[3].setEnabled(true);
						switche = false;
					}
					else{
						camentrada[3].setEnabled(false);
						switche = true;
					}
				}
		});
		
		entradas[4].addActionListener(new ActionListener(){
				boolean switche = true;
				public void actionPerformed(ActionEvent e){
					if(switche){
						camentrada[4].setEnabled(true);
						switche = false;
					}
					else{
						camentrada[4].setEnabled(false);
						switche = true;
					}
				}
		});
		
		entradas[5].addActionListener(new ActionListener(){
				boolean switche = true;
				public void actionPerformed(ActionEvent e){
					if(switche){
						camentrada[5].setEnabled(true);
						switche = false;
					}
					else{
						camentrada[5].setEnabled(false);
						switche = true;
					}
				}
		});
		
		entradas[6].addActionListener(new ActionListener(){
				boolean switche = true;
				public void actionPerformed(ActionEvent e){
					if(switche){
						camentrada[6].setEnabled(true);
						switche = false;
					}
					else{
						camentrada[6].setEnabled(false);
						switche = true;
					}
				}
		});
		
		entradas[7].addActionListener(new ActionListener(){
				boolean switche = true;
				public void actionPerformed(ActionEvent e){
					if(switche){
						camentrada[7].setEnabled(true);
						switche = false;
					}
					else{
						camentrada[7].setEnabled(false);
						switche = true;
					}
				}
		});
		
		entradas[8].addActionListener(new ActionListener(){
				boolean switche = true;
				public void actionPerformed(ActionEvent e){
					if(switche){
						camentrada[8].setEnabled(true);
						switche = false;
					}
					else{
						camentrada[8].setEnabled(false);
						switche = true;
					}
				}
		});
		
		entradas[9].addActionListener(new ActionListener(){
				boolean switche = true;
				public void actionPerformed(ActionEvent e){
					if(switche){
						camentrada[9].setEnabled(true);
						switche = false;
					}
					else{
						camentrada[9].setEnabled(false);
						switche = true;
					}
				}
		});
		
		//**Campo para ejecutar
		
		JButton ejecutar = new JButton("Ejecutar");
		ejecutar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				//Se crea el evento del tipo que entiende los agentes y se envia
				GuiEvent ge = new GuiEvent(this,EJECUTAR);
				myusuario.postGuiEvent(ge);
				//Se pasa a la ventana de resultados
				myinterfaz.setVentana(1);
				myinterfaz.setResultadoPres(getServicio());
			}
		});
		ejecutar.setBounds(280,340,90,20);
		add(ejecutar);
	}
	
	
	/**
	 *Este metodo retorna la cadena con la direccion del Servicio Web
	 *@return cadena con la direccion del servicio web
	 */
	 
	public String getServicio(){
		servicio = camposervicio.getText();
		return servicio;			
	}
	
	/**
	 *Este metodo permite retornar el valor del campo de ontologia asociado a un Servicio Web, esto es para cuando un
	 *servicio tiene las entradas/salidas formateadas con alguna ontologia. Esta entrada es opcional
	 *@return cadena con la direccion de la ontologia asociada al Servicio Web, cadena vacia en caso de que el usuario
	 *no haya ingresado la opcion
	 */
	
	public String getOntologia(){
		String ontologia = new String("");
		if(campoontologia.isEnabled())
			ontologia = campoontologia.getText();
		return ontologia;
		
	}
	
	/**
	 *Este metodo permite recuperar las entradas que el usuario haya ingresado en la interfaz. Se debe de recordar que
	 *estas entradas deben de tener el formato Entrada:Valor para que sean validas
	 *@return vector con las entradas dadas por el usuario
	 */
	
	public Vector getEntradas(){
		Vector entradas = new Vector();
		for(int i=0;i<10;i++){
			if(camentrada[i].isEnabled()){
				entradas.addElement(camentrada[i].getText());
				System.out.println(camentrada[i].getText());
			}
		}
		return entradas;
	}
}