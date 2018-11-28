/**
* EJERCICIO RESUELTO No. 76
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Este ejercicio es desarrollado como un applet
*/

import java.awt.*;
import java.applet.Applet;

public class Num76 extends Applet
{
	
	int num[][] = new int[8][8];
	int nfr = 0, cc=0, cf= 0, cb =0, nfn =0, ntf =0, co;
	Label l2, l0;
	TextField t2;
	Button b;
	
	
	public void init()
	{
		l0 = new Label(" Fila: " + (cf+1) + " Columna: " + (cc+1));
		l2 = new Label("Ingrese los 64 datos por filas:  0 ninguna ficha, 1 ficha roja, 2 ficha negra y presione ENTER");
		t2 = new TextField(10);
		add(l2);
		add(t2);
		add(l0);
	
	}
	
	public void paint(Graphics g)
	{
		
		if(cb != 0)
		{
			g.drawString("Fichas Existentes en el Tablero",  40, 90);
			for(int i=0; i<8; i++)
			{
				for(int j=0; j<8; j++)
				{
					g.drawString("   " + num[i][j],  40+i*25, 120+j*25);
					showStatus("Programa Terminado");
				}
			}
			g.drawString("El numero de fichas rojas es: " + nfr,  40, 320);
			g.drawString("El numero de fichas negras es: " + nfn,  40, 345);
			g.drawString("El numero total de fichas es: " + ntf,  40, 370);
		}
			
			
			
	}
	
	
	
	public boolean action(Event e, Object o)
	{
		
		if(e.target instanceof TextField)
		{
			if(e.target == t2)
			{
				if(cb < 64)
				{
					
					co = Integer.parseInt(t2.getText());
					if((co == 0)||(co == 1)||(co == 2))
					{
						if(co==1)
							nfr++;
						if(co==2)
							nfn++;
						ntf=nfn + nfr;
						num[cc][cf] = co;
						cb++;//contador de instancias de boton para insertar en 
							 //la posicion correcta del vector
						cc++;
						if((cc == 8)&&(cf<8))
						{
							cc =0;
							cf ++;
						}
						t2.setText("");
						l0.setText(" Fila: " + (cf+1) + " Columna: " + (cc+1));
					}
				}
				if(cb == 64)
				{
					t2.setVisible(false);
					l2.setVisible(false);
					l0.setVisible(false);
					repaint();
				}
			}
		}
		return true;
	}
}