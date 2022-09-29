package Com;

public class Persona {

	/*color de piel------String
	 * edad----------int
	 * nombre---------String
	 * sexo----------String
	 * ciudadania-----------String
	 */
	
	String colordepiel,nombre,sexo,ciudadania;
	int edad;
	
	public Persona() {
	}

	public Persona(String colordepiel, String nombre, String sexo, String ciudadania, int edad) {
		super();
		this.colordepiel = colordepiel;
		this.nombre = nombre;
		this.sexo = sexo;
		this.ciudadania = ciudadania;
		this.edad = edad;
	}

	public String getColordepiel() {
		return colordepiel;
	}

	public void setColordepiel(String colordepiel) {
		this.colordepiel = colordepiel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCiudadania() {
		return ciudadania;
	}

	public void setCiudadania(String ciudadania) {
		this.ciudadania = ciudadania;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [colordepiel=" + colordepiel + ", nombre=" + nombre + ", sexo=" + sexo + ", ciudadania="
				+ ciudadania + ", edad=" + edad + "]";
	}
	
	
	public void ImprimirMensaje() {
		System.out.println("Imprecion des de Persona");
	}
	
	
	
	
}
