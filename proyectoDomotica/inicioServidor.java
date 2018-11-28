
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Calendar;
import javax.swing.*;


public class inicioServidor extends JFrame implements ActionListener{
    
      static JTextArea txtArea, txtMonitor;
      static JButton btnSaldo;
     	
	public inicioServidor(){
                /////FONDO
                Color c = new Color(255,255,255);
		getContentPane().setBackground(c);
                /////FONDO

                //Elementos
		txtArea = new JTextArea();
                txtArea.setBounds(20, 50, 350, 30);
                txtArea.setEditable(false);
                
                txtMonitor = new JTextArea();
                txtMonitor.setBounds(20, 90, 350, 400);
                txtMonitor.setEditable(false);
                
                btnSaldo = new JButton ("Iniciar Reporte");
		btnSaldo.setBounds(150,10,120,30);
                btnSaldo.addActionListener(this);
                
		add(txtArea);
                add(txtMonitor);
                add(btnSaldo);
			
		
		setLayout(null);
		setSize(340,400);
                setTitle("Domotic - Beta");
		setResizable(false); // con este se desactiva el boton maximizar
		//setExtendedState(MAXIMIZED_BOTH);  // con esta instrucci?n sale maximizada por defecto
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		setLocation(300,200);
                setVisible (true);
		
	}

	
	public static void main (String arg[]) throws IOException, InterruptedException{
                            
		inicioServidor ven = new inicioServidor();
                writeArea("");
                servidorTCP.iniciar();
                
                		
	}//main
        
        
        public static void writeArea(String texto){
        String t= "--------------------------------------------------------------------\n";   
        t+="Domotic - Console\n";
        txtArea.setText(t+texto);
        }
	
         	
         public static void writeAreaReporte(String texto){
           txtMonitor.setText(texto);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        new hiloReporte().start();
    }
	
}
