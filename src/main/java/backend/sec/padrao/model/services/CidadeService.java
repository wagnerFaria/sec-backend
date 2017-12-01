package backend.sec.padrao.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.sec.padrao.model.entidades.Cidade;
import backend.sec.padrao.model.repositories.CidadeRepository;
import backend.sec.padrao.model.services.exceptions.ObjectNotFoundException;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository cidadeRepository;

	public List<Cidade> findAll() {
		return cidadeRepository.findAll();
	}

	public List<Cidade> findByNome(String nome) {
		return cidadeRepository.findByNomeLike(nome);
	}

	public Cidade findById(Long idCidade) {
		Cidade cidade = cidadeRepository.findOne(idCidade);
		if (cidade == null) {
			throw new ObjectNotFoundException(
					"Objeto não encontrado! Id: " + idCidade + ", Tipo: " + Cidade.class.getName());
		}
		return cidade;
	}

	public List<Cidade> findByEstadoId(Long idEstado) {
		return cidadeRepository.findByEstadoId(idEstado);
	}
}
