/**
* EJERCICIO RESUELTO No. 13
* @autor	Efrain Oviedo
* @libro	Logica de Programación
* 
* Este ejercicio es desarrollado como un applet
*/

import java.awt.*;
import java.applet.Applet;

public class Num13 extends Applet
{
	Label l2, l3, l4, l5;
	TextArea ta;
	Panel p, p1, p2, p3, p4, p5, p6;
	TextField t2, t3;
	int valcomp=0, pdes=0;
	Float valpag;
	String color; 
	
	public void init()
	{
		p1 = new Panel();
		p4 = new Panel();
		p5 = new Panel();
		p6 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		p = new Panel();
		l2 = new Label("Ingrese el valor de la compra                          ");
		l3 = new Label("Ingrese el color de la bolita y pulse enter          ");
		l4 = new Label("Ingrese la informacion solicitada en minuscula: blanco, amarillo, verde, azul, rojo        ");
		l5 = new Label("Resultado de la operacion                        ");
		t2 = new TextField(10);
		t3 = new TextField(10);
		ta = new TextArea("");
		ta.setEditable(false);
		p1.add(l4);
		add(p1);
		p3.add(l2);
		p3.add(t2);
		add(p3);
		p4.add(l3);
		p4.add(t3);
		add(p4);
		p5.add(l5);
		add(p5);
		p6.add(ta);
		add(p6);
	}
	
	
	public boolean action(Event e, Object o)
	{
		if(e.target == t3)
		{
			valcomp = Integer.parseInt(t2.getText());
			color = new String(t3.getText());
			color= color.toLowerCase();
			if (color.equals("blanco"))
			{
				pdes = 0;
			}
			else
			{
				if(color.equals("verde"))
				{
					pdes = 10;
				}
				else
				{
					if (color.equals("amarillo"))
					{
						pdes = 25;
					}
					else
					{
						if (color.equals("azul"))
						{
							pdes = 50;
						}
						else
						{
							if (color.equals("rojo"))
								pdes = 100;
						}
					}
				}
			}
			valpag = new Float(valcomp - ((pdes * valcomp)/100));
			ta.setVisible(true);
			t2.setText("");
			t3.setText("");
			ta.setText("\nEl valor de la compra es: $ " + valcomp +
					   "\nEl descuento de la compra es: " + pdes +"%"+
					   "\nEl cliente debe cancelar: $ " + valpag);		
		}
		return true;
	}
}