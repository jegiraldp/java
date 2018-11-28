/**
* EJERCICIO RESUELTO No. 32
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Este ejercicio es desarrollado como un applet 
*/

import java.awt.*;
import java.applet.Applet;

public class Num32 extends Applet
{
	int con;
	long iden;
	float peso;
	double tiempo, r;
	Label l1, l2, l3;
	TextField t1, t2, t3;
	TextArea t;
	Button b;
	
	
	public void init()
	{
		peso =0;
		tiempo = 0;
		r = 0;
		con=0;
		l1 = new Label("Ingrese la identificacion de la persona ");
		l2 = new Label("Ingrese el peso de la persona en Kg    ");
		l3 = new Label("Ingrese la condicion de la persona       ");
		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);
		t = new TextArea("Ingrese la condicion de la persona en numeros enteros 3, 4, 5, 6"
						+ "\n para terminar ingrese cero"
						+ "\n\t Identificacion" 
						+ "\t\t Tiempo de la sesion de parctica"	);
		b = new Button("Ingresar");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(t);
		add(b);
		t.setEditable(false);
	}
	
	public boolean action(Event e, Object o)
	{
		if(e.target == b)
		{
			iden = Long.parseLong(t1.getText());
			if(iden != 0)
			{
				peso = Float.parseFloat(t2.getText());
				con = Integer.parseInt(t3.getText());
				con = con - 2;
				switch(con)
				{
					case 1:
					{
						r = 0.15;
						break;
					}
					case 2:
					{
						r = 0.21;
						break;
					}
					case 3:
					{
						r = 0.22;
						break;
					}
					case 4:
					{
						r = 0.26;
						break;
					}
				}
				tiempo = peso * r;
				t.appendText("\n\t" + iden + "\t\t\t" + tiempo);
				t1.setText("");
				t2.setText("");
				t3.setText("");
			}
			else
			{
				t1.setVisible(false);
				l1.setVisible(false);
				t2.setVisible(false);
				l2.setVisible(false);
				t3.setVisible(false);
				l3.setVisible(false);
				b.setVisible(false);
			}
		}
		return true;
	}
}