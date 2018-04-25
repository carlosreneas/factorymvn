package convencion.dao;

import java.util.List;

import convencion.model.Participante;

public interface ParticipanteDao {
	public Participante obtener(Integer id);
	public void insertar(Participante participante);
	public void actualizar(Participante participante);
	public void eliminar(Integer id);
	public List<Participante> listar();
	
	
}
