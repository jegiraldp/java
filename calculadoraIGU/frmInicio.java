import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmInicio extends JFrame implements ActionListener{

    static JLabel lblNumeroUno, lblNumeroDos, lblResultado;
    static JTextField txtNumeroUno, txtNumeroDos;
    static JButton btnSumar;
    static frmLogin ventanaLogin;
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(btnSumar)){
            /*int n1 = Integer.parseInt(txtNumeroUno.getText());
            int n2 = Integer.parseInt(txtNumeroDos.getText());
            int suma = sumar.calcular(n1,n2);
            lblResultado.setText("La suma es "+suma);*/
            ventanaLogin = new frmLogin();
            setVisible(false);
            
        }

    }

public frmInicio(){
    lblNumeroUno = new JLabel("Número 1");
    lblNumeroUno.setBounds(30,30,100,30);

    txtNumeroUno = new JTextField();
    txtNumeroUno.setBounds(30,80,100,30);

    lblNumeroDos = new JLabel("Númerop 2");
    lblNumeroDos.setBounds(30,120,100,30);

    txtNumeroDos = new JTextField();
    txtNumeroDos.setBounds(30,160,100,30);

    btnSumar = new JButton("+");
    btnSumar.setBounds(30,200,50,30);
    btnSumar.addActionListener(this);

    lblResultado = new JLabel("Resultado");
    lblResultado.setBounds(30,240,100,30);

    ////
    add(lblNumeroUno);
    add(txtNumeroUno);
    add(lblNumeroDos);
    add(txtNumeroDos);
    add(btnSumar);
    add(lblResultado);

    ////
    setLayout(null);
    setSize(400,400);
    setTitle("Calculator 2000");
    setResizable(false); // con este se desactiva el boton maximizar
    //setExtendedState(MAXIMIZED_BOTH);  // con esta instrucci?n sale maximizada por defecto
    setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    setLocation(300,200);
    setVisible (true);
}

    public static void main(String[] args) {
        frmInicio ventana = new frmInicio();
    }


}
