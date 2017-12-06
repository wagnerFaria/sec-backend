package backend.sec.fco.controllers.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend.sec.fco.model.services.TipoFcoService;

@RestController
@RequestMapping(value = "/tipoFco")
public class TipoFcoResource {

	@Autowired
	private TipoFcoService tipoFcoService;

	@GetMapping(value = "/findAll")
	public ResponseEntity<?> findAll() {
		return ResponseEntity.ok(tipoFcoService.findAll());
	}

	@GetMapping(value = "/findById/{idTipoFco}")
	public ResponseEntity<?> findById(@PathVariable Long idTipoFco) {
		return ResponseEntity.ok(tipoFcoService.findById(idTipoFco));
	}
}
