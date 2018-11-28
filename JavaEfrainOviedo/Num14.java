/**
* EJERCICIO RESUELTO No. 14
* @autor	Efrain Oviedo
* @libro	Logica de Programación
* 
* Este ejercicio es desarrollado como un applet
*/


import java.awt.*;
import java.applet.Applet;

//clase que calcula el incremento en el salario de los empleados de una tienda
public class Num14 extends Applet{
	Label l1, l2, l3, l4;
	TextField t1, t2, t3, t4;
	TextArea ta;//area de texto donde se muestra los resultados obtenidos
	Button b;
	double sal1, sal2,	sal3;//salarios de los departamentos 1, 2, y 3
	double  porc; //porcentaje de incremento
	double aus;//variable auxiliar para calcular el salario
	float ven1,	ven2, ven3,	totalven=0,	salario=0;
		
	//metodo de inicializacion de variables
	public void init()
	{
		l1 = new Label("Ingrese el total de ventas del departamento 1             ");
		l2 = new Label("Ingrese el total de ventas del departamento 2             ");
		l3 = new Label("Ingrese el total de ventas del departamento 3             ");
		l4 = new Label("Ingrese el salario de los empleados                            ");
		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);
		t4 = new TextField(10);
		ta = new TextArea("");
		ta.setEditable(false);
		b = new Button ("          Calcular Salario          ");
		//adiciona botones, campos de texto y rotulos al applet que los contiene
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(ta);
		add(b);
	}

	//metodo donde se manejan las entradas a traves del evento del boton
	public boolean action(Event e, Object o)
	{
		//si el evento corresponde al boton
		if (e.target == b)
		{
			//captura de valores -  se realiza un casting para pasar a
			//un numero flotante lo que se digito en los campos de texto
			ven1 = Float.parseFloat(t1.getText());
			ven2 = Float.parseFloat(t2.getText());
			ven3 = Float.parseFloat(t3.getText());
			salario = Float.parseFloat(t4.getText());
			aus = (salario * (0.20));
			totalven = (ven1 + ven2 + ven3);
			porc = (totalven * (0.33));
			if(ven1 > porc)
			{
				
				sal1 = (salario + aus);
			}
			else
			{
				sal1 = salario;
			}
			if(ven2> porc)
			{
				sal2 = (salario + aus);
			}
			else
			{
				sal2 = salario;
			}
			if(ven3> porc)
			{
				sal3 = (salario + aus);
			}
			else
			{
				sal3 = salario;
			}
			/* Hace visible el area de texto y muestra 
			 * el salario de cada uno de los departamentos
			 */
			ta.setVisible(true);
			ta.setText("\n Salario vendedores del departamento 1 es: " + sal1 +
						"\n Salario vendedores del departamento 2 es: " + sal2 + 
						"\n Salario vendedores del departamento 3 es: " + sal3);
		}
		return true;
	}
}