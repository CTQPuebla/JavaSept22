package Com;

import java.util.Date;

public class ClaseHija extends ClasePrueba{
	
	
	Date fechaActual;
	boolean bandera;
	
	
	public ClaseHija() {
	}	
	
	
	public void getFechaActual() {
		System.out.println(new Date());
	}
	
	@Override  // anotacion de java
	
	public void imprimirMensaje() {
		System.out.println("Este es otro mensaje " +(10+50));
	}
	
}
