package backend.sec.padrao.controllers.resources.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EmpresaDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String razaoSocial;
	private String nomeFantasia;
	private String cnpj;
	private List<EmpresaHasCnaeDto> listaCnae22 = new ArrayList<>();

	public EmpresaDto() {
		super();
	}

	public EmpresaDto(Long id, String razaoSocial, String nomeFantasia, String cnpj) {
		super();
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<EmpresaHasCnaeDto> getListaCnae22() {
		return listaCnae22;
	}

	public void setListaCnae22(List<EmpresaHasCnaeDto> listaCnae22) {
		this.listaCnae22 = listaCnae22;
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
		EmpresaDto other = (EmpresaDto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "backend.sec.padrao.controllers.resources.dto.EmpresaDto [id=" + id + "]";
	}

}
