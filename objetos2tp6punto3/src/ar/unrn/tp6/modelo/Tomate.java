package ar.unrn.tp6.modelo;

public class Tomate implements Comestibles {

	private Comestibles comestible;

	private String descripcion;
	private double precio;

	public Tomate(Comestibles comestible, String descripcion, double precio) {
		this.comestible = comestible;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	@Override
	public double calcularPrecio() {
		return this.precio + this.comestible.calcularPrecio();
	}

	@Override
	public String añadirPorcion() {
		return descripcion + " " + comestible.añadirPorcion();
	}

}
