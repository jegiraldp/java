import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class frmMascotas extends JFrame implements ActionListener {

    static ImageIcon imgLogo, imgRegistrar;
    static JLabel lblLogo;
    static JButton btnRegistrar, btnListar;
    static frmRegistrar ventanaRegistrar;
    static frmListar ventanaListar;
    static frmMascotas ventana;

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnRegistrar)){
         ventanaRegistrar.setVisible(true);
         this.setVisible(false);
        }

        if(e.getSource().equals(btnListar)){
            ventanaListar.setVisible(true);
            this.setVisible(false);

        }
    }

    public frmMascotas(){
        ventanaRegistrar = new frmRegistrar();
        ventanaListar = new frmListar();


        imgRegistrar = new ImageIcon(".\\img\\new.png");
        btnRegistrar = new JButton("Registrar",imgRegistrar);
        btnRegistrar.setBounds(50,50,150,30);
        btnRegistrar.addActionListener(this);

        btnListar = new JButton("listar");
        btnListar.setBounds(80,80,150,30);
        btnListar.addActionListener(this);

        imgLogo = new ImageIcon(".\\img\\logo.png");
        lblLogo = new JLabel(imgLogo);
        lblLogo.setLocation(100,80);
        lblLogo.setSize(210,200);

        /////


        ///
        add(lblLogo);
        add(btnRegistrar);
        add(btnListar);

        ///

        Color c = new Color(173, 216, 230);
        getContentPane().setBackground(c);

        setLayout(null);
        setSize(450,350);
        setTitle("Módulo Mascotas");

        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setLocation(300,200);


    }

    public static void main(String[] args) {
        ventana = new frmMascotas();
        ventana.setVisible(true);
    }


}
