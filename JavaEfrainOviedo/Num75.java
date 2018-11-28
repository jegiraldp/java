/**
* EJERCICIO RESUELTO No. 75
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Este ejercicio es desarrollado como un applet
*/

import java.awt.*;
import java.applet.Applet;

public class Num75 extends Applet
{
	
	int num[][], SF[], SC[];
	int n=0, cf = 0, ct = 0, m=0, cc=0, cb =0, c =0, sc= 0, sf=0;
	Label l1, l2, l0;
	TextField t1, t2;
	Button b, b2;
	
	
	public void init()
	{
		l0 = new Label(" Fila: " + (cf+1) + " Columna: " + (cc+1));
		l1 = new Label("Ingrese el numero de columnas de la matriz                  ");
		t1 = new TextField(10);
		add(l1);
		add(t1);
		l2 = new Label("Ingrese el numero de filas de la matriz y pulse ENTER                           ");
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
		if(cb != 0)//mostrar el contenido de los vectores
		{
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++)
				{
					g.drawString("   " + num[i][j],  40+25*j, 120+25*i);
				}
			}
			g.drawString("Datos existentes en la matriz",  40, 90);
			g.drawString("El vector de sumas de filas es: ",  40, 300);
			for(int k=0; k<n; k++)
			{
				g.drawString("  "+ SF[k],  40 + 25*k, 330);
			}
			g.drawString("El vector de sumas de columnas es: ",  40, 360);
			for(int k=0; k<m; k++)
			{
				g.drawString("  "+ SC[k],  40 + 25*k, 390);
			}
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
				m = Integer.parseInt(t1.getText()); //Columnas
				n = Integer.parseInt(t2.getText()); //Filas
				if ((n>0)&&(m>0))
				{
					num = new int[n][m];
					SF = new int[n];
					SC = new int[m];
				}
				l2.setText("Ingrese los elementos de la matriz por filas y pulse el BOTON" );
				t2.setText("");
				l1.setVisible(false);
				t1.setVisible(false);
				b.setEnabled(true);
				l0.setEnabled(true);
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
						 //la posicion correcta del vector
					cc++;
					if((cc == m)&&(cf<n))
					{
						cc =0;
						cf ++;
					}
					t2.setText("");
					l0.setText(" Fila: " + (cf+1) + " Columna: " + (cc+1));
				}
				if(cb == (n*m))
				{
					t2.setVisible(false);
					l2.setVisible(false);
					b.setVisible(false);
					l0.setVisible(false);
						//suma de filas
					for(int i=0; i<n; i++)
					{
						sf=0;
						for(int j=0; j<m; j++)
						{
							sf = sf + num[i][j];
						}
						SF[i] = sf;
					}
					//suma de columnas
					for(int i=0; i<m; i++)
					{
						sc=0;
						for(int j=0; j<n; j++)
						{
							sc = sc + num[j][i];
						}
						SC[i] = sc;
						
					}
					repaint();
				}
			}
		}
		return true;
	}
}