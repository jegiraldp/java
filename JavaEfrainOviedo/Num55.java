/**
* EJERCICIO RESUELTO No. 55
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Este ejercicio es desarrollado como un applet
*/

import java.awt.*;
import java.applet.Applet;

public class Num55 extends Applet
{
	
	int num[], aux[];
	int n=0, cb = 0, dato;
	double prom=1, var, dt, suma1 =0, suma2=0;
	double pot=0;
	Label l1;
	TextField t1;
	Button b;
	
	
	public void init()
	{
		l1 = new Label("Ingrese los datos uno por uno y pulse el BOTON. Ingrese 0 para terminar");
		t1 = new TextField(10);
		add(l1);
		add(t1);
		b = new Button("Insertar Dato");
		add(b);
	}
	
	public void paint(Graphics g)
	{
		for(int i=0; i<cb; i++)
		{
			g.drawString("Datos existentes en el vector",  40, 40);
			g.drawString("" + num[i],  40+25*i, 60);
			g.drawString("El promedio es:   "  + prom + ", la varianza es:   " + var + " y la desviacion tipica es:   " + dt, 40, 100);;
			showStatus("Programa Terminado");
		}
	}
	
	//proceso que se realiza mientras el dato no sea cero
	public boolean action(Event e, Object o)
	{
		if(e.target instanceof Button)
		{
			if(e.target == b)
			{
				dato = Integer.parseInt(t1.getText());//captura el dato
				if(dato != 0)
				{
					cb++;//contador de instancias de boton 
					aux = new int[cb];//crea un nuevo vector aux con mas longitud
					if(cb == 1)
					{
						num = new int[cb];
						num[0] = dato;
					}
					
					//lleva los datos del vector num al vector auxiliar
					for(int k=0; k<cb-1; k++)
					{
						aux[k] = num[k];
					}
				//lleva el nuevo dato a la ultima posicion del vector
					aux[cb-1] = dato;
					num = null;
					num = new int[cb];
					num = aux;
					suma1 = suma1 + dato;//suma el nuevo dato
					t1.setText("");
				}
				else
				{	//termino de llenar
					if((cb - 1)>0)
					{
						prom = (suma1/(cb));//calcula el promedio
					}
					t1.setVisible(false);
					l1.setVisible(false);
					b.setVisible(false);
					for(int j=0; j<cb; j++)
					{
						if((prom >= 0)&&(num[j]>= 0))
							suma2 = (suma2 + ((prom - num[j])*(prom - num[j])));
					}
					if((cb - 1)!=0)
						var = (suma2/(cb));//varianza
						if(var >= 0)
							dt = Math.sqrt(var);//desviacion tipica
					repaint();
				}
			}
	
			
		}
		return true;
	}
}