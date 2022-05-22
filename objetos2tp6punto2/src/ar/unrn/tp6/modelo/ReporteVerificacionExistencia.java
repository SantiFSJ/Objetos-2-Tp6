package ar.unrn.tp6.modelo;

import java.io.File;

public class ReporteVerificacionExistencia implements GestorReportes {
	private GestorReportes reporte;

	public ReporteVerificacionExistencia(GestorReportes reporte) {
		this.reporte = reporte;
	}

	public void export(File file) {

		if (file.exists()) {
			throw new IllegalArgumentException("El archivo ya existe...");
		}
		reporte.export(file);

	}

	public String importar(File file, int cantidadCaracteres) {
		return reporte.importar(file, cantidadCaracteres);
	}
}