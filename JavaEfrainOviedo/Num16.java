/**
* EJERCICIO RESUELTO No. 16
* @autor	Efrain Oviedo
* @libro	Logica de Programación
* 
* Este ejercicio es desarrollado como un applet
*/

import java.awt.*;
import java.applet.Applet;

public class Num16 extends Applet
{
	int n=1, suma= 0;
			
	public void paint(Graphics g)
	{
		while(n<=5)
		{
			suma = suma + n;
			n++;
		}
		g.drawString("la suma de los primeros 5 numeros naturales es: " + suma, 15,45);
	}
}		
	
	