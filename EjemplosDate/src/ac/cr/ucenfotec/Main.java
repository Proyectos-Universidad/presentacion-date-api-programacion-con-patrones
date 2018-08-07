package ac.cr.ucenfotec;

import ac.cr.ucenfotec.ejemplo.mutabilidad.Bar;

public class Main {

	public static void main(String[] args) {
		
		Bar.intentarEntrarABar();
		System.out.println();
		Bar.intentarModificarEdades();
		System.out.println();
		Bar.intentarEntrarABar();
		
	}

}
