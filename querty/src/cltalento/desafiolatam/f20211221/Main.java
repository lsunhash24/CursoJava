package cltalento.desafiolatam.f20211221;



	import java.util.ArrayList;
	import java.util.Iterator;

	import cltalento.desafiolatam.f20211221.models.Estudiante;
	import cltalento.desafiolatam.f20211221.models.Nieto;
	import cltalento.desafiolatam.f20211221.models.Persona;
	import cltalento.desafiolatam.f20211221.models.Profesor;

	

	public class Main {

		public static void main(String[] args) {

			ArrayList<Profesor> profesores = new ArrayList<Profesor>();
			ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
			
			Estudiante estudiante = new Estudiante();
			estudiante.setNombre("Zoe");
			estudiante.setApellido("Loren");
			estudiante.	
			estudiantes.add(estudiante);
			
			estudiantes.add(new Estudiante("Ayun","Palma",null,null,true));
			estudiantes.add(new Estudiante("Donato","Palma",null,null,false));
			
			
			profesores.add(new Profesor("Pamela","Arriagada",null, "1-9",true));
			
			
			
			for (Iterator iterator = estudiantes.iterator(); iterator.hasNext();) {
				Estudiante alumno = (Estudiante) iterator.next();
				System.out.println(alumno.toString());
				
			}
			System.out.println("For Each");
			for (Estudiante estudiantefe : estudiantes) {
				System.out.println(estudiantefe.toString());
			}
			
			System.out.println();
			for (int i = 0; i < profesores.size(); i++) {
				System.out.println(profesores.get(i).toString());
			}
			
			
			/**
			 * POLIMORFISMO
			 * */

			System.out.println("** POLIMORFISMO **");
			ArrayList<Persona> personas = new ArrayList<Persona>();
			
			Estudiante estudiante2 = new Estudiante();
			estudiante2.setNombre("Zoe2");
			estudiante2.setApellido("Loren2");
			estudiante2.setAsistencia(true);
			
			personas.add(estudiante2);
			
			personas.add(new Estudiante("Ayun","Palma",null,null,true));
			personas.add(new Estudiante("Donato","Palma",null,null,false));
			personas.add(new Profesor("Pamela","Arriagada",null, "1-9",true));
			
			Nieto nieto = new Nieto("Luffy","Monkey",null,null,true);
			personas.add(nieto);
			for (Persona persona : personas) {
				System.out.println(persona.toString());
			}
			
			System.out.println("Nieto "+nieto.toString());
			
			
		}

	
	}

	
