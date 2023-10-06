package ar.edu.unlu.agencia;

public class Hospedaje {
	private String nombre;
	private String direccion;
	private Double precio;

	

	public Hospedaje(String nombre, String direccion, Double precio) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.precio = precio;
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getDireccion() {
		return direccion;
	}

	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	private Double getPrecio() {
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
		return "Hospedaje [nombre=" + nombre + ", direccion=" + direccion + ", precio=" + precio + "]";
	}

}
