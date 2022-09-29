package com;

import java.util.Scanner;

public class EJERCICIO11CICLOS {
	public static void main(String[] args) {
		
// Ejercicio10:10.	Programa que lea 20 números e indique si son positivos o 
//		negativos y pares o impares
//		y ademas muestre la sumatoria de los positivos y sumatoria de los impares. 		
		
		
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		int n;
		double sumimpar=0;
		double sumapositivos=0;
		while (contador<20) {
		
		System.out.println("Ingresa numero");
		
		n= sc.nextInt(); //leo el numero
		
		//Positivos o Negativos
		
		if (n<0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Positivo");
			sumapositivos=sumapositivos+n;
		}
		
		
		if (n % 2 == 0) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
			sumimpar=sumimpar+n;
		}
		contador++;
		
		}
		
		
		
		
		
		//iterar para las filas
//		
//		for (int k=0; k<8; k++) {
//			for (int j=0; j<8; j++) {
//				System.out.print("*");
//				
//			}
//				System.out.println("");
//			
//		}
		
// Ejercicio12:Se ingresan un conjunto de n edades de personas por teclado. 
//		El programa finalizara cuando el promedio de las 
//		edades sea superior a 25		
		
//		Scanner sc = new Scanner (System.in);
//		int edad;
//		double promedio = 0.0;
//		int contador = 0;
//		int suma = 0;
//		
//		
//		do {
//			System.out.println("Ingresa la edad");
//			edad = sc.nextInt();
//			contador++;
//			suma=suma + edad;
//			promedio = (suma/contador);
//			System.out.println(promedio);
//		} while (promedio <=25);
//		
//
//
		
		}//main
	}//publicclass

