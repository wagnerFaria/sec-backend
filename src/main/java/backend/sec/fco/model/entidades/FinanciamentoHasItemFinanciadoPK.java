package backend.sec.fco.model.entidades;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class FinanciamentoHasItemFinanciadoPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Basic(optional = false)
	@NotNull
	@Column(name = "financiamento_id", nullable = false)
	private long financiamento;
	@Basic(optional = false)
	@NotNull
	@Column(name = "itemFinanciado_id", nullable = false)
	private long itemFinanciado;

	public FinanciamentoHasItemFinanciadoPK(long financiamento, long itemFinanciado) {
		this.financiamento = financiamento;
		this.itemFinanciado = itemFinanciado;
	}

	public FinanciamentoHasItemFinanciadoPK() {
	}

	public long getFinanciamento() {
		return financiamento;
	}

	public void setFinanciamento(long financiamento) {
		this.financiamento = financiamento;
	}

	public long getItemFinanciado() {
		return itemFinanciado;
	}

	public void setItemFinanciado(long itemFinanciado) {
		this.itemFinanciado = itemFinanciado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (financiamento ^ (financiamento >>> 32));
		result = prime * result + (int) (itemFinanciado ^ (itemFinanciado >>> 32));
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
		FinanciamentoHasItemFinanciadoPK other = (FinanciamentoHasItemFinanciadoPK) obj;
		if (financiamento != other.financiamento)
			return false;
		if (itemFinanciado != other.itemFinanciado)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "backend.sec.fco.model.entidades.FinanciamentoHasItemFinanciadoPK [financiamento=" + financiamento
				+ ", itemFinanciado=" + itemFinanciado + "]";
	}

}
