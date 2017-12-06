package backend.sec.fco.controllers.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend.sec.fco.model.services.StatusAnaliseService;

@RestController
@RequestMapping(value = "/statusAnalise")
public class StatusAnaliseResource {

	@Autowired
	private StatusAnaliseService statusAnaliseService;

	@GetMapping(value = "/findAll")
	public ResponseEntity<?> findAll() {
		return ResponseEntity.ok(statusAnaliseService.findAll());
	}

	@GetMapping(value = "/findById/{idStatusAnalise}")
	public ResponseEntity<?> findById(@PathVariable Long idStatusAnalise) {
		return ResponseEntity.ok(statusAnaliseService.findById(idStatusAnalise));
	}

}
