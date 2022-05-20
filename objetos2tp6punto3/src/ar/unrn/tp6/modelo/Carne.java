package ar.unrn.tp6.modelo;

public class Carne implements Comestibles {
	private Comestibles comestible;

	private String descripcion;
	private double precio;

	public Carne(Comestibles comestible, String descripcion, double precio) {
		this.comestible = comestible;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	@Override
	public String aņadirPorcion() {
		return descripcion + " " + comestible.aņadirPorcion();
	}

	@Override
	public double calcularPrecio() {
		return this.precio + this.comestible.calcularPrecio();
	}

}
