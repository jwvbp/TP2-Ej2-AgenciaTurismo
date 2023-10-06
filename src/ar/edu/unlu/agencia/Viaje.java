package ar.edu.unlu.agencia;

public class Viaje {
private Cliente cliente;
private Paquete paquete;
public Viaje(Cliente cliente, Paquete paquete) {
	super();
	this.cliente = cliente;
	this.paquete = paquete;
}

void calcularPrecio(){
	System.out.println("Cliente: " + cliente.getNombre()); 
	paquete.calcularPrecio();
}
@Override
public String toString() {
	return "Viaje [cliente=" + cliente + ", paquete=" + paquete + "]";
}


}
