package com;

import java.util.Scanner;

////Realiza un programa que reciba dos n�meros por 
//teclado e indique cu�l es mayor o si son iguales.

public class Ejercicios {

	public static void main(String[] args) {
		
		
//EJERCICIO 1:Realiza un programa que reciba dos n�meros
//		por teclado e indique cu�l es mayor o si son iguales.
		
//		int x = 0;
//		int y = 0;
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("numero1");
//		x = sc.nextInt();
//		System.out.println("numero2");
//		y = sc.nextInt();
//
//		if (x == y) {
//			System.out.println("son iguales");
//
//		}else if (x < y) {
//			System.out.println("el numero1 es mayor");
//			} 
//			else  {
//				System.out.println("el numero2 es menor");
//			}
	
// EJERCICIO2: Realiza un programa que pida un n�mero por teclado y
//		nos indique si es par o impar.
		
//		int numero;
//        Scanner teclado = new Scanner( System.in );
//
//        System.out.println( "Introduzca un n�mero entero: " );
//        numero = teclado.nextInt();
//
//        if ( numero % 2 == 0 )
//        {
//            System.out.println( "PAR" );
//        }
//        else
//        {
//            System.out.println( "IMPAR" );
//        }
//		
//EJERCICIO3: Crea un programa que pida al usuario dos n�meros y 
//        muestre el resultado de su divisi�n. Si el segundo n�mero es 0, 
//        debe mostrar un mensaje de error.
//		
//		Scanner sc = new Scanner(System.in);
//        double dividendo, divisor;
//        System.out.print("Introduzca el dividendo: ");
//        dividendo = sc.nextDouble();
//        System.out.print("Introduzca el divisor: ");
//        divisor = sc.nextDouble();
//        if(divisor==0){
//           System.out.println("No se puede dividir por cero");   
//        }else{
//            System.out.println(dividendo + " / " + divisor + " = " + dividendo/divisor);  
//            System.out.println(); 
//            
            
            
//EJERCICIO4: Realiza un programa que lea una cadena por teclado y 
//		compruebe si es una letra may�scula.
		
//		  Scanner scanner = new Scanner (System.in);
//		    String cadena;
//		
//		    System.out.println("Este programa nos pide una cadena y comprueba si es una letra may�scula.");
//		    System.out.println("Introduce la cadena que desees: ");
//		    cadena = scanner.nextLine();
//		    
//		    if (cadena.length() != 1){
//		      System.out.println("La cadena no es una letra may�scula");
//		    }else if ((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z")<=0)) {
//		       System.out.println("La cadena es una letra may�scula.");
//		    }else {
//		        System.out.println("La cadena no es una letra may�scula.");

//EJERCICIO5: Realiza un programa que calcule la aceptaci�n de una solicitud 
//		en base a los siguientes par�metros: edad, nota y sexo.
//		* M�nimo: Nota (5), edad (18), sexo M -> POSIBLE
//		* M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA
//		* Otros casos -> NO ACEPTADA

  Nota >=5;
  Edad >=15;
  Sexo M o F;
  
  Scanner sc. new Scanner (System.in);
  int nota, edad = 0;
  char sexo = 0;
  
System.out.println("Ingresar nota");
		
		int Nota = sc.nextInt();
		System.out.println("Ingresar edad");
		int Edad= sc.nextInt();
		System.out.println("Ingresar sexo");
		char Sexo = sc.next().charAt(0);

		if (sexo == 'M') {

			if (nota >= 5 && edad >= 18) {
				System.out.println("Posible");
			} else {
				if (nota >= 5 && edad >= 18) {
					System.out.println("Aceptada");
				} else {
					System.out.println("No Valido");
				}
			}

		} else {
			if (nota >= 5 && edad >= 18) {
				System.out.println("Posible");
			} else {
				if (nota >= 5 && edad >= 18) {
					System.out.println("Posible");
				} else {
					System.out.println("No Valido");
				}
			}
		}
			
		
		
//EJERCICIO6:La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial 
//al kilo de uva, la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2).
//Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, se requiere 
//determinar cuanto recibir� un productor por la uva que entrega en un embarque considerando
//lo siguiente:
//* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de tama�o 2.
//* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de tama�o 2.
//Precio inicial se recibe desde teclado
		
//		Scanner sc = new Scanner (System.in);
//	
//		String tipo = "";
//		  int tama�o;
//		  double precioInicial = 0.0;
//
//		  // pedir al usuario
//		  System.out.println("Ingresa precio inicial");
//		  precioInicial = sc.nextDouble();
//		  
//		  System.out.println("Ingresa el tama�o");
//		  tama�o = sc.nextInt();
//		  
//		  sc.nextLine(); //Limpia el chach�
//		  
//		  System.out.println("Ingresa el tipo");
//		  tipo = sc.nextLine();
//		  
//		  
//		  
//		  if (tipo.equalsIgnoreCase("a")) {
//		   if (tama�o == 1) {
//		    precioInicial = precioInicial + 0.20;
//		   }
//		   if (tama�o == 2) {
//		    precioInicial = precioInicial + 0.30;
//
//		   }
//		  }
//
//		  if (tipo.equalsIgnoreCase("b")) {
//		   if (tama�o == 1) {
//		    precioInicial = precioInicial - 0.30;
//		   }
//		   if (tama�o == 2) {
//		    precioInicial = precioInicial - 0.50;
//
//		   }
//		  }
//		  
//		  
//		  System.out.println("Precio final: "+precioInicial);
//		
//	}
//		
 //EJERCICIO7:El director de una escuela est� organizando un viaje de estudios y 
//	requiere determinar cu�nto debe cobrar a cada alumno y cu�nto debe 
//	pagar a la compa��a de viajes por el servicio. La forma de cobrar 
//	es la siguiente:
//		  * Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
//		  * De 50 a 99 alumnos, el costo es de 70 euros.
//		  * De 30 a 49 alumnos, el costo es de 95 euros.
//		  * Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de alumnos.
//		  Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe pagar cada alumno por el viaje.
//    
	
//	Scanner sc = new Scanner(System.in);
//	  int alumnos;
//	  int costo;
//	  double costoIndividual;
//
//	  System.out.println("Ingrese el numero de alumnos");
//	  alumnos = sc.nextInt();
//
//	  // 100 o m�s
//	  if (alumnos >= 100) {
//	   costo = alumnos * 65;
//	  } else if (alumnos >= 50 && alumnos <= 99) { // si esta entre 50 y 99
//	   costo = alumnos * 70;
//	  } else if (alumnos >= 30 && alumnos <= 49) {
//	   costo = alumnos * 95;
//	  } else {
//	   costo = 4000;
//	   costoIndividual = 4000/ alumnos;
//	   System.out.println("Por alumno: " +costoIndividual);
//	   
//
//	  }
//
//	  System.out.println("Costo: " + costo);
//	  
//	  
//	  
//	  
	  
}//Main

}//Publiclass
	
            
			
			
			
			
			
					
					
					
					
					
				
				
			
			
	




