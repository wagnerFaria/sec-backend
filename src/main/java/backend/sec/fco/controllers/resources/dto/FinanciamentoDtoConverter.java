package backend.sec.fco.controllers.resources.dto;

import java.util.ArrayList;
import java.util.List;

import backend.sec.fco.model.entidades.Financiamento;
import backend.sec.fco.model.entidades.FinanciamentoHasItemFinanciado;
import backend.sec.fco.model.entidades.FinanciamentoHasItemFinanciadoPK;

public class FinanciamentoDtoConverter {

	public static FinanciamentoDto financiamentoToDto(Financiamento financiamento) {
		FinanciamentoDto dto = new FinanciamentoDto();
		dto.setId(financiamento.getId());
		dto.setTipoFco(financiamento.getTipoFco());
		dto.setAgencia(financiamento.getAgencia());
		dto.setDataProtocoloAgencia(financiamento.getDataProtocoloAgencia());
		dto.setNumeroProcesso(financiamento.getNumeroProcesso());
		dto.setPrograma(financiamento.getPrograma());
		dto.setEmpresaProponente(financiamento.getEmpresaProponente());

		dto.setNumeroProjeto(financiamento.getNumeroProjeto());
		dto.setDataProtocoloProjeto(financiamento.getDataProtocoloProjeto());
		dto.setValorProjeto(financiamento.getValorProjeto());
		dto.setValorSolicitado(financiamento.getValorSolicitado());
		dto.setLocalInvestimento(financiamento.getLocalInvestimento());
		dto.setLocalInvestimento(financiamento.getLocalInvestimento());
		dto.setFaturamentoOuValorBruto(financiamento.getFaturamentoOuValorBruto());
		dto.setEnquadramento(financiamento.getEnquadramento());
		List<ItemFinanciadoDto> listFinancDto = new ArrayList<>();
		for (FinanciamentoHasItemFinanciado fhif : financiamento.getListaFinanciamentoHasItemFinanciado()) {
			ItemFinanciadoDto item = new ItemFinanciadoDto();
			item.setAprovado(fhif.getAprovado());
			item.setItemFinanciado(fhif.getItemFinanciado());
			listFinancDto.add(item);
		}
		dto.setListaItemFinanciadoDto(listFinancDto);
		dto.setObjetoDoProjeto(financiamento.getObjetoDoProjeto());

		dto.setCartaConsulta(financiamento.getCartaConsulta());
		dto.setDataAnaliseCartaConsulta(financiamento.getDataAnaliseCartaConsulta());
		dto.setNumeroReuniao(financiamento.getNumeroReuniao());
		dto.setLocalAprovacao(financiamento.getLocalAprovacao());
		dto.setStatusAnalise(financiamento.getStatusAnalise());
		dto.setValorAprovado(financiamento.getValorAprovado());
		dto.setLocalReuniao(financiamento.getLocalReuniao());
		dto.setParecer(financiamento.getParecer());

		dto.setDataAprovacao(financiamento.getDataAprovacao());
		dto.setDataContratacao(financiamento.getDataContratacao());
		dto.setValorContratado(financiamento.getValorContratado());
		dto.setFonteRecurso(financiamento.getFonteRecurso());
		dto.setQtdEmpregoDireto(financiamento.getQtdEmpregoDireto());
		dto.setQtdEmpregoIndireto(financiamento.getQtdEmpregoIndireto());

		return dto;
	}

	public static Financiamento dtoToFinanciamento(FinanciamentoDto dto) {

		Financiamento financiamento = new Financiamento();
		financiamento.setId(dto.getId());
		financiamento.setId(dto.getId());
		financiamento.setTipoFco(dto.getTipoFco());
		financiamento.setAgencia(dto.getAgencia());
		financiamento.setDataProtocoloAgencia(dto.getDataProtocoloAgencia());
		financiamento.setNumeroProcesso(dto.getNumeroProcesso());
		financiamento.setPrograma(dto.getPrograma());
		financiamento.setEmpresaProponente(dto.getEmpresaProponente());

		financiamento.setNumeroProjeto(dto.getNumeroProjeto());
		financiamento.setDataProtocoloProjeto(dto.getDataProtocoloProjeto());
		financiamento.setValorProjeto(dto.getValorProjeto());
		financiamento.setValorSolicitado(dto.getValorSolicitado());
		financiamento.setLocalInvestimento(dto.getLocalInvestimento());
		financiamento.setLocalInvestimento(dto.getLocalInvestimento());
		financiamento.setFaturamentoOuValorBruto(dto.getFaturamentoOuValorBruto());
		financiamento.setEnquadramento(dto.getEnquadramento());
		List<FinanciamentoHasItemFinanciado> list = new ArrayList<>();
		for (ItemFinanciadoDto ifd : dto.getListaItemFinanciadoDto()) {
			FinanciamentoHasItemFinanciado fhif = new FinanciamentoHasItemFinanciado();
			if (financiamento.getId() != null) {
				fhif.setFinanciamentoHasItemFinanciadoPK(
						new FinanciamentoHasItemFinanciadoPK(financiamento.getId(), ifd.getItemFinanciado().getId()));
			}
			fhif.setItemFinanciado(ifd.getItemFinanciado());
			fhif.setAprovado(ifd.getAprovado());
			list.add(fhif);
		}
		financiamento.setListaFinanciamentoHasItemFinanciado(list);
		financiamento.setObjetoDoProjeto(dto.getObjetoDoProjeto());

		financiamento.setCartaConsulta(dto.getCartaConsulta());
		financiamento.setDataAnaliseCartaConsulta(dto.getDataAnaliseCartaConsulta());
		financiamento.setNumeroReuniao(dto.getNumeroReuniao());
		financiamento.setLocalAprovacao(dto.getLocalAprovacao());
		financiamento.setStatusAnalise(dto.getStatusAnalise());
		financiamento.setValorAprovado(dto.getValorAprovado());
		financiamento.setLocalReuniao(dto.getLocalReuniao());
		financiamento.setParecer(dto.getParecer());

		financiamento.setDataAprovacao(dto.getDataAprovacao());
		financiamento.setDataContratacao(dto.getDataContratacao());
		financiamento.setValorContratado(dto.getValorContratado());
		financiamento.setFonteRecurso(dto.getFonteRecurso());
		financiamento.setQtdEmpregoDireto(dto.getQtdEmpregoDireto());
		financiamento.setQtdEmpregoIndireto(dto.getQtdEmpregoIndireto());

		return financiamento;
	}

	public static List<FinanciamentoDto> financiamentoListToDtoList(List<Financiamento> lsFinanciamento) {
		List<FinanciamentoDto> lsDto = new ArrayList<>();
		for (Financiamento financiamento : lsFinanciamento) {
			lsDto.add(FinanciamentoDtoConverter.financiamentoToDto(financiamento));
		}
		return lsDto;

	}
}
