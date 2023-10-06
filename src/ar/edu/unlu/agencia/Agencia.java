package ar.edu.unlu.agencia;

import java.util.ArrayList;

public class Agencia {
private ArrayList<Viaje> misViajes = new ArrayList<Viaje>();

public void agregarViaje(Viaje viaje){
	misViajes.add(viaje);
}

public void listarViajes() {
		for (int i = 0; i < misViajes.size(); i++) {
			System.out.println(misViajes.get(i).toString());
		}
	}
	


public void listarVentas() {
	Viaje aux;
	for (int i = 0; i < misViajes.size(); i++) {
		aux = (misViajes.get(i));
		aux.calcularPrecio();
	}

}
}

