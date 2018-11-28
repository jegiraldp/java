/**
* EJERCICIO RESUELTO No. 54
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Este ejercicio es desarrollado como un applet
*/

import java.awt.*;
import java.applet.Applet;

public class Num54 extends Applet
{
	
	int num[];
	int n=0, cb = 0, ct = 0, nei=1, suma =0, k;
	float prom;
	Label l1;
	TextField t1;
	Button b, b2;
	
	
	public void init()
	{
		l1 = new Label("Ingrese la longitud del vector y pulse ENTER                           ");
		t1 = new TextField(10);
		add(l1);
		add(t1);
		b = new Button("Insertar Dato");
		b.setEnabled(false);
		add(b);
	}
	
	public void paint(Graphics g)
	{
		for(int i=0; i<n; i++)
		{
			g.drawString("Datos existentes en el vector",  40, 40);
			g.drawString("" + num[i],  40+25*(i+1), 60);
			g.drawString("la suma de la posiciones impares es: " + suma + " y el promedio es: " + prom, 40, 90);;
			showStatus("Programa Terminado");
		}
	}
	
	
	public boolean action(Event e, Object o)
	{	
		if(e.target == t1)
		{
				
			if(ct == 0)
			{
				n = Integer.parseInt(t1.getText());
				if (n>1){
					ct++;//contador de las instancias del campo de texto
									 //para controlar que sea creado el vector solamente una vez
					num = new int[n];
					l1.setText("Ingrese el numero a guardar en el vector y pulse el BOTON" );
					t1.setText("");
					b.setEnabled(true);
				}
				
				
				
				
			}
			
		}
		if(e.target instanceof Button)
		{
			if(e.target == b)
			{
				if(cb < n)
				{
					num[cb] = Integer.parseInt(t1.getText());
					cb++;//contador de instancias de boton para insertar en 
						 //la posicion correcta del vector
					t1.setText("");
				}
				if(cb==n)
				{
					t1.setVisible(false);
					l1.setVisible(false);
					b.setVisible(false);
					k = 1;
					nei=1;
					while(k <= n-1)
					{
						suma = suma + num[k];
						nei++;
						k = k+2;
					}
					if(nei>0)
						prom = (suma/(nei-1));
					repaint();
				}
			}
	
			
		}
		return true;
	}
}