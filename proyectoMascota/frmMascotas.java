import javax.swing.*;
import java.awt.*;


public class frmMascotas extends JFrame {

    static ImageIcon imgLogo;
    static JLabel lblLogo;

    public frmMascotas(){

        imgLogo = new ImageIcon(".\\img\\logo.png");
        lblLogo = new JLabel(imgLogo);
        lblLogo.setLocation(100,80);
        lblLogo.setSize(210,200);

        /////


        ///
        add(lblLogo);

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
