package com;

import java.util.Scanner;

public class ArrayString {
	public static void main(String[] args) {

//Inicializa un array solo con el tamaño
		
//		int [] numeros = new int [5];
//		numeros [0]= 17;
//		numeros [1]= 16;
//		numeros [2]= 28;
//		numeros [3]= 69;
//		numeros [4]= 80;
//		
//		System.out.println(numeros[4]);
		
		
//Leer desde el teclado una cadena como la siguiente
//V4mo5 a de54yuna12 90 jhf 234

//*Separar letras de numeros
//Almacenar en un array solamente las letras
//Almacenar en otro array solamente los numeros,
//pero sumandole 1
		
//ejemplo
		
//[vmodeyunajhf] -> debe ser un array de strings
//[56652345] -> debe ser un array de int
		
//Imprimir el contenido de los arrays
		
		Scanner scan = new Scanner(System.in); 
		  System.out.println("Introduce texto"); //Instruccion al usuario 
		 
		  String texto = scan.nextLine(); //Leer el texto 
		  //fsd234RGgd3546cd323 
		   
		  int num = 0; // 1 
		  int let = 0; 
		 
		  String numeros = ""; //22343546323 
		  String letras = ""; //fsdRGgdcd 
		  /* 
		   *Seccion 1: Iterar sobre el texto original y separar los numeros de letras 
		   */ 
		  // Itera sobre todo el texto 
		  for (int i = 0; i < texto.length(); i++) { 
		   // Separa los numeros de las letras 
		   if ("1234567890".indexOf(texto.charAt(i)) >= 0) { 
		    //num++; // Incrementa contador de numeros 
		    numeros = numeros + texto.charAt(i); // Almacena los numeros en una variable temporal 
		   } else { 
		    //let++; 
		    letras = letras + texto.charAt(i); 
		   } 
		  } 
		   
		   
		   
		  /* 
		   * Seccion 2: Crear los arrays que contendran los valores 
		   */ 
		   
		  //Inicializo un array de Strings  
		  String[] arrayLetras = new String[letras.length()]; //[ ] 
		  //Inicializo un array de enteros 
		  int[] arraynumeros = new int[numeros.length()];//[ ] 
		   
		   
		  /* 
		   * Seccion 3: LLenar los arrays, iterando sobre las variables acumuladores anteriores 
		   */ 
		 
		  // llenando los arrays 
		  for (int i = 0; i < letras.length(); i++) { 
		   // "f" 'f' 
		   arrayLetras[i] = Character.toString(letras.charAt(i)); 
		  } 
		 
		  for (int i = 0; i < numeros.length(); i++) { 
		              // 2 "2" '2' 
		   arraynumeros[i] = 1 + Integer.parseInt(Character.toString(numeros.charAt(i))); 
		  } 
		   
		   
		  /* 
		   * Seccion 4: Impresion de resultados 
		   */ 
		     
		  // [33454657434]   
		  int c = 0; 
		  while(c<arrayLetras.length) {    
		   System.out.print(arrayLetras[c]); 
		   c++; 
		  }   
		  int h = 0; 
		  while(h<arraynumeros.length) {    
		   System.out.print(arraynumeros[h]); 
		   h++; 
		  }
		
		
		
		
		
		
	


	
	

}//main
		

		
		
		
		
		
		
		
	}//publicclass

