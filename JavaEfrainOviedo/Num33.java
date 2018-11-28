/**
* EJERCICIO RESUELTO No. 33
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Este ejercicio es desarrollado como un applet 
*/

import java.awt.*;
import java.applet.Applet;

public class Num33 extends Applet
{
	int n;
	long factorial=0;
	Label l;
	TextField t;
	
	public void init()
	{
		l = new Label("Ingrese el numero limite para calcular el factorial y pulse ENTER");
		t = new TextField(10);
		add(l);
		add(t);
	}
	
	public void paint(Graphics g)
	{
		if(n == 0)
				factorial = 1;
			else
			{
				for(int i=1;i<=n;i++)
				{
					factorial = factorial * i;
				}
				g.drawString("El factorial de " + n + " es: " + factorial, 45, 60);
				factorial = 1;
				showStatus("Programa Terminado");
			}
	}
	
	public boolean action(Event e, Object o)
	{
		if(e.target == t)
		{
			n = Integer.parseInt(t.getText());
			repaint();
		}
		return true;
	}
}