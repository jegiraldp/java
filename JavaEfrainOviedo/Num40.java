/**
* EJERCICIO RESUELTO No. 40
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Este ejercicio es desarrollado como un applet 
*/

import java.awt.*;
import java.applet.Applet;

public class Num40 extends Applet
{
	
	int prim, segu, terc, men, med, may, sw=0;;
	Label l1, l2, l3, l4;
	TextField t1, t2, t3;
	
	
	public void init()
	{
		l1 = new Label("Ingrese el primer numero     ");
		t1 = new TextField(10);
		add(l1);
		add(t1);
		l2 = new Label("Ingrese el segundo numero");
		t2 = new TextField(10);
		add(l2);
		add(t2);
		l3 = new Label("Ingrese el tercer numero       ");
		t3 = new TextField(10);
		add(l3);
		add(t3);
		l4 = new Label("Despues de ingresar el tercer numero pulse ENTER");
		add(l4);
		
	}
	
	//Ordena los tres numeros y devuelve el menor
	public int OrdenMen(int p, int s, int t)
	{
		int pri = p, menor, medio=0, mayor=0;
		int seg = s;
		int ter = t;
		if((pri<seg)&&(pri<ter))
		{
			menor = pri;
			if(seg<ter)
			{
				medio = seg;
				mayor = ter;
			}
			else
			{
				medio = ter;
				mayor = seg;
			}
		}
		else
		{
			if(seg<ter)
			{
				menor = seg;
				if(pri<ter)
				{
					medio = pri;
					mayor = ter;
				}
			}
			else
			{
				menor = ter;
				if(pri<seg)
				{
					medio = pri;
					mayor = seg;
				}
				else
				{
					medio = seg;
					mayor = pri;
				}
			}
		}
		return menor;
	}
	
	//Ordena los tres numeros y devuelve el medio
		public int OrdenMed(int p, int s, int t)
	{
		int pri = p, menor=0, medio=0, mayor=0;
		int seg = s;
		int ter = t;
		if((pri<seg)&&(pri<ter))
		{
			menor = pri;
			if(seg<ter)
			{
				medio = seg;
				mayor = ter;
			}
			else
			{
				medio = ter;
				mayor = seg;
			}
		}
		else
		{
			if(seg<ter)
			{
				menor = seg;
				if(pri<ter)
				{
					medio = pri;
					mayor = ter;
				}
			}
			else
			{
				menor = ter;
				if(pri<seg)
				{
					medio = pri;
					mayor = seg;
				}
				else
				{
					medio = seg;
					mayor = pri;
				}
			}
		}
		return medio;
	}
	
	//Ordena los tres numeros y devuelve el mayor
		public int OrdenMay(int p, int s, int t)
	{
		int pri = p, menor=0, medio=0, mayor=0;
		int seg = s;
		int ter = t;
		if((pri<seg)&&(pri<ter))
		{
			menor = pri;
			if(seg<ter)
			{
				medio = seg;
				mayor = ter;
			}
			else
			{
				medio = ter;
				mayor = seg;
			}
		}
		else
		{
			if(seg<ter)
			{
				menor = seg;
				if(pri<ter)
				{
					medio = pri;
					mayor = ter;
				}
			}
			else
			{
				menor = ter;
				if(pri<seg)
				{
					medio = pri;
					mayor = seg;
				}
				else
				{
					medio = seg;
					mayor = pri;
				}
			}
		}
		return mayor;
	}
	
	
	public void paint(Graphics g)
	{
		if(sw == 1)
			g.drawString("El menor es " + men + ", el medio es " + med + " y el mayor es " + may, 40, 150);
		t1.setText("");
		t2.setText("");
		t3.setText("");
		
	}
	
	public boolean action(Event e, Object o)
	{
		if(e.target == t3)
		{
			prim = Integer.parseInt(t1.getText());
			segu = Integer.parseInt(t2.getText());
			terc = Integer.parseInt(t3.getText());
			men = OrdenMen(prim, segu, terc);
			med = OrdenMed(prim, segu, terc);
			may = OrdenMay(prim, segu, terc);
			sw=1;
			repaint();
		}
		return true;
	}
}