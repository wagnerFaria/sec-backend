package backend.sec.fco.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.sec.fco.model.entidades.TipoFco;
import backend.sec.fco.model.repositories.TipoFcoRepository;

@Service
public class TipoFcoService {

	@Autowired
	private TipoFcoRepository tipoFcoRepository;

	public List<TipoFco> findAll() {
		return tipoFcoRepository.findAll();
	}

	public TipoFco findById(Long idTipoFco) {
		return tipoFcoRepository.findOne(idTipoFco);
	}
}
