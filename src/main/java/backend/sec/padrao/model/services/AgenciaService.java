package backend.sec.padrao.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.sec.padrao.model.entidades.Agencia;
import backend.sec.padrao.model.repositories.AgenciaRepository;
import backend.sec.padrao.model.services.exceptions.ObjectNotFoundException;

@Service
public class AgenciaService {

	@Autowired
	private AgenciaRepository agenciaRepository;

	public List<Agencia> findByBancoId(Long idBanco) {
		List<Agencia> lista = agenciaRepository.findByBancoId(idBanco);
		return lista;
	}

	public Agencia salvarAgencia(Agencia agencia) throws Exception {
		Agencia obj = agenciaRepository.save(agencia);
		return obj;
	}

	public Boolean deleteAgencia(Long idAgencia) {
		try {
			agenciaRepository.delete(idAgencia);
			return true;
		} catch (Exception e) {
			return false;

		}
	}

	public Agencia findById(Long idAgencia) {
		Agencia obj = agenciaRepository.findOne(idAgencia);
		if (obj == null) {
			throw new ObjectNotFoundException(
					"Objeto não encontrado! Id: " + idAgencia + ", Tipo: " + Agencia.class.getName());
		}
		return obj;
	}
}
