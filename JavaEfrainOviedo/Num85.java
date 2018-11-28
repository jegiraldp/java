/**
* EJERCICIO RESUELTO No. 85
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Este ejercicio es desarrollado como un applet
*/

import java.awt.*;
import java.applet.Applet;

public class Num85 extends Applet
{
	
	int num[][][];
	int n=0, cf = 0, ct = 0, m=0, cc=0, cb =0, npv,a=0, p=0;
	Label l1, l2;
	TextField t1, t2;
	Button b, b2;
	
	
	public void init()
	{
		l1 = new Label("Vuelo: " + (ct+1) + " Fila: " + (cf+1) + " Columna: " + (cc+1));
		l2 = new Label();
		l2.setText("Ingrese el numero a guardar la matriz y pulse el BOTON" );
		t2 = new TextField(10);
		add(l2);
		add(t2);
		b = new Button("Insertar Dato");
		add(b);
		add(l1);
		p=5; //planos 5
		n=50; //filas 50
		m=6; //columnas 6
		num = new int[p][n][m];
		l2.setText("Ingrese el 0: desocupado, 1: vendido y pulse el BOTON" );
		System.out.println("creo el vector");
		t2.setText("");
		
	}
	
	public void paint(Graphics g)
	{
		if(cb != 0)
		{
			for(int k=0; k<p; k++)
			{
				npv=0;
				for(int i=0; i<n; i++)
				{
					for(int j=0; j<m; j++)
					{
						if(num[k][i][j] == 1)
							npv++;
					}
				}
				g.drawString("El vuelo " + (k+1) + " lleva " + npv + " pasajeros", 40, 160+k*25);
			}
			g.drawString("Datos existentes en la matriz",  40, 90);
		}
	}
	
		
	public boolean action(Event e, Object o)
	{
		if(e.target instanceof Button)
		{
			if(e.target == b)
			{
				a = Integer.parseInt(t2.getText());
				if(cb < (n*m*p))
				{
					if((a==0)||(a==1))
					{
						num[ct][cf][cc] = a;
						cb++;//contador de instancias de boton para insertar en 
							 //la posicion correcta del vector
						cc++;
						if((cc == m)&&(cf<n)&&(ct<p))
						{
							cc =0;
							cf ++;
							if((cf==n)&&(ct<p))
							{
								ct++;
								cf=0;
							}
						}
						t2.setText("");
						l1.setText("Vuelo: " + (ct+1) + " Fila: " + (cf+1) + " Columna: " + (cc+1));
					}
				}
				if(cb == (n*m*p))
				{
					t2.setVisible(false);
					l2.setVisible(false);
					l1.setVisible(false);
					b.setVisible(false);
					
					repaint();
				}
			}
		}
		return true;
	}
}