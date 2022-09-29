package com;

public class Cuadrado extends Figura implements ICalculo { 
	 double medidaLado; 
	  
	 public Cuadrado() { 
	   
	 } 
	 
	  
	 
	 public Cuadrado(double medidaLado) { 
	   
	  this.medidaLado = medidaLado; 
	 } 
	 
	 
	 
	 public double getMedidaLado() { 
	  return medidaLado; 
	 } 
	 
	 
	 
	 public void setMedidaLado(double medidaLado) { 
	  this.medidaLado = medidaLado; 
	 } 
	 
	 
	 
	 @Override 
	 public String toString() { 
	  return "Cuadrado [medidaLado=" + medidaLado + "]"; 
	 } 
	 
	 
	 
	 @Override 
	 public double perimetro() { 
	  // TODO Auto-generated method stub 
	  return this.medidaLado*4; 
	 } 
	 
	 
	 
	 @Override 
	 public double area() { 
	  // TODO Auto-generated method stub 
	  return this.medidaLado*this.medidaLado; 
	 } 
	 
	 
	 
	 @Override 
	 public double volumen() { 
	  // TODO Auto-generated method stub 
	  return medidaLado; 
	 } 
	 
	}
