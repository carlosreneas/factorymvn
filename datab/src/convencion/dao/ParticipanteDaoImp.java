package convencion.dao;

import java.security.Policy.Parameters;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import convencion.model.Participante;
import convencion.util.Conexion;
import convencion.util.FactoryConexion;

public class ParticipanteDaoImp implements ParticipanteDao {
	
	private Conexion cn = null;
	private List<Participante> participantes = new ArrayList<Participante>();
	

	public ParticipanteDaoImp() {
		// TODO Auto-generated constructor stub
		cn = FactoryConexion.getFactory("PgSql");
	}

	@Override
	public Participante obtener(Integer id) {
		// TODO Auto-generated method stub
		
		try {
	     	   ResultSet res = cn.query("SELECT * FROM participante where id = " + id + " ");
	     	   while(res.next()){
		        	    Participante participante = new Participante();
		        	    participante.setId(res.getInt("id"));
		        	    participante.setNombre(res.getString("nombre"));
		        	    participante.setEmail(res.getString("email"));
		        	    participante.setEstado(res.getString("estado"));
		        	    participante.setTelefono(res.getString("telefono"));
		        	    return participante;
	     	   }
	          res.close();

	     	  
	     	  } catch (Exception e) {
	     		  System.out.println(e.getMessage());
	     	   //JOptionPane.showMessageDialog(null, "no se pudo consultar la Persona\n"+e);
	     	  }
		
		return null;
	}

	@Override
	public void insertar(Participante participante) {
		// TODO Auto-generated method stub
		try {
			String consulta = "INSERT INTO participante (nombre, email, telefono, estado) VALUES ('"+participante.getNombre()+"', "+ 
		 			"'" +participante.getEmail()+"','" +participante.getTelefono()+"', '"+participante.getEstado()+"')";

 		   cn.insert(consulta);

 		    
 		  } catch (SQLException e) {
 		            System.out.println(e.getMessage());
 		   //JOptionPane.showMessageDialog(null, "No se Registro la persona");
 		  }

	}

	@Override
	public void actualizar(Participante participante) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Participante> listar() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String sql="select * from participante";
		participantes = new ArrayList<Participante>();
		
		try {			
			
			ResultSet res=cn.query(sql);
			while (res.next()) {
				Participante c = new Participante();
				c.setId(res.getInt(1));
				c.setNombre(res.getString(2));
				c.setEmail(res.getString(3));
				c.setTelefono(res.getString(4));
				c.setEstado(res.getString(5));
				participantes.add(c);
			}
			res.close();

		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método obtener");
			e.printStackTrace();
		}
		return participantes;
	}

}
