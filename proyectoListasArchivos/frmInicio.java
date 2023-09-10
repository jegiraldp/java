import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class frmInicio extends JFrame implements ActionListener{
    static JButton btnListar, btnRegistrar;
    static JLabel lblTitulo, lblLogo, lblInformacion;
    static ImageIcon imgLogo, imgRegistrar, imgListar;
    static frmListar vListar;
    static frmInicio vInicio;


    public frmInicio() throws IOException {
        //configuracion
        imgLogo = new ImageIcon(".\\img\\logo.png");
        imgRegistrar = new ImageIcon(".\\img\\add.png");
        imgListar = new ImageIcon(".\\img\\search.png");

        lblTitulo = new JLabel("Sistema de contactos");
        lblTitulo.setLocation(125,20);
        lblTitulo.setSize(200,30);
        lblTitulo.setFont(new Font("Arial", Font.PLAIN, 18));

        btnRegistrar = new JButton("Nuevo", imgRegistrar);
        btnRegistrar.setLocation(100,60);
        btnRegistrar.setSize(105,40);

        btnListar = new JButton("Listar", imgListar);
        btnListar.setLocation(215,60);
        btnListar.setSize(105,40);
        btnListar.addActionListener(this);

        lblLogo = new JLabel(imgLogo);
        lblLogo.setLocation(100,80);
        lblLogo.setSize(210,200);

        lblInformacion = new JLabel("");
        lblInformacion.setForeground(Color.RED);
        lblInformacion.setLocation(50,270);
        lblInformacion.setSize(200,30);


        //add
        add(lblTitulo);
        add(btnListar);
        add(btnRegistrar);
        add(lblLogo);
        add(lblInformacion);

        //set
        Color c = new Color(173, 216, 230);
        getContentPane().setBackground(c);

        setLayout(null);
        setSize(450,350);
        setTitle("Agenda de contactos");

        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setLocation(300,200);
        setVisible (true);

        //leer archivo plano
        String infoArchivo = readFile.leer(".\\files\\contactos.txt");
        lblInformacion.setText("Archivo cargado");
        //crearLista
        ArrayList<contacto> listaContactos= lista.crearLista(infoArchivo);
        lblInformacion.setText(lblInformacion.getText()+" :: Lista creada");
    }

    public static void main(String[] args)throws IOException {
        vInicio=new frmInicio();
        vInicio.setVisible(true);
    }


    public void actionPerformed(ActionEvent e)  {
        if(e.getSource().equals(btnListar)){
            try {
                vListar= frmListar.crear();
                vListar.setVisible(true);
                vInicio.setVisible(false);

            } catch (IOException ex) {
                System.out.println(ex);
            }
        }

    }

}
