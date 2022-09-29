package com;

public class Cuadrado extends Figura implements ICalculos{
	
	int lado;
	
 public Cuadrado () {
	
}
public Cuadrado(int lado) {
	super();
	this.lado = lado;
}
public int getLado() {
	return lado;
}
public void setLado(int lado) {
	this.lado = lado;
}
@Override
public String toString() {
	return "Cuadrado [lado=" + lado + "]";
}
@Override
public double perimetro() {
	// TODO Auto-generated method stub
	return this.lado*4;
}
@Override
public double area() {
	// TODO Auto-generated method stub
	return this.lado*4;
}
@Override
public double volumen() {
	// TODO Auto-generated method stub
	return this.lado*lado*4;
}

}
