import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.io.*;

@SuppressWarnings("serial")

public class Interfaz extends JFrame implements ActionListener{
	
	private JPanel cabecera;
	static  JPanel izquierdo;
	private JPanel derecho;

	private JPanel sala1;
	private JPanel sala2;
	private JPanel sala3;
	
	private JTabbedPane salas;
	
	private JButton reservar;
	private JButton cancelarReserva;
	private JButton historial;
	private JButton salir;
	
	private JMenuItem cerrar;
	private JMenuItem saliryguardar;
	private JMenuItem mReservar;
	private JMenuItem mCancelarReservar;
	private JMenuItem mHistorial;
	
	private Sala[] sal1;
	
	private RandomAccessFile accesor;
	
	public Interfaz(){
		super();
		inicializarComponentes();
		InitializeWindows();
		panelPrincipal();
	
		menu();
	}

	public void InitializeWindows(){
		
	
    	this.setTitle("Reservas Politecnico J.I.C.");
    	this.setBounds(100, 100, 750, 550);
    	this.setResizable(false);
    	this.getContentPane().setLayout(null);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public void inicializarComponentes(){
		cabecera  = new JPanel();
		izquierdo = new JPanel();
		derecho   = new JPanel();
	;
		sala1 	  = new JPanel();
		sala2 	  = new JPanel();
		sala3 	  = new JPanel();
		salas 	  = new JTabbedPane();
		sal1      = new Sala[3];
	}
	

	public void menu(){
		JMenuBar menu = new JMenuBar();
		
		JMenu archivo = new JMenu("Archivo");
		JMenu editar = new JMenu("Editar");
		JMenu ver = new JMenu("Ver");
		
		saliryguardar = new JMenuItem("Salir y Guardar");
		cerrar = new JMenuItem("Cerrar");
		mReservar = new JMenuItem("Reservar");
		mCancelarReservar = new JMenuItem("Cancelar Reservacion");
		mHistorial = new JMenuItem("Historial");
		
		archivo.add(cerrar);
		archivo.add(saliryguardar);
		
		editar.add(mReservar);
		editar.add(mCancelarReservar);
		
		ver.add(mHistorial);
		
		cerrar.addActionListener(this);
		saliryguardar.addActionListener(this);
		mReservar.addActionListener(this);
		mCancelarReservar.addActionListener(this);
		mHistorial.addActionListener(this);
		
		menu.add(archivo);
		menu.add(editar);
		menu.add(ver);
		
		this.setJMenuBar(menu);
	}
	
	
	public void panelPrincipal(){
		
		
		cabecera.setBounds(0, 0, 750, 70);
		JLabel titulo = new JLabel("Reserva sala de sistemas");
		titulo.setFont(new Font("Verdana", 1, 20));
		titulo.setBounds(50, 50, 100, 20);
		cabecera.add(titulo);
	
		
		this.getContentPane().add(cabecera);
		izquierdo.setBounds(0, 102, 250, 438); 
		izquierdo.setBackground(new Color(160, 180, 100));
		izquierdo.setBorder(new TitledBorder("Datos"));
		this.getContentPane().add(izquierdo);
		izquierdo.setVisible(true);
		
		derecho.setBounds(250, 102, 500, 438);
		derecho.setBackground(new Color(160, 180, 90));
		derecho.setLayout(new GridLayout(1, 1));
		derecho.add(salas, 0);
		
		
		sal1[0] = new Sala(1);
		sal1[1] = new Sala(2);
		sal1[2] = new Sala(3);
		
	
		sala1.add(sal1[0].panelComputadores());
		salas.addTab("Sala 1.", sala1);
		sala2.add(sal1[1].panelComputadores());
		salas.addTab("Sala 2.", sala2);
		sala3.add(sal1[2].panelComputadores());
		salas.addTab("Sala 3.", sala3);
		
		this.getContentPane().add(derecho);
	}
	
	
	
	
	public static void Datos(Reserva reserva){
		izquierdo.removeAll();
		JTextArea datos = new JTextArea();
		datos.setFont(new Font("Verdana", 1, 12));
		datos.append("Equipo Reservado....\n");
		if(reserva.getTipo() == 1){
			Estudiante usuario = (Estudiante)reserva.getUsuario(); 
			datos.append("Sala: " + reserva.getSala() + "\n");
			datos.append("Equipo reservado: " + (reserva.getEquipo()+1)  + "\n");
			datos.append("Nombre: " + usuario.getNombre() + "\n");
			datos.append("Apellido: " + usuario.getApellido() + "\n");
			datos.append("Tipo de Usuario: " + usuario.tipoUsuario() + "\n");
			datos.append("Carrera: " + usuario.getCarrera() + "\n");
			datos.append("Correo: " + usuario.getCorreo() + "\n");
		}
		if(reserva.getTipo() == 2){
			DocCatedra usuario = (DocCatedra)reserva.getUsuario();
			
			datos.append("Sala: " + reserva.getSala() + "\n");
			datos.append("Equipo reservado: " + (reserva.getEquipo()+1) + "\n");
			datos.append("Nombre: " + usuario.getNombre() + "\n");
			datos.append("Apellido: " + usuario.getApellido() + "\n");
			datos.append("Tipo de Usuario: Docente \n");
			datos.append("Tipo de docente: " + usuario.tipoUsuario() + "\n");
			datos.append("Correo: " + usuario.getCorreo() + "\n");
		}
		if(reserva.getTipo() == 3){
			DocTiempoCompleto usuario = (DocTiempoCompleto)reserva.getUsuario();
			
			datos.append("Sala: " + reserva.getSala() + "\n");
			datos.append("Equipo reservado: " + (reserva.getEquipo()+1) + "\n");
			datos.append("Nombre: " + usuario.getNombre() + "\n");
			datos.append("Apellido: " + usuario.getApellido() + "\n");
			datos.append("Tipo de Usuario: Docente \n");
			datos.append("Tipo de docente: " + usuario.tipoUsuario() + "\n");
			datos.append("Correo: " + usuario.getCorreo() + "\n");
		}
		datos.setBackground(new Color(160, 180, 100));
		datos.setBounds(20, 25, 200, 400);
		izquierdo.add(datos);
		izquierdo.repaint();
	}
	
	
	public void guardarHistorial(){
		try{
			accesor = new RandomAccessFile("historia.txt", "rw");
			for(int i = 0; i < 3; i++){
				accesor.writeBytes("Sala: " + (i+1) + "\r\n");
				for(int j = 0; j < 12; j++){
					if(sal1[i].getReservas()[j] == null) continue;
					if(sal1[i].getReservas()[j].getTipo() == 1){
						Estudiante usuario = (Estudiante)sal1[i].getReservas()[j].getUsuario();
						accesor.writeBytes("Computador: " + sal1[i].getReservas()[j].getEquipo() + ",    " + usuario.datos() + "\r\n");
					}
					if(sal1[i].getReservas()[j].getTipo() == 2){
						DocCatedra usuario = (DocCatedra)sal1[i].getReservas()[j].getUsuario();
						accesor.writeBytes("Computador: " + sal1[i].getReservas()[j].getEquipo() + ",   " + usuario.datos() + "\r\n");
					}
					if(sal1[i].getReservas()[j].getTipo() == 3){
						DocTiempoCompleto usuario = (DocTiempoCompleto)sal1[i].getReservas()[j].getUsuario();
						accesor.writeBytes("Computador: " + sal1[i].getReservas()[j].getEquipo() + ",   " + usuario.datos() + "\r\n");
					}
				}
				accesor.writeBytes("\r\n");
	    	}
			accesor.close();
		}
		catch(IOException e) {
			System.out.println("Error en el archivo.../n" + e);		
		}
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == salir){
			guardarHistorial();
			System.exit(0);
		}
		
		if(e.getSource() == cancelarReserva) sal1[salas.getSelectedIndex()].cancelarReserva();
		if(e.getSource() == historial) sal1[salas.getSelectedIndex()].mostrarHistorial();
		
		if(e.getSource() == mCancelarReservar) sal1[salas.getSelectedIndex()].cancelarReserva();
		if(e.getSource() == mHistorial) sal1[salas.getSelectedIndex()].mostrarHistorial();
		if(e.getSource() == cerrar) System.exit(0);
		if(e.getSource() == saliryguardar){
			guardarHistorial();
			System.exit(0);
		}
	}
	

	public static void main(String ar[]){
		Interfaz interfaz = new Interfaz();
		interfaz.setVisible(true);
	}

}
