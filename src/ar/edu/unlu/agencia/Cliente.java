package ar.edu.unlu.agencia;

import java.util.ArrayList;

public class Cliente {
private String nombre;
//private ArrayList<Paquete> paquete;

public Cliente(String nombre) {
	super();
	this.nombre = nombre;
}

public String getNombre() {
	return nombre;
}

private void setNombre(String nombre) {
	this.nombre = nombre;
}

@Override
public String toString() {
	return "Cliente [nombre=" + nombre + "]";
}

}
