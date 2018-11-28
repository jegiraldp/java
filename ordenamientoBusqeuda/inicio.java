package pqtOrdenamiento;

public class inicio {

	public static void main(String[] args) {
		
		
		//int[] vector = {3,9,11,4,1};
		int[] vector = {17,89,45,76,3,94,11,4,9,77,54,34,12,13,14};
				
		//ordenar por burbuja
		System.out.print("\n...Método Ordenamiento Burbuja...");
		burbuja.ordenarBurbuja(vector);
		verVector(vector);
		System.out.print("\nTiempo (Nano): "+burbuja.tDelta);
		///
		
		//ordenar por inserción
		//int[] vector2 = {3,9,11,4,1};
		int[] vector2 = {17,89,45,76,3,94,11,4,9,77,54,34,12,13,14};
		System.out.print("\n\n...Método Ordenamiento Inserción...");
		insercion.ordenarInsercion(vector2);
		verVector(vector2);
		System.out.print("\nTiempo (Nano): "+insercion.tDelta);
		///
		
		//ordenar por inserción
		//int[] vector3 = {3,9,11,4,1};
		int[] vector3 = {17,89,45,76,3,94,11,4,9,77,54,34,12,13,14};
		System.out.print("\n\n...Método Ordenamiento Selección...");
		seleccion.ordenarSeleccion(vector3);
		verVector(vector3);
		System.out.print("\nTiempo (Nano): "+seleccion.tDelta);
				///
		

	}//main
	
	static void verVector(int[] ve){
		System.out.print("\n");
		for (int i = 0; i < ve.length; i++){ 
			System.out.print(ve[i]+" ");
		}
	}//verVector

}//clase
