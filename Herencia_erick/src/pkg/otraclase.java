package pkg;

import java.util.Date;

import com.claseprueba;

public class otraclase extends claseprueba {

	public otraclase() {
		this.atributoC = 487.90;
	}

	Date fechaActual;
	boolean bandera;

	public void getFechaActual() {
		System.out.println(new Date());
	}

	// --------Comportamiento propio
	public void imprimirmensaje() {
		System.out.println("Este es otro mensaje");
	}

}
