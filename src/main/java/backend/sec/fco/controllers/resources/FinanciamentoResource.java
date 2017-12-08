package backend.sec.fco.controllers.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend.sec.fco.controllers.resources.dto.FinanciamentoDto;
import backend.sec.fco.controllers.resources.dto.FinanciamentoDtoConverter;
import backend.sec.fco.model.services.FinanciamentoService;

@RestController
@RequestMapping(value = "/financiamento")
public class FinanciamentoResource {

	@Autowired
	private FinanciamentoService financiamentoService;

	@GetMapping(value = "/findAll")
	public ResponseEntity<?> findAll() {
		return ResponseEntity.ok(FinanciamentoDtoConverter.financiamentoListToDtoList(financiamentoService.findAll()));
	}

	@GetMapping(value = "/findById/{idFinanciamento}")
	public ResponseEntity<?> findById(@PathVariable Long idFinanciamento) {
		return ResponseEntity
				.ok(FinanciamentoDtoConverter.financiamentoToDto(financiamentoService.findById(idFinanciamento)));
	}

	@PostMapping(value = "/salvarFinanciamento")
	public ResponseEntity<?> salvarFinanciamento(@RequestBody FinanciamentoDto dto) {
		return ResponseEntity
				.ok(financiamentoService.salvarFinanciamento(FinanciamentoDtoConverter.dtoToFinanciamento(dto)));
	}

	@DeleteMapping(value = "/deletarFinanciamento/{idFinanciamento}")
	public ResponseEntity<?> deletarFinanciamento(@PathVariable Long idFinanciamento) {
		financiamentoService.deletarFinanciamento(idFinanciamento);
		return ResponseEntity.ok(true);
	}
}
