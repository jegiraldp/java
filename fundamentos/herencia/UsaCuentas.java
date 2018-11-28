public class UsaCuentas {
 public static void main(String[] pps)   {
  InOut io=new InOut();
  double capital;
  boolean otramás=true;
  CuentaConServicios cuenta;
                                       // Solicita capital inicial
  System.out.println("¿Con cuánto quieres iniciar tu cuenta?");
  capital=io.readDouble();
  while(capital<2500) {   //Valida el depósito inicial para una cuenta
    System.out.println("La cantidad mínima es de $2500");
    System.out.println("Indica de nuevo la cantidad");
    capital=io.readDouble();
  }
  cuenta=new CuentaConServicios(capital);  // Crea la cuenta
  do {        //Muestra menú de opciones y pide seleccionar alguna
    System.out.println("1.Retirar capital");
    System.out.println("2.Depositar capital");
    System.out.println("3.Consultar saldo");
    System.out.println("4.Pagar teléfono");
    System.out.println("9.Terminar");

    switch(io.readChar()) {
    case '1':            //Retiro
      System.out.println("¿Cuánto dinero quieres retirar?");
      capital=io.readDouble();
      cuenta.retirar(capital);
      break;
    case '2':            //Depósito
      System.out.println("¿Qué cantidad deseas depositar?");
      capital=io.readDouble();
      cuenta.depositar(capital);
      break;
    case '3':            // Saldo
      System.out.println("Tu saldo es de:$" + cuenta.darDisponible());
      break;
    case '4':            // Pago de teléfono
      System.out.println("¿Cuánto dinero vas a pagar?");
      capital=io.readDouble(); 
      cuenta.pagarTeléfono(capital);
      System.out.println("Teléfono pagado, gracias");
      break;
    case '9':              //Fin del programa
      System.out.println("***   Hasta pronto.   ***");
      otramás = false;
      break;
    default:
      System.out.println("Opción inválida");
    }
  } while(otramás==true); 
 }
}
