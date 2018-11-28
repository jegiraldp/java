/**
* EJERCICIO RESUELTO No. 74
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Este ejercicio es desarrollado como un applet
*/

import java.awt.*;
import java.applet.Applet;

public class Num74 extends Applet
{
	
	int num[][], tras[][];
	int n=0, cf = 0, ct = 0, m=0, cc=0, cb =0, sdp =0, sds =0, c =0;
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
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				g.drawString("   " + num[i][j],  40+j*25, 120+i*25);
			}
		}
		for(int i=0; i<m; i++)
		{
			for(int j=0; j<n; j++)
			{
				g.drawString("   " + tras[i][j],  40+j*25, 230+i*25);
				showStatus("Programa Terminado");
			}
		}
		
		if(cb != 0)
		{
			g.drawString("Datos existentes en la matriz original",  40, 90);
			g.drawString("Datos existentes en la matriz traspuesta",  40, 210);
		
		}
	}
	
	public void Traspuesta()
	{
		for(int i=0; i<m; i++)
		{
			for(int j=0; j<n; j++)
			{
				tras[i][j] = num[j][i];
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
					tras = new int[m][n];
				}
				l2.setText("Ingrese los elementos de la matriz por filas y pulse el BOTON" );
				System.out.println("creo el vector");
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
				//se lleno la matriz
				if(cb==(n*m))
				{
					t2.setVisible(false);
					l2.setVisible(false);
					b.setVisible(false);
					l0.setVisible(false);
					Traspuesta();
					repaint();
				}
			}
		}
		return true;
	}
}