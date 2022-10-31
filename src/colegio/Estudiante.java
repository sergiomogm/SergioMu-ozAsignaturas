package colegio;

import java.util.List;
import java.util.Objects;

public class Estudiante {
	private String nombre;
	private String apellidos;
	private String dni;
	private List<Asignatura> asignaturas;
	
	public Estudiante(String nombre, String apellidos, String dni, List<Asignatura> asignaturas) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.asignaturas = asignaturas;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public List<Asignatura> getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(List<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", asignaturas="
				+ asignaturas + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, asignaturas, dni, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(asignaturas, other.asignaturas)
				&& Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre);
	}

	
}
