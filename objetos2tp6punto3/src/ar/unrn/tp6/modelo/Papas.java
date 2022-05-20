package ar.unrn.tp6.modelo;

public class Papas implements Comestibles {
	private Comestibles comestible;

	private String descripcion;
	private double precio;

	public Papas(Comestibles comestible, String descripcion, double precio) {
		this.comestible = comestible;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	@Override
	public String añadirPorcion() {
		return descripcion + " " + comestible.añadirPorcion();
	}

	@Override
	public double calcularPrecio() {
		return this.precio + this.comestible.calcularPrecio();
	}

}
