import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmListar extends JFrame implements ActionListener {
    static JButton btnRegresar;
    static ImageIcon imgRegresar;
    static JTable tabla;
    static DefaultTableModel model;
    static JScrollPane scrollpane;


    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnRegresar)){
            frmMascotas.ventana.setVisible(true);
            this.setVisible(false);

                    }
    }
    public frmListar(){
        imgRegresar = new ImageIcon(".\\img\\back.png");
        btnRegresar = new JButton("Regresar", imgRegresar);
        btnRegresar.setBounds(50,50,150,30);
        btnRegresar.addActionListener(this);


        model = new DefaultTableModel();
        tabla = new JTable(model);

        model.addColumn("ID");
        model.addColumn("Nombre");

        scrollpane = new JScrollPane(tabla);
        scrollpane.setLocation(40,80);
        scrollpane.setSize(100,100);


        //
        add(btnRegresar);
        add(scrollpane, BorderLayout.CENTER);

        Color c = new Color(173, 216, 230);
        getContentPane().setBackground(c);

        setLayout(null);
        setSize(450,350);
        setTitle("Listado Mascotas");

        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setLocation(300,200);

        Object[] fila1 = {1,"firulais"};
        Object[] fila2 = {2,"lucky"};
        model.addRow(fila1);
        model.addRow(fila2);


    }

}

