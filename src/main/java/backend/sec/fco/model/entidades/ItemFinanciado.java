package backend.sec.fco.model.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ItemFinanciado implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tipo_itens_id")
	private TipoItem tipoItens;

	@OneToMany(mappedBy = "itemFinanciado")
	private List<FinanciamentoHasItemFinanciado> listaFinanciamentoHasItemFinanciado = new ArrayList<>();

	public ItemFinanciado() {
	}

	public ItemFinanciado(Long id, String descricao, TipoItem tipoItens) {
		this.id = id;
		this.descricao = descricao;
		this.tipoItens = tipoItens;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoItem getTipoItens() {
		return tipoItens;
	}

	public void setTipoItens(TipoItem tipoItens) {
		this.tipoItens = tipoItens;
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
		ItemFinanciado other = (ItemFinanciado) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "backend.sec.fco.model.entidades.ItemFinanciado [id=" + id + "]";
	}

}
