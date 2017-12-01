package backend.sec.padrao.model.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cnae22", schema = "padrao")
public class Cnae22 implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@Column(name = "cod_secao", nullable = false)
	private String codSecao;
	@NotNull
	@Column(name = "desc_secao", nullable = false)
	private String descSecao;
	@NotNull
	@Column(name = "cod_divisao", nullable = false)
	private String codDivisao;
	@NotNull
	@Column(name = "desc_divisao", nullable = false)
	private String descDivisao;
	@NotNull
	@Column(name = "cod_grupo", nullable = false)
	private String codGrupo;
	@NotNull
	@Column(name = "desc_grupo", nullable = false)
	private String descGrupo;
	@NotNull
	@Column(name = "cod_classe", nullable = false)
	private String codClasse;
	@NotNull
	@Column(name = "desc_classe", nullable = false)
	private String descClasse;
	@NotNull
	@Column(name = "cod_subclasse", nullable = false)
	private String codSubclasse;
	@NotNull
	@Column(name = "desc_subclasse", nullable = false)
	private String descSubclasse;
	@OneToMany(mappedBy = "cnae")
	private List<EmpresaHasCnae> listaEmpresaHasCnae = new ArrayList<>();

	public Cnae22() {
		super();
	}

	public Cnae22(Long id, String codSecao, String descSecao, String codDivisao, String descDivisao, String codGrupo,
			String descGrupo, String codClasse, String descClasse, String codSubclasse, String descSubclasse) {
		super();
		this.id = id;
		this.codSecao = codSecao;
		this.descSecao = descSecao;
		this.codDivisao = codDivisao;
		this.descDivisao = descDivisao;
		this.codGrupo = codGrupo;
		this.descGrupo = descGrupo;
		this.codClasse = codClasse;
		this.descClasse = descClasse;
		this.codSubclasse = codSubclasse;
		this.descSubclasse = descSubclasse;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodSecao() {
		return codSecao;
	}

	public void setCodSecao(String codSecao) {
		this.codSecao = codSecao;
	}

	public String getDescSecao() {
		return descSecao;
	}

	public void setDescSecao(String descSecao) {
		this.descSecao = descSecao;
	}

	public String getCodDivisao() {
		return codDivisao;
	}

	public void setCodDivisao(String codDivisao) {
		this.codDivisao = codDivisao;
	}

	public String getDescDivisao() {
		return descDivisao;
	}

	public void setDescDivisao(String descDivisao) {
		this.descDivisao = descDivisao;
	}

	public String getCodGrupo() {
		return codGrupo;
	}

	public void setCodGrupo(String codGrupo) {
		this.codGrupo = codGrupo;
	}

	public String getDescGrupo() {
		return descGrupo;
	}

	public void setDescGrupo(String descGrupo) {
		this.descGrupo = descGrupo;
	}

	public String getCodClasse() {
		return codClasse;
	}

	public void setCodClasse(String codClasse) {
		this.codClasse = codClasse;
	}

	public String getDescClasse() {
		return descClasse;
	}

	public void setDescClasse(String descClasse) {
		this.descClasse = descClasse;
	}

	public String getCodSubclasse() {
		return codSubclasse;
	}

	public void setCodSubclasse(String codSubclasse) {
		this.codSubclasse = codSubclasse;
	}

	public String getDescSubclasse() {
		return descSubclasse;
	}

	public void setDescSubclasse(String descSubclasse) {
		this.descSubclasse = descSubclasse;
	}

	public List<EmpresaHasCnae> getListaEmpresaHasCnae() {
		return listaEmpresaHasCnae;
	}

	public void setListaEmpresaHasCnae(List<EmpresaHasCnae> listaEmpresaHasCnae) {
		this.listaEmpresaHasCnae = listaEmpresaHasCnae;
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
		Cnae22 other = (Cnae22) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "backend.sec.padrao.model.entidades.Cnae22 [id=" + id + "]";
	}

}
