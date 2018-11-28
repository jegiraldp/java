/**
 *  Clase para almacenar cualquier tipo de dato
 *  @author  Amparo López Gaona
 *  @version Abril 2006
 */
public class Celda {
  private Object valor;
/** 
 * Constructor por omisión, asigna el valor null.
 */
  public Celda () {
    valor = null;  
  }
/**
 * Método para asignar valor al objeto.
 * @param val - valor que se asignará.
 */
  public void asignarValor(Object val) {
    valor = val;
  }
/**
 * Método para recuperar el valor almacenado.
 * @return Object - valor almacenado.
 */
  public Object obtenerValor() {
    return valor;
  }
}

