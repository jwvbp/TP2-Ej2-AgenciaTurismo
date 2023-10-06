package ar.edu.unlu.agencia;

public class Destino {
private String nombre;
private String descripcion;
public Destino(String nombre, String descripcion) {
	super();
	this.nombre = nombre;
	this.descripcion = descripcion;
}
@Override
public String toString() {
	return "Destino [nombre=" + nombre + ", descripcion=" + descripcion + "]";
}


}
