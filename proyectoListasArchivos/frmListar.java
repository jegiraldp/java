import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class frmListar extends JFrame implements ActionListener {
    JLabel lblTitulo, lblDocumento,lblNombre,lblTelefono,lblFoto, lblRuta;
    JTextField  txtDocumento,txtNombre,txtTelefono,txtFoto;
    JButton btnRegresar, btnBuscar, btnVer, btnFind, btnNewFoto, btnActualizar;
    ImageIcon imgHome,imgVer,imgBuscar, imgFind, imgFoto,imgChange;
    static frmListar ventana;
    static JTable tabla;
    static DefaultTableModel model;
    static JScrollPane scrollpane;
    static ArrayList<contacto> contactList;
    static contacto con;
    static JFileChooser fileChooser;
    static FileNameExtensionFilter filtro;
    static File archivoSeleccionado;
    static String nombreArchivo;


    public static frmListar crear(ArrayList<contacto> listaContactos) throws IOException{
        contactList=listaContactos;
        if(ventana==null) {
            //System.out.println("es null");
            ventana = new frmListar();
        }
            //cargarLista
        model.setRowCount(0);
        for (contacto c:contactList) {
            Object[] fila = {c.getDocumento(), c.nombre, c.telefono,c.foto};
            model.addRow(fila);
        }
            //


            return ventana;

    }

    public frmListar() throws IOException {
        //configuracion
        imgHome = new ImageIcon(".\\img\\back.png");
        imgVer = new ImageIcon(".\\img\\view.png");
        imgBuscar = new ImageIcon(".\\img\\search.png");
        imgFind = new ImageIcon(".\\img\\find.png");
        imgChange = new ImageIcon(".\\img\\change.png");

        lblTitulo = new JLabel("Lista de contactos");
        lblTitulo.setLocation(125, 20);
        lblTitulo.setSize(150, 30);
        lblTitulo.setFont(new Font("Arial", Font.PLAIN, 18));

        btnVer = new JButton(imgVer);
        btnVer.setLocation(300, 20);
        btnVer.setSize(50, 30);
        btnVer.addActionListener(this);

        btnBuscar = new JButton(imgBuscar);
        btnBuscar.setLocation(360, 20);
        btnBuscar.setSize(50, 30);
        btnBuscar.addActionListener(this);

        btnRegresar = new JButton(imgHome);
        btnRegresar.setLocation(40, 20);
        btnRegresar.setSize(50, 30);
        btnRegresar.addActionListener(this);

        model = new DefaultTableModel();
        tabla = new JTable(model);
        model.addColumn("Documento");
        model.addColumn("Nombre");
        model.addColumn("Teléfono");
        model.addColumn("Foto");

        scrollpane = new JScrollPane(tabla);
        scrollpane.setLocation(40,80);
        scrollpane.setSize(380,300);

        lblDocumento = new JLabel("Documento");
        lblDocumento.setBounds(40,80,100,30);
        lblDocumento.setVisible(false);

        txtDocumento = new JTextField();
        txtDocumento.setBounds(120,80,150,30);
        txtDocumento.setVisible(false);

        btnFind = new JButton(imgFind);
        btnFind.setBounds(280,80,50,30);
        btnFind.addActionListener(this);

        lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(40,120,100,30);
        lblNombre.setVisible(false);

        txtNombre = new JTextField();
        txtNombre.setBounds(120,120,150,30);
        txtNombre.setVisible(false);

        lblTelefono = new JLabel("Teléfono");
        lblTelefono.setBounds(40,160,100,30);
        lblTelefono.setVisible(false);

        txtTelefono = new JTextField();
        txtTelefono.setBounds(120,160,150,30);
        txtTelefono.setVisible(false);

        lblFoto = new JLabel();
        lblFoto.setBounds(120,200,100,100);
        lblFoto.setVisible(false);

        btnNewFoto = new JButton(imgChange);
        btnNewFoto.setBounds(220,250,50,30);
        btnNewFoto.addActionListener(this);
        btnNewFoto.setVisible(false);

        lblRuta = new JLabel("");
        lblRuta.setBounds(280,250,100,30);
        lblRuta.setVisible(false);

        btnActualizar = new JButton("Actualizar");
        btnActualizar.setBounds(120,300,100,30);
        btnActualizar.addActionListener(this);
        btnActualizar.setVisible(false);



        //add
        add(lblTitulo);
        add(btnRegresar);
        add(scrollpane, BorderLayout.CENTER);
        add(btnVer);
        add(btnBuscar);
        add(btnFind);
        add(lblDocumento);
        add(txtDocumento);
        add(lblNombre);
        add(txtNombre);
        add(lblTelefono);
        add(txtTelefono);
        add(lblFoto);
        add(btnNewFoto);
        add(lblRuta);
        add(btnActualizar);


        //set
        Color c = new Color(173, 216, 230);
        getContentPane().setBackground(c);

        setLayout(null);
        setSize(550, 450);
        setTitle("Agenda de contactos");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(300, 200);



    }

    public void actionPerformed(ActionEvent e)  {

        if(e.getSource().equals(btnRegresar)){
            frmInicio.vInicio.setVisible(true);
            ventana.setVisible(false);

        }

        if(e.getSource().equals(btnBuscar)){
            scrollpane.setVisible(false);
            lblNombre.setVisible(false);
            txtNombre.setVisible(false);
            lblTelefono.setVisible(false);
            txtTelefono.setVisible(false);
            lblDocumento.setVisible(true);
            txtDocumento.setVisible(true);
            txtDocumento.setEnabled(true);
            lblFoto.setVisible(false);
            btnNewFoto.setVisible(false);
            lblRuta.setVisible(false);
            btnActualizar.setVisible(false);

        }
        if(e.getSource().equals(btnVer)){
            scrollpane.setVisible(true);
        }

        if(e.getSource().equals(btnFind)){
            String entrada=txtDocumento.getText();
            if(entrada.length()==0){
                JOptionPane.showMessageDialog(ventana,"Faltan datos");
            } else if  (!esNumero(entrada)) {
                JOptionPane.showMessageDialog(ventana,"Solo números");
            } else if ((con=getContacto(entrada))!=null) {
                txtDocumento.setEnabled(false);
                lblNombre.setVisible(true);
                txtNombre.setVisible(true);
                txtNombre.setText(con.nombre);
                lblTelefono.setVisible(true);
                txtTelefono.setVisible(true);
                txtTelefono.setText(con.telefono);
                lblFoto.setIcon(new ImageIcon(".\\photos\\"+ con.foto));
                lblFoto.setVisible(true);
                btnNewFoto.setVisible(true);
                lblRuta.setVisible(true);
                lblRuta.setText(con.foto);
                btnActualizar.setVisible(true);
                nombreArchivo=con.foto;


            }else{
                JOptionPane.showMessageDialog(ventana,"Contacto no existe");
            }

        }

        if(e.getSource().equals(btnNewFoto)){
            fileChooser = new JFileChooser();
            filtro = new FileNameExtensionFilter("Imágenes (PNG, JPEG, GIF)",
                    "png", "jpeg", "jpg", "gif");
            fileChooser.setFileFilter(filtro);
            int resultado = fileChooser.showOpenDialog(null);
            if (resultado == JFileChooser.APPROVE_OPTION) {
                archivoSeleccionado = fileChooser.getSelectedFile();
                nombreArchivo=archivoSeleccionado.getName();
                lblRuta.setText(nombreArchivo);
                lblFoto.setIcon(new ImageIcon(archivoSeleccionado.toString()));

            }

            }

        if(e.getSource().equals(btnActualizar)){
             String carpetaDestino = ".\\photos\\";
             if(archivoSeleccionado!=null){
                 try {
                     Path origen = archivoSeleccionado.toPath();
                     Path destino = new File(carpetaDestino, archivoSeleccionado.getName()).toPath();
                     Files.copy(origen, destino, StandardCopyOption.REPLACE_EXISTING);
                     JOptionPane.showMessageDialog(null, "Foto cargada");
                 } catch (IOException ex) {
                     ex.printStackTrace();
                     JOptionPane.showMessageDialog(null, "Error : " + ex.getMessage());
                 }
             }

                //actualizar lista
            for (contacto cnt:contactList) {
                if(cnt.getDocumento().equals(txtDocumento.getText())){
                   // System.out.println("actualizando");
                    cnt.nombre=txtNombre.getText().trim();
                    cnt.telefono=txtTelefono.getText().trim();
                    cnt.foto=nombreArchivo;
                    JOptionPane.showMessageDialog(null, "Registro Actualizado");
                    model.setRowCount(0);
                    for (contacto c:contactList) {
                        Object[] fila = {c.getDocumento(), c.nombre,
                                c.telefono,c.foto};
                        model.addRow(fila);
                    }
                }

            }
        }

    }


        public static boolean esNumero(String texto) {

            try{
               int num = Integer.parseInt(texto);
                return true;
            }catch(Exception ex){
                return false;
            }

        }

        public static contacto getContacto(String documento) {
            documento = documento.trim();
            for (contacto c : contactList) {
                if (c.getDocumento().equals(documento)) {
                    return c;
                }

            }
            return null;
        }
    }//class
