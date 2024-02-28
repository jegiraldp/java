import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmRegistrar extends JFrame implements ActionListener {
    static JButton btnRegresar;
    static ImageIcon imgRegresar;


    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnRegresar)){
            frmMascotas.ventana.setVisible(true);
            this.setVisible(false);
        }
    }
    public frmRegistrar(){
        imgRegresar = new ImageIcon(".\\img\\back.png");
        btnRegresar = new JButton("Regresar", imgRegresar);
        btnRegresar.setBounds(50,50,150,30);
        btnRegresar.addActionListener(this);

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
