package backend.sec.fco.controllers.resources.dto;

import java.io.Serializable;

import backend.sec.fco.model.entidades.ItemFinanciado;

public class ItemFinanciadoDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private ItemFinanciado itemFinanciado;
	private Boolean aprovado = false;

	public ItemFinanciadoDto() {
		super();
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
		result = prime * result + ((itemFinanciado == null) ? 0 : itemFinanciado.hashCode());
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
		ItemFinanciadoDto other = (ItemFinanciadoDto) obj;
		if (itemFinanciado == null) {
			if (other.itemFinanciado != null)
				return false;
		} else if (!itemFinanciado.equals(other.itemFinanciado))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "backend.sec.fco.controllers.resources.dto.ItemFinanciadoDto [itemFinanciado=" + itemFinanciado + "]";
	}

}
