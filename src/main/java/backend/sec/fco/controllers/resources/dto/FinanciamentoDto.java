package backend.sec.fco.controllers.resources.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import backend.sec.fco.model.entidades.FonteRecurso;
import backend.sec.fco.model.entidades.Localidade;
import backend.sec.fco.model.entidades.StatusAnalise;
import backend.sec.fco.model.entidades.TipoFco;
import backend.sec.padrao.model.entidades.Agencia;
import backend.sec.padrao.model.entidades.Empresa;

public class FinanciamentoDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private TipoFco tipoFco;
	private Agencia agencia;
	private Date dataProtocoloAgencia;
	private String numeroProcesso;
	private String programa;
	private Empresa empresaProponente;
	// Cadastro de Financiamento FIM

	// Dados do Financiamento - INICIO
	private String numeroProjeto;
	private Date dataProtocoloProjeto;
	private BigDecimal valorProjeto;
	private BigDecimal valorSolicitado;
	private Localidade localInvestimento;
	private BigDecimal faturamentoOuValorBruto;
	private String enquadramento;
	// O campo abaixo tb serve apara identificar os itens aprovados
	private List<ItemFinanciadoDto> listaItemFinanciadoDto = new ArrayList<>();
	private String objetoDoProjeto;
	// Dados do Financiamento - FIM

	// Dados da Analise - INICIO
	private Boolean cartaConsulta;
	private Date dataAnaliseCartaConsulta;
	private String numeroReuniao;
	private Localidade localAprovacao;
	private StatusAnalise statusAnalise;
	private BigDecimal valorAprovado;
	private Localidade localReuniao;
	private String parecer;
	// Dados da Analise - FIM

	// Outros dados - INICIO
	private Date dataAprovacao;
	private Date dataContratacao;
	private BigDecimal valorContratado;
	private FonteRecurso fonteRecurso;
	private Integer qtdEmpregoDireto;
	private Integer qtdEmpregoIndireto;

	public FinanciamentoDto() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoFco getTipoFco() {
		return tipoFco;
	}

	public void setTipoFco(TipoFco tipoFco) {
		this.tipoFco = tipoFco;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public Date getDataProtocoloAgencia() {
		return dataProtocoloAgencia;
	}

	public void setDataProtocoloAgencia(Date dataProtocoloAgencia) {
		this.dataProtocoloAgencia = dataProtocoloAgencia;
	}

	public String getNumeroProcesso() {
		return numeroProcesso;
	}

	public void setNumeroProcesso(String numeroProcesso) {
		this.numeroProcesso = numeroProcesso;
	}

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public Empresa getEmpresaProponente() {
		return empresaProponente;
	}

	public void setEmpresaProponente(Empresa empresaProponente) {
		this.empresaProponente = empresaProponente;
	}

	public String getNumeroProjeto() {
		return numeroProjeto;
	}

	public void setNumeroProjeto(String numeroProjeto) {
		this.numeroProjeto = numeroProjeto;
	}

	public Date getDataProtocoloProjeto() {
		return dataProtocoloProjeto;
	}

	public void setDataProtocoloProjeto(Date dataProtocoloProjeto) {
		this.dataProtocoloProjeto = dataProtocoloProjeto;
	}

	public BigDecimal getValorProjeto() {
		return valorProjeto;
	}

	public void setValorProjeto(BigDecimal valorProjeto) {
		this.valorProjeto = valorProjeto;
	}

	public BigDecimal getValorSolicitado() {
		return valorSolicitado;
	}

	public void setValorSolicitado(BigDecimal valorSolicitado) {
		this.valorSolicitado = valorSolicitado;
	}

	public Localidade getLocalInvestimento() {
		return localInvestimento;
	}

	public void setLocalInvestimento(Localidade localInvestimento) {
		this.localInvestimento = localInvestimento;
	}

	public BigDecimal getFaturamentoOuValorBruto() {
		return faturamentoOuValorBruto;
	}

	public void setFaturamentoOuValorBruto(BigDecimal faturamentoOuValorBruto) {
		this.faturamentoOuValorBruto = faturamentoOuValorBruto;
	}

	public String getEnquadramento() {
		return enquadramento;
	}

	public void setEnquadramento(String enquadramento) {
		this.enquadramento = enquadramento;
	}

	public List<ItemFinanciadoDto> getListaItemFinanciadoDto() {
		return listaItemFinanciadoDto;
	}

	public void setListaItemFinanciadoDto(List<ItemFinanciadoDto> listaItemFinanciadoDto) {
		this.listaItemFinanciadoDto = listaItemFinanciadoDto;
	}

	public String getObjetoDoProjeto() {
		return objetoDoProjeto;
	}

	public void setObjetoDoProjeto(String objetoDoProjeto) {
		this.objetoDoProjeto = objetoDoProjeto;
	}

	public Boolean getCartaConsulta() {
		return cartaConsulta;
	}

	public void setCartaConsulta(Boolean cartaConsulta) {
		this.cartaConsulta = cartaConsulta;
	}

	public Date getDataAnaliseCartaConsulta() {
		return dataAnaliseCartaConsulta;
	}

	public void setDataAnaliseCartaConsulta(Date dataAnaliseCartaConsulta) {
		this.dataAnaliseCartaConsulta = dataAnaliseCartaConsulta;
	}

	public String getNumeroReuniao() {
		return numeroReuniao;
	}

	public void setNumeroReuniao(String numeroReuniao) {
		this.numeroReuniao = numeroReuniao;
	}

	public Localidade getLocalAprovacao() {
		return localAprovacao;
	}

	public void setLocalAprovacao(Localidade localAprovacao) {
		this.localAprovacao = localAprovacao;
	}

	public StatusAnalise getStatusAnalise() {
		return statusAnalise;
	}

	public void setStatusAnalise(StatusAnalise statusAnalise) {
		this.statusAnalise = statusAnalise;
	}

	public BigDecimal getValorAprovado() {
		return valorAprovado;
	}

	public void setValorAprovado(BigDecimal valorAprovado) {
		this.valorAprovado = valorAprovado;
	}

	public Localidade getLocalReuniao() {
		return localReuniao;
	}

	public void setLocalReuniao(Localidade localReuniao) {
		this.localReuniao = localReuniao;
	}

	public String getParecer() {
		return parecer;
	}

	public void setParecer(String parecer) {
		this.parecer = parecer;
	}

	public Date getDataAprovacao() {
		return dataAprovacao;
	}

	public void setDataAprovacao(Date dataAprovacao) {
		this.dataAprovacao = dataAprovacao;
	}

	public Date getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(Date dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public BigDecimal getValorContratado() {
		return valorContratado;
	}

	public void setValorContratado(BigDecimal valorContratado) {
		this.valorContratado = valorContratado;
	}

	public FonteRecurso getFonteRecurso() {
		return fonteRecurso;
	}

	public void setFonteRecurso(FonteRecurso fonteRecurso) {
		this.fonteRecurso = fonteRecurso;
	}

	public Integer getQtdEmpregoDireto() {
		return qtdEmpregoDireto;
	}

	public void setQtdEmpregoDireto(Integer qtdEmpregoDireto) {
		this.qtdEmpregoDireto = qtdEmpregoDireto;
	}

	public Integer getQtdEmpregoIndireto() {
		return qtdEmpregoIndireto;
	}

	public void setQtdEmpregoIndireto(Integer qtdEmpregoIndireto) {
		this.qtdEmpregoIndireto = qtdEmpregoIndireto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FinanciamentoDto other = (FinanciamentoDto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "backend.sec.fco.controllers.resources.dto.FinanciamentoDto [id=" + id + "]";
	}

}
