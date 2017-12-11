package backend.sec.fco.model.security.services;

import java.util.Optional;

import backend.sec.fco.model.security.entidades.Usuario;

public interface UsuarioService {

	/**
	 * Busca e retorna um usuário dado um email.
	 * 
	 * @param email
	 * @return Optional<Usuario>
	 */
	Optional<Usuario> buscarPorEmail(String email);
}
