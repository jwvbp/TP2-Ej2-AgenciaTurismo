package ar.edu.unlu.agencia;

import java.util.ArrayList;


public class Paquete {
private String nombre;
private Destino destino;
private Transporte transporte;
private Hospedaje hospedaje;
private ArrayList<Excursion> excursion;
private Double precioTransporte;
private Double precioHospedaje;
private Double precioExcursion = 0.0;

public Paquete(String nombre, Destino destino, Transporte transporte, Hospedaje hospedaje,
		ArrayList<Excursion> excursion) {
	super();
	this.nombre = nombre;
	this.destino = destino;
	this.transporte = transporte;
	this.hospedaje = hospedaje;
	this.excursion = excursion;
}
private String getNombre() {
	return nombre;
}
private void setNombre(String nombre) {
	this.nombre = nombre;
}
private Destino getDestino() {
	return destino;
}
private void setDestino(Destino destino) {
	this.destino = destino;
}
private Transporte getTransporte() {
	return transporte;
}
private void setTransporte(Transporte transporte) {
	this.transporte = transporte;
}
private Hospedaje getHospedaje() {
	return hospedaje;
}
private void setHospedaje(Hospedaje hospedaje) {
	this.hospedaje = hospedaje;
}
private ArrayList<Excursion> getExcursion() {
	return excursion;
}
private void setExcursion(ArrayList<Excursion> excursion) {
	this.excursion = excursion;
}
@Override
public String toString() {
	return "Paquete [nombre=" + nombre + ", destino=" + destino + ", transporte=" + transporte + ", hospedaje="
			+ hospedaje + ", excursion=" + excursion + "]";
}
public void calcularPrecio() {
	precioTransporte = transporte.calcularPrecio();
	precioHospedaje = hospedaje.calcularPrecio();
	Excursion aux;
	for (int i = 0; i < excursion.size(); i++) {
		aux = (excursion.get(i));
		//System.out.println(aux.getNombre() + aux.calcularPrecio());
		precioExcursion = precioExcursion + aux.calcularPrecio();
		}
	System.out.println("tr:" + precioTransporte + " hosp:" + precioHospedaje + " exc:" + precioExcursion);
	
	// TODO Auto-generated method stub
	
}


}
