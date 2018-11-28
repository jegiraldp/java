/**
* EJERCICIO RESUELTO No. 19
* @autor	Efrain Oviedo
* @libro	Logica de Programación
* 
* Este ejercicio es desarrollado como un applet
*/

import java.awt.*;
import java.applet.Applet;

public class Num19 extends Applet
{
	Label l;
	TextField t;
	TextArea ta;
	int numero, suma=0, cant=0;
	
	public void init()
	{
		l = new Label("Ingrese el valor a sumar o un numero < 0 para terminar");
		t = new TextField(10);
		ta = new TextArea("");
		ta.setEditable(false);
		add(l);
		add(t);
		add(ta);
		
		
		
	}
	
	
	public boolean action(Event e, Object o)
	{
		
		numero = Integer.parseInt(t.getText());
		t.setText("");
		ta.setVisible(true);
		if (numero > 0){
		cant++;
		suma = suma + numero;
		ta.setText("La suma hasta el momento es: " + Integer.toString(suma));
		showStatus("La suma hasta el momento es: " + Integer.toString(suma));
		
		}else{
		double prom = (double)suma/cant;	
		ta.setText("El promedio de los numeros es: " + prom);
		showStatus("El promedio de los numeros es: " + prom);
		}
		return true;
	}
}