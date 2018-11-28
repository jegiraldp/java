
package pqtCelular;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.*;


public class inicio extends JFrame implements ActionListener{
    
    static JLabel lblSaldo, saldo;
    static JTextField txtSaldo;
    static JButton btnSaldo;
    static JTextArea txtArea, txtMonitor;
    static hiloCelular[] hilos;
    static int saldoFavor;
    
 

     	
	public inicio(){
                /////FONDO
                Color c = new Color(255,255,255);
		getContentPane().setBackground(c);
                /////FONDO

                //Action Listener 
		saldoFavor=0;
		
		
		//Elementos
		lblSaldo = new JLabel ("Saldo:");
		lblSaldo.setBounds(20,10,50,30);
		
		txtSaldo = new JTextField(5);
		txtSaldo.setBounds(80,10,50,30);
				
		btnSaldo = new JButton ("Actualizar");
		btnSaldo.setBounds(150,10,120,30);
                btnSaldo.addActionListener(this);
                
                saldo = new JLabel("SF:"+saldoFavor);
                saldo.setForeground(Color.BLUE);
                saldo.setBounds(280,10,100,30);
                
                txtArea = new JTextArea();
                txtArea.setBounds(20, 50, 350, 30);
                txtArea.setEditable(false);
                
                txtMonitor = new JTextArea();
                txtMonitor.setBounds(20, 90, 500, 400);
                txtMonitor.setEditable(false);
                
		
		
		
		add(lblSaldo);
		add(btnSaldo);
		add(txtSaldo);
                add(txtArea);
                add(txtMonitor);
                add(saldo);
			
		
		setLayout(null);
		setSize(700,400);
                setTitle("cell_Kontrol - Beta");
		setResizable(false); // con este se desactiva el boton maximizar
		//setExtendedState(MAXIMIZED_BOTH);  // con esta instrucci?n sale maximizada por defecto
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		setLocation(300,200);
                setVisible (true);
		
	}

	
	public static void main (String arg[]) throws InterruptedException{
                            
		inicio ven = new inicio();
                                
                hiloEcabezado he = new hiloEcabezado("imprimir");
                
                hilos = new hiloCelular[6];
                hilos[0]= new hiloCelular("c1",123,1000,1000,"libre","Trabajando");
                hilos[1]= new hiloCelular("c2",124,1000,500,"libre","Trabajando");
                hilos[2]= new hiloCelular("c3",125,1000,500,"libre","Trabajando");
                hilos[3]= new hiloCelular("c3",126,1000,500,"libre","Trabajando");
                hilos[4]= new hiloCelular("c4",127,1000,500,"libre","Trabajando");
                hilos[5]= new hiloCelular("c5",128,1000,1000,"libre","Trabajando");
                hiloTablero ht=new hiloTablero("tablero",1000);
                
                
                for (int i = 0; i < hilos.length; i++) {
                hilos[i].join();
                }
                he.join();
                ht.join();
                
                
                System.out.println("\nFin");
		
		
	}//main
        
        
        public static void writeArea(String texto){
        String t= "--------------------------------------------------------------------\n";   
        t+="$ck:konsole#-";
        txtArea.setText(t+texto);
        }

	
public static void writeAreaReporte(String n){
             txtMonitor.setText(n);
        }



public void actionPerformed(ActionEvent e){
    
    String s = txtSaldo.getText();
    int sal = Integer.parseInt(s);
    saldoFavor+=sal;
    saldo.setText("SF:"+saldoFavor);
    for (int i = 0; i < hilos.length; i++) {
       hilos[i].setSaldo(hilos[i].getSaldo()+sal); 
    }
    
                    
}
	
	
}//
