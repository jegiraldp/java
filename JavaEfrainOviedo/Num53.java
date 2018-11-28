/**
* EJERCICIO RESUELTO No. 53
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Este ejercicio es desarrollado como un applet
*/

import java.awt.*;
import java.applet.Applet;

public class Num53 extends Applet
{
	
	int num, cnp =0, cd = 0, y= 60, x= 40, I=0;
	boolean resultado = false;
	Label l1;
	TextField t1;
	
	
	public void init()
	{
		l1 = new Label("Ingrese el numero limite para verificar si es primo y pulse ENTER");
		t1 = new TextField(10);
		add(l1);
		add(t1);
	}
	
	//Ordena los tres numeros y devuelve el menor
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
		for(int j=1; j<= num; j++)
		{
			resultado = Primo(j);
			if (resultado == true)
			{
				cnp++;
				if((cnp == ((cd*15)+1)))
				{
					cd++;
					y = 60 + 25*cd;
					x = 40;
					I = 1;
				}
				else
				{
					x = 40 + 25*I;
					I++;
				}
				g.drawString( "NUMEROS PRIMOS ENCONTRADOS ", 40, 50);
				g.drawString( j + ", ", x, y);
				showStatus("La cantidad de numeros primos encontrados hasta el numero " + num + " es: " + (cnp ));
			}
		}
	}
	
	public boolean action(Event e, Object o)
	{
		if(e.target == t1)
		{
			num = Integer.parseInt(t1.getText());
			t1.setText("");
			cnp = 0;
			cd = 0; y= 60; x= 40; I=0;
			repaint();
		}
		return true;
	}
}