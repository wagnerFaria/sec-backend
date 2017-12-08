package backend.sec.fco.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.sec.fco.model.entidades.Localidade;
import backend.sec.fco.model.repositories.LocalidadeRepository;

@Service
public class LocalidadeService {

	@Autowired
	private LocalidadeRepository localidadeRepository;

	public List<Localidade> findAll() {
		return localidadeRepository.findAll();
	}

	public Localidade findById(Long idLocalidade) {
		return localidadeRepository.findOne(idLocalidade);
	}

	public Localidade salvarLocalidade(Localidade localidade) {
		return localidadeRepository.save(localidade);
	}

	public Boolean deletarLocalidade(Long idLocalidade) {
		localidadeRepository.delete(idLocalidade);
		return true;
	}
}
