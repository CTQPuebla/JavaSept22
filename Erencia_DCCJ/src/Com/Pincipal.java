package Com;

public class Pincipal {

	public static void main(String[] args) {
	
		ClasePrueba claseP= new ClasePrueba ("hola",20,30.6);
		claseP.imprimirMensaje();
	
		claseP.getAtributoB();
		System.out.println(claseP.atributoD);
		claseP.atributoD ="un valor mas raro";
//		claseP.MENSAJE = "kdeudjij"
		//instancia clase hija
		ClaseHija claseH = new ClaseHija();
		
		claseH.imprimirMensaje();
		
		claseH.getAtributoB();
		
		claseH.getFechaActual();
		
		System.out.println(claseH.atributoD);
		
		//Modificadores de acceso public,private,protected
		
		ClasePrueba objeto = new ClasePrueba ("abcdf",20,30.6);
		
		objeto.atributoA = "uhuvife";       //llamada al atributo de clase  
	
		objeto.setAtributoA("otro valor");  // llamada mediante setter
	
		System.out.println(objeto.atributoD);
	
	//objeto.atributoB=10;  llama a un atributo privado (no funciona)
	
	
	objeto.setAtributoB(18); // llama a un atrubuto privado
	
	objeto.atributoC = 334.55;
	
	
	System.out.println(claseP.multiplicar(2.7, 8));
	System.out.println(claseP.multiplicar("60"));
	
	
	}
}
