package buscador;

import java.io.*;
import javax.swing.JOptionPane;

public class Buscador_De_Archivos {

	public Buscador_De_Archivos(String archivo_buscar) {

		nombre = archivo_buscar;		
		
	}

	public String recorrer(String ruta) {

		File archivo = new File(ruta);

		File archivos[] = archivo.listFiles();	

		String resultado="No se encontró el archivo";
		
		for (int i = 0; i < archivos.length; i++) {

			if (archivos[i].isDirectory()) {

				String otra_ruta = archivos[i].getAbsolutePath();

				recorrer(otra_ruta);

			}

			

			if (nombre.equals(archivos[i].getName())) {
				
				resultado="El archivo se encuentra en: " + archivos[i].getAbsolutePath();
				
				JOptionPane.showMessageDialog(null, "El archivo se encuentra en: " + archivos[i].getAbsolutePath());				

				System.out.println("El archivo se encuentra en: " + archivos[i].getAbsolutePath());

			}else {
				
				JOptionPane.showMessageDialog(null, "No se encontró el archivo");
				
			}

			

		}
		
		return resultado;

	}
	

	

	String nombre;

}