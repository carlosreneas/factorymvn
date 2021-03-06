package convencion.util;

import java.sql.*;

public class MySqlConexion implements Conexion {

	private Connection con=null;
	private static MySqlConexion db;
	private Statement statement;
	
	private String url= "jdbc:mysql://localhost:3306/";
    private String dbName = "convencion";
    private String driver = "com.mysql.jdbc.Driver";
    private String userName = "root";
    private String password = "";

	public MySqlConexion() {
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
 
	public static MySqlConexion getConexion(){
		if ( db == null ) {
            db = new MySqlConexion();
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
