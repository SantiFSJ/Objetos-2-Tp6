package ar.unrn.tp6.modelo;

import java.io.File;

public interface GestorReportes {
	public void export(File file);

	public String importar(File file, int cantidadCaracteres);
}