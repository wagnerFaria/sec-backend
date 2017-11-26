package backend.sec.padrao.model.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import backend.sec.fco.model.entidades.Financiamento;

@Entity
public class Agencia implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String numeroAgencia;
	private String descricao;
	@ManyToOne
	@JoinColumn(name = "banco_id")
	private Banco banco;
	@ManyToOne
	@JoinColumn(name = "cidade_id")
	private Cidade cidade;
	@OneToMany(mappedBy = "agencia")
	private List<Financiamento> listaFinanciamento = new ArrayList<>();

	public Agencia() {
		super();
	}

	public Agencia(Long id, String numeroAgencia, String descricao, Banco banco, Cidade cidade) {
		super();
		this.id = id;
		this.numeroAgencia = numeroAgencia;
		this.descricao = descricao;
		this.banco = banco;
		this.cidade = cidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
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
		Agencia other = (Agencia) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "backend.sec.padrao.model.entidades.Agencia [id=" + id + "]";
	}

}
