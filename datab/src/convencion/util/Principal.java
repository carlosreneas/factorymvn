package convencion.util;

import convencion.dao.ParticipanteDao;
import convencion.dao.ParticipanteDaoImp;
import convencion.model.Participante;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Participante p = new Participante();
		p.setNombre("carlosb22222");
		p.setEmail("emailb222");
		p.setTelefono("132323656");
		p.setEstado("activob");
		
		ParticipanteDao pd = new ParticipanteDaoImp();
		
		pd.insertar(p);
		
		p = pd.obtener(2);
		
		System.out.println(p.getNombre());
		

	}

}
