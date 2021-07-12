package UD7ejercicios;

import java.util.Enumeration;

import java.util.Hashtable;

import javax.swing.JOptionPane;

public class ejercicio1 {

	public static void main(String[] args) {
		
		Hashtable <String, Integer> notaalumnos = recogidadatos();
		
		recorrerhashtable(notaalumnos);

	}
	
	public static Hashtable<String, Integer> recogidadatos(){
		
		String contadorbeta =(JOptionPane.showInputDialog("Cuantos alumnos hay en la clase?"));
		
		int contador =  Integer.parseInt(contadorbeta);
		
		Hashtable<String, Integer> notaalumnos = new Hashtable<>();
		
		for (int i = 0; i < contador; i++) {
			
			String alumno = JOptionPane.showInputDialog("Cual es el nombre del alumno?");
			
			String nota1beta=JOptionPane.showInputDialog("Introduce la nota 1");
			
			int nota1 = Integer.parseInt(nota1beta);
			
			String nota2beta=JOptionPane.showInputDialog("Introduce la nota 2");
			
			int nota2 = Integer.parseInt(nota2beta);
			
			String nota3beta=JOptionPane.showInputDialog("Introduce la nota 3");
			
			int nota3 = Integer.parseInt(nota3beta);
			
			notaalumnos.put(alumno, ((nota1 + nota2 + nota3) / 3));
		}
		
		return notaalumnos;
		
	}
		
	public static void recorrerhashtable (Hashtable <String, Integer> hash) {
		
		
		Enumeration		<String> key=hash.keys();
		
		Enumeration		<Integer> valor=hash.elements();
		
		while (key.hasMoreElements()) {
		
			System.out.println(key.nextElement() + ": " + valor.nextElement());
			
		}

	}

}