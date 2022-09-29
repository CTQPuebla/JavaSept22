package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {

	public static void main(String[] args) {
		// Lectura & escritura de archivos

		String linea = "";

		try {

//			File archivo = new File("\"C:\\Users\\hp\\Desktop\\karla.txt\""); // Representacion del archivo en memoria
//			FileReader fr = new FileReader(archivo); // Sabe leer el archivo
//			BufferedReader buffer = new BufferedReader(fr); // Lee el contenido del archivo
//
//			while ((linea = buffer.readLine()) != null) {
//				System.out.println("Linea: " + linea);
//			}

			 String abc = "karlarocha";
			 File archivo = new File("C:\\Users\\hp\\Desktop\\karla.txt\\");
			 FileWriter line = new FileWriter(archivo, true);
			
			 for (int i = 0; i < abc.length(); i++) {
			
			 line.write(abc.charAt(i));
			 }
			 line.close();

		} catch (Exception ex) {
			System.out.println("No encontre el archivo");
		}

	}

}
