package backend.sec.fco.controllers.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend.sec.fco.model.services.StatusAnaliseService;

@RestController
@RequestMapping(value = "/fco/statusAnalise")
public class StatusAnaliseResource {

	@Autowired
	private StatusAnaliseService statusAnaliseService;

	@GetMapping(value = "/findAll")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<?> findAll() {
		return ResponseEntity.ok(statusAnaliseService.findAll());
	}

	@GetMapping(value = "/findById/{idStatusAnalise}")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<?> findById(@PathVariable Long idStatusAnalise) {
		return ResponseEntity.ok(statusAnaliseService.findById(idStatusAnalise));
	}

}
