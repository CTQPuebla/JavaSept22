package com;

public class Hexagono extends Figura implements ICalculos {
	
 double lado;
 
   Hexagono (){
	   
   }

public Hexagono(double lado) {
	
	this.lado = lado;
}

public double getLado() {
	return lado;
}

public void setLado(double lado) {
	this.lado = lado;
}

@Override
public String toString() {
	return "Hexagono [lado=" + lado + "]";
}

@Override
public double area() {
	// TODO Auto-generated method stub
	return (3*(Math.sqrt(3)/2))*lado*lado;
	
}
@Override
public double Volumen() {
	// TODO Auto-generated method stub
	return (3* Math.sqrt(3)* this.lado * this.lado * this.lado) / 2;
	
}

@Override
public double perimetro() {
	// TODO Auto-generated method stub
	return this.lado*6;
}


}

   

