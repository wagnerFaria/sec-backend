package backend.sec.padrao.model.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.sec.padrao.model.entidades.Empresa;
import backend.sec.padrao.model.entidades.EmpresaHasCnae;
import backend.sec.padrao.model.entidades.EmpresaHasCnaePK;
import backend.sec.padrao.model.repositories.EmpresaRepository;

@Service
public class EmpresaService {

	@Autowired
	private EmpresaRepository empresaRepository;

	public Empresa findById(Long idEmpresa) {
		return empresaRepository.findOne(idEmpresa);
	}

	public List<Empresa> findAll() {
		return empresaRepository.findAll();
	}

	public Empresa salvarEmpresa(Empresa empresa) {
		List<EmpresaHasCnae> lista = new ArrayList<>();
		if (empresa.getId() == null) {
			if (empresa.getListaEmpresaHasCnae().size() > 0) {
				lista = empresa.getListaEmpresaHasCnae();
				empresa.setListaEmpresaHasCnae(null);
			}
			empresa = empresaRepository.save(empresa);
			empresa.setListaEmpresaHasCnae(new ArrayList<>());
			for (EmpresaHasCnae ehc : lista) {
				ehc.setEmpresaHasCnaePK(new EmpresaHasCnaePK(empresa.getId(), ehc.getCnae().getId()));
				empresa.getListaEmpresaHasCnae().add(ehc);
			}
		}
		Empresa obj = empresaRepository.save(empresa);
		return obj;
	}

	public boolean deletarEmpresa(Long empresaId) {
		try {
			empresaRepository.delete(empresaId);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
