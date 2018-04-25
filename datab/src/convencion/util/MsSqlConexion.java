package convencion.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MsSqlConexion implements Conexion {
	
	private Connection con=null;
	private static MsSqlConexion db;
	private Statement statement;

	public MsSqlConexion() {
		// TODO Auto-generated constructor stub
	}
	
	public static MsSqlConexion getConexion(){
		if ( db == null ) {
            db = new MsSqlConexion();
        }
		return db;
	}

	@Override
	public ResultSet query(String query) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(String insertQuery) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}

