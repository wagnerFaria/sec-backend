package backend.sec.padrao.controllers.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend.sec.padrao.model.entidades.Agencia;
import backend.sec.padrao.model.services.AgenciaService;

@RestController
@RequestMapping(value = "/agencia")
public class AgenciaResource {

	@Autowired
	private AgenciaService agenciaService;

	@GetMapping(value = "/findByBancoId/{idBanco}")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<?> findByBancoId(@PathVariable Long idBanco) {
		return ResponseEntity.ok(agenciaService.findByBancoId(idBanco));
	}

	@GetMapping(value = "/findById/{idAgencia}")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<?> findById(@PathVariable Long idAgencia) {
		Agencia obj = agenciaService.findById(idAgencia);
		return ResponseEntity.ok(obj);
	}

	@PostMapping(value = "/salvarAgencia")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<?> salvarAgencia(@RequestBody Agencia agencia) {
		try {
			Agencia obj = agenciaService.salvarAgencia(agencia);
			return ResponseEntity.ok(obj);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.toString());
		}
	}

	@DeleteMapping(value = "/deleteAgencia/{idAgencia}")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<?> deleteAgencia(@PathVariable Long idAgencia) {
		try {
			Agencia agencia = agenciaService.findById(idAgencia);
			if (agencia != null) {
				agenciaService.deleteAgencia(idAgencia);
				return ResponseEntity.ok("true");
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND)
						.body("Não foi encontrado nenhuma agência com este id");
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.toString());
			// TODO: handle exception
		}
	}
}
