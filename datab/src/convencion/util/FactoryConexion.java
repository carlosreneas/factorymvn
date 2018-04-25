package convencion.util;

public class FactoryConexion {
	public static Conexion getFactory(String tipo){
        switch(tipo){
            case "Oracle":
                //return new TxtFactoryDao();
            case "MySql":
                return MySqlConexion.getConexion();
            case "PgSql":
                return PgSqlConexion.getConexion();
            case "MsSql":
                return MsSqlConexion.getConexion();
            default:
                throw new IllegalArgumentException();
        }
    }
}
