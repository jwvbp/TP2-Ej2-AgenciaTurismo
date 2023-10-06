package ar.edu.unlu.agencia;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Excursion> exc1 = new ArrayList<Excursion>();
		List<Excursion> exc2 = new ArrayList<Excursion>();

		Excursion e1 = new Excursion("paseo", 100.00);
		Excursion e2 = new Excursion("visita", 150.00);
		Excursion e3 = new Excursion("museo", 200.00);
		exc1.add(e1);
		exc1.add(e2);
		exc2.add(e1);
		exc2.add(e2);
		exc2.add(e3);

		Destino d1 = new Destino("Londres", "un buen lugar");
		Destino d2 = new Destino("Londres simple", "barato");
		Destino d3 = new Destino("Roma intensa", "caro pero bueno");
		Destino d4 = new Destino("Roma", "muy barato");

		Transporte t1 = new Transporte("Avion chico", 1000.00);
		Transporte t2 = new Transporte("Avion grande", 1500.00);

		Hospedaje h1 = new Hospedaje("Hotel", "por ahi", 1000.00);
		Hospedaje h2 = new Hospedaje("Posada", "bien lejos", 500.00);

		Paquete miPaquete1 = new Paquete("economico", d2, t1, h2, (ArrayList<Excursion>) exc1);
		Paquete miPaquete2 = new Paquete("moderado", d1, t2, h1, (ArrayList<Excursion>) exc1);
		Paquete miPaquete3 = new Paquete("caro", d3, t2, h1, (ArrayList<Excursion>) exc2);

		Cliente c1 = new Cliente("Jose");
		Cliente c2 = new Cliente("Juan");
		Cliente c3 = new Cliente("Maria");
		Cliente c4 = new Cliente("Fernando");

		Agencia miAgencia = new Agencia();

		Viaje viaje1 = new Viaje(c1, miPaquete1);
		miAgencia.agregarViaje(viaje1);
		Viaje viaje2 = new Viaje(c2, miPaquete1);
		miAgencia.agregarViaje(viaje2);
		Viaje viaje3 = new Viaje(c3, miPaquete2);
		miAgencia.agregarViaje(viaje3);
		Viaje viaje4 = new Viaje(c4, miPaquete3);
		miAgencia.agregarViaje(viaje4);

		miAgencia.listarViajes();
		miAgencia.listarVentas();
		
	}

}
