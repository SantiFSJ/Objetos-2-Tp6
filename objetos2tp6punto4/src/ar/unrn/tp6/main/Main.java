package ar.unrn.tp6.main;

import ar.unrn.tp6.accesos.DataBaseDecorator;
import ar.unrn.tp6.accesos.FileDecorator;
import ar.unrn.tp6.modelo.Listados;
import ar.unrn.tp6.webservices.RestCall;

public class Main {
	public static void main(String[] args) {
		RestCall rest = new RestCall("https://jsonplaceholder.typicode.com/posts");
		Listados listado = new DataBaseDecorator(
				new FileDecorator(new RestCall("https://jsonplaceholder.typicode.com/posts/3")));
		System.out.println(listado.obtenerListado());
	}
}
