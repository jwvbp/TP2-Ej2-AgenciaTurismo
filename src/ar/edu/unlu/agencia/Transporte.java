package ar.edu.unlu.agencia;

public class Transporte {
private String nombre;
private Double precio;
public Transporte(String nombre, Double precio) {
	super();
	this.nombre = nombre;
	this.precio = precio;
}
private String getNombre() {
	return nombre;
}
private void setNombre(String nombre) {
	this.nombre = nombre;
}
private Double getPrecio() {
	return precio;
}
private void setPrecio(Double precio) {
	this.precio = precio;
}
@Override
public String toString() {
	return "Transporte [nombre=" + nombre + ", precio=" + precio + "]";
}

public Double calcularPrecio(){
	return getPrecio();
}
}
