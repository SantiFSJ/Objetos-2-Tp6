package ar.unrn.tp6.webservices;

import java.io.IOException;

import ar.unrn.tp6.modelo.Listados;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RestCall implements Listados {
	private String url;

	public RestCall(String url) {
		this.url = url;
	}

	public String obtenerListado() {
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder().url(this.url).build();

		try (Response response = client.newCall(request).execute()) {
			return response.body().string();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
