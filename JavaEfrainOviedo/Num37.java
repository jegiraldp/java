/**
* EJERCICIO RESUELTO No. 37
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Este ejercicio es desarrollado como un applet 
*/

import java.awt.*;
import java.applet.Applet;

public class Num37 extends Applet
{
	Label l1, l2, l3, l4;
	TextField t1, t2, t3, t4;
	Button b;
	int fi, ff, ci, cf;

	public void init()
	{
		b = new Button("Dibujar");
		l1 = new Label("Ingrese la fila donde desea que inicie el cuadro en pixel  ");
		l2 = new Label("Ingrese la fila donde desea que termine el cuadro en pixel  ");
		l3 = new Label("Ingrese la columna donde desea que inicie el cuadro en pixel ");
		l4 = new Label("Ingrese la columna donde desea que termine el cuadro en pixel ");
		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);
		t4 = new TextField(10);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(b);
	}

	public void paint(Graphics g)
	{
		for(int i=ci;i<cf;i++)
		{
			g.drawString("-", i, fi-5);
			g.drawString("-", i, ff+5);
		}
		for(int i=ci+5;i<cf-5;i++)
		{
			g.drawString("-", i, fi);
			g.drawString("-", i, ff);
		}
		for(int j=fi;j<ff;j++)
		{
			g.drawString("|", ci-1, j);
			g.drawString("|", cf, j);
		}
		for(int j=fi+5;j<ff-5;j++)
		{
			g.drawString("|", cf-5, j);
			g.drawString("|", ci+4, j);
		}
	}

	public boolean action(Event e, Object o)
	{
		if(e.target == b)
		{
			fi = Integer.parseInt(t1.getText());
			ff = Integer.parseInt(t2.getText());
			ci = Integer.parseInt(t3.getText());
			cf = Integer.parseInt(t4.getText());
			repaint();
		}
		return true;
	}
}