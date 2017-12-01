package backend.sec.fco.model.entidades;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "financ_has_item_financ", schema = "fco")
public class FinanciamentoHasItemFinanciado implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FinanciamentoHasItemFinanciadoPK financiamentoHasItemFinanciadoPK;
	@JoinColumn(name = "financiamento_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Financiamento financiamento;
	@JoinColumn(name = "itemFinanciado_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private ItemFinanciado itemFinanciado;
	private Boolean aprovado = false;

	public FinanciamentoHasItemFinanciado() {
	}

	public FinanciamentoHasItemFinanciado(FinanciamentoHasItemFinanciadoPK financiamentoHasItemFinanciadoPK,
			Financiamento financiamento, ItemFinanciado itemFinanciado, Boolean aprovado) {
		this.financiamentoHasItemFinanciadoPK = financiamentoHasItemFinanciadoPK;
		this.financiamento = financiamento;
		this.itemFinanciado = itemFinanciado;
		this.aprovado = aprovado;
	}

	public FinanciamentoHasItemFinanciadoPK getFinanciamentoHasItemFinanciadoPK() {
		return financiamentoHasItemFinanciadoPK;
	}

	public void setFinanciamentoHasItemFinanciadoPK(FinanciamentoHasItemFinanciadoPK financiamentoHasItemFinanciadoPK) {
		this.financiamentoHasItemFinanciadoPK = financiamentoHasItemFinanciadoPK;
	}

	public Financiamento getFinanciamento() {
		return financiamento;
	}

	public void setFinanciamento(Financiamento financiamento) {
		this.financiamento = financiamento;
	}

	public ItemFinanciado getItemFinanciado() {
		return itemFinanciado;
	}

	public void setItemFinanciado(ItemFinanciado itemFinanciado) {
		this.itemFinanciado = itemFinanciado;
	}

	public Boolean getAprovado() {
		return aprovado;
	}

	public void setAprovado(Boolean aprovado) {
		this.aprovado = aprovado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((financiamentoHasItemFinanciadoPK == null) ? 0 : financiamentoHasItemFinanciadoPK.hashCode());
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
		FinanciamentoHasItemFinanciado other = (FinanciamentoHasItemFinanciado) obj;
		if (financiamentoHasItemFinanciadoPK == null) {
			if (other.financiamentoHasItemFinanciadoPK != null)
				return false;
		} else if (!financiamentoHasItemFinanciadoPK.equals(other.financiamentoHasItemFinanciadoPK))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "backend.sec.fco.model.entidades.FinanciamentoHasItemFinanciado [financiamentoHasItemFinanciadoPK="
				+ financiamentoHasItemFinanciadoPK + "]";
	}

}
