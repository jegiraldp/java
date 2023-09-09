import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class frmRegistrar extends JFrame implements ActionListener{

    static JButton btnLeer, btnListar, btnNuevo, btnActualizar;
    static JTextArea txtTablero;
    static JTextField txtCodigo,txtNombre,txtTelefono;
    static JLabel lblCodigo;
    static String linea;
    static ArrayList<contacto> laLista;
    //static frmDos ventanaDos;
    static frmRegistrar ventana;
    public frmRegistrar(){

        //configuración
        btnLeer = new JButton("Read_File");
        btnLeer.setLocation(30,30);
        btnLeer.setSize(105,30);
        btnLeer.addActionListener(this);

        btnActualizar = new JButton("Write_File");
        btnActualizar.setLocation(160,30);
        btnActualizar.setSize(105,30);
        btnActualizar.addActionListener(this);
       // btnActualizar.setEnabled(false);

        txtTablero = new JTextArea();
        txtTablero.setLocation(30,70);
        txtTablero.setSize(200,350);

        lblCodigo = new JLabel("Digite Código");
        lblCodigo.setLocation(270,40);
        lblCodigo.setSize(100,30);

        txtCodigo = new JTextField(10);
        txtCodigo.setLocation(270,70);
        txtCodigo.setSize(150,30);

        txtNombre = new JTextField(10);
        txtNombre.setLocation(270,110);
        txtNombre.setSize(150,30);

        txtTelefono = new JTextField(10);
        txtTelefono.setLocation(270,150);
        txtTelefono.setSize(150,30);

        btnNuevo = new JButton("Registrar");
        btnNuevo.setLocation(270,190);
        btnNuevo.setSize(130,30);
        btnNuevo.addActionListener(this);

        btnListar = new JButton("Listar");
        btnListar.setLocation(270,230);
        btnListar.setSize(130,30);
        btnListar.addActionListener(this);


        //adicionar
        add(btnLeer);
        add(btnActualizar);
        add(txtTablero);
        add(txtCodigo);
        add(txtNombre);
        add(txtTelefono);
        add(lblCodigo);
        add(btnNuevo);
        add(btnListar);
        //configurar formulario
        /*Color c = new Color(38,38,38);
        getContentPane().setBackground(c);*/

        setLayout(null);
        setSize(500,500);
        setTitle("Agenda de contactos");

        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setLocation(300,200);
        setVisible (true);

    }

    public static void main(String[] args) {

         ventana= new frmRegistrar();

    }

    public void actionPerformed(ActionEvent e)  {
        String listaArea="";
        if (e.getSource().equals(btnListar)){
            System.out.println("----------");
            for (contacto con:laLista) {
                listaArea=listaArea+"\n"+con.getCodigo() + "," + con.nombre + "," + con.telefono;
                //System.out.println(con.getCodigo() + "," + con.nombre + "," + con.telefono);
            }
                txtTablero.setText("");
            txtTablero.append(listaArea);
        }
        if(e.getSource().equals(btnLeer)){
            try{
                txtTablero.append("");
              linea = readFile.leer("c:\\codeall\\contactos.txt");
              //txtTablero.setText(linea);
              txtTablero.append("\nArchivo leido\nLista creada");
              laLista=lista.crearLista(linea);
                /*
                for (contacto con:laLista) {
                    System.out.println(con.getCodigo()+","+con.nombre+","+con.telefono);
                }*/

            }catch(IOException ioe){
                System.out.println(ioe);
            }
        }

        if(e.getSource().equals(btnNuevo)){
            String cod = txtCodigo.getText();
            String nom = txtNombre.getText();
            String tel = txtTelefono.getText();

            contacto c = new contacto(cod,nom,tel);
            laLista.add(c);

        }
        if(e.getSource().equals(btnActualizar)){
            try{
            String escribir="";
            for (contacto c:laLista){
                escribir=escribir+";"+c.getCodigo()
                        +","+c.nombre+","+c.telefono;
            }

                writeFile.escribir(escribir,"c:\\codeall\\contactos.txt");
            }catch(IOException ioe){
                System.out.println(ioe);
            }



        }
    }



    }
