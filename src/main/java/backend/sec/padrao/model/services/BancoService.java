package backend.sec.padrao.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.sec.padrao.model.entidades.Banco;
import backend.sec.padrao.model.repositories.BancoRepository;
import backend.sec.padrao.model.services.exceptions.ObjectNotFoundException;

@Service
public class BancoService {

	@Autowired
	private BancoRepository bancoRepository;

	public List<Banco> findAll() {
		return bancoRepository.findAll();
	}

	public List<Banco> findByNomeLike(String nome) {
		return bancoRepository.findByNomeLike(nome);
	}

	public Banco findById(Long idBanco) {
		Banco obj = bancoRepository.findOne(idBanco);
		if (obj == null) {
			throw new ObjectNotFoundException(
					"Objeto não encontrado! Id: " + idBanco + ", Tipo: " + Banco.class.getName());
		}
		return obj;
	}
}
