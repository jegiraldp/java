/**
* EJERCICIO RESUELTO No. 73
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Este ejercicio es desarrollado como un applet
*/

import java.awt.*;
import java.applet.Applet;

public class Num73 extends Applet
{
	
	int num[][];
	int n=0, cf = 0, ct = 0, m=0, cc=0, cb =0, sdp =0, sds =0, c =0;
	Label  l2, l0;
	TextField  t2;
	Button b, b2;
	
	
	public void init()
	{ 
		l0 = new Label(" Fila: " + (cf+1) + " Columna: " + (cc+1));
		
		l2 = new Label("Ingrese el orden de la matriz y pulse ENTER                           ");
		t2 = new TextField(10);
		add(l2);
		add(t2);
		b = new Button("Insertar Dato");
		b.setEnabled(false);
		add(b);
		l0.setEnabled(false);
		add(l0);
	}
	
	public void paint(Graphics g)
	{
		
		if(cb != 0)
		{
			
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++)
				{
					g.drawString("   " + num[i][j],  40+25*j, 120+25*i);
					
				}
			}
			g.drawString("Datos existentes en la matriz",  40, 90);
			g.drawString("La suma de la diagonal principal es: " + sdp,  40, 300);
			g.drawString("La suma de la diagonal secundaria es: " + sds,  40, 350);
		}
			
			
			
	}
	
	
	
	public boolean action(Event e, Object o)
	{
		if(e.target == t2)
		{
			ct++;//contador de las instancias del campo de texto
				 //para controlar que sea creado el vector solamente una vez
			if(ct == 1)
			{
				n = Integer.parseInt(t2.getText());//filas
				m = n;//columnas
				if ((n>0)&&(m>0))
				{
					num = new int[n][m];//se crea la matriz
				}
				l2.setText("Ingrese los elementos de la matriz por columnas" );
				t2.setText("");
				
				l0.setEnabled(true);
				b.setEnabled(true);
				
			}
		}
		if(e.target instanceof Button)
		{
			if(e.target == b)
			{
				if(cb < (n*m))
				{
					num[cf][cc] = Integer.parseInt(t2.getText());
					cb++;//contador de instancias de boton para insertar en 
						 //la posicion correspondiente del vector
					cf++;//contador de filas
					if((cf == n)&&(cc<m))
					{
						cf =0;
						cc ++;//contador de columnas
					}
					t2.setText("");
					l0.setText(" Fila: " + (cf+1) + " Columna: " + (cc+1));
				}
				//se lleno la matriz
				if(cb==(n*m))
				{
					t2.setVisible(false);
					l2.setVisible(false);
					b.setVisible(false);
					l0.setVisible(false);
					for(int k=0; k<n; k++)
					{
						c=m-k-1;//columna para la sds
						sdp = sdp + (int)(num[k][k]);//suma diagonal principal
						sds = sds + (int)(num[k][c]);//suma diagonal secundaria
						
					}
					repaint();
				}
			}
		}
		return true;
	}
}