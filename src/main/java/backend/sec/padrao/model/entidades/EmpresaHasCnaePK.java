package backend.sec.padrao.model.entidades;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class EmpresaHasCnaePK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Basic(optional = false)
	@NotNull
	@Column(name = "empresa_id", nullable = false)
	private long empresaId;
	@Basic(optional = false)
	@NotNull
	@Column(name = "cnae_id", nullable = false)
	private long cnaeId;

	public EmpresaHasCnaePK() {
	}

	public EmpresaHasCnaePK(long empresaId, long cnaeId) {
		this.empresaId = empresaId;
		this.cnaeId = cnaeId;
	}

	public long getEmpresaId() {
		return empresaId;
	}

	public void setEmpresaId(long empresaId) {
		this.empresaId = empresaId;
	}

	public long getCnaeId() {
		return cnaeId;
	}

	public void setCnaeId(long cnaeId) {
		this.cnaeId = cnaeId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cnaeId ^ (cnaeId >>> 32));
		result = prime * result + (int) (empresaId ^ (empresaId >>> 32));
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
		EmpresaHasCnaePK other = (EmpresaHasCnaePK) obj;
		if (cnaeId != other.cnaeId)
			return false;
		if (empresaId != other.empresaId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "backend.sec.padrao.model.entidades.EmpresaHasCnaePK [empresaId=" + empresaId + ", cnaeId=" + cnaeId
				+ "]";
	}

}
