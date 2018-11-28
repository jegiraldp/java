/**
* EJERCICIO RESUELTO No. 72
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Este ejercicio es desarrollado como un applet
*/

import java.awt.*;
import java.applet.Applet;

public class Num72 extends Applet
{
	
	int num[], au[];
	String a="";
	int n=0, cb = 0, ct = 0, k;
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
			g.drawString("Datos existentes en el vector original",  40, 40);
			g.drawString("" + a,  40, 60);
			g.drawString("Datos existentes en el vector sin repeticiones",  40, 120);
			showStatus("Programa Terminado");
			g.drawString("" + Ordenar(),  40, 140);
		}
			
			
	}
	
	public String Ordenar()
	{
		String s = "";
		int nu[];
		k = 0;
		for(int i=0;i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if((num[i] == num[j])&&(num[i]!= 0))
				{
					num[j] = 0;
					k++;
				}
			}
		}
		
		for(int j=0; j<(n-k); j++)
		{
			if(num[j]!=0)
				s = s + "   " + Integer.toString(num[j]);
		}

		return s;
	}
	
	public boolean action(Event e, Object o)
	{
		if(e.target == t1)
		{
			
			if(ct == 0)
			{
				n = Integer.parseInt(t1.getText());
				if (n>1)
				{
					ct++;//contador de las instancias del campo de texto
						 //para controlar que sea creado el vector solamente una vez
					num = new int[n];
					au = new int[n];
					l1.setText("Ingrese el numero a guardar en el vector y pulse el BOTON" );
					System.out.println("creo el vector");
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
					au[cb] = Integer.parseInt(t1.getText());
					a = a + "   " + t1.getText();
					cb++;//contador de instancias de boton para insertar en 
						 //la posicion correcta del vector
					t1.setText("");
				}
				if(cb==n)
				{
					t1.setVisible(false);
					l1.setVisible(false);
					b.setVisible(false);
				
					repaint();
				}
			}
		}
		return true;
	}
}