package colegio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante estudiante1 = new Estudiante("Pepe", "Lotas", "000000000D",
		List.of(new Asignatura("Lengua", 5), new Asignatura("Mates", 5),new Asignatura("Naturales", 8)));
		Estudiante estudiante2 = new Estudiante("Juana", "Borrico", "000000000D",
				List.of(new Asignatura("Lengua", 5), new Asignatura("Mates", 3),new Asignatura("Fisica", 4)));
		Estudiante estudiante3 = new Estudiante("Enrique", "Sofeta", "000000000D",
				List.of(new Asignatura("Lengua", 8), new Asignatura("Mates", 6),new Asignatura("Biologia", 10)));
		Estudiante estudiante4 = new Estudiante("Rosa", "Melano", "000000000D",
				List.of(new Asignatura("Lengua", 4), new Asignatura("Mates", 2),new Asignatura("Biologia", 2)));
		Estudiante estudiante5 = new Estudiante("Juan", "Felipe", "000000000D",
				List.of(new Asignatura("Lengua", 9), new Asignatura("Fisica", 3),new Asignatura("Fisica", 4)));
		List<Estudiante> estudiantes = new ArrayList<Estudiante>();
		
		estudiantes.add(estudiante1);
		estudiantes.add(estudiante2);
		estudiantes.add(estudiante3);
		estudiantes.add(estudiante4);
		estudiantes.add(estudiante5);
		
		System.out.println("se muestra todos los estudiantes");
		
		for(Estudiante estudiante : estudiantes) {
			System.out.println(estudiante.toString());
		}
		
		System.out.println("estudiantes que dieron mates");
		for(Estudiante estudiante : estudiantes) {
			if(equalsMateria(estudiante,"Mates")) {
				System.out.println(estudiante);
			}
		}
		
		
		System.out.println("muestra media");
		for(Estudiante estudiante : estudiantes) {
			int media = 0;
			for(Asignatura asignatura: estudiante.getAsignaturas()) {
				media = media + asignatura.getNota();
			}
			if((media/3) > 5) {
				System.out.println(estudiante);
			}
		}
		
		System.out.println("se elimina si suspende lengua");
		for(int x = 0; x<estudiantes.size();x++) {
			if(equalsMateria(estudiantes.get(x),"Lengua")) {
				for(Asignatura asignatura: estudiantes.get(x).getAsignaturas()) {
					if(asignatura.getNota() < 5 && asignatura.getNombre()== "Lengua") {
						System.out.println("se elimina " +estudiantes.get(x).getNombre() + " " + estudiantes.get(x).getApellidos());
						estudiantes.remove(x);
					}
				}
			}
		}
	}
	
	private static boolean equalsMateria(Estudiante estudiante, String materia) {
		for(Asignatura asignatura : estudiante.getAsignaturas()) {
			if(asignatura.getNombre().equals(materia)) {
				return true;
			}
		}
		return false;
	}

}
