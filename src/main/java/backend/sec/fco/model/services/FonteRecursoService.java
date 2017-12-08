package backend.sec.fco.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.sec.fco.model.entidades.FonteRecurso;
import backend.sec.fco.model.repositories.FonteRecursoRepository;

@Service
public class FonteRecursoService {

	@Autowired
	private FonteRecursoRepository fonteRecursoRepository;

	public List<FonteRecurso> findAll() {
		return fonteRecursoRepository.findAll();
	}

	public FonteRecurso findById(Long idFonteRecurso) {
		return fonteRecursoRepository.findOne(idFonteRecurso);
	}

	public FonteRecurso salvarFonteRecurso(FonteRecurso fonteRecurso) {
		return fonteRecursoRepository.save(fonteRecurso);
	}

	public Boolean deletarFonteRecurso(Long idFonteRecurso) {
		fonteRecursoRepository.delete(idFonteRecurso);
		return true;
	}
}
