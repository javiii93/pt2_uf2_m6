package pt2_uf2_m6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionJDBC {
	private static String db_ = "Nombre  Base de  Datos";
	private static String login_ = "Usuario  de la Base de  Datos";
	private static String password_ = "Contrasena";
	private static String url_ = "jdbc:mysql :// ip_servidor/" + db_;
	private static Connection connection_;
	private static Statement st_ = null;

	public ConnectionJDBC() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection_ = DriverManager.getConnection(url_, login_, password_);
			if (connection_ != null) {
				st_ = connection_.createStatement();
				System.out.println("Conexion a base dedatos " + db_ + " correcta.");
			} else {
				System.out.println("Conexion  fallida.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}