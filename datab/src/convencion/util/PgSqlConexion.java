package convencion.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PgSqlConexion implements Conexion {

	private Connection con=null;
	private static PgSqlConexion db;
	private Statement statement;
	
	private String url= "jdbc:postgresql://localhost:5432/";
    private String dbName = "conferencia";
    private String driver = "org.postgresql.Driver";
    private String userName = "postgres";
    private String password = "1234";

	public PgSqlConexion() {
		try {
			Class.forName(driver).newInstance();
			con = (Connection)DriverManager.getConnection(url+dbName,userName,password);
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
	public static PgSqlConexion getConexion(){
		if ( db == null ) {
            db = new PgSqlConexion();
        }
		return db;
	}
 
	public void cerrarConexion(){
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet query(String query) throws SQLException{
        statement = db.con.createStatement();
        ResultSet res = statement.executeQuery(query);
        return res;
    }
		
	public int insert(String insertQuery) throws SQLException {
        statement = db.con.createStatement();
        int result = statement.executeUpdate(insertQuery);
        return result;
 
    }

}
