/**
* EJERCICIO RESUELTO No. 56
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Este ejercicio es desarrollado como un applet
*/

import java.awt.*;
import java.applet.Applet;

public class Num56 extends Applet
{
	
	int A[], B[], C[], aux[];
	int cb = 0, ct = 0, a, b, c, k=0, cn=0;
	float prom;
	Label l1, l2;
	TextField t1, t2;
	Button b2;
	
	
	public void init()
	{
		l1 = new Label("Ingrese la longitud del vector 1                                         ");
		t1 = new TextField(10);
		add(l1);
		add(t1);
		l2 = new Label("Ingrese la longitud del vector 2 y pulse ENTER            ");
		t2 = new TextField(10);
		add(l2);
		add(t2);
		b2 = new Button("Insertar Dato");
		add(b2);
	}
	
	public void paint(Graphics g)
	{
		if(cb!=0)
		{		
			for(int i=0; i<a; i++)
			{
				g.drawString("Datos existentes en el vector A",  40, 40);
				g.drawString("" + A[i],  40+25*i, 60);
			}
			for(int q=0; q<b; q++)
			{
				g.drawString("Datos existentes en el vector B",  40, 80);
				g.drawString("" + B[q],  40+25*q, 100);
			}
			for(int w=0; w<(c); w++)
			{
				g.drawString("Datos existentes en el vector RESULTANTE",  40, 120);
				g.drawString("" + aux[w],  40+25*w, 140);
			}
			showStatus("Programa Terminado");
		}
	}
	
	
	public boolean action(Event e, Object o)
	{
		if(e.target == t2)
		{
			ct++;//contador de las instancias del campo de texto
				 //para controlar que sea creado el vector solamente una vez
			if(ct == 1)
			{
				a = Integer.parseInt(t1.getText());
				if (a>0)
					A = new int[a];//crea el vector A
				l1.setText("Ingrese enteros positivos mayores que cero" );
				System.out.println("creo el vector 1");
				l2.setText("Ingrese el numero a guardar en el vector 2" );
				b = Integer.parseInt(t2.getText());
				if (b>0)
					B = new int[b];//crea el vector B
				c = a + b;//lonitud inicial del vector C
				System.out.println("creo el vector 2");
				t2.setText("");t1.setVisible(false);
				l2.setText("Ingrese el numero a guardar en el vector 1" );
			}
			
		}
		if(e.target instanceof Button)
		{
			if(e.target == b2)
			{
				if(cb < (a+b))
				{
					//llena el vector A
					if(cb<a)
					{
						l1.setText("Ingrese enteros positivos mayores que cero" );
						l2.setText("Ingrese el numero a guardar en el vector 1" );
						A[cb] = Integer.parseInt(t2.getText());
						cb++;//contador de instancias de boton
						t2.setText("");
					}
					else
					{
						//llena el vector B
						l2.setText("Ingrese el numero a guardar en el vector 2" );
						B[cb-a] = Integer.parseInt(t2.getText());
						cb++;//contador de instancias de boton
						t2.setText("");
					}
				}
				//termino de llenar los dos vectores
				if(cb==(a+b))
				{
					t2.setVisible(false);
					l1.setVisible(false);
					l2.setVisible(false);
					b2.setVisible(false);
					if(c>0)
						C = new int[c];//crea el vector C
					System.out.println("creo el vector 3");
					//inserta todo el vector A
					for(int r=0; r<a; r++)
					{
						C[r] = A[r];
					}
					//ingresa el vector B
					for(int t=0; t<b; t++)
					{
						C[t + a] = B[t];
					}
					//se revisa cuales estan repetidos
					cn=0;
					for(int j=0; j<c; j++)
					{
						for(int k=j+1; k<c; k++)
						{
							if(C[j] == C[k])
							{
								C[k] = 0;
								System.out.println("cambio los repetidos");
								cn++;
							}
						}
					}
					//se actualiza el vector resultante
					k=0;
					if((c-cn)>0)
					{
						aux = new int[c-cn];
						for(int y=0; y<c; y++)
						{	if(C[y]!= 0)
							{
								aux[k] = C[y];
								System.out.println("llevo a auxiliar");
								k++;
							}
						}
						c=c-cn;
					}
					else
					{
						aux = new int[c];
						for(int y=0; y<c; y++)
						{	
							aux[k] = C[y];
							System.out.println("llevo a auxiliar");
							k++;
							
						}
					}
					System.out.println("actualizo el vector 3");
					repaint();
				}
			}
		}
		return true;
	}
}
