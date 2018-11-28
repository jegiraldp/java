/**
 * Clase para trabajar cuentas de crédito. Este tipo de cuentas tienen además
 * de un saldo o cantidad disponible, un límite de crédito y la cantidad que 
 * se adeuda
 * @author Amparo López Gaona
 * @version Abril 2006
 * @see Cuenta
 */
public class CuentaDeCredito extends Cuenta {
  private final double límite;
  private double deuda;

  /**
   * Constructor de una cuenta de crédito a partir del límite de crédito especificado
   * @param crédito - límite de crédito otorgado
   */
  public CuentaDeCredito (double crédito) {
    super (crédito);   //  disponible = límite;
    límite = crédito;
    deuda = 0;
  }
  /**
   * Método que registra una compra mediante la cuenta de crédito siempre que
   * el monto de la misma sea positivo y menor que el disponible.
   * @param monto - importe de la compra
   * @return boolean - indica si se autoriza la compra o no.
   */
  public boolean comprar(double monto) {
    if (monto > 0.0 && monto < disponible ) {
      deuda += monto;
      disponible -= monto;
      return true;
    } else return false;
  }
  /**
   * Método para retirar dinero de una cuenta de crédito
   * @param monto - importe del retiro
   * @exception ExcepcionBancaria - disparada si el déposito es negativo
   */
    public void retirar (double monto) {
    if (monto >0.0 && monto <= disponible ) {
      double comision = monto *0.02;
      super.retirar(monto+comision);
      deuda += monto + comision;
    }
  }
  /**
   * Método para conocer el importe de la deuda de la tarjeta de crédito
   * @return double - importe de la deuda.
   */
  public double obtenerValorDeuda() {
    return deuda;
  }
}
