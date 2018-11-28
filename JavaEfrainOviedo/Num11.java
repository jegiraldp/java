/**
* EJERCICIO RESUELTO No. 11
* @autor	Efrain Oviedo
* @libro	Logica de Programación
* 
* Este ejercicio es desarrollado como un applet
*/

import java.awt.*;
import java.applet.Applet;

public class Num11 extends Applet
{
	Label l1, l2, l3, l4, l5;
	TextArea ta;
	Panel p, p1, p2, p3, p4, p5, p6;
	TextField t1, t2, t3;
	int n1, n2, n3, mayor;
	
	public void init()
	{
		p1 = new Panel();
		p4 = new Panel();
		p5 = new Panel();
		p6 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		p = new Panel();
		l1 = new Label("Ingrese el primer numero                                ");
		l2 = new Label("Ingrese el segundo numero                           ");
		l3 = new Label("Ingrese el tercer numero y pulse enter        ");
		l4 = new Label("Ingrese solo numeros enteros y diferentes          ");
		l5 = new Label("Resultado de la comparacion                        ");
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
			n1 = Integer.parseInt(t1.getText());
			n2 = Integer.parseInt(t2.getText());
			n3 = Integer.parseInt(t3.getText());
			t1.setText("");
			t2.setText("");
			t3.setText("");
			if ((n1>n2)&&(n1>n3))
				mayor = n1;
			if((n2>n3)&&(n2>n1))
				mayor = n2;
			if((n3>n1)&&(n3>n2))
				mayor = n3;
			ta.setVisible(true);
			ta.setText("El valor mayor entre " + n1 + ", " + n2 + " y " + n3 + "es: " + mayor);		
		}
		return true;
	}
}