/**
* EJERCICIO RESUELTO No. 86
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* Clase que contiene la estructura estudiante para el ejercicio 86
*/



public class Num86_Est 
	{
        private long cedula;
        private String nombre;
        private long pago;
        
		public Num86_Est() {
		}
		
        public Num86_Est(long cedula, String nombre, long pago) {
            this.cedula = cedula;
            this.nombre = nombre;
            this.pago = pago;
        }
        
        
        public long getCedula() {
            return cedula;
        }
        
        public void setCedula(long cedula) {
            this.cedula = cedula;
        }
        
        public String getNombre() {
            return nombre;
        }
        
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        
        public long getPago() {
            return pago;
        }
        
        public void setPago(long pago) {
            this.pago = pago;
        }
}
