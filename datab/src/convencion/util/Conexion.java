package convencion.util;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface Conexion {
	public ResultSet query(String query) throws SQLException;
	public int insert(String insertQuery) throws SQLException;
}
