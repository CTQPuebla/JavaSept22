package com;

public class Ciclos {
	public static void main(String[] args) {

		// Ciclos
		// While, do-while, for ---- foreach(colecciones)

		int h = 50;

		// Ejecuta el codigo mientra y solo si se cumple la condicion
		// while(h<10) {
		// System.out.println("texto: "+h);
		// h--;
		//
		// }

		// Se ejecuta el codigo al menos 1 vez, independientemente que se cumpla o no la
		// condicion
		// do {
		// System.out.println("hola");
		// }while(h<10);

		// Ciclo con inicio y fin determinados
		// for (int i = 0; i <25; i++) {
		// System.out.println("Impresion: "+i);
		// }

		// Determinar cuantos numeros hay dentro de un String
		
		
		String mensaje = "13 21 de Septiembre 04 de 2022 63";

		int x = 0;
		int contador = 0;
		int espacios = 0;
		int suma = 0;

		while (x < mensaje.length()) {
			// Buscar numeros
			// 1 '1' 0
			if ("0123456789".indexOf(mensaje.charAt(x)) >= 0) {
				// 3 "3" '3' 2
				suma = suma + Integer.parseInt(Character.toString(mensaje.charAt(x)));
				contador++; // Incrementa el registro de numeros

			} else if (Character.toString(mensaje.charAt(x)).equals(" ")) {
				espacios++;
			}
			x++; // Cambia la posicion del while
		}

		System.out.println("Numeros: " + contador);
		System.out.println("Letras: " + (mensaje.length() - (contador + espacios)));
		System.out.println(mensaje.replace(" ", "")); // sirve para eliminar los espacios
		System.out.println(suma);
		System.out.println(mensaje.toUpperCase());
		
		

	}
	

}