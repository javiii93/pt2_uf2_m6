package pt2_uf2_m6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class ConnectionJDBC {
	private static String db = "bd_videoclub";
	private static String login = "root";
	private static String password = "";
	private static String url = "jdbc:mysql://localhost/" + db;
	@SuppressWarnings("unused")
	private static Connection connection;

	public ConnectionJDBC() {
	}

	public void conexionJDBC() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
			System.out.println("Error al registrar el driver de MySQL: " + ex);
		}
		try {
			connection = DriverManager.getConnection(url, login, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Conexion a base dedatos " + db + " correcta.");
	}

	public int conocerSiguienteCod_soc() throws SQLException {
		ArrayList<Integer> codigos = new ArrayList<>();
		int mayor = -5;
		String sql = "SELECT * FROM socio;";
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			codigos.add(rs.getInt("COD_SOC"));
		}
		for (int i = 0; i < codigos.size(); i++) {
			if (codigos.get(i) > mayor) {
				mayor = codigos.get(i);
			}
		}
		return mayor + 1;
	}

	public void insertarSocio(Socio s) throws SQLException {
		String sql = "INSERT INTO socio(cod_soc,nombre,apellidos,direccion,telefono,poblacion,cp,provincia,pais,edad,fechaalta,cuota) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setInt(1, conocerSiguienteCod_soc());
		pstmt.setString(2, s.getNombre());
		pstmt.setString(3, s.getApellidos());
		pstmt.setString(4, s.getDireccion());
		pstmt.setString(5, s.getTelefono());
		pstmt.setString(6, s.getPoblacion());
		pstmt.setString(7, s.getCp());
		pstmt.setString(8, s.getProvincia());
		pstmt.setString(9, s.getPais());
		pstmt.setInt(10, s.getEdad());
		pstmt.setDate(11, s.getFechaAlta());
		pstmt.setFloat(12, s.getCuota());
		pstmt.executeUpdate();
		System.out.println(
				"Socio " + s.getNombre() + " " + s.getApellidos() + " integrada en la base de datos con exito");

	}
}
