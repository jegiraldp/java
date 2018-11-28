/**
* EJERCICIO RESUELTO No. 12
* @autor	Efrain Oviedo
* @libro	Logica de Programación
* 
* Este ejercicio es desarrollado como un applet
*/


import java.awt.*;
import java.applet.Applet;

public class Num12 extends Applet
{
	Label l1, l2, l3, l4, l5;
	TextArea ta;
	Panel p, p1, p2, p3, p4, p5, p6;
	TextField t1, t2, t3;
	int nht, het, hee8;
	float vhn, salario;
	String nom; 
	
	public void init()
	{
		p1 = new Panel();
		p4 = new Panel();
		p5 = new Panel();
		p6 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		p = new Panel();
		l1 = new Label("Ingrese el nombre del empleado                                      ");
		l2 = new Label("Ingrese el numero de horas trabajadas                          ");
		l3 = new Label("Ingrese el valor por hora trabajada y pulse enter          ");
		l4 = new Label("Ingrese la informacion solicitada          ");
		l5 = new Label("Resultado de la operacion                        ");
		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);
		ta = new TextArea("");
		ta.setEditable(false);
		p1.add(l4);
		add(p1);
		p2.add(l1);
		p2.add(t1);
		add(p2);
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
			nom = t1.getText();
			nht = Integer.parseInt(t2.getText());
			vhn = Float.parseFloat(t3.getText());
			if(nht>40)
			{
				het = nht - 40;
				if(het > 8)
				{
					hee8 = het - 8;
					salario = ((40*vhn) + (2*8*vhn) + (3*hee8*vhn));
				}
				else
					salario = ((40*vhn) + (2*8*het));
			}
			else
				salario = nht*vhn;
			ta.setVisible(true);
			ta.setText("\nEl trabajador " + nom + " devengo: $  " + salario);		
		}
		return true;
	}
}