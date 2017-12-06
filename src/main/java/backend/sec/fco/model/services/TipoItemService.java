package backend.sec.fco.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.sec.fco.model.entidades.TipoItem;
import backend.sec.fco.model.repositories.TipoItemRepository;

@Service
public class TipoItemService {

	@Autowired
	private TipoItemRepository tipoItemRepository;

	public List<TipoItem> findAll() {
		return tipoItemRepository.findAll();
	}

	public TipoItem findById(Long idTipoItem) {
		return tipoItemRepository.findOne(idTipoItem);
	}

}
