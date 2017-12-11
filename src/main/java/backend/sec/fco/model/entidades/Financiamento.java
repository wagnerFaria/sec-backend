package backend.sec.fco.model.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import backend.sec.padrao.model.entidades.Agencia;
import backend.sec.padrao.model.entidades.Empresa;

@Entity
@Table(name = "financiamento", schema = "fco")
public class Financiamento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	// Cadastro de Financiamento INICIO
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tipo_fco_id")
	private TipoFco tipoFco;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "agencia_id")
	private Agencia agencia;
	@Temporal(TemporalType.DATE)
	private Date dataProtocoloAgencia;
	private String numeroProcesso;
	private String programa;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "empresa_proponente_id")
	private Empresa empresaProponente;
	// Cadastro de Financiamento FIM

	// Dados do Financiamento - INICIO
	private String numeroProjeto;
	@Temporal(TemporalType.DATE)
	private Date dataProtocoloProjeto;
	private BigDecimal valorProjeto;
	private BigDecimal valorSolicitado;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "local_investimento_id")
	private Localidade localInvestimento;
	private BigDecimal faturamentoOuValorBruto;
	private String enquadramento;
	// O campo abaixo tb serve apara identificar os itens aprovados
	@OneToMany(mappedBy = "financiamento", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<FinanciamentoHasItemFinanciado> listaFinanciamentoHasItemFinanciado = new ArrayList<>();
	@Column(columnDefinition = "TEXT")
	private String objetoDoProjeto;
	// Dados do Financiamento - FIM

	// Dados da Analise - INICIO
	private Boolean cartaConsulta;
	@Temporal(TemporalType.DATE)
	private Date dataAnaliseCartaConsulta;
	private String numeroReuniao;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "local_aprovacao_id")
	private Localidade localAprovacao;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "status_analise_id")
	private StatusAnalise statusAnalise;
	private BigDecimal valorAprovado;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "local_reuniao_id")
	private Localidade localReuniao;
	@Column(columnDefinition = "TEXT")
	private String parecer;
	// Dados da Analise - FIM

	// Outros dados - INICIO
	@Temporal(TemporalType.DATE)
	private Date dataAprovacao;
	@Temporal(TemporalType.DATE)
	private Date dataContratacao;
	private BigDecimal valorContratado;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "fonte_recurso_id")
	private FonteRecurso fonteRecurso;
	private Integer qtdEmpregoDireto;
	private Integer qtdEmpregoIndireto;
	// Outros dados - FIM

	public Financiamento() {
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

	public List<FinanciamentoHasItemFinanciado> getListaFinanciamentoHasItemFinanciado() {
		return listaFinanciamentoHasItemFinanciado;
	}

	public void setListaFinanciamentoHasItemFinanciado(
			List<FinanciamentoHasItemFinanciado> listaFinanciamentoHasItemFinanciado) {
		this.listaFinanciamentoHasItemFinanciado = listaFinanciamentoHasItemFinanciado;
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
		Financiamento other = (Financiamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "backend.sec.fco.model.entidades.Financiamento [id=" + id + "]";
	}

}
