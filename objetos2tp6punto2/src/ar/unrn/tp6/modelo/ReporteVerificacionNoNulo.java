package ar.unrn.tp6.modelo;

import java.io.File;

public class ReporteVerificacionNoNulo implements GestorReportes {
	private GestorReportes reporte;

	public ReporteVerificacionNoNulo(GestorReportes reporte) {
		this.reporte = reporte;
	}

	public void export(File file) {
		if (file == null) {
			throw new IllegalArgumentException("File es NULL; no puedo exportar...");
		}
		reporte.export(file);

	}

	public String importar(File file, int cantidadCaracteres) {
		return reporte.importar(file, cantidadCaracteres);
	}

}