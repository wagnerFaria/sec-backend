package backend.sec.padrao.controllers.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend.sec.padrao.model.entidades.Banco;
import backend.sec.padrao.model.services.BancoService;

@RestController
@RequestMapping(value = "/banco")
public class BancoResource {

	@Autowired
	private BancoService bancoService;

	@GetMapping(value = "/findAll")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<?> findAll() {
		return ResponseEntity.ok(bancoService.findAll());
	}

	@GetMapping(value = "/findByNome/{nome}")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<?> findByNome(@PathVariable String nome) {
		List<Banco> lista = bancoService.findByNomeLike(nome);
		return ResponseEntity.ok(lista);
	}

	@GetMapping(value = "/findById/{idBanco}")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<?> findById(@PathVariable Long idBanco) {
		Banco banco = bancoService.findById(idBanco);
		return ResponseEntity.ok(banco);
	}

}
