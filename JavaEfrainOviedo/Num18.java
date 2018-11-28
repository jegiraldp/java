/**
* EJERCICIO RESUELTO No. 18
* @autor	Efrain Oviedo
* @libro	Logica de Programación
* 
* Este ejercicio es desarrollado como un applet
*/

import java.awt.*;
import java.applet.Applet;

public class Num18 extends Applet
{
	Label l1, l2, l3, l4, l5, l6, l7, l8, l9, l0;
	TextArea ta;
	Panel p1, p2, p3, p4, p5, p6, p7, p8, p9, p0, pd;
	TextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t0;
	int ne, nume=0, ncc, nc1, nc2, nc3, nc4, bas;
	float n1, n2, n3, n4, pc;
	Button b;
	String cod;//codigo alfanumerico
	
	public void init()
	{
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		p4 = new Panel();
		p5 = new Panel();
		p6 = new Panel();
		p7 = new Panel();
		p8 = new Panel();
		p9 = new Panel();
		p0 = new Panel();
		//pd = new Panel();
	//	b = new Button("                     Salir                     ");
		l0 = new Label("Ingrese el numero de estudiantes                                                 ");
		l1 = new Label("Ingrese el codigo del estudiante                                                    ");
		l2 = new Label("Ingrese la nota de la materia 1                                                       ");
		l3 = new Label("Ingrese el numero de creditos de la materia 1                           ");
		l4 = new Label("Ingrese la nota de la materia 2                                                       ");
		l5 = new Label("Ingrese el numero de creditos de la materia 2                           ");
		l6 = new Label("Ingrese la nota de la materia 3                                                      ");
		l7 = new Label("Ingrese el numero de creditos de la materia 3                           ");
		l8 = new Label("Ingrese la nota de la materia 4                                                      ");
		l9 = new Label("Ingrese el numero de creditos de la materia 4 y presione enter");
		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);
		t4 = new TextField(10);
		t5 = new TextField(10);
		t6 = new TextField(10);
		t7 = new TextField(10);
		t8 = new TextField(10);
		t9 = new TextField(10);
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
		p3.add(l3);
		p3.add(t3);
		add(p3);
		p4.add(l4);
		p4.add(t4);
		add(p4);
		p5.add(l5);
		p5.add(t5);
		add(p5);
		p6.add(l6);
		p6.add(t6);
		add(p6);
		p7.add(l7);
		p7.add(t7);
		add(p7);
		p8.add(l8);
		p8.add(t8);
		add(p8);
		p9.add(l9);
		p9.add(t9);
		add(p9);
		add(ta);
	}
	
	//metodo donde se recolectan los datos
	public void redatos()
	{
		cod = t1.getText();
		n1 = Float.parseFloat(t2.getText());//nota de la materia 1
		nc1 = Integer.parseInt(t3.getText());//numero de creditos de la materia 1
		n2 = Float.parseFloat(t4.getText());//nota de la materia 1
		nc2 = Integer.parseInt(t5.getText());//numero de creditos de la materia 1
		n3 = Float.parseFloat(t6.getText());//nota de la materia 1
		nc3 = Integer.parseInt(t7.getText());//numero de creditos de la materia 1
		n4 = Float.parseFloat(t8.getText());//nota de la materia 1
		nc4 = Integer.parseInt(t9.getText());//numero de creditos de la materia 1
		ncc = (nc1 + nc2 + nc3 + nc4);//numero de creditos cursados
		if(ncc != 0)
				pc = (n1*nc1 + n2*nc2 + n3*nc3 + n4*nc4)/ncc; //calculo del promedio credito
			ta.setText("");
			String text="\n\nEl estudiante con codigo " + cod +" curso " + ncc + " creditos y su promedio fue " + pc;
			
			ta.setText("");
			if(nume < ne){
				text=text+ "\n\n Ingrese los datos del siguiente estudiante";	
			}else{
				text=text + "\n\n Ya se ingresaron todos los estudiantes...";
			}
			ta.setText(text);
			
			//limpia los campos de texto
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t7.setText("");
			t8.setText("");
			t9.setText("");
			repaint();//vuelve a pintar el applet
	}
	
	/* Los eventos generados por el boton se procesan mientras
	 * la variable nume sea menor que el numero de estudiantes
	 */
	public boolean action(Event e, Object o)
	{
		ne = Integer.parseInt(t0.getText());// numero de estudiantes
		t0.setEditable(false);// se desabilita para escritura para evitar
								// que se cambie el numero de estudiantes
		if(nume < ne)			//durante el proceso
		{
			nume++;
			redatos();//invoca al metodo que recolecta los datos de los campos de texto
		//termina el proceso haciendo no editables los campos de texto
			if(nume==ne)
			{
				t1.setEditable(false);
				t2.setEditable(false);
				t3.setEditable(false);
				t4.setEditable(false);
				t5.setEditable(false);
				t6.setEditable(false);
				t7.setEditable(false);
				t8.setEditable(false);
				t9.setEditable(false);
			}
		}
		return true;
	}
}