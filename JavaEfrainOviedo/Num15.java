/**
* EJERCICIO RESUELTO No. 15
* @autor	Efrain Oviedo
* @libro	Logica de Programación
* 
* Este ejercicio es desarrollado como un applet
*/

import java.awt.*;
import java.applet.Applet;

public class Num15 extends Applet
{
	Label l2, l3, l4, l5, l1, l6, l7;
	TextArea ta;
	Panel p7, p1, p2, p3, p4, p5, p6, p8;
	TextField t2, t3, t1, t4;
	float pesoA, pesoB, pesoC, pesoD;
		
	public void init()
	{
		p1 = new Panel();
		p4 = new Panel();
		p5 = new Panel();
		p6 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		p7 = new Panel();
		p8 = new Panel();
		l1 = new Label("Ingrese el peso de la bolita numero A                        ");
		l2 = new Label("Ingrese el peso de la bolita numero B                        ");
		l3 = new Label("Ingrese el peso de la bolita numero C                        ");
		l5 = new Label("Ingrese el peso de la bolita numero D y pulse enter");
		l4 = new Label("comparacion de pesos                                           ");
		l6 = new Label("Resultado de la comparacion                                    ");
		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);
		t4 = new TextField(10);
		ta = new TextArea("");
		ta.setEditable(false);
		p1.add(l4);
		add(p1);
		p3.add(l1);
		p3.add(t1);
		add(p3);
		p4.add(l2);
		p4.add(t2);
		add(p4);
		p7.add(l3);
		p7.add(t3);
		add(p7);
		p8.add(l5);
		p8.add(t4);
		add(p8);
		p5.add(l6);
		add(p5);
		p6.add(ta);
		add(p6);
	}
	
	
	public boolean action(Event e, Object o)
	{
		if(e.target == t4)
		{
			pesoA = Float.parseFloat(t1.getText());
			pesoB = Float.parseFloat(t2.getText());
			pesoC = Float.parseFloat(t3.getText());
			pesoD = Float.parseFloat(t4.getText());
			ta.setVisible(true);
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			if((pesoA == pesoB)&&(pesoA == pesoC))
			{
				if(pesoD > pesoA)
				{
					ta.setText("\nLa esfera D es la diferente y es de mayor peso ");
				}
				else
				{
					ta.setText("\nLa esfera D es la diferente y es de menor peso ");
				}
			}
			else
			{
				if((pesoA == pesoB)&&(pesoA == pesoD))
				{
					if(pesoC > pesoA)
					{
						ta.setText("\nLa esfera C es la diferente y es de mayor peso ");
					}
					else
					{
						ta.setText("\nLa esfera C es la diferente y es de menor peso ");
					}
				}
				else
				{
					if((pesoA == pesoC)&&(pesoA == pesoD))
					{
						if(pesoB > pesoD)
						{
							ta.setText("\nLa esfera B es la diferente y es de mayor peso ");
						}
						else
						{
							ta.setText("\nLa esfera B es la diferente y es de menor peso ");
						}
					}
					else
					{
						if(pesoA > pesoB)
						{
							ta.setText("\nLa esfera A es la diferente y es de mayor peso ");
						}
						else
						{
							ta.setText("\nLa esfera A es la diferente y es de menor peso ");
						}
					}
				}
			}
		}
		return true;
	}
}