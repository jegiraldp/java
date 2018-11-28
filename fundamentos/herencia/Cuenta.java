/**
 * Clase para manejar cuentas bancarias.
 * @author  Amparo Lopez Gaona
 * @version Abril 2006
 */
public class Cuenta {
  protected double disponible;

  /**
   * Crea una cuenta con disponible mínimo de $2500
   * @param disponibleInicial monto con el que se creara la cuenta.
   */
  public Cuenta(double disponibleInicial) {
    if (disponibleInicial < 2500) {
      do {
        System.out.println("El saldo mínimo es de 2,500.00");
        disponible = (new InOut()).readDouble();
      } while (disponible < 2500);
    } else 
    disponible = disponibleInicial;
  }
  /** 
   * Retira una cantidad de dinero en la cuenta 
   * @param monto cantidad que se desea retirar
   * mayor que el disponible
   */
  public void retirar(double monto) {
    while (monto <= 0 || monto > disponible) {
      System.out.print("Los retiros deben ser positivos y menores a ");
      System.out.println(disponible);
      monto = (new InOut()).readDouble();
    }
    disponible -= monto;
  }

  /** 
   * Deposita una cantidad de dinero en la cuenta 
   * @param monto cantidad que se desea depositar
   */
  public void depositar(double monto) {
    while (monto <= 0) {
      System.out.println("El monto del depósito debe ser positivo");
      monto = (new InOut()).readDouble();
    }
    disponible += monto;
  }

  /**
   * Devuelve el disponible de la cuenta
   * @return double - disponible disponible 
   */
  public double darDisponible() {
    return disponible;
  }
}

