package backend.sec.fco.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.sec.fco.model.entidades.StatusAnalise;
import backend.sec.fco.model.repositories.StatusAnaliseRepository;

@Service
public class StatusAnaliseService {

	@Autowired
	private StatusAnaliseRepository statusAnaliseRepository;

	public List<StatusAnalise> findAll() {
		return statusAnaliseRepository.findAll();
	}

	public StatusAnalise findById(Long idStatusAnalise) {
		return statusAnaliseRepository.findOne(idStatusAnalise);
	}

}
