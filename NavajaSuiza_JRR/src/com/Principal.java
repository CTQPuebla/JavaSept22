package com;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Ejemplo Navaja");

		Navaja hojaGrande = new Navaja(5, 58);
		Navaja cuchilla = new Navaja(3, 36);

		Destornillador desarmador = new Destornillador("cruz", 0.25);

		Lupa lupa = new Lupa(2.5, 5.0);

		Gancho gancho = new Gancho(100);

		Tijera tijeras = new Tijera("papel", 5.5);

		NavajaSuiza navaja = new NavajaSuiza("Victorinox", "rojo", "acero inoxidable", 10.8, 3.5, hojaGrande, cuchilla,
				true, desarmador, true, tijeras, lupa, true, gancho);

		System.out.println(navaja);

	}
}
