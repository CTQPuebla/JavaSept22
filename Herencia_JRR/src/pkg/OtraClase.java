package pkg;

import com.ClasePrueba;

public class OtraClase extends ClasePrueba {

	public OtraClase() {
		this.atributoC = 47.47;
	}

	public static void main(String[] args) {
		ClasePrueba claseP = new ClasePrueba("Hola", 2, 30.6);
		// claseP.atributoCC

		OtraClase otraC = new OtraClase();
		// otraC.atributoC = 10.5;
		System.out.println(otraC);
	}

}
