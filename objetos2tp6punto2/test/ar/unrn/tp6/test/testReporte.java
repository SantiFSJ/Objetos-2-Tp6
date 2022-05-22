package ar.unrn.tp6.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import ar.unrn.tp6.modelo.GestorArchivo;
import ar.unrn.tp6.modelo.Report;
import ar.unrn.tp6.modelo.ReporteVerificacionExistencia;
import ar.unrn.tp6.modelo.ReporteVerificacionNoNulo;
import ar.unrn.tp6.servicios.GestorArchivoImplementacion;

public class testReporte {
	@Test
	public void testEscritorArchivoExistente() throws IOException { // Da error la primera vez
		// Inicializaci�n
		File archivo = new File(
				"C:\\Users\\santi\\OneDrive\\Escritorio\\Orientacion a Objetos 2\\archivoTp6Reporte.txt");
		FileWriter writer = new FileWriter(archivo);
		FileReader reader = new FileReader(archivo);
		GestorArchivo gestor = new GestorArchivoImplementacion(writer, reader);
		ReporteVerificacionExistencia reporte = new ReporteVerificacionExistencia(
				new Report("Reporte Liquidacion 6", gestor));

		// Ejercitaci�n
		try {
			reporte.export(archivo);
			Assert.fail("Deber�a haber tirado una excepci�n");
		}
		// Validaci�n
		catch (IllegalArgumentException e) {
			String mensajeError = "El archivo ya existe...";
			Assert.assertEquals("Las excepciones no son las mismas ", mensajeError, e.getMessage());
		}

	}

	@Test
	public void testEscritorArchivoNoExistente() throws IOException {
		// Inicializaci�n
		int random = (int) Math.pow(Math.random(), -3);
		File archivo = new File("C:\\Users\\santi\\OneDrive\\Escritorio\\Orientacion a Objetos 2\\" + random + ".txt");
		FileWriter writer = new FileWriter(archivo);
		FileReader reader = new FileReader(archivo);
		GestorArchivo gestor = new GestorArchivoImplementacion(writer, reader);
		Report reporte = new Report("Reporte Liquidacion 6", gestor);

		// Ejercitaci�n
		reporte.export(archivo);
		String texto = gestor.leer(archivo, 21);
		// Validaci�n
		Assert.assertEquals("Reporte Liquidacion 6", texto);
	}

	@Test
	public void testEscritorArchivoNoNulo() throws IOException {
		// Inicializaci�n
		File archivo = null;
		FileWriter writer = null;
		FileReader reader = null;
		GestorArchivo gestor = new GestorArchivoImplementacion(writer, reader);
		ReporteVerificacionNoNulo reporte = new ReporteVerificacionNoNulo(new Report("Reporte Liquidacion 6", gestor));

		// Ejercitaci�n
		try {
			reporte.export(archivo);
			Assert.fail("Deber�a haber tirado una excepci�n");
		}
		// Validaci�n
		catch (IllegalArgumentException e) {
			String mensajeError = "File es NULL; no puedo exportar...";
			Assert.assertEquals("Las excepciones no son las mismas ", mensajeError, e.getMessage());
		}
	}
}
