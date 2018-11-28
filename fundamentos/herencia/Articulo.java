public class Articulo extends Obra {
  private String revista;
  private int volumen;
  private int número;

  public Articulo(String autor, String título, String tema, int año, String r,
                  int v, int n){
    super(autor, título, tema, año);
    revista = r;
    volumen = v;
    número = n;
  }
  /** 
   * Método para asignar revista al artículo
   * @param ed - revista del artículo
   */
  public void asignarRevista(String rev){
    revista = (rev != null) ? rev : "Desconocida";
  }

  /** 
   * Método para asignar volumen al artículo
   * @param v - volumen del artículo
   */
  public void asignarVolumen(int v){
      volumen = (v <= 0) ? v : 0;
  }

  /** 
   * Método para asignar número al artículo
   * @param n - número del artículo
   */
  public void asignarNúmero(int n){
      número = (n <= 0) ? n :0;
  }

  /**
   * Método para obtener la revista de publicación del artículo
   * @return String - revista del artículo
   */
  public String obtenerRevista(){
    return revista;
  }
  /**
   * Método para obtener el volumen del artículo
   * @return int - volumen del artículo
   */
  public int obtenerVolumen(){
    return volumen;
  }
  /**
   * Método para obtener el número del artículo
   * @return int - número del artículo
   */
  public int obtenerNumero(){
    return número;
  }

  /**
   * Método para obtener una cadena con los datos de la obra
   * @return String - cadena con los datos de la obra
   */
  public String toString() {
    return super.toString() + "\t" + revista + "\t" + volumen + "\t" + número;
  }
}

