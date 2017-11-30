package backend.sec.padrao.model.entidades;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class EmpresaHasCnae implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EmpresaHasCnaePK empresaHasCnaePK;
	@JoinColumn(name = "empresa_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private Empresa empresa;
	@JoinColumn(name = "cnae_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private Cnae22 cnae;
	private Boolean cnaePrincipal;
	private boolean ativo = true;

	public EmpresaHasCnae() {
	}

	public EmpresaHasCnae(EmpresaHasCnaePK empresaHasCnaePK, Empresa empresa, Cnae22 cnae, Boolean cnaePrincipal) {
		this.empresaHasCnaePK = empresaHasCnaePK;
		this.empresa = empresa;
		this.cnae = cnae;
		this.cnaePrincipal = cnaePrincipal;
	}

	public EmpresaHasCnaePK getEmpresaHasCnaePK() {
		return empresaHasCnaePK;
	}

	public void setEmpresaHasCnaePK(EmpresaHasCnaePK empresaHasCnaePK) {
		this.empresaHasCnaePK = empresaHasCnaePK;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Cnae22 getCnae() {
		return cnae;
	}

	public void setCnae(Cnae22 cnae) {
		this.cnae = cnae;
	}

	public Boolean getCnaePrincipal() {
		return cnaePrincipal;
	}

	public void setCnaePrincipal(Boolean cnaePrincipal) {
		this.cnaePrincipal = cnaePrincipal;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empresaHasCnaePK == null) ? 0 : empresaHasCnaePK.hashCode());
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
		EmpresaHasCnae other = (EmpresaHasCnae) obj;
		if (empresaHasCnaePK == null) {
			if (other.empresaHasCnaePK != null)
				return false;
		} else if (!empresaHasCnaePK.equals(other.empresaHasCnaePK))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "backend.sec.padrao.model.entidades.EmpresaHasCnae [empresaHasCnaePK=" + empresaHasCnaePK + "]";
	}

}
