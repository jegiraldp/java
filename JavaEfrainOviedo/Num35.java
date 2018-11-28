/**
* EJERCICIO RESUELTO No. 35
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Este ejercicio es desarrollado como un applet 
*/

import java.awt.*;
import java.applet.Applet;

public class Num35 extends Applet
{
	int n;
	long suma=0;
	Label l;
	TextField t;
	
	public void init()
	{
		l = new Label("Ingrese el numero limite para calcular la suma y pulse ENTER");
		t = new TextField(10);
		add(l);
		add(t);
	}
	
	public void paint(Graphics g)
	{
		if(n == 0)
				suma = 0;
		else
		{
			for(int i=1;i<=n;i++)
			{
				suma = suma + i;
			}
			g.drawString("La suma de los primeros " + n + " es: " + suma, 45, 60);
			suma = 0;
			showStatus("Programa Terminado");
		}
	}
	
	public boolean action(Event e, Object o)
	{
		if(e.target == t)
		{
			n = Integer.parseInt(t.getText());
			t.setText("");
			repaint();
		}
		return true;
	}
}