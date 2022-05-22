package ar.unrn.tp6.modelo;

import java.io.File;

public class Report implements GestorReportes {
	protected String reporte;
	protected GestorArchivo escritor;

	public Report(String reporte, GestorArchivo escritor) {
		this.reporte = reporte;
		this.escritor = escritor;
	}

	@Override
	public void export(File file) {
		escritor.escribir(file, reporte);
	}

	@Override
	public String importar(File file, int cantidadCaracteres) {
		if (file == null) {
			throw new IllegalArgumentException("File es NULL; no puedo importar...");
		}
		return escritor.leer(file, cantidadCaracteres);
	}
}
