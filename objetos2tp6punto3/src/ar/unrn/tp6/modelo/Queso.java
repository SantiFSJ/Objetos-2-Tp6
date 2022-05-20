package ar.unrn.tp6.modelo;

public class Queso implements Comestibles {
	Comestibles comestible;

	private String descripcion;
	private double precio;

	public Queso(Comestibles combo, String descripcion, double precio) {
		this.comestible = combo;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	@Override
	public String a�adirPorcion() {
		return descripcion + " " + comestible.a�adirPorcion();
	}

	@Override
	public double calcularPrecio() {
		return this.precio + this.comestible.calcularPrecio();
	}

}
