package backend.sec.fco.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.sec.fco.model.entidades.ItemFinanciado;
import backend.sec.fco.model.repositories.ItemFinanciadoRepository;

@Service
public class ItemFinanciadoService {

	@Autowired
	private ItemFinanciadoRepository itemFinanciadoRepository;

	public List<ItemFinanciado> findAll() {
		return itemFinanciadoRepository.findAll();
	}

	public ItemFinanciado findById(Long idItemFinanciado) {
		return itemFinanciadoRepository.findOne(idItemFinanciado);
	}

	public ItemFinanciado salvarItemFinanciado(ItemFinanciado itemFinanciado) {
		return itemFinanciadoRepository.save(itemFinanciado);
	}

	public void deletarItemFinanciado(Long idItemFinanciado) {
		itemFinanciadoRepository.delete(idItemFinanciado);
	}
}
