import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmInicio extends JFrame implements ActionListener {
    JLabel lblTitulo,lblNumero1, lblNumero2, lblResultado;
    JTextField txtNumeroUno, txtNumeroDos;
    JButton btnSuma,btnLimpiar;
    static frmInicio formulario;

    public frmInicio() {
        //elementos
        lblTitulo = new JLabel("Calculator T2000");
        lblTitulo.setLocation(200,30);
        lblTitulo.setSize(100,30);

        lblNumero1 = new JLabel("Número 1");
        lblNumero1.setLocation(70, 100);
        lblNumero1.setSize(100,30);

        lblNumero2 = new JLabel("Número 2");
        lblNumero2.setLocation(70, 140);
        lblNumero2.setSize(100,30);

        txtNumeroUno = new JTextField(70);
        txtNumeroUno.setLocation(180,100);
        txtNumeroUno.setSize(100,30);

        txtNumeroDos = new JTextField(70);
        txtNumeroDos.setLocation(180,140);
        txtNumeroDos.setSize(100,30);

        btnSuma = new JButton("Sumar");
        btnSuma.setLocation(180,180);
        btnSuma.setSize(100,30);
        btnSuma.addActionListener(this);

        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setLocation(180,220);
        btnLimpiar.setSize(100,30);
        btnLimpiar.addActionListener(this);

        lblResultado = new JLabel("...");
        lblResultado.setLocation(180,260);
        lblResultado.setSize(100,30);
        //adicionar
        add(lblTitulo);
        add(lblNumero1);
        add(lblNumero2);
        add(txtNumeroUno);
        add(txtNumeroDos);
        add(btnSuma);
        add(btnLimpiar);
        add(lblResultado);

        //configuracion formulario
        setLayout(null);
        setSize(500,500);
        setLocation(300,100);
        setTitle("Calculator T2000");
        //setExtendedState(MAXIMIZED_BOTH);
        //setResizable(false);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setVisible (true);
    }

    public static void main(String[] args) {
        formulario = new frmInicio();
    }

    public void actionPerformed(ActionEvent e) {
        String n1, n2;
        int num1, num2;

        if(e.getSource().equals(btnLimpiar)){
            txtNumeroUno.setText("");
            txtNumeroDos.setText("");
        }
        if(e.getSource().equals(btnSuma)){
            n1 = txtNumeroUno.getText();
            n2 = txtNumeroDos.getText();
            if(n1.length()==0 || n2.length()==0){
                JOptionPane.showMessageDialog(formulario,"Faltan Datos !!");
            }else {

                num1 = Integer.parseInt(n1);
                num2 = Integer.parseInt(n2);
                lblResultado.setText("Resultado " + String.valueOf(suma.calcular(num1, num2)));
            }
        }

    }
}
