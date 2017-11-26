package backend.sec.padrao.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.sec.padrao.model.entidades.Estado;
import backend.sec.padrao.model.repositories.EstadoRepository;
import backend.sec.padrao.model.services.exceptions.ObjectNotFoundException;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository estadoRepository;

	public List<Estado> findAll() {
		List<Estado> lista = estadoRepository.findAll();
		return lista;
	}

	public Estado findById(Long id) {
		Estado obj = estadoRepository.findOne(new Long(id));
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Estado.class.getName());
		}
		return obj;
	}

}
