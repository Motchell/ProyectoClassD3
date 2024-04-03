package com.aplicacion;

import com.codingdojo.Project;

public class ProjectTest {

	public static void main(String[] args) {
		
		Project prueba1 = new Project("Mitchell", "Hola mundooooo!!!");
		Project proyecto = new Project("Nuevos edificios");
		Project vacio = new Project();

		System.out.println(prueba1.elevatorPitch());	
		System.out.println(proyecto.elevatorPitch());	
		System.out.println(vacio.elevatorPitch());	
	}

}
