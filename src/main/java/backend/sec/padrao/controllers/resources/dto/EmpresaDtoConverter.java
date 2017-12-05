package backend.sec.padrao.controllers.resources.dto;

import java.util.ArrayList;
import java.util.List;

import backend.sec.padrao.model.entidades.Empresa;
import backend.sec.padrao.model.entidades.EmpresaHasCnae;
import backend.sec.padrao.model.entidades.EmpresaHasCnaePK;

public class EmpresaDtoConverter {

	public static EmpresaDto empresaToDto(Empresa empresa) {
		EmpresaDto dto = new EmpresaDto();
		dto.setId(empresa.getId());
		dto.setNomeFantasia(empresa.getNomeFantasia());
		dto.setRazaoSocial(empresa.getRazaoSocial());
		dto.setCnpj(empresa.getCnpj());
		List<EmpresaHasCnaeDto> listaCnae = new ArrayList<>();
		for (EmpresaHasCnae ehc : empresa.getListaEmpresaHasCnae()) {
			EmpresaHasCnaeDto empCnaeDto = new EmpresaHasCnaeDto();
			empCnaeDto.setCnae(ehc.getCnae());
			empCnaeDto.setAtivo(ehc.isAtivo());
			empCnaeDto.setCnaePrincipal(ehc.getCnaePrincipal());
			listaCnae.add(empCnaeDto);
		}
		dto.setListaCnae22(listaCnae);
		return dto;
	}

	public static Empresa dtoToEmpresa(EmpresaDto empresaDto) {
		Empresa empresa = new Empresa();
		empresa.setId(empresaDto.getId());
		empresa.setNomeFantasia(empresaDto.getNomeFantasia());
		empresa.setRazaoSocial(empresaDto.getRazaoSocial());
		empresa.setCnpj(empresaDto.getCnpj());
		List<EmpresaHasCnae> listaEmpresaHasCnae = new ArrayList<>();
		for (EmpresaHasCnaeDto empCnaeDto : empresaDto.getListaCnae22()) {
			EmpresaHasCnae ehc = new EmpresaHasCnae();
			if (empresa.getId() != null) {
				ehc.setEmpresaHasCnaePK(new EmpresaHasCnaePK(empresa.getId(), empCnaeDto.getCnae().getId()));
			}
			ehc.setAtivo(empCnaeDto.isAtivo());
			ehc.setCnaePrincipal(empCnaeDto.getCnaePrincipal());
			ehc.setCnae(empCnaeDto.getCnae());
			listaEmpresaHasCnae.add(ehc);
		}
		empresa.setListaEmpresaHasCnae(listaEmpresaHasCnae);
		return empresa;
	}

	public static List<EmpresaDto> empresaListToDtoList(List<Empresa> lsEmpresa) {
		List<EmpresaDto> lsDto = new ArrayList<>();
		for (Empresa empresa : lsEmpresa) {
			lsDto.add(EmpresaDtoConverter.empresaToDto(empresa));
		}
		return lsDto;
	}

}
