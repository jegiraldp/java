/**
* EJERCICIO RESUELTO No. 34
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Este ejercicio es desarrollado como un applet 
*/

import java.awt.*;
import java.applet.Applet;

public class Num34 extends Applet
{
	Label l1, l2, l0, l3, l4, l5, l6;
	TextArea ta;
	TextField t1, t2, t0, t3, t4, t5, t6;
	int nmc, codm, nc, ncc, nt, code, cb=0;
	float nota, pc, pcp=0, suma1=0, suma2=0;
	double valtpa=0, vtc=0;
	String nomm, nome;
	Button b, b2;
	
	//inicializa las componentes graficas
	public void init()
	{
		b = new Button("          Ingresar          ");
		l0 = new Label("Ingrese el codigo del estudiante                                             ");
		l1 = new Label("Ingrese el nombre del estudiante                                           ");
		l2 = new Label("Ingrese el numero de materias cursadas y pulse ENTER");
		l3 = new Label("Ingrese el codigo de la materia                                               ");			
		l4 = new Label("Ingrese el nombre de la materia                                             ");			
		l5 = new Label("Ingrese el numero de creditos de la materia                        ");			
		l6 = new Label("Ingrese la nota de la materia y  pulse el BOTON                 ");
		t1 = new TextField(10);
		t2 = new TextField(10);
		t0 = new TextField(10);
		t4 = new TextField(10);
		t5 = new TextField(10);
		t6 = new TextField(10);
		t3 = new TextField(10);
		ta = new TextArea("");
		ta.setEditable(false);
		//adiciona al applet los componentes graficos
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
		add(b);
		add(ta);
		//deja desactivados para escritura los campos 
		//correspondientes a las materias
		t3.setEditable(false);
		t4.setEditable(false);
		t5.setEditable(false);
		t6.setEditable(false);
		//fija valores para poder realizar las operaciones
		t3.setText("0");
		t4.setText("0");
		t5.setText("0");
		t6.setText("0");
	}
	
	/* El metodo se va a repetir las veces que sea necesario 
	 * hasta que sea ingresado en el codigo del alumno un cero
	 * mientras esto ocurre se mantiene una actualizacion
	 * constante del aspecto grafico. Inicialmente se deja activos 
	 * solamente tres campos de texto donde se recolecta la informacion basica 
	 * del estudiante y el numero de materias que curso durante el periodo
	 * cuando termina el evento del campo de texto se activan los campos donde
	 * se recolecta la informacion de las materias cursadas hasta que el numero de
	 * veces sea igual al numero de materias cursadas por el alumno; tan pronto termine muestra
	 * el promedio credito del alumno y repite el proceso para codigos de 
	 * estudiante validos.
	 */
	public boolean action(Event e, Object o)
	{
		//si el evento es un enter en el campo de texto t2
		if(e.target == t2)
		{
			code = Integer.parseInt(t0.getText());
			//verifica que el codigo del estudiante no sea cero para realizar las operaciones 
			if((!(code == 0)))
			{
				nt++;//incrementa el contador de eventos del campo de texto
				ncc=0;//numero de creditos cursados
				suma1 = 0; 
				nome = t1.getText();//nombre del estudiante
				nmc = Integer.parseInt(t2.getText());//numero de materias cursadas
				ta.appendText("\n\n\t codigo:  " + code  + "\t nombre:  " + nome +"\tmaterias cursadas:  " + nmc 
							+ "\n\t codigo materia \t\t nombres\t\t nota");
				//limpia los campos de texto correspondientes
				//a la inforacion de las materias
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");	
				//desactiva los campos de texto para la informacion inicial del estudiante y activa los de la materia
				t0.setEditable(false);
				t1.setEditable(false);
				t2.setEditable(false);
				t3.setEditable(true);
				t4.setEditable(true);
				t5.setEditable(true);
				t6.setEditable(true);
				//inicializa el contador de eventos de boton
				cb=0;
			}
			//si el codigo del estudiante es cero se termina el programa
			if(code == 0)
			{
				pcp = suma2/nt;//promedio credito ponderado
				if(nt > 0)
				ta.appendText("\n\n\tPromedio del grupo:  " + pcp);
				//inhabilita los campos de la informacion del estudiante
				t0.setEditable(false);
				t1.setEditable(false);
				t2.setEditable(false);
				//oculta el boton para evitar mas acciones
				b.hide();
				//indica que termino el programa
				showStatus("Programa Terminado");
			}
		}
		//evento de boton
		if(e.target == b)
		{
			//controla que el numero de veces que instancie el boton
			//sea menor que el numero de materia cursadas
			if(cb < nmc)
			{
				codm = Integer.parseInt(t3.getText());//codigo de la materia
				nomm = t4.getText();//nombre de la materia
				nc = Integer.parseInt(t5.getText());//numero de creditos de la materia
				nota = Float.parseFloat(t6.getText());//nota de la materia
				suma1 = suma1 + nc * nota;
				ncc = ncc + nc;//numero de creditos cursados
				ta.appendText("\n\t " + codm  + "\t\t\t " + nomm +"\t\t\t" + nota );
				//limpia los campos de texto para esperar nuevos datos
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");	
				cb++;
				//termina de recolectar datos de las materias
				if(cb == nmc)
				{
					pc = suma1/ncc;//promedio credito
					suma2 = suma2 + pc;
					ta.appendText("\n\tcreditos cursados  " + ncc + " promedio credito  " + pc);
					//limpia los campos de texto del alumno
					t0.setText("");
					t1.setText("");
					t2.setText("");
					//habilita los campos de los estudiantes 
					//y deshabilita los de la materia
					t0.setEditable(true);
					t1.setEditable(true);
					t2.setEditable(true);
					t3.setEditable(false);
					t4.setEditable(false);
					t5.setEditable(false);
					t6.setEditable(false);
					t3.setText("0");
					t4.setText("0");
					t5.setText("0");
					t6.setText("0");
				}
			}
		}
		return true;
	}
}