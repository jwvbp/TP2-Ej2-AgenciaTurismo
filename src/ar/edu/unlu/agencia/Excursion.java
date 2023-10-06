package ar.edu.unlu.agencia;

public class Excursion {
private String nombre;
private Double precio;
public Excursion(String nombre, Double precio) {
	super();
	this.nombre = nombre;
	this.precio = precio;
}
public String getNombre() {
	return nombre;
}
private void setNombre(String nombre) {
	this.nombre = nombre;
}
public Double getPrecio() {
	return precio;
}
private void setPrecio(Double precio) {
	this.precio = precio;
}
public Double calcularPrecio() {
	return getPrecio();
}
@Override
public String toString() {
	return "Excursion [nombre=" + nombre + ", precio=" + precio + "]";
}


}
