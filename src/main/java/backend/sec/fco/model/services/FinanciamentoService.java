package backend.sec.fco.model.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.sec.fco.model.entidades.Financiamento;
import backend.sec.fco.model.entidades.FinanciamentoHasItemFinanciado;
import backend.sec.fco.model.entidades.FinanciamentoHasItemFinanciadoPK;
import backend.sec.fco.model.repositories.FinanciamentoRepository;

@Service
public class FinanciamentoService {

	@Autowired
	private FinanciamentoRepository financiamentoRepository;

	public List<Financiamento> findAll() {
		return financiamentoRepository.findAll();
	}

	public Financiamento findById(Long idFinanciamento) {
		return financiamentoRepository.findOne(idFinanciamento);
	}

	public Financiamento salvarFinanciamento(Financiamento financiamento) {
		List<FinanciamentoHasItemFinanciado> lista = new ArrayList<>();
		if (financiamento.getId() == null) {
			if (financiamento.getListaFinanciamentoHasItemFinanciado().size() > 0) {
				lista = financiamento.getListaFinanciamentoHasItemFinanciado();
				financiamento.setListaFinanciamentoHasItemFinanciado(null);
			}
			financiamento = financiamentoRepository.save(financiamento);
			financiamento.setListaFinanciamentoHasItemFinanciado(new ArrayList<>());
			for (FinanciamentoHasItemFinanciado fhif : lista) {
				fhif.setFinanciamentoHasItemFinanciadoPK(
						new FinanciamentoHasItemFinanciadoPK(financiamento.getId(), fhif.getItemFinanciado().getId()));
				financiamento.getListaFinanciamentoHasItemFinanciado().add(fhif);
			}
		}
		Financiamento obj = financiamentoRepository.save(financiamento);
		return obj;
	}

	public void deletarFinanciamento(Long idFinanciamento) {
		financiamentoRepository.delete(idFinanciamento);
	}
}
