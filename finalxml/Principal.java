/*
 * Main.java
 *
 * Created on 29 de noviembre de 2007, 17:02
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

//package finalxml;

import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import org.w3c.dom.*;
import org.xml.sax.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource; 
import javax.xml.transform.stream.StreamResult;
import javax.xml.*;
import javax.swing.tree.*;
import org.xml.sax.helpers.*;
import java.util.Arrays;
import java.util.Vector;


/**
 *
 * @author Administrador
 */
public class Principal extends JFrame implements ActionListener
{
	JPanel panelMain;
	JTextField txA, taroot, tanumnod, tanod1, tanod2, tanod3, tanod4;
	JButton btnOpenFileA, crearxml, aceptaroot, acepterror1, aceptnumnod, aceptnodos, cancelnodos, mostrar;
	JFileChooser fileChooser;
	JMenuBar menu;
        JMenu menu1, menu2;
        JMenuItem salir, creditos;
        int band = 0, num, j=0, k = 0;
        static Document xmldoc, docxml;
        JFrame frameroot, error1, framenumnod, pidenodos;
        JComboBox padres;
        Vector vectnombres;
        Element raiz;
        Element [] arraynodos;
        Transformer aTransformer, bTransformer;
        JScrollPane scrollPane, scrollPane2;
               
	public Principal()
	{
            panelMain = new JPanel();
        
            txA = new JTextField(40);
     
            btnOpenFileA    = new JButton("Abrir");
            crearxml    = new JButton("Crear");
            mostrar = new JButton("MostrarXML");
        
            fileChooser = new JFileChooser(); 
        
               
        addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				exit();
			}	
		});     
    }
	
	
	private void initComponents()
	{
		panelMain.setLayout(new BorderLayout());//distribucuion panel principal
		
		JPanel panelFiles = new JPanel();//creamos panel archivos
                
		panelFiles.setLayout(new GridLayout(1, 3));//distribucion panel archivos
                	
		panelFiles.add(new JLabel("Archivo 1"));//agrega jlabel al panel archivos
		panelFiles.add(txA);//agrega txtarea al panel archivos
				
		btnOpenFileA.addActionListener(this);//ponemos escuchador de eventos al jbutton
		btnOpenFileA.setToolTipText("Abre xml");//pone texto cuando paso cursor sobre el boton
		panelFiles.add(btnOpenFileA);//agrega jbutton al panel archivos
		               
		panelMain.add(BorderLayout.NORTH, panelFiles);//agrega panel de archivos al panel principal
                               
		JPanel panelCrear = new JPanel();//creamos panel archivos 
                 
                panelCrear.setLayout(new GridLayout(1, 3));//distribucion panel archivos
                
                panelCrear.add(new JLabel("Generar XML:"));//agrega jlabel al panel archivos
                
                crearxml.addActionListener(this);//ponemos escuchador de eventos al jbutton
		crearxml.setToolTipText("crea archivo xml");//pone texto cuando paso cursor sobre el boton
		panelCrear.add(crearxml);//agrega jbutton al panel archivos
		
                
                mostrar.addActionListener(this);//ponemos escuchador de eventos al jbutton
		mostrar.setToolTipText("mostrar xml creado");//pone texto cuando paso cursor sobre el boton
		panelCrear.add(mostrar);//agrega jbutton al panel archivos
                
		panelMain.add(BorderLayout.SOUTH, panelCrear);//agrega panel de archivos al panel principal
                                
		menu    = new JMenuBar();
                menu1    = new JMenu("Archivo");
                menu2   = new JMenu("Acerca de"); 

                salir    = new JMenuItem("Salir");
                salir.addActionListener(this);

                menu1.add(salir);
                menu1.addSeparator(); 

                creditos    = new JMenuItem("Creditos");        
                creditos.addActionListener(this);

                menu2.add(creditos);
                menu2.addSeparator(); 		
		
		menu.add(menu1);
		menu.add(menu2);
		
		setJMenuBar(menu);
		
		this.getContentPane().add(panelMain);
                this.setSize(400, 400);
                this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
            if (e.getSource() == btnOpenFileA) //funcion para el boton que abre el archivo a
            {                
                    int returnVal = fileChooser.showOpenDialog(this);
                    
            if (returnVal == JFileChooser.APPROVE_OPTION)
            {                
            	File fileA = fileChooser.getSelectedFile();
                txA.setText(fileA.getName());
                
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                
                try{
                       DocumentBuilder builder = factory.newDocumentBuilder();
                        		
                       System.out.println(fileA.getAbsolutePath());
                                               
                       xmldoc = builder.parse(fileA);                        
                                             
                       TransformerFactory tranFactory = TransformerFactory.newInstance(); 
                       aTransformer = tranFactory.newTransformer(); 
                       //salida del xml a consola
                        Source src = new DOMSource(xmldoc); 
                        Result dest = new StreamResult(System.out); 
                        aTransformer.transform(src, dest);                                           
                        
                }catch(SAXException e1){
			System.err.println("Error al analizar el archivo");
			System.err.println(e1);
		}catch(IOException e1){
			System.err.println("Se ha producido un error de entrada  / salida");
                        System.out.print(e1);
		}catch(ParserConfigurationException e1){
			System.err.println("Se ha producido un error ParserConfigurationException");
		}catch(TransformerConfigurationException e1){
			System.err.println("Se ha producido un error TransformerConfigurationException");
		}catch(TransformerException e1){
			System.err.println("Se ha producido un error TransformerException");
		}
                
                if(scrollPane2 != null){
                    this.panelMain.remove(scrollPane2);
                }                
                
                Node rootNode = xmldoc.getFirstChild();
                DefaultMutableTreeNode root = new DefaultMutableTreeNode(rootNode.getNodeName());
                treeWalk(rootNode, 0, root);
                JTree tree = new JTree(root);                
                scrollPane = new JScrollPane(tree);
                panelMain.add(BorderLayout.CENTER, scrollPane);
                
                this.getContentPane().add(panelMain);
                this.setSize(400, 400);
                this.setVisible(true);
            }       
                       
            }else if(e.getSource() == salir)   //opcion del menu salir     
            {
                    exit();        	
            }else if(e.getSource() == creditos)//opcion del menu creditos
            {
                acercaDe frameAcerca = new acercaDe();
                frameAcerca.setVisible(true);
            }else if(e.getSource() == crearxml)//Boton crear archvo xml
            {
                frameroot = new JFrame("inserte nodo Raiz");
                JPanel panel1 = new JPanel();
                panel1.setLayout(new GridLayout(3,1));//distribucion panel archivos
                
                panel1.add(new JLabel("Ingrese Nombre del Nodo Raiz"));//agrega jlabel al panel archivos
                
                taroot = new JTextField();
                
                aceptaroot = new JButton("Aceptar");
                aceptaroot.addActionListener(this);//ponemos escuchador de eventos al jbutton
		aceptaroot.setToolTipText("Acepta Nombre de nodo raiz");
                
                panel1.add(taroot);
                panel1.add(aceptaroot);
                
                                
                frameroot.getContentPane().add(panel1);
                frameroot.setSize(200, 100);
                //frameroot.pack();
                frameroot.setVisible(true);
                
            }else if(e.getSource() == aceptaroot)//Aceptar del nombre del nodo raiz
            {
                if(taroot.getText().equals(""))//valida si el campo de texto esta vacio
                {
                    error("Debe Ingresar Nombre del Nodo Raiz");                    
                }
                else
                {
                    frameroot.dispose();
                    
                    String rootname = taroot.getText();
                    
                    DocumentBuilderFactory factory1 = DocumentBuilderFactory.newInstance();
                    
                    vectnombres = new Vector(1);
                    
                   try{                 
                       DocumentBuilder builder1 = factory1.newDocumentBuilder();
                       docxml = builder1.newDocument();
                     
                     if(isNumeric(rootname))
                     {                          
                           error("El nombre no puede ser numerico"); 
                     }
                     else                     
                     {
                           raiz = docxml.createElement(rootname);
                           docxml.appendChild(raiz);

                           if(raiz!=null)
                           {
                                vectnombres.add(raiz.getTagName());                           
                           }
                           else
                           {
                                error("nodo no fue creado satisfacoriamente");
                           }
                     }
                   
                   }catch(ParserConfigurationException e2)
                   {
                       System.err.println("Se ha producido un error ParserConfigurationException");
                   }
                    
                    
                    framenumnod = new JFrame("inserte numero de nodos");
                    JPanel panel2 = new JPanel();
                    panel2.setLayout(new GridLayout(3,1));//distribucion panel archivos

                    panel2.add(new JLabel("Ingrese Numero de Nodos"));//agrega jlabel al panel archivos

                    tanumnod = new JTextField();
                    aceptnumnod = new JButton("Aceptar");
                    aceptnumnod.addActionListener(this);//ponemos escuchador de eventos al jbutton
                    aceptnumnod.setToolTipText("Acepta Numero de nodos");

                    panel2.add(tanumnod);
                    panel2.add(aceptnumnod);


                    framenumnod.getContentPane().add(panel2);
                    framenumnod.setSize(200, 100);
                    //frameroot.pack();
                    framenumnod.setVisible(true);                   
                    
                }
            }else if(e.getSource() == acepterror1)//Aceptar del mensaje de error
            {
                error1.dispose();
            }
            else if(e.getSource() == aceptnumnod)//Acepta numero de nodos
            { 
                          
                if(tanumnod.getText().isEmpty())//valida si el campo de texto esta vacio
                {
                    error("Debe Ingresar el numero de nodos");
                }else
                {   num=0;
                    try
                    {    
                        num = Integer.parseInt(tanumnod.getText()); 
                    }catch(NumberFormatException e3)
                    {
                        error("El dato debe ser numerico");
                        tanumnod.setText(null);
                    } 
                     
                    if(num != 0)
                    {
                        framenumnod.dispose();
                        nodos();
                    }
                    else
                    {
                        error("No puede ser cero");
                        tanumnod.setText(null);
                    }
                }
                
               arraynodos = new Element [num+1];
               arraynodos[0] = raiz;
            }
            else if(e.getSource() == aceptnodos)
            {
                j++;
                
                
                if(tanod1.getText().isEmpty())
                {
                    error("El nombre del nodo es obligatorio");
                }
                else
                {
                    Element nodohijo = docxml.createElement(tanod1.getText());
                    nodohijo.setTextContent(tanod2.getText());
                    
                    if(tanod3.getText().isEmpty() && tanod4.getText().isEmpty())
                    {
                        
                    }else
                    {
                        if(tanod3.getText().isEmpty())
                        {
                            error("entro valor de atributo sin darle un nombre");
                        }
                        else if(tanod3.getText().isEmpty())
                        {
                            error("entro un atributo sin valor");
                        }                        
                        nodohijo.setAttribute(tanod3.getText(),tanod4.getText());
                    }
                   k++;
                   arraynodos[k] = nodohijo;
                   arraynodos[padres.getSelectedIndex()].appendChild(nodohijo);                   
                   vectnombres.add(nodohijo.getTagName());
                   pidenodos.dispose();
                   
                }
                if(j < num){
                    nodos();                   
                }  

            }
            else if(e.getSource() == cancelnodos)
            {
                band = 1;
                Document docxml = null;
                pidenodos.dispose();
                j=0;
                num=0;
                arraynodos = null;
            }else if(e.getSource() == mostrar)
            {   
//                   try{ 
//                      
//                        TransformerFactory tranFactoryb = TransformerFactory.newInstance();
//                        bTransformer = tranFactoryb.newTransformer(); 
//                        Source src1 = new DOMSource(docxml); 
//                        Result dest1 = new StreamResult(System.out); 
//                        bTransformer.transform(src1, dest1);                         
//                   
//                    }catch(TransformerConfigurationException e7){
//			System.err.println("Se ha producido un error TransformerConfigurationException");
//                    }catch(TransformerException e7){
//			System.err.println("Se ha producido un error TransformerException");
//                    }
                
                try{
                    this.panelMain.remove(scrollPane);
                    
                    Node rootNode2 = docxml.getFirstChild();
                    DefaultMutableTreeNode root2 = new DefaultMutableTreeNode(rootNode2.getNodeName());
                    treeWalk(rootNode2, 0, root2);
                    JTree tree2 = new JTree(root2);                
                    scrollPane2 = new JScrollPane(tree2);
                    panelMain.add(BorderLayout.CENTER, scrollPane2);

                    this.getContentPane().add(panelMain);
                    this.setSize(400, 400);
                    this.setVisible(true);
                }catch(NullPointerException e8)
                {
                    error("Debe crear primero el xml");
                }
                  padres = null;                  
            }            
	}
	 
	void exit()
        {
                String mensaje = "¿Está Seguro de Abandonar la aplicacion?";
		String titulo = "Abandonar aplicacion";
		int opciones = JOptionPane.YES_NO_OPTION;
		
		if (JOptionPane.showConfirmDialog(this, mensaje, titulo, opciones) == JOptionPane.YES_OPTION)
		{
            System.exit(0);
        }        
    }
        //recorre los hijos del nodo root y los agrega como treenode
        public static void treeWalk( Node node, int level, DefaultMutableTreeNode parentNode)
        {

		String nodeName = node.getNodeName();
		DefaultMutableTreeNode childNode = null;

		if (node.hasChildNodes()) {
			level++;
			System.out.println(repeat(level, ' ').append(nodeName));
			NodeList list = node.getChildNodes();
			int len = list.getLength();
			for (int i = 0; i < len; i++) {
				Node child = list.item(i);
				childNode = new DefaultMutableTreeNode(child.getNodeName());                                
				if(child.getNodeName().equals("#text")){}
                                else{
                                parentNode.add(childNode);                                
                                }
				treeWalk(list.item(i), level, childNode);
			}
		} else {
                    
			childNode = new DefaultMutableTreeNode(node.getNodeValue());
                        System.out.println(
			repeat(level, ' ').append(node.getTextContent()));
			parentNode.add(childNode);                       
		}
                //System.out.println("Niveles del arbol" + level);
	}
        
        public void error(String error)
        {
            error1 = new JFrame("Error de Entrada");
            JPanel panelerror1 = new JPanel();
            panelerror1.setLayout(new GridLayout(2,1));

            panelerror1.add(new JLabel(error));                    

            acepterror1 = new JButton("Aceptar");
            acepterror1.addActionListener(this);//ponemos escuchador de eventos al jbutton
            acepterror1.setToolTipText("Aceptar");
            panelerror1.add(acepterror1);

            error1.getContentPane().add(panelerror1);
            error1.setSize(250,150);
            error1.setVisible(true);
        }
        
        public void nodos()
        {
            pidenodos = new JFrame("Inserte valores de la etiqueta");
            JPanel panel3 = new JPanel();
            panel3.setLayout(new GridLayout(6,2));//distribucion panel archivos
            
            panel3.add(new JLabel("Seleccione padre del nodo: "));
            padres = null;
            padres = new JComboBox(vectnombres);
            padres.setSelectedIndex(0);
            panel3.add(padres);
            
            panel3.add(new JLabel("Ingrese nombre del tag: "));
            tanod1 = null;
            tanod1 = new JTextField();
            panel3.add(tanod1);
            
            panel3.add(new JLabel("Ingrese contenido del tag: "));
            tanod2 = null;
            tanod2 = new JTextField();
            panel3.add(tanod2);
            
            panel3.add(new JLabel("Ingrese nombre del atributo: "));
            tanod3 = null;
            tanod3 = new JTextField();
            panel3.add(tanod3);
            
            panel3.add(new JLabel("Ingrese valor del atributo: "));
            tanod4 = null;
            tanod4 = new JTextField();
            panel3.add(tanod4);            
            
            aceptnodos = new JButton("Ingresar");
            aceptnodos.addActionListener(this);//ponemos escuchador de eventos al jbutton
            aceptnodos.setToolTipText("Ingresar Datos del Nodo");
            panel3.add(aceptnodos);
            
            cancelnodos = new JButton("Cancelar");
            cancelnodos.addActionListener(this);//ponemos escuchador de eventos al jbutton
            cancelnodos.setToolTipText("Cancelar Construccion");
            panel3.add(cancelnodos);
           
            pidenodos.getContentPane().add(panel3);
            pidenodos.pack();
            pidenodos.setVisible(true);            
        }
        
        public final static StringBuffer repeat(int n, char c)
        {
		char[] cA = new char[n];
		Arrays.fill(cA, c);
		return (StringBuffer) new StringBuffer().insert(0, cA);
	}
        
        private static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
}
	
	public static void main(String[] args) throws IOException, SAXException
	{
		Principal pri = new Principal();
	 	pri.initComponents();
	}
}
