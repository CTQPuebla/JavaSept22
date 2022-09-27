
public class navaja {
	
		
		//Crear el Objeto
		
		
		//Atributos
		String color, marca, materiales;
		double largo , ancho;
		
		//Atributos de objeto
		String abrelatas, destonillador, navaja;

		public navaja(String color, String marca, String materiales, double largo, double ancho, String abrelatas,
				String destonillador, String navaja) {
			super();
			this.color = color;
			this.marca = marca;
			this.materiales = materiales;
			this.largo = largo;
			this.ancho = ancho;
			this.abrelatas = abrelatas;
			this.destonillador = destonillador;
			this.navaja = navaja;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getMateriales() {
			return materiales;
		}

		public void setMateriales(String materiales) {
			this.materiales = materiales;
		}

		public double getLargo() {
			return largo;
		}

		public void setLargo(double largo) {
			this.largo = largo;
		}

		public double getAncho() {
			return ancho;
		}

		public void setAncho(double ancho) {
			this.ancho = ancho;
		}

		public String getAbrelatas() {
			return abrelatas;
		}

		public void setAbrelatas(String abrelatas) {
			this.abrelatas = abrelatas;
		}

		public String getDestonillador() {
			return destonillador;
		}

		public void setDestonillador(String destonillador) {
			this.destonillador = destonillador;
		}

		public String getNavaja() {
			return navaja;
		}

		public void setNavaja(String navaja) {
			this.navaja = navaja;
		}

		@Override
		public String toString() {
			return "navaja [color=" + color + ", marca=" + marca + ", materiales=" + materiales + ", largo=" + largo
					+ ", ancho=" + ancho + ", abrelatas=" + abrelatas + ", destonillador=" + destonillador + ", navaja="
					+ navaja + "]";
		}
		
		

	
			
			
			
			
		}//Class Navaja

