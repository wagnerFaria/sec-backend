package backend.sec.fco.model.security.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend.sec.fco.model.entidades.enums.PerfilEnum;
import backend.sec.fco.model.security.dto.UsuarioAdminDto;
import backend.sec.fco.model.security.dto.UsuarioDtoConverter;
import backend.sec.fco.model.security.entidades.Usuario;
import backend.sec.fco.model.security.services.impl.UsuarioServiceImpl;
import backend.sec.padrao.model.utils.SenhaUtils;

@RestController
@RequestMapping(value = "/auth/usuario")
public class UsuarioResource {

	@Autowired
	private UsuarioServiceImpl usuarioService;

	@PostMapping(value = "/salvarUsuarioAdmin")
	public ResponseEntity<?> salvarUsuarioAdmin(@RequestBody UsuarioAdminDto dto) {
		Usuario usuario = UsuarioDtoConverter.dtoToUsuario(dto);
		usuario.setSenha(SenhaUtils.gerBCript(usuario.getSenha()));
		usuario.setPerfil(PerfilEnum.ROLE_ADMIN);
		usuarioService.salvarUsuario(usuario);
		return ResponseEntity.ok(true);
	}

}
