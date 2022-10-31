package colegio;

public class Asignatura {
	private String nombre;
	private Integer nota;
	
	public Asignatura(String nombre, int nota) {
		super();
		this.nombre = nombre;
		this.nota = nota;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getNota() {
		return nota;
	}
	public void setNota(Integer nota) {
		this.nota = nota;
	}
	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", nota=" + nota + "]";
	}
	
	
}
