package com;

import java.util.Scanner;

public class ArrayBidimensional {
	public static void main(String[] args) {
		
		
		int [] [] matriz = new int [5][7];
		matriz [0][0] = 1;
		matriz [0][1] = 2;
		matriz [0][2] = 3;
		matriz [0][3] = 4;
		matriz [0][4] = 5;
		matriz [0][5] = 6;
		matriz [0][6] = 7;
		
		matriz [1][0] = 8;
		matriz [1][1] = 9;
		matriz [1][2] = 10;
		matriz [1][3] = 11;
		matriz [1][3] = 12;
		matriz [1][5] = 13;
		matriz [1][6] = 14;
		
//LLenado mediante ciclos
	
		
		Scanner sc = new Scanner (System.in);
		
		//Itera  sobre las filas

	for (int i=0; 1 < matriz.length; i++) {
		//Itera sobre columnas
		
	for (int j = 0; j < matriz.length; j++) {
		System.out.println("Ingresa un valor");
		matriz[i][j] = sc.nextInt();
		
	}
	}
		
		
		
		
		
		
		
		
		
	}//main

}//publicclass
