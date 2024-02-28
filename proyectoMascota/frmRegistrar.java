import javax.swing.*;
import java.awt.*;

public class frmRegistrar extends JFrame{
    static JButton btnRegresar;
    static ImageIcon imgRegresar;

    public frmRegistrar(){
        imgRegresar = new ImageIcon(".\\img\\logo.png");
        btnRegresar = new JButton("Regresar", imgRegresar);
        btnRegresar.setBounds(50,50,70,30);


        //
        add(btnRegresar);


        Color c = new Color(173, 216, 230);
        getContentPane().setBackground(c);

        setLayout(null);
        setSize(450,350);
        setTitle("Registrar Módulo Mascotas");

        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setLocation(300,200);

    }

}
