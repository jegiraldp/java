import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;


public class Sala implements ActionListener, Historial{
	
	int numeroSala;
	
	private Reserva[] reservas = new Reserva[12];
	
	private JPanel computadores;
	private JPanel tipo1;
	private JPanel cabecera;
	private JPanel cuerpo;
	private JPanel car; 
	
	private JTextField nombre;
	private JTextField apellido;
	private JTextField documento;
	private JTextField correo;
	
	private JRadioButton estudiante;
	private JRadioButton docente;
	private JRadioButton docCatedra;
	private JRadioButton tiempoCompleto;
	
	private JComboBox tcar;
	
	private JButton reservar;
	private JButton cancelar;
	
	private JFrame form;
	
	private int pc;
	
	private JButton[] comput;
	

	public Sala(int numeroSala){
		 this.numeroSala = numeroSala;
		 computadores    = new JPanel();
		 comput          = new JButton[12];
		 tipo1           = new JPanel();
		 car             = new JPanel();
	}
	
	
	public int getNumeroSala(){
		return numeroSala;
	}
	
	
	public Reserva[] getReservas(){
		return reservas;
	}
	
	
	public JPanel panelComputadores(){
		computadores.setBounds(200, 0, 550, 400);
		computadores.setLayout(new GridLayout(4, 3, 25, 30));
		
		for(int i = 0; i < 12; i++){
			comput[i] = new JButton("PC " + (i+1));
			comput[i].addActionListener(this);
			computadores.add(comput[i],i);
		}
		return computadores;
	}
	
	
	public void formulario(int pc){
		if(reservas[pc] != null){
			System.out.println("Ya esta reservado");
			Interfaz.Datos(reservas[pc]);
			return;
		}
		form = new JFrame("Datos de reserva de equipos");
		form.setBounds(220, 150, 430, 430);
		form.setResizable(false);
		form.setLayout(null); 
		
		cabecera = new JPanel();
		cuerpo   = new JPanel();
		tipo1 = new JPanel();
		tipo1.setBorder(new TitledBorder("Docente"));
		
		JLabel nom   = new JLabel("Nombres:");
		JLabel apell = new JLabel("Apellidos:");
		JLabel doc   = new JLabel("Documento de Identidad:");
		JLabel cor   = new JLabel("Correo");
		
		nombre    = new JTextField(10);
		apellido  = new JTextField(10);
		documento = new JTextField(10);
		correo	  = new JTextField(10);
		
		reservar = new JButton("Reservar");
		reservar.addActionListener(this);
		cancelar = new JButton("Cancelar");
		cancelar.addActionListener(this);
		reservar.setBounds(130, 280, 100, 30);
		cancelar.setBounds(235, 280, 100, 30);
		cuerpo.add(reservar);
		cuerpo.add(cancelar);
		
		ButtonGroup grupo = new ButtonGroup();
		estudiante = new JRadioButton("Estudiante");
		estudiante.addActionListener(this);
		docente = new JRadioButton("Docente    ");
		docente.addActionListener(this);
		grupo.add(estudiante);
		grupo.add(docente);
		
		JPanel tipo = new JPanel();
		tipo.setBorder(new TitledBorder("Seleccione tipo"));
		tipo.setBounds(50, 150, 100, 100);
		tipo.add(estudiante);
		tipo.add(docente);
		
		ButtonGroup grupo1 = new ButtonGroup();
		docCatedra = new JRadioButton("Catedra   ");
		tiempoCompleto = new JRadioButton("Completo");
		grupo1.add(docCatedra);
		grupo1.add(tiempoCompleto);
		tipo1.setBounds(250, 150, 100, 100);
		tipo1.add(docCatedra);
		tipo1.add(tiempoCompleto);
		tipo1.setVisible(false);
		car.removeAll();
		car.setBounds(175, 150, 250, 100);
		JLabel lcar = new JLabel("Carrera");
		lcar.setBounds(0, 0, 60, 20);
		
		tcar = new JComboBox();
		tcar.addItem("Ingenieria informatica");
		tcar.addItem("Ingenieria Industrial");
		tcar.addItem("Contaduria");
		tcar.addItem("Derecho");
		
		tcar.setBounds(70, 0, 100, 20);
		car.add(lcar);
		car.add(tcar);
		car.setBackground(new Color(200, 200, 180));
		car.setVisible(false);
		
		nom.setBounds(50, 30, 100, 20);
		apell.setBounds(50, 60, 100, 20);
		doc.setBounds(50, 90, 140, 20);
		cor.setBounds(50, 120, 100, 20);
		
		nombre.setBounds(250, 30, 150, 20);
		apellido.setBounds(250, 60, 150, 20);
		documento.setBounds(250, 90, 100, 20);
		correo.setBounds(250, 120, 150, 20);
		
		cuerpo.setBorder(new TitledBorder(""));
		cuerpo.setBackground(new Color(200, 200, 180));
		cuerpo.setBounds(0, 80, 500, 420);
		cuerpo.setLayout(null);
		cuerpo.add(nom);
		cuerpo.add(nombre);
		cuerpo.add(apell);
		cuerpo.add(apellido);
		cuerpo.add(doc);
		cuerpo.add(documento);
		cuerpo.add(cor);
		cuerpo.add(correo);
		cuerpo.add(tipo);
		cuerpo.add(car);
		cuerpo.add(tipo1);
		
		cabecera.setBounds(0, 0, 500, 70);
		cabecera.setBackground(new Color(160, 180, 100));
		
		JLabel titulo = new JLabel("DATOS DE USUARIO");
		titulo.setBounds(150, 25, 200, 30);
		titulo.setFont(new Font("Verdana", 1, 16));
		cabecera.setLayout(null);
		cabecera.add(titulo);
		
		form.add(cuerpo);
		form.add(cabecera);
		
		this.pc = pc;
		form.setVisible(true);
	}
	
	
	public void Reservar(){
		if(nombre.getText().equals("")|| apellido.getText().equals("") || documento.getText().equals("") || correo.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Por favor llene todos los datos", "...", 1);
			return;
		}
		if(estudiante.isSelected()){
			Estudiante usuario = new Estudiante(nombre.getText(), apellido.getText(), documento.getText(), (String)tcar.getSelectedItem(), correo.getText());
			reservas[pc] = new Reserva(usuario, 1, pc, this.numeroSala);
		}
		else{
			if(!docente.isSelected()){
				JOptionPane.showMessageDialog(null, "Por favor seleccione alguno opcion..", "...", 1);
				return;
			}
			if(docCatedra.isSelected()){
				DocCatedra usuario = new DocCatedra(nombre.getText(), apellido.getText(), documento.getText(), correo.getText());
				reservas[pc] = new Reserva(usuario, 2, pc, this.numeroSala);
			}
			else{
				if(!tiempoCompleto.isSelected()){
					JOptionPane.showMessageDialog(null, "Por favor seleccione alguno opcion..", "...", 1);
					return;
				}
				DocTiempoCompleto usuario = new DocTiempoCompleto(nombre.getText(), apellido.getText(), documento.getText(), correo.getText());
				reservas[pc] = new Reserva(usuario, 3, pc, this.numeroSala);
			}
		}
		form.dispose();
	}
	
	
	public void cancelarReserva(){
		Vector<String> pc = new Vector<String>();
		JTextArea datos;
		JComboBox pcs = new JComboBox();
		for(int i = 0; i < 12; i++){
			if(reservas[i] != null){
				pc.add(""+i);
				pcs.addItem("PC " + (i+1));
			}
		}
		if(pcs.getSelectedIndex() == -1) {
			JOptionPane.showMessageDialog(null, "No hay reservaciones", "...", 2);
			return;
		}
		if((JOptionPane.showConfirmDialog(null, pcs, "Cancelar Reservacion", JOptionPane.OK_CANCEL_OPTION)) == 0){
			System.out.println(reservas[Integer.parseInt(pc.get(pcs.getSelectedIndex()))].getEquipo());
			datos = new JTextArea();
			datos.setFont(new Font("Verdana", 1, 12));
			datos.append("Esta seguro de que desea cancelar la siguiente reservacion?\n");
				if(reservas[Integer.parseInt(pc.get(pcs.getSelectedIndex()))].getTipo() == 1){
					Estudiante usuario = (Estudiante)reservas[Integer.parseInt(pc.get(pcs.getSelectedIndex()))].getUsuario();
					
					datos.append("Sala: " + reservas[Integer.parseInt(pc.get(pcs.getSelectedIndex()))].getSala() + "\n");
					datos.append("Equipo reservado: " + (reservas[Integer.parseInt(pc.get(pcs.getSelectedIndex()))].getEquipo()+1)  + "\n");
					datos.append("Nombre: " + usuario.getNombre() + "\n");
					datos.append("Apellido: " + usuario.getApellido() + "\n");
					datos.append("Tipo de Usuario: " + usuario.tipoUsuario() + "\n");
					datos.append("Carrera: " + usuario.getCarrera() + "\n");
					datos.append("Correo: " + usuario.getCorreo() + "\n");
				}
				if(reservas[Integer.parseInt(pc.get(pcs.getSelectedIndex()))].getTipo() == 2){
					DocCatedra usuario = (DocCatedra)reservas[Integer.parseInt(pc.get(pcs.getSelectedIndex()))].getUsuario();
					
					datos.append("Sala: " + reservas[Integer.parseInt(pc.get(pcs.getSelectedIndex()))].getSala() + "\n");
					datos.append("Equipo reservado: " + (reservas[Integer.parseInt(pc.get(pcs.getSelectedIndex()))].getEquipo()+1) + "\n");
					datos.append("Nombre: " + usuario.getNombre() + "\n");
					datos.append("Apellido: " + usuario.getApellido() + "\n");
					datos.append("Tipo de Usuario: Docente \n");
					datos.append("Tipo de docente: " + usuario.tipoUsuario() + "\n");
					datos.append("Correo: " + usuario.getCorreo() + "\n");
				}
				if(reservas[Integer.parseInt(pc.get(pcs.getSelectedIndex()))].getTipo() == 3){
					DocTiempoCompleto usuario = (DocTiempoCompleto)reservas[Integer.parseInt(pc.get(pcs.getSelectedIndex()))].getUsuario();
					
					datos.append("Sala: " + reservas[Integer.parseInt(pc.get(pcs.getSelectedIndex()))].getSala() + "\n");
					datos.append("Equipo reservado: " + (reservas[Integer.parseInt(pc.get(pcs.getSelectedIndex()))].getEquipo()+1) + "\n");
					datos.append("Nombre: " + usuario.getNombre() + "\n");
					datos.append("Apellido: " + usuario.getApellido() + "\n");
					datos.append("Tipo de Usuario: Docente \n");
					datos.append("Tipo de docente: " + usuario.tipoUsuario() + "\n");
					datos.append("Correo: " + usuario.getCorreo() + "\n");
				}
				datos.setBackground(new Color(160, 180, 100));
				datos.setBounds(20, 25, 200, 400);
		
			if((JOptionPane.showConfirmDialog(null, datos, "Cancelar Reservacion", JOptionPane.OK_CANCEL_OPTION)) == 0){
				reservas[Integer.parseInt(pc.get(pcs.getSelectedIndex()))] = null;
			}
		}
	}
	
	
	public void mostrarHistorial(){
		
		JTextArea datos = new JTextArea();
		datos.append("+++++++++\n");
		datos.append(" Sala: " + numeroSala + " \n");
		datos.append("+++++++++\n\n");
		for(int i = 0; i < reservas.length; i++){
			if(reservas[i] == null) continue;
			
			if(reservas[i].getTipo() == 1){
				Estudiante usuario = (Estudiante)reservas[i].getUsuario();
				
				datos.append("Equipo reservado: " + (reservas[i].getEquipo()+1) + "\n");
				datos.append("Nombre: " + usuario.getNombre() + "\n");
				datos.append("Apellido: " + usuario.getApellido() + "\n");
				datos.append("Tipo de Usuario: " + usuario.tipoUsuario() + "\n");
				datos.append("Carrera: " + usuario.getCarrera() + "\n");
				datos.append("Correo: " + usuario.getCorreo() + "\n");
				datos.append("*******************************************************\n");
			}
			if(reservas[i].getTipo() == 2){
				DocCatedra usuario = (DocCatedra)reservas[i].getUsuario();
				
				datos.append("Equipo reservado: " + (reservas[i].getEquipo()+1) + "\n");
				datos.append("Nombre: " + usuario.getNombre() + "\n");
				datos.append("Apellido: " + usuario.getApellido() + "\n");
				datos.append("Tipo de Usuario: Docente \n");
				datos.append("Tipo de docente: " + usuario.tipoUsuario() + "\n");
				datos.append("Correo: " + usuario.getCorreo() + "\n");
				datos.append("*******************************************************\n");
			}
			if(reservas[i].getTipo() == 3){
				DocTiempoCompleto usuario = (DocTiempoCompleto)reservas[i].getUsuario();
				
				datos.append("Equipo reservado: " + (reservas[i].getEquipo()+1) + "\n");
				datos.append("Nombre: " + usuario.getNombre() + "\n");
				datos.append("Apellido: " + usuario.getApellido() + "\n");
				datos.append("Tipo de Usuario: Docente \n");
				datos.append("Tipo de docente: " + usuario.tipoUsuario() + "\n");
				datos.append("Correo: " + usuario.getCorreo() + "\n");
				datos.append("*******************************************************\n");
			}
		}
		datos.setEditable(false);
		JFrame ventana = new JFrame();
		ventana.setResizable(false);
		ventana.setTitle("Datos de reservas");
		ventana.setBounds(130, 150, 320, 300);
		ventana.add(new JScrollPane(datos));
		ventana.setVisible(true);
	}
	
	public void guardarHistorial(){
	
	}
	
	
	
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == comput[0]) formulario(0);
		if(e.getSource() == comput[1]) formulario(1);
		if(e.getSource() == comput[2]) formulario(2);
		if(e.getSource() == comput[3]) formulario(3);
		if(e.getSource() == comput[4]) formulario(4);
		if(e.getSource() == comput[5]) formulario(5);
		if(e.getSource() == comput[6]) formulario(6);
		if(e.getSource() == comput[7]) formulario(7);
		if(e.getSource() == comput[8]) formulario(8);
		if(e.getSource() == comput[9]) formulario(9);
		if(e.getSource() == comput[10]) formulario(10);
		if(e.getSource() == comput[11]) formulario(11);
		if(e.getSource() == reservar) Reservar();
		if(e.getSource() == cancelar){
			form.dispose();
		}
		if(e.getSource() == estudiante){
			car.setVisible(true);
			tipo1.setVisible(false);
		}
		if(e.getSource() == docente){
			car.setVisible(false);
			tipo1.setVisible(true);
		}
	}

}
