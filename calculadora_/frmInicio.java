import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmInicio extends JFrame implements ActionListener{

    JLabel lblTitulo, lblNumeroUno, lblNumeroDos,lblOperacion, lblRespuesta;
    JTextField txtNumeroUno, txtNumeroDos;
    JButton btnCalcular, btnLimpiar;
    JComboBox cmbOperacion;
    static frmInicio formulario;

    public frmInicio() {
        //Color c = new Color(255,255,255);
        //getContentPane().setBackground(c);

        lblTitulo = new JLabel("--- Calculadora T2000 -- ");
        lblTitulo.setLocation(150,20);
        lblTitulo.setSize(150,30);

        lblNumeroUno = new JLabel("Número 1 : ");
        lblNumeroUno.setLocation(30,60);
        lblNumeroUno.setSize(70,30);

        lblNumeroDos = new JLabel("Número 2 : ");
        lblNumeroDos.setLocation(30,100);
        lblNumeroDos.setSize(70,30);

        lblOperacion = new JLabel("Operación : ");
        lblOperacion.setLocation(30,140);
        lblOperacion.setSize(70,30);

        lblRespuesta = new JLabel("..");
        lblRespuesta.setLocation(30,220);
        lblRespuesta.setSize(200,30);

        txtNumeroUno = new JTextField();
        txtNumeroUno.setLocation(100,60);
        txtNumeroUno.setSize(70,30);

        txtNumeroDos = new JTextField();
        txtNumeroDos.setLocation(100,100);
        txtNumeroDos.setSize(70,30);

        String[] opciones ={"Suma", "Resta", "Multiplicacion", "División"};
        cmbOperacion = new JComboBox(opciones);
        cmbOperacion.setLocation(100,140);
        cmbOperacion.setSize(100,30);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setLocation(100,180);
        btnCalcular.setSize(100,30);
        btnCalcular.addActionListener(this);

        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setLocation(210,180);
        btnLimpiar.setSize(100,30);
        btnLimpiar.addActionListener(this);




        //
        add(lblTitulo);
        add(lblNumeroUno);
        add(lblNumeroDos);
        add(lblOperacion);
        add(lblRespuesta);
        add(txtNumeroUno);
        add(txtNumeroDos);
        add(btnCalcular);
        add(btnLimpiar);
        add(cmbOperacion);

        setLayout(null);
        setSize(500,350);
        setTitle("Calculadora T200");
        setResizable(false); // con este se desactiva el boton maximizar
        //setExtendedState(MAXIMIZED_BOTH);  // con esta instrucci?n sale maximizada por defecto
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setLocation(300,200);
        setVisible (true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnCalcular)) {
            String n1 = txtNumeroUno.getText();
            String n2 = txtNumeroDos.getText();
            int numUno, numDos;

            if (n1.length() == 0 || n2.length() == 0) {
                JOptionPane.showMessageDialog(formulario, "Faltan datos !!!");
            }else{
                try{
                    numUno = Integer.parseInt(n1);
                    numDos = Integer.parseInt(n2);


                if(cmbOperacion.getSelectedIndex()==0){
                    lblRespuesta.setText("La respuesta es: "
                            +String.valueOf(suma.calcular(numUno,numDos)));
                }
                if(cmbOperacion.getSelectedIndex()==1) {
                    lblRespuesta.setText("La respuesta es: "
                            +String.valueOf(resta.calcular(numUno,numDos)));
                }
                if(cmbOperacion.getSelectedIndex()==2) {
                    lblRespuesta.setText("La respuesta es: "
                            +String.valueOf(multiplicacion.calcular(numUno,numDos)));
                }
                if(cmbOperacion.getSelectedIndex()==3) {
                    if(numDos==0){
                        JOptionPane.showMessageDialog(formulario, "Error división por cero!!!");
                    }else {
                        lblRespuesta.setText("La respuesta es: "
                                + String.valueOf(division.calcular(numUno, numDos)));
                    }
                }
                }catch(Exception exc){
                    JOptionPane.showMessageDialog(formulario, "Error de conversión !!!");
                }

            }
        }

        if (e.getSource().equals(btnLimpiar)) {
            txtNumeroUno.setText("");
            txtNumeroDos.setText("");
            lblRespuesta.setText("...");

        }
    }

    public static void main(String[] args) {
        formulario = new frmInicio();
    }
}
