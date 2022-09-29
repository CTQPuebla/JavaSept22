package com;

public class Circulo extends Figura implements ICalculo{ 
	  
    double radio; 
  
 public Circulo() { 
   
 } 
 
 public Circulo(double radio) { 
  super(); 
  this.radio = radio; 
 } 
 
 public double getRadio() { 
  return radio; 
 } 
 
 public void setRadio(double radio) { 
  this.radio = radio; 
 } 
 
 @Override 
 public String toString() { 
  return "Circulo [radio=" + radio + "]"; 
 } 
 
 
 
 @Override 
 public double perimetro() { 
  // TODO Auto-generated method stub 
  return 1.33*(Math.PI*(Math.pow(radio, 3))); 
 } 
 
 @Override 
 public double area() { 
  // TODO Auto-generated method stub 
  return Math.PI*(radio); 
 } 
 
 @Override 
 public double volumen() { 
  // TODO Auto-generated method stub 
  return 0; 
 } 
 
}

