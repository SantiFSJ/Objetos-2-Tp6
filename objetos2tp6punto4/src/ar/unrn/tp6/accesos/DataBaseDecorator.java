package ar.unrn.tp6.accesos;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import ar.unrn.tp6.modelo.Listados;

public class DataBaseDecorator implements Listados {
	Listados listador;

	public DataBaseDecorator(Listados listador) {
		this.listador = listador;
	}

	@Override
	public String obtenerListado() {
		try {

			ObjectMapper mapper = new ObjectMapper();
			try {
				Map<String, String> map = mapper.readValue(listador.obtenerListado(), Map.class);
				Connection conn = ConnectionManager.getConnection();

				// for (int i = 0; i < map.size(); i++) {
				PreparedStatement statement = conn.prepareStatement("INSERT INTO posts(informacion) " + "VALUES (?)");
				statement.setString(1, map.get("title"));
				statement.executeUpdate();
				// }

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (SQLException e) {
			throw new RuntimeException("No se puedo conectar a la base de datos" + e);
		} finally {
			ConnectionManager.disconnect();
		}

		return listador.obtenerListado();
	}
}
