package backend.sec.fco.controllers.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend.sec.fco.model.services.TipoItemService;

@RestController
@RequestMapping(value = "/fco/tipoItem")
public class TipoItemResource {

	@Autowired
	private TipoItemService tipoItemService;

	@GetMapping(value = "/findAll")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<?> findAll() {
		return ResponseEntity.ok(tipoItemService.findAll());
	}

	@GetMapping(value = "/findById/{idTipoItem}")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<?> findById(@PathVariable Long idTipoItem) {
		return ResponseEntity.ok(tipoItemService.findById(idTipoItem));
	}

}
