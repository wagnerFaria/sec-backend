package backend.sec.padrao.model.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaUtils {

	/**
	 * Gera Hash utilizando o BCrypt
	 * 
	 * @param senha
	 * @return string
	 */
	public static String gerBCript(String senha) {
		if (senha == null) {
			return senha;
		}

		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
		return bCryptEncoder.encode(senha);
	}

	/**
	 * Verifica se a senha é valida ou não
	 * 
	 * @param senha
	 * @param senhaEncoded
	 * @return
	 */
	public static boolean senhaValida(String senha, String senhaEncoded) {
		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
		return bCryptEncoder.matches(senha, senhaEncoded);
	}

}
