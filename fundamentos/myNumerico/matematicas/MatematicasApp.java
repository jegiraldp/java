package matematicas;

public class MatematicasApp {
  public static void main(String args[]) {
    
    int i = 7;
    int j = -9;
    double x = 72.3543;
    double y = 0.3498;

    System.out.println("i es " + i);
    System.out.println("j es " + j);
    System.out.println("x es " + x);
    System.out.println("y es " + y);

    // Valor absoluto de un número
    System.out.println("|" + i + "| es " + Math.abs(i));
    System.out.println("|" + j + "| es " + Math.abs(j));
    System.out.println("|" + x + "| es " + Math.abs(x));
    System.out.println("|" + y + "| es " + Math.abs(y));

// aproximación decimal
//empleando (round)
     System.out.println(x + " es " + Math.round(x));
     System.out.println(y + " es " + Math.round(y));

     System.out.println(x + " es aprox." + (double)Math.round(x*100)/100);
     System.out.println(y + " es aprox." + (double)Math.round(y*100)/100);

//empleando floor
     System.out.println("The floor of " + x + " es " + (100*Math.floor(x))/100);
     System.out.println("The floor of " + y + " es " + (100*Math.floor(y))/100);

// para hallar el menor de dos número
     System.out.println("min(" + i + "," + j + ") es " + Math.min(i,j));
     System.out.println("min(" + x + "," + y + ") es " + Math.min(x,y));

// Para hallar el mayor de dos números
     System.out.println("max(" + i + "," + j + ") es " + Math.max(i,j));     
     System.out.println("max(" + x + "," + y + ") es " + Math.max(x,y));

// las constantes PI y E
     System.out.println("Pi es " + Math.PI);
     System.out.println("e es " + Math.E);
       
//funciones trigonométricas
    double angulo = 45.0 * Math.PI/180.0;
    System.out.println("cos(" + angulo + ") es " + Math.cos(angulo));
    System.out.println("sin(" + angulo + ") es " + Math.sin(angulo));
    System.out.println("tan(" + angulo + ") es " + Math.tan(angulo));

// Funciones trigonomértricas inversas
    double valor = 0.707;
    System.out.println("acos(" + valor + ") es " + Math.acos(valor));
    System.out.println("asin(" + valor + ") es " + Math.asin(valor));
    System.out.println("atan(" + valor + ") es " + Math.atan(valor));
    y=6.2;  //ordenada
    x=-5.4;   //abscisa
    System.out.println("atan2(" + y+" , "+x + ") es " + Math.atan2(y, x));

//Funciones exponencial y logarítmica
    System.out.println("exp(1.0) es " +  Math.exp(1.0));
    System.out.println("exp(10.0) es " + Math.exp(10.0));
    System.out.println("exp(0.0) es " +  Math.exp(0.0));

    System.out.println("log(1.0) es " + Math.log(1.0));
    System.out.println("log(10.0) es " + Math.log(10.0));
    System.out.println("log(Math.E) es " + Math.log(Math.E));

// pow(x,y) devuelve x elevado a y.
    System.out.println("pow(2.0, 2.0) es " +  Math.pow(2.0,2.0));
    System.out.println("pow(10.0, 3.5) es " +  Math.pow(10.0,3.5));
    System.out.println("pow(8, -1) es " + Math.pow(8,-1));

// sqrt(x) devuelve la raíz cuadrada de x.
    System.out.println("La raíz cuadrada de " + y + " es " + Math.sqrt(y));

// Devuelve un número pseudo-aleatorio comprendido entre 0.0 y 1.0
    System.out.println("Número aleatorio: " + Math.random());
    System.out.println("Otro número aleatorio: " + Math.random());

    try  {
//espera la pulsación de una tecla y luego RETORNO
        System.in.read();
    }catch (Exception ex) {  }
  }
}
