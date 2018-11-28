/**
* EJERCICIO RESUELTO No. 36
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Este ejercicio es desarrollado como un applet 
*/

import java.awt.*;
import java.applet.Applet;

public class Num36 extends Applet
{
	Label l1, l2, l3;
	TextArea ta;
	TextField t1, t2;
	int cod, emfr=0, efr=0, er=0, enr=0, nte=0, ce=0;
	float pc, spc=0;
	double pcg=0;
	Button b;
	String s;
	
	public void init()
	{
		b = new Button("          Ingresar          ");
		l1 = new Label("Ingrese el codigo del estudiante                   ");
		t1 = new TextField(10);
		t2 = new TextField(10);
		l3 = new Label("Ingrese cero en los campos cuando desee terminar");
		l2 = new Label("Ingrese el promedio credito del estudiante");
		ta = new TextArea("\nCodigo \t\t Promedio Credito \t Estado de la Recomendacion");
		ta.setEditable(false);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(ta);
		add(b);
	}
	
	public boolean action(Event e, Object o)
	{
		if(e.target == b)
		{
			cod = Integer.parseInt(t1.getText());
			pc = Float.parseFloat(t2.getText());
			spc = spc + pc;
			if((pc <= 5.0)&&(pc >= 0.0))
			{
				if(pc >= 4.8)
				{
					emfr++;
					s = new String("Muy Fuerte Recomendacion");
				}
				else
				{
					if(pc >= 4.5)
					{
						efr++;
						s = new String("Fuerte Recomendacion");
					}
					else
					{
						if(pc >= 4.0)
						{
							er++;
							s = new String("Recomendado");
						}
						else
						{
							enr++;
							s = new String("No Recomendado");
						}
					}
				}
				t1.setText("");
				t2.setText("");
				if(cod != 0)
					ta.appendText("\n" + cod + "\t\t" + pc + "\t\t\t" + s);
				else
				{
					nte = emfr + efr + er+ enr;
					pcg = spc/nte;
					l1.setVisible(false);
					t1.setVisible(false);
					l2.setVisible(false);
					t2.setVisible(false);
					b.setVisible(false);
					ta.appendText("\nEstudiantes con muy fuerte recomendacion: " + emfr
								+ "\nEstudiantes con fuerte recomendacion: " + efr
								+ "\nEstudiantes recomendados: " + er
								+ "\nEstudiantes no recomendados: " + (enr-1));
				}
			}
		}
		else
		{
			ce++;
			repaint();
		}
		return true;
	}
	
	public void paint(Graphics g)
	{
		if(ce != 0)
			showStatus("verifique el promedio credito del estudiante");	
	}
}