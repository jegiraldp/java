/**
* EJERCICIO RESUELTO No. 17
* @autor	Efrain Oviedo
* @libro	Logica de Programación
* 
* Este ejercicio es desarrollado como un applet
*/

import java.awt.*;
import java.applet.Applet;

public class Num17 extends Applet
{
	int n, suma= 0, con = 1;
	Label l;
	TextField t;
	
	public void init()
	{
		l = new Label("Ingrese el numero natural limite que desea sumar y presione enter");
		t = new TextField(10);
		add(l);
		add(t);
	}
			
	public void paint(Graphics g)
	{
		while(con <= n)
		{
			suma = suma + con;
			con++;
		}
		g.drawString("La suma de los primeros " + n + " numeros naturales es: " + suma, 50,60);	
	}
	
	public boolean action(Event e, Object o)
	{
		if(e.target == t)
		{
			n = Integer.parseInt(t.getText());
			t.setText("");
			suma =0;
			con=1;
			repaint();
		}
		return true;
	}
}	