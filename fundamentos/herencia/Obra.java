/**
 * Clase para registrar los datos de una obra literaria.
 * @author  Amparo López Gaona
 * @version Abril 2006
 */
public class Obra {
  private String autor;
  private String título;
  private String tema;
  private int año;

  /** Constructor de una obra
   * @param a- nombre del autor de la obra
   * @param t- título de la obra
   * @param tem - tema de clasificación de la obra
   * @param an - año de publicación de la obra
   */
  public Obra(String a, String t, String tem, int an){
    autor = a;
    título = t;
    tema = tem;
    año = an;
  }
  /** Método para asignar valor al autor de la obra
   * @param nombre - nombre del autor de la obra
   */
  public void asignarAutor (String nombre) {
    autor = nombre;
  }
  /** Método para asignar título a la obra
   * @param t- título de la obra
   */
  public void asignarTítulo (String t) {
    título = t;
  }
  /** Método para asignar tema a la obra
   * @param t - tema de la obra
   */
  public void asignarTema (String t) {
    tema = t;
  }
  /** Método para asignar año a la obra
   * @param a - año de publicación de la obra
   */
  public void asignarAño (int a) {
    año = a;
  }
  /**
   * Método para obtener el autor de la obra
   * @return String - nombre del autor de la obra
   */
  public String obtenerAutor () {
    return autor;
  }
  /**
   * Método para obtener el tema de la obra
   * @return String - tema de la obra
   */
  public String obtenerTema () {
    return tema;
  }

  /**
   * Método para obtener el título de la obra
   * @return String - título de la obra
   */
  public String obtenerTítulo () {
    return título;
  }

  /**
   * Método para obtener el año de la obra
   * @return int - año de publicación de la obra
   */
  public int obtenerAño () {
    return año;
  }
  /**
   * Método para obtener una cadena con los datos de la obra
   * @return String - cadena con los datos de la obra
   */
  public String toString() {
    return autor + "\t"+ título + "\t"+ tema + "\t" + año;
  }
}


