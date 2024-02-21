import javax.swing.*;

public class frmLogin extends JFrame {

    public frmLogin(){
        setLayout(null);
        setSize(700,400);
        setTitle("Login");
        setResizable(false); // con este se desactiva el boton maximizar
        //setExtendedState(MAXIMIZED_BOTH);  // con esta instrucci?n sale maximizada por defecto
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setLocation(300,200);
        setVisible (true);
    }



}
