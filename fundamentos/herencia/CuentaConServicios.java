/**
 * Clase para manejar cuentas bancarias con la posibilidad de pagar
 * el teléfono.
 * @author  Amparo López Gaona
 * @see     Cuenta
 * @version Abril 2006
 */
public class CuentaConServicios extends Cuenta {
  /*
   * Constructor de CuentaConServicios, simplemente llama al contructor
   * de la clase Cuenta.
   */
  public CuentaConServicios(double montoInicial) {
    super(montoInicial);
  }
  /*
   * Método para pagar el teléfono tomando dinero de la cuenta
   * con la que se llama a este método.
   * @param monto - Cantidad que debe pagarse
   */
    public void pagarTeléfono(double monto) { 
    retirar(monto);
                // Código para pagar el teléfono
    disponible += 100.00;
  }
}

