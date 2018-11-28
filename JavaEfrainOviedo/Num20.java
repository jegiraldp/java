/**
* EJERCICIO RESUELTO No. 20
* @autor	Efrain Oviedo
* @libro	Logica de Programación
* 
* Este ejercicio es desarrollado como un applet
*/

import java.awt.*;
import java.applet.Applet;

public class Num20 extends Applet
{
	Label l1, l2, l0;
	TextArea ta;
	Panel p1, p2, p0;
	TextField t1, t2, t0;
	int can=0, ca=0;
	float precio=0;
	double valtpa=0, vtc=0;
	String coda;
	Button b;
	
	public void init()
	{
		p1 = new Panel();
		p2 = new Panel();
		p0 = new Panel();
		b = new Button("                   Ingresar Articulo                 ");
		l0 = new Label("Ingrese el codigo del articulo                    ");
		l1 = new Label("Ingrese la cantidad de articulos iguales");
		l2 = new Label("Ingrese el precio del articulo                     ");
		t1 = new TextField(10);
		t2 = new TextField(10);
		t0 = new TextField(10);
		ta = new TextArea("");
		ta.setEditable(false);
		p0.add(l0);
		p0.add(t0);
		add(p0);
		p1.add(l1);
		p1.add(t1);
		add(p1);
		p2.add(l2);
		p2.add(t2);
		add(p2);
		add(ta);
		add(b);
		
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Cuando desee terminar deje en blanco todos lo campos y presione el boton", 60, 365);
	}
	
	/* Se realiza el proceso mientras el campo de teto sorrespondiente
	 * al codigo no se deje vacio
	 */
	public boolean action(Event e, Object o)
	{
		coda = t0.getText();
		if(!(coda.equals("")))
		{
			ca++;
			can = Integer.parseInt(t1.getText());//cantidad de articulos iguales
			precio = Float.parseFloat(t2.getText());//precio por articulo
			valtpa = can * precio;//valor total a pagar por los articulos
			vtc = vtc + valtpa;//valor total de la compra
			if (ca == 1)
				ta.appendText("\n\n\tCodigo Articulo\t Cantidad \t Precio Unitario \t Subtotal ");		
			//muestra los articulos comprados hasta el momento
			ta.appendText("\n\t" + coda +"\t\t"+ can +"\t\t" + precio + "\t\t" + valtpa);		
			//limpia los campos de texto
			t0.setText("");
			t1.setText("");
			t2.setText("");
		}
		else//se dejan en blanco todos los campos lo que implica el fin de la compra
		{
			t1.setEditable(false);
			t2.setEditable(false);
			repaint();
			ta.appendText("\n\n\tEl total de la compra es: " + vtc);		
			//se deja inactivos los campos y se muestra el total a paar por todos
			//los articulos registrados
		}
		return true;
	}
}