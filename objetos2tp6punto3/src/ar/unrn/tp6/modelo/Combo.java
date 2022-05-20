package ar.unrn.tp6.modelo;

public class Combo implements Comestibles {
	private String descripcion;
	private double precio;

	public Combo(String descripcion, double precio) {
		this.descripcion = descripcion;
		this.precio = precio;
	}

	@Override
	public double calcularPrecio() {
		return precio;
	}

	@Override
	public String añadirPorcion() {
		return descripcion;

	}
}
