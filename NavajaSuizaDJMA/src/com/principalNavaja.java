package com;

public class principalNavaja {

	public static void main(String[] Args) {
		
		navajaSuiza t1 = new navajaSuiza();
		System.out.println(t1);
		
		t1.setAccesorios(5);
		t1.setColor("rojo");
		t1.setMarca("Victorinox");
		t1.setMateriales("acero");
		t1.setAncho(1.3);
		t1.setLargo(3.58);
		t1.setInstrumentos("navaja, destapador, lima, tijeras, desarmador");
				
		System.out.println(t1);
		
		navajaSuiza t2 = new navajaSuiza("rojo", "victorinox", "acero", "navaja, desarmador, lima, tijeras, destapador", 1.3, 3.58, 5);
		System.out.println(t2);
		System.out.println(t2.getMarca());	
		
		navaja n1 = new navaja(10, 1.8, "acero");
		System.out.println(n1);
		
		destapador d1 = new destapador(5, 1.2, "acero");
		System.out.println(d1);
		
		lima l1 = new lima(8, 2.0, "acero");
		System.out.println(l1);
				
		
	}
}
