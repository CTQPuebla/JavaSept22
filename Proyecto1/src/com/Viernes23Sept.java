package com;

import java.util.Scanner;

public class Viernes23Sept {
	public static void main(String[] args) {
    //tabla A     tabla b
		//x4f     72k
		//y35     26q
		//2pt     c31
		
		Scanner sc = new Scanner(System.in);
		// Suma de matrices

		// [Filas] [Columnas]
		String[][] matrizA = new String[3][3];
		String[][] matrizB = new String[3][3];
		String[][] matrizC = new String[3][3];

		// Llenar la matriz A

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.println("Ingresa un valor, posicion:¨" + i + ":" + j);
				matrizA[i][j] = sc.nextLine();
			}
		}

		// Llena matriz B

		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[i].length; j++) {
				System.out.println("Ingresa un valor, posicion:¨" + i + ":" + j);
				matrizB[i][j] = sc.nextLine();

			}
		}

		// Realizando suma

		String numeros = "1234567890";
		int n1 = 0;
		int n2 = 0;
		int suma=0;

		// Filas
		for (int i = 0; i < matrizC.length; i++) {
			// Columnas
			for (int j = 0; j < matrizC[i].length; j++) {
				// Verifica que ambos valores sean numeros
				if (numeros.indexOf(matrizA[i][j]) >= 0 && numeros.indexOf(matrizB[i][j]) >= 0) {

					// Convierte a enteros
					n1 = Integer.parseInt(matrizA[i][j]);
					n2 = Integer.parseInt(matrizB[i][j]);

					matrizC[i][j] = Integer.toString(n1 + n2);
					
					String[] arrayletras = {"uno","dos", "tres","cuatro", "cinco","seis", "siete","ocho", "nueve","cero"};
					suma = n1+n2;
					matrizC [i][j]=arrayletras [suma-1];
					
					

				} else {
					matrizC[i][j] = "0";
				}

			}
		}

		// Imprime el contenido de la 3er matriz

		for (int i = 0; i < matrizC.length; i++) {
			for (int j = 0; j < matrizC[i].length; j++) {
				System.out.print(matrizC[i][j]);
			}
			System.out.println();
		}

		
		
		
	}// main

}// publicclass
