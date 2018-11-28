/**
* EJERCICIO RESUELTO No. 60
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Este ejercicio es desarrollado como un applet y se encuentran los ejercicios
* 57, 58, 59 y 60
*/

import java.awt.*;
import java.applet.Applet;

public class Num60 extends Applet
{
	
	int num[];
	int n=0, cb = 0, ct = 0, mayor =0, k;
	float prom;
	Label l1;
	TextField t1;
	Button b, b2;
	
				
	/*
	 * Ejercicio 57 
	 * Buscar posicion del mayor elemento
	 */
	
	public int MaVec(int[] ve, int lo)
	{
		int re = 0;
		int vec[]= ve;
		int	j = 1,n = lo;
				while(j <= n-1)
		{
			if(vec[j] > re)
				re = vec[j];
			j++;
		}
		return re;
	}
	
	
	/*
	 * Ejercicio 59
	 * Leer el vector
	 */
	public void Leer()
	{
		if(cb < n)
		{
			num[cb] = Integer.parseInt(t1.getText());
			cb++;//contador de instancias de boton para insertar en 
				 //la posicion correcta del vector
			t1.setText("");
		}
		if (cb==n)
		{
		t1.setVisible(false);
		l1.setVisible(false);
		b.setVisible(false);
		/*
		 * Ejercicio 58 
		 * Invocar al subprograma
		 */
		mayor = MaVec(num, n);
		repaint();
		}
	}
	
	
	/*
	 * Ejercicio 60
	 * Imprimir el vector
	 */
	public String Imprima(int[] arr, int l)
	{
		String s="";
		int lon = l;
		int a[] = arr; 
		for(int i=0; i<lon; i++)
		{
			s = s +"   " + a[i];	
		}
		return s;
	}
	
	
	public void init()
	{
		l1 = new Label("Ingrese la longitud del vector y pulse ENTER                           ");
		t1 = new TextField(10);
		add(l1);
		add(t1);
		b = new Button("Insertar Dato");
		b.setEnabled(false);
		add(b);
	}
	
	
	 
	  public void paint(Graphics g)
	  {
		  if(Imprima(num, n) != "")
		  {
			  g.drawString("Datos existentes en el vector",  40, 100);
			  g.drawString(Imprima(num, n), 40, 130);
			  g.drawString("El mayor es: " + mayor , 60, 160);
			  showStatus("Programa Terminado");
		  }
		
	  }
	  
	
	public boolean action(Event e, Object o)
	{
		if(e.target == t1)
		{
			
			if(ct == 0)
			{	
				n = Integer.parseInt(t1.getText());
				if (n>1){
					ct++;//contador de las instancias del campo de texto
						 //para controlar que sea creado el vector solamente una vez
					num = new int[n];
					l1.setText("Ingrese el numero a guardar en el vector y pulse el BOTON" );
					t1.setText("");
					b.setEnabled(true);
				}
			}
			
		}
		if(e.target instanceof Button)
		{
			if(e.target == b)
			{
				Leer();
			}
	
			
		}
		return true;
	}
	
	
}