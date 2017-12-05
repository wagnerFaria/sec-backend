package backend.sec.padrao.controllers.resources.dto;

import java.io.Serializable;

import backend.sec.padrao.model.entidades.Cnae22;

public class EmpresaHasCnaeDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Cnae22 cnae;
	private Boolean cnaePrincipal = false;
	private boolean ativo = true;

	public EmpresaHasCnaeDto() {
		super();
	}

	public EmpresaHasCnaeDto(Cnae22 cnae, Boolean cnaePrincipal, boolean ativo) {
		super();
		this.cnae = cnae;
		this.cnaePrincipal = cnaePrincipal;
		this.ativo = ativo;
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
		result = prime * result + ((cnae == null) ? 0 : cnae.hashCode());
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
		EmpresaHasCnaeDto other = (EmpresaHasCnaeDto) obj;
		if (cnae == null) {
			if (other.cnae != null)
				return false;
		} else if (!cnae.equals(other.cnae))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "backend.sec.padrao.controllers.resources.dto.EmpresaHasCnaeDto [cnae=" + cnae + "]";
	}

}
