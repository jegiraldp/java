/**
 *  Clase para simular una memoria en la que se puede almacenar cualquier
 *  tipo de dato.
 *  @author  Amparo López Gaona
 *  @version Abril 2006
 */
public class Memoria {
  DepositoDato [] mem;

/** 
 * Constructor por omisión, crea una memoria para 100 elementos.
 */
  public Memoria() {
    mem = new DepositoDato[100];
    for (int i = 0; i < mem.length; i++) {
      mem[i] = new DepositoDato();
    }
  }
/** 
 * Constructor por omisión, crea una memoria para la cantidad
 * especificada de elementos.
 * @param tamaño - capacidad de la memoria.
 */
  public Memoria(int tamaño) {
    mem = (tamaño > 0) ? new DepositoDato[tamaño] : new DepositoDato[100];
    for (int i = 0; i < mem.length; i++) {
      mem[i] = new DepositoDato();
    }
  }
/**
 * Método para almacenar un dato en la posición especificada.
 * @param pos - posición en que almacenará el dato
 * @param val - valor que se asignará.
 */
  public void almacenarDato(int pos, Object val) {
    if (pos > 0 && pos < mem.length) {
      mem[pos].asignarValor(val);
    }
  }
/**
 * Método para recuperar el valor almacenado en la posición especificada.
 * @param pos - posición de la que se tomará el dato
 * @return Object - valor almacenado.
 */
  public Object obtenerDato(int pos) {
    return (pos > 0 && pos < mem.length) ? mem[pos].obtenerValor() : null;
  }

}

