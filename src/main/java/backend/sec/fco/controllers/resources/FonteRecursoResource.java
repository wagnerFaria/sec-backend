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

import backend.sec.fco.model.entidades.FonteRecurso;
import backend.sec.fco.model.services.FonteRecursoService;

@RestController
@RequestMapping(value = "/fonteRecurso")
public class FonteRecursoResource {

	@Autowired
	private FonteRecursoService fonteRecursoService;

	@GetMapping(value = "/findAll")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<?> findAll() {
		return ResponseEntity.ok(fonteRecursoService.findAll());
	}

	@GetMapping(value = "/findById/{idFonteRecurso}")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<?> findById(@PathVariable Long idFonteRecurso) {
		return ResponseEntity.ok(fonteRecursoService.findById(idFonteRecurso));
	}

	@PostMapping(value = "/salvarFonteRecurso")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<?> salvarFonteRecurso(@RequestBody FonteRecurso fonteRecurso) {
		return ResponseEntity.ok(fonteRecursoService.salvarFonteRecurso(fonteRecurso));
	}

	@DeleteMapping(value = "/deletarFonteRecurso/{idFonteRecurso}")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<?> deletarFonteRecurso(@PathVariable Long idFonteRecurso) {
		return ResponseEntity.ok(fonteRecursoService.deletarFonteRecurso(idFonteRecurso));
	}

}
