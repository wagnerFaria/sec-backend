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

import backend.sec.fco.model.entidades.ItemFinanciado;
import backend.sec.fco.model.services.ItemFinanciadoService;

@RestController
@RequestMapping(value = "/fco/itemFinanciado")
public class ItemFinanciadoResource {

	@Autowired
	private ItemFinanciadoService itemFinanciadoService;

	@GetMapping(value = "/findAll")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<?> findAll() {
		return ResponseEntity.ok(itemFinanciadoService.findAll());
	}

	@GetMapping(value = "/findById/{idItemFinanciado}")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<?> findById(@PathVariable Long idItemFinanciado) {
		return ResponseEntity.ok(itemFinanciadoService.findById(idItemFinanciado));
	}

	@PostMapping(value = "/salvarItemFinanciado")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<?> salvarItemFinanciado(@RequestBody ItemFinanciado itemFinanciado) {
		return ResponseEntity.ok(itemFinanciadoService.salvarItemFinanciado(itemFinanciado));
	}

	@DeleteMapping(value = "/deletarItemFinanciado/{idItemFinanciado}")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<?> deletarItemFinanciado(@PathVariable Long idItemFinanciado) {
		itemFinanciadoService.deletarItemFinanciado(idItemFinanciado);
		return ResponseEntity.ok(true);
	}
}
