package com;

import java.util.Date;

public class ClaseHija extends ClasePrueba{
	
	Date fechaactual;
	boolean bandera;
	
  public ClaseHija() {
	  
  }
  
  public void getFechaActual() {
	  System.out.println(new Date());
  }
  
  //Anotacion de Java
  @Override
  public void ImprimirMensaje() {
	  System.out.println("este es otro mensaje"+(10+50));
  }
}
