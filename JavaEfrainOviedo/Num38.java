/**
* EJERCICIO RESUELTO No. 38
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Este ejercicio es desarrollado como un applet 
*/

import java.awt.*;
import java.applet.Applet;

public class Num38 extends Applet
{
	Label l1, l2, l4, l3, l5, l6, l7, l, l0;
	TextArea ta;
	TextField t, t0, t1, t2, t4, t3, t5, t6, t7;
	int ci, es;
	float leaca,leana, leace, leane, mca, kwh;
	double pca, pce, factura, re1=0, re2=0, re3=0, re4=0, re5=0, re6=0, tree=0, trea=0, res, por;
	String nom;
	Button b;
	
	public void init()
	{
		b = new Button("          Ingresar          ");
		l1 = new Label("Ingrese el codigo de la instalacion            ");
		l2 = new Label("Ingrese el nombre del usuario                   ");
		l3 = new Label("Ingrese el estrato socioeconomico           ");
		l4 = new Label("Ingrese la lectura anterior del agua          ");
		l5 = new Label("Ingrese la lectura actual del agua             ");
		l6 = new Label("Ingrese la lectura anterior de la energia  ");
		l7 = new Label("Ingrese la lectura actual de la energia     ");
		l = new Label("Ingrese el valor por metro cubico de agua");
		l0 = new Label("Ingrese el valor por kilovatio hora               ");
		t = new TextField(10);
		t0 = new TextField(10);
		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);
		t4 = new TextField(10);
		t5 = new TextField(10);
		t6 = new TextField(10);
		t7 = new TextField(10);
		
		ta = new TextArea("Ingrese los campos en cero para finalizar\n\n"
						+"Ingrese los datos del estrato a partir de la siguiente informacion"
						+"\n1: para el estrato 1"
						+"\n2: para el estrato 2"
						+"\n3: para el estrato 3"
						+"\n4: para el estrato 4"
						+"\n5: para el estrato 5"
						+"\n6: para el estrato 6"
						+"\ncodigo\t\tnombre\t\testrato\t\tpago agua\tpago energia\ttotal factura");
		ta.setEditable(false);
		add(l);
		add(t);
		add(l0);
		add(t0);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(l5);
		add(t5);
		add(l6);
		add(t6);
		add(l7);
		add(t7);
		add(ta);
		add(b);
	}
	
	
	public void Captura()
	{
		kwh = Float.parseFloat(t0.getText());
		mca = Float.parseFloat(t.getText());
		ci = Integer.parseInt(t1.getText());
		nom = t2.getText();
		es = Integer.parseInt(t3.getText());
		leana = Float.parseFloat(t4.getText());
		leaca = Float.parseFloat(t5.getText());
		leane = Float.parseFloat(t6.getText());
		leace = Float.parseFloat(t7.getText());
		t1.setText("");
		t2.setText("");
		t3.setText("");
		t4.setText("");
		t5.setText("");
		t6.setText("");
		t7.setText("");
		t.setEditable(false);
		t0.setEditable(false);
	}
	
	public double Calculo(double p)
	{
		double retorno = 0;
		double porc = p;
		pca = (leaca - leana)* mca * porc;
		pce = (leace - leane) * kwh * porc;
		factura = pca + pce;
		retorno = factura;
		return retorno;
	}
	
	public boolean action(Event e, Object o)
	{
		Captura();
		if(ci != 0)
		{
			switch(es)
			{
				case 1:
				{
					por = 0.5;
					res = Calculo(por);
					re1 = re1 + res;
					break;
				}
				case 2:
				{
					por = 0.7;
					res = Calculo(por);
					re2 = re2 + res;
					break;
				}
				case 3:
				{
					por = 0.7;
					res = Calculo(por);
					re3 = re3 + res;
					break;
				}
				case 4:
				{
					por = 1.0;
					res = Calculo(por);
					re4 = re4 + res;
					break;
				}
				case 5:
				{
					por = 1.2;
					res = Calculo(por);
					re5 = re5 + res;
					break;
				}
				case 6:
				{
					por = 1.2;
					res = Calculo(por);
					re6 = re6 + res;
					break;
				}
			}
			trea = trea + pca;
			tree = tree + pce;
			ta.appendText("\n" + ci + "\t\t" + nom + "\t\t" + es + "\t\t" + pca + "\t\t" + pce + "\t\t" + factura);
		}
		else
		{
			ta.appendText("\nTotal recaudado por agua: " + trea 
						+ "\nTotal recaudado por energia: " + tree 
						+ "\nTotal recaudado por estrato 1: " + re1 
						+ "\nTotal recaudado por estrato 2: " + re2 
						+ "\nTotal recaudado por estrato 3: " + re3 
						+ "\nTotal recaudado por estrato 4: " + re4 
						+ "\nTotal recaudado por estrato 5: " + re5 
						+ "\nTotal recaudado por estrato 6: " + re6);
		}
		return true;
	}
}