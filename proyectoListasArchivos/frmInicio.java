import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class frmInicio extends JFrame implements ActionListener{
    static JButton btnListar, btnRegistrar;
    static JLabel lblTitulo, lblLogo, lblInformacion;
    static ImageIcon imgLogo, imgRegistrar, imgListar;

    public frmInicio(){
        //configuracion
        imgLogo = new ImageIcon(".\\img\\logo.png");
        imgRegistrar = new ImageIcon(".\\img\\add.png");
        imgListar = new ImageIcon(".\\img\\list.png");

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

        lblLogo = new JLabel(imgLogo);
        lblLogo.setLocation(100,80);
        lblLogo.setSize(210,200);

        lblInformacion = new JLabel("");
        lblInformacion.setForeground(Color.RED);
        lblInformacion.setLocation(100,270);
        lblInformacion.setSize(100,30);



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
    }

    public static void main(String[] args) {
        new frmInicio().setVisible(true);


    }


    public void actionPerformed(ActionEvent e)  {

    }

}
