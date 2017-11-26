package backend.sec.fco.model.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StatusAnalise {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String status;
	@Column(nullable = true)
	private String descricaoStatus;
	@OneToMany(mappedBy = "statusAnalise")
	private List<Financiamento> listaFinanciamento = new ArrayList<>();

	public StatusAnalise() {
	}

	public StatusAnalise(Long id, String status, String descricaoStatus) {
		this.id = id;
		this.status = status;
		this.descricaoStatus = descricaoStatus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescricaoStatus() {
		return descricaoStatus;
	}

	public void setDescricaoStatus(String descricaoStatus) {
		this.descricaoStatus = descricaoStatus;
	}

	public List<Financiamento> getListaFinanciamento() {
		return listaFinanciamento;
	}

	public void setListaFinanciamento(List<Financiamento> listaFinanciamento) {
		this.listaFinanciamento = listaFinanciamento;
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
		StatusAnalise other = (StatusAnalise) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "backend.sec.fco.model.entidades.StatusAnalise [id=" + id + "]";
	}

}