import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class frmListar extends JFrame implements ActionListener {
    JLabel lblTitulo;
    JButton btnRegresar;
    ImageIcon imgHome;
    static frmListar ventana;
    static JTable tabla;

    public static frmListar crear()throws IOException{
        if(ventana==null) {
            //System.out.println("es null");
            ventana = new frmListar();
        }
            return ventana;

    }

    public frmListar() throws IOException {
        //configuracion
        imgHome = new ImageIcon(".\\img\\back.png");

        lblTitulo = new JLabel("Lista de contactos");
        lblTitulo.setLocation(125, 20);
        lblTitulo.setSize(200, 30);
        lblTitulo.setFont(new Font("Arial", Font.PLAIN, 18));

        btnRegresar = new JButton(imgHome);
        btnRegresar.setLocation(40, 20);
        btnRegresar.setSize(60, 30);
        btnRegresar.addActionListener(this);

        Object[][] datos={{123,"jorge"},{124,"jorge2"}};
        String[] headers={"Código","Nombre"};
        tabla = new JTable(datos,headers);
        JScrollPane scrollpane = new JScrollPane(tabla);
        scrollpane.setLocation(40,60);
        scrollpane.setSize(350,200);


        //Agregamos el scrollpanel al contenedor


        //add
        add(lblTitulo);
        add(btnRegresar);
        add(scrollpane, BorderLayout.CENTER);
        //add(tabla);

        //set
        Color c = new Color(173, 216, 230);
        getContentPane().setBackground(c);

        setLayout(null);
        setSize(450, 350);
        setTitle("Agenda de contactos");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(300, 200);



    }

    public void actionPerformed(ActionEvent e)  {
        if(e.getSource().equals(btnRegresar)){
            frmInicio.vInicio.setVisible(true);
            ventana.setVisible(false);

        }

    }


}