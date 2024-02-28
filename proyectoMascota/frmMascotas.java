import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class frmMascotas extends JFrame implements ActionListener {

    static ImageIcon imgLogo, imgRegistrar;
    static JLabel lblLogo;
    static JButton btnRegistrar;

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnRegistrar)){
            System.out.println("Pulso boton registrar");
        }
    }

    public frmMascotas(){
        imgRegistrar = new ImageIcon(".\\img\\new.png");
        btnRegistrar = new JButton("Registrar",imgRegistrar);
        btnRegistrar.setBounds(50,50,150,30);
        btnRegistrar.addActionListener(this);

        imgLogo = new ImageIcon(".\\img\\logo.png");
        lblLogo = new JLabel(imgLogo);
        lblLogo.setLocation(100,80);
        lblLogo.setSize(210,200);

        /////


        ///
        add(lblLogo);
        add(btnRegistrar);

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
        frmMascotas ventana = new frmMascotas();
        ventana.setVisible(true);
    }


}
