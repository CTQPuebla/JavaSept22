package com;

import java.util.Scanner;

public class EstructurasControl {

	public static void main(String[] args) {
		// Estructuras de control
		// If,if=else, switch-case
		// ADN, OR, NOT, ==

//		String letras = "1323";
//		int y = 10;
//		int x = 9;
//
//		// System.out.println(letras.lenght());
//		// false
//
//		if (!(x > y && letras.equals("jjjjjjj"))) {
//			// si se cumple
//			System.out.println("Si");
//		} else {
//			// no se cumple
//			System.out.println("No");
//
//		}

////			//Diferente de
//			if('z'!='Z') {
//					System.out.println("Si es diferente de");
//			}
		
//		int x=5;
//
//		if (x == 1) {
//			System.out.println("lunes");
//		} else if (x == 2) {
//			System.out.println("martes");
//		} else if (x == 3) {
//			System.out.println("miercoles");
//		} else if (x == 4) {
//			System.out.println("jueves");
//		} else if (x == 5) {
//			System.out.println("viernes");
//		} else if (x == 6) {
//			System.out.println("sabado");
//		} else if (x == 7) {
//			System.out.println("domingo");
//
//		}

		// switch
//int x= 1;
//		switch (x) {
//
//		case 1:
//			System.out.println("lunes");
//
//		case 2:
//			System.out.println("martes");
//		case 3:
//			System.out.println("miercoles");
//			break;
//		case 4:
//			System.out.println("jueves");
//		case 5:
//			System.out.println("viernes");
//		case 6:
//			System.out.println("sabado");
//		case 7:
//			System.out.println("domingo");
//			break;
//
//		default:
//			System.out.println("opcion no valida");
//
//		}
		
		
		//Scanner
		
		Scanner lector = new Scanner(System.in);
		System.out.println("ingresa un numero");
		int y = lector.nextInt();
		
		System.out.println(y*2);

	}// main
}// clase
