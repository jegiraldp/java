/**
* EJERCICIO RESUELTO No. 31
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Este ejercicio es desarrollado como un applet 
*/

import java.awt.*;
import java.applet.Applet;

public class Num31 extends Applet{
	Label l1, l2, l3, l4;
	TextField t1, t2, t3, t4;
	TextArea ta;
	Button b;
	double salm=0;
	double por=0;
	double tdev=0;
	int cat=0, nup=0;
	String nom;

	public void init()
	{
		l1 = new Label("Ingrese el nombre del empleado                           ");
		l2 = new Label("Ingrese el salario mensual del empleado                  ");
		l3 = new Label("Ingrese la categoria del empleado                        ");
		l4 = new Label("Ingrese el numero de unidades producidas y pulse enter   ");
		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);
		t4 = new TextField(10);
		ta = new TextArea("");
		ta.setEditable(false);
		b = new Button ("   Calcular Salario   ");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(ta);
	}

/* El proceso se puede realizar repetidamente mientas no se deje
 * en blanco el campo donde se pide el nombre del empleado
 */
	public boolean action(Event e, Object o)
	{
		if (e.target == t4)
		{
			nom = t1.getText();//captura el nombre del empleado
			if(!(nom.equals("")))
			{
				salm = Double.parseDouble(t2.getText());//captura el salario mensual
				cat = Integer.parseInt(t3.getText());//captura la ategoria del empleado
				nup = Integer.parseInt(t4.getText());//captura el numero de unidadesa producidas
				tdev = salm;
				//dependiendo de la categoria y del numero de
				//unidades producidas por el empleado se calcula el porcentaje
				//en que se le incrementara el salario mensual
				switch(cat)
				{
					case 1:
					{
						por = salm * 0.05;
						if(nup > 50)
							tdev = tdev + por;
						break;
					}
					case 2:
					{
						por = salm * 0.07;
						if(nup >50)
							tdev = tdev + por;
						break;
					}
					case 3:
					{
						por = salm * 0.1;
						if(nup >50)
							tdev = tdev + por;
						break;
					}
					case 4:
					{
						por = salm * 0.15;
						if(nup >50)
							tdev = tdev + por;
						break;
					}
				}
				//vuelve a pintar el applet y muestra el salario del empleado 
				repaint();
				ta.appendText("\n " + nom +"\t devengo: $ " + tdev );
			}
			//limpia los campos de texto
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
		}
		
		return true;
	}
}