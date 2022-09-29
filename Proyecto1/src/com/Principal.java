package com;

public class Principal {

	
//metodo main
public static void main(String[] args) {
	
	System.out.println("Septiembre22");  
    
	  // Tipos de datos, declarar variables, tipado fuerte 
	  /* 
	   * Numericos, reales, cadenas, booleans - primitivos 
	   * Objetos - Wrappers, envoltorios  
	   *  
	   */   
	  /* 
	   * long, byte,int,boolean,char,float,double, short 
	   */ 
	  //Numeros enteros 
	  byte b = 127; 
	  short s = 32767; 
	  int x = 32763394; 
	  long l = 999999999999999999l; 
	   
	   
	  //Valores reales 
	  float f = 156.89f; 
	  double d = 156.89; 
	   
	  //Valores booleans 
	  boolean bol = false; 
	   
	  //Caracteres 
	  char c = '5'; 
	  //----------------Envoltorios--- 
	   
	  String mensaje = "yjtyjbhrtyjh$345#%90?)=¡"; //Asignacion directa  
	  String m2 = new String("3G#$%YG#Y$y"); //Asignacion por constructor 
	   
	   
	  Integer numero = 67876; 
	  Byte by = 100; 
	  Short sh = 300; 
	  Long lo = 24945234234234L; 
	   
	  Float fl = 84.45f; 
	  Double dl = 23443.23423; 
	   
	  Boolean bl = true;

//-------------------------------------

System.out.println(mensaje.length());
System.out.println(numero.compareTo(4384));

System.out.println(double.class);
System.out.println(Float.BYTES);
System.out.println(Short.valueOf(s));
System.out.println(lo);
System.out.println(Integer.SIZE);
System.out.println(true);


}
}


