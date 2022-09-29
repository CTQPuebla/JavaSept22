package Com;

public class Profecionista extends Persona {

	
	String titulo, gradodeestudio;
	
	public Profecionista() {
		
	}

	public Profecionista(String titulo, String gradodeestudio) {
		super();
		this.titulo = titulo;
		this.gradodeestudio = gradodeestudio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGradodeestudio() {
		return gradodeestudio;
	}

	public void setGradodeestudio(String gradodeestudio) {
		this.gradodeestudio = gradodeestudio;
	}

	@Override
	public String toString() {
		return "Profecionista [titulo=" + titulo + ", gradodeestudio=" + gradodeestudio + "]";
	}
	
	public void getTitulo1() {
		System.out.println();
}
	
}