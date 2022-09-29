package com;
public class Hexagono extends FiguraG implements ICalculos{

  double lado;
 
  public Hexagono() {
    
  
    
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
  public double perimetro() {
    // TODO Auto-generated method stub
    return this.lado*6;
  }

  @Override
  public double area() {
    double perimetro= this.lado*6;
    
    double apotema= Math.sqrt((this.lado*this.lado)-(1/2)*(1/2));
    
    return (perimetro*apotema)/2;
  }

  @Override
  public double volumen() {
	  double perimetro= this.lado*6;
	  
	  double apotema= Math.sqrt((this.lado*this.lado)-(1/2)*(1/2));
  double area= (perimetro*apotema)/2;
    return area*this.lado;
  }

}