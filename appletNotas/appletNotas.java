

import java.awt.*;
import java.awt.Button;
import java.applet.Applet;
import java.applet.*;
import java.awt.event.*;

import java.applet.Applet;
import java.applet.*;
import java.awt.event.*;

import java.io.*;

import javax.swing.*;


public class appletNotas extends Applet implements ActionListener {
   
    static Label lbl_gra, lbl_carg;
    static Button btn_gra, btn_carg;
    static Graphics g1,g2;
    static Graphics2D g2D_1,g2D_2;
    static int val;
    static appletNotas obj = new appletNotas();
	
    public void init() {
    	
    	setBackground(Color.yellow);
    	setLayout(null);
    	
    	lbl_gra = new Label("Frecuencia de las Notas");
    	lbl_gra.setBounds(100,500,200,30);
    	
    	btn_gra = new Button("Grafica");
    	btn_gra.setBounds(120,530,100,30); 
    	btn_gra.addActionListener(this);
    	
    	lbl_carg = new Label("Cargar Notas");
    	lbl_carg.setBounds(100,350,200,30);
    	
    	btn_carg = new Button("Cargar");
    	btn_carg.setBounds(120,380,100,30); 
       	btn_carg.addActionListener(this);
    	
      
    	add(lbl_carg);
    	add(btn_carg);
    	add(lbl_gra);
    	add(btn_gra);
       	
    	

    
 	
		}	
		
		
		public void actionPerformed(ActionEvent e)
 		{
 			
 				String actionCommand = e.getActionCommand();
 			
 				if (actionCommand.equals("Cargar")) 
			{
				val=1;
				try{
				
				Notas objNotas = new Notas();
				}catch(IOException ioe){
					JOptionPane.showMessageDialog(null, "Error Leyendo datos");
               JOptionPane.showMessageDialog(null, "Error" );
                			}
				
				
				JOptionPane.showMessageDialog(null, "Notas Cargadas con exito" );
				
	
			
			
			}	//botno cargar
			
			if (actionCommand.equals("Grafica"))
			{
				
				if (val==0){
					
					JOptionPane.showMessageDialog(null, "Debe cargar los datos primero" );
				}else{
			
		
				g1 = getGraphics();
				g2 = getGraphics();
				g2.setColor(Color.black);
				g2D_1 = (Graphics2D)g1;
				g2D_1.setStroke(new BasicStroke(5.0f));
				g2D_2 = (Graphics2D)g2;
				g2D_2.setStroke(new BasicStroke(2.0f));
				
				int salto=410, pos=180, tam, y, col=1, slt=380;
   				
   				for (int i=0; i<11; i++)   
   				{   					
   					 if(Notas.frec[i] != 0.0)
   					 {
   					 	if(col%2 == 0)
   					 		g1.setColor(Color.red);
   					 	else
   					 		g1.setColor(Color.blue);
   					 		
   					 	col++;
   					 	tam = (20 - Notas.frec[i]) * 22;	
   					 	y = pos + tam;				    				
   					 	g1.drawRect(salto,y,50,(440-tam));
   					 	g1.fillRect(salto,y,50,(440-tam));
   					 	
   					 /*	while(slt <= salto)
   					 	{
   					 		g2.drawLine(slt,y,(slt+10),y);
   					 		slt+=20;
   					 	}   */					 	  					 	
   					 }
   					 slt=380;
   					 salto+=75;
   				}
   							
   				g2.drawLine(380,180,380,630);
   				g2.drawLine(370,620,1250,620);
   				
   				int n=20, p=180;
   				String s; 
    			
   				for(int j=0; j<20; j++)
   				{
   					s = String.valueOf(n);
   					g2.drawString(s,345,p);
   					g2.drawLine(365,p,380,p);
   					p+=22;	
   					n--;	
   				}
   				
   				float acum=0.0F;
   				int	q=435;
   				String A;
   				
   				for(int j=0; j<11; j++)
   				{
   					A = String.valueOf(acum);
   					g1.drawString(A,q,655);
   					g1.drawLine(q,620,q,635);
   					q += 75;	
   					acum += 0.5;
   					//System.out.println(acum);
   				}  
   					
   					}		
			}
				
 		}//metodo
		


}//clase applet