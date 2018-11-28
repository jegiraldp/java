/**
* EJERCICIO RESUELTO No. 78
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Este ejercicio es desarrollado como un applet
*/

import java.awt.*;
import java.applet.Applet;

public class Num78 extends Applet
{
	
	float VEN[][];
	int n=0, cf = 0, ct = 0, m=31, cc=0, cb =0;
	Label l0, l2;
	float suma=0;
	TextField t1, t2;
	Button b, b2;
	
	
	public void init()
	{
		l0 = new Label(" Fila: " + (cf+1) + " Columna: " + (cc+1));
		l2 = new Label("Ingrese el numero de productos y pulse ENTER                                      ");
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
					g.drawString("   " + VEN[i][j],  40+25*j, 120+25*i);
				}
			}
			g.drawString("Datos existentes en la matriz",  40, 90);
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
				n = Integer.parseInt(t2.getText()); //productos
				if (n>0)
				{
					VEN = new float[n][(m+3)];
					
				}
				l2.setText("Ingrese los elementos de la matriz por filas y pulse el BOTON" );
				t2.setText("");
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
					VEN[cf][cc] = Float.parseFloat(t2.getText());
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
					Calcular();
					repaint();
				}
			}
		}
		return true;
	}
	
	public void Calcular()
	{
		int ndhv;
		float suma;
		
		for(int i=0; i<n; i++){
			suma=ndhv=0;
			for(int k=1; k<m; k++){
				suma= suma + VEN[i][k];
				if(VEN[i][k]!=0)
					ndhv++;
			}
			VEN[i][31]= suma/30;
			if(ndhv==0)
				VEN[i][32]= 0;
			else
				VEN[i][32]= suma/ndhv;	
			VEN[i][33]= ndhv;
		}
		m=m+3;
	}
}