package backend.sec.fco.model.security.dto;

import backend.sec.fco.model.security.entidades.Usuario;

public class UsuarioDtoConverter {

	public static Usuario dtoToUsuario(UsuarioAdminDto dto) {
		Usuario usuario = new Usuario();
		usuario.setId(dto.getId());
		usuario.setEmail(dto.getEmail());
		usuario.setSenha(dto.getSenha());
		usuario.setNome(dto.getNome());
		usuario.setCpf(dto.getCpf());
		return usuario;
	}

}
