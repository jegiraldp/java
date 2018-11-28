

//package finalxml;
/*
 * acercaDe.java
 *
 */


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Creditos del programa
 * @author Diego Andres Oviedo
 * @author Juan Josue Chitiva
 */
public class acercaDe extends JFrame {
    private JPanel jPanel1, jPanel2;
    private JLabel jLabel1;
    private JButton jButton1;
    
    /** Crea nueva instancia de acercaDe */
    public acercaDe() {
        initComponents();
    }
    /*
     *
     * Metodo que inicializa componentes
     *
     */
    private void initComponents(){
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jButton1 = new JButton();
        jLabel1 = new JLabel();
        
               
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                exitForm(evt);
            }
        });
        
        jLabel1.setText("\n Este Programa fue desarrolado por: \n" + "\n Diego Andres Oviedo \n" +"\n y \n "+ "\n Hernan Salazar\n");
        jPanel1.add(jLabel1);
        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
        
        jButton1.setText("Aceptar");
        jButton1.setToolTipText("Aceptar");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);
        pack();
    }
    
     private void jButton1ActionPerformed(ActionEvent evt) {
                
        dispose();
        
    }
    
    
    private void exitForm(WindowEvent evt) {
        dispose();
    }
      
     
    /**
     * Metodo que controla la salida
     */
    public void exit() {
              
            dispose();
        
    }
    
    
}
