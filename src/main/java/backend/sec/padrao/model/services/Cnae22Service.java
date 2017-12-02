package backend.sec.padrao.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.sec.padrao.model.entidades.Cnae22;
import backend.sec.padrao.model.repositories.Cnae22Repository;
import backend.sec.padrao.model.services.exceptions.ObjectNotFoundException;

@Service
public class Cnae22Service {

	@Autowired
	private Cnae22Repository cnae22Repository;

	public List<Cnae22> findAll() {
		return cnae22Repository.findAll();
	}

	public Cnae22 findById(Long idCnae) {
		Cnae22 obj = cnae22Repository.findOne(idCnae);
		if (obj == null) {
			throw new ObjectNotFoundException(
					"Objeto não encontrado! Id: " + idCnae + ", Tipo: " + Cnae22.class.getName());
		}
		return obj;
	}

	public List<Cnae22> findByDescSubclasse(String descSubclasse) {
		return cnae22Repository.findByDescSubclasse(descSubclasse);
	}

	public Cnae22 salvarCnae22(Cnae22 cnae) {
		return cnae22Repository.save(cnae);
	}

	public Boolean deletarCnae22(Long idCnae) {
		try {
			cnae22Repository.delete(idCnae);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
