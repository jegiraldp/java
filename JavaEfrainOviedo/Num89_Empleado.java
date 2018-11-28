/**
* EJERCICIO RESUELTO No. 89
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Clase que contiene la estructura del archivo del ejercicio 89
**/

public class Num89_Empleado {

        private String codigo;
        private String nombre;
        private long pago;
        private int estado;

        public Num89_Empleado(String codigo, String nombre, long pago, int estado) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.pago = pago;
            this.estado = estado;
        }
        
        public String getCodigo() {
            return codigo;
        }
        
        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }
        
        public long getPago() {
            return pago;
        }
        
        public void setPago(long pago) {
            this.pago = pago;
        }
        
        public int getEstado() {
            return estado;
        }
        
        public void setEstado(int estado) {
            this.estado = estado;
        }
        
        public String getNombre() {
            return nombre;
        }
        
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
  }
