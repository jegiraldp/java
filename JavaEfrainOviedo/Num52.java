/**
* EJERCICIO RESUELTO No. 52
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Este ejercicio es desarrollado como un applet
*/

import java.awt.*;
import java.applet.Applet;

public class Num52 extends Applet
{
	
	int num;
	boolean resultado = false, entro=false;
	Label l1;
	TextField t1;
	
	
	public void init()
	{
		l1 = new Label("Ingrese un numero para averiguar si es primo y presione enter ");
		t1 = new TextField(10);
		add(l1);
		add(t1);
	}
	
	//Determina si un numero es primo o no
	public boolean Primo(int n)
	{
		int nu = n, mitad = n/2, i = 2;
		boolean re = false;;
		while((i <= mitad)&&((nu%i) != 0))
		{
			i++;
		}
		if(i > mitad)
		{
			re = true;
		}
		
		return re;
	}
	

	
	public void paint(Graphics g)
	{
		resultado = Primo(num);
		if(entro){
		
			if (resultado == true)
			{
				g.drawString("El numero " + num + " es primo. ", 40, 70);
			}
			else
			{
				g.drawString("El numero " + num + " no es primo. ", 40, 70);
			}
			t1.setText("");
		}
	}
	
	public boolean action(Event e, Object o)
	{
		if(e.target == t1)
		{
			num = Integer.parseInt(t1.getText());
			repaint();
			entro = true;
		}
		return true;
	}
}