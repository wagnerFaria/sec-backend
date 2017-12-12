package backend.sec.fco.controllers.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend.sec.fco.model.entidades.Localidade;
import backend.sec.fco.model.services.LocalidadeService;

@RestController
@RequestMapping(value = "/fco/localidade")
public class LocalidadeResource {

	@Autowired
	private LocalidadeService localidadeService;

	@GetMapping(value = "/findAll")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<?> findAll() {
		return ResponseEntity.ok(localidadeService.findAll());
	}

	@GetMapping(value = "/findById/{idLocalidade}")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<?> findById(@PathVariable Long idLocalidade) {
		return ResponseEntity.ok(localidadeService.findById(idLocalidade));
	}

	@PostMapping(value = "/salvarLocalidade")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<?> salvarLocalidade(@RequestBody Localidade localidade) {
		return ResponseEntity.ok(localidadeService.salvarLocalidade(localidade));
	}

	@DeleteMapping(value = "deletarLocalidade/{idLocalidade}")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<?> deletarLocalidade(@PathVariable Long idLocalidade) {
		return ResponseEntity.ok(localidadeService.deletarLocalidade(idLocalidade));
	}
}
