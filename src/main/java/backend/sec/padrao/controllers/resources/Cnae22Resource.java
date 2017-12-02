package backend.sec.padrao.controllers.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend.sec.padrao.model.entidades.Cnae22;
import backend.sec.padrao.model.services.Cnae22Service;

@RestController
@RequestMapping(value = "/cnae")
public class Cnae22Resource {

	@Autowired
	private Cnae22Service cnae22Service;

	@GetMapping(value = "/findAll")
	public ResponseEntity<?> findAll() {
		return ResponseEntity.ok(cnae22Service.findAll());
	}

	@GetMapping(value = "/findById/{idCnae}")
	public ResponseEntity<?> findById(@PathVariable Long idCnae) {
		return ResponseEntity.ok(cnae22Service.findById(idCnae));
	}

	@GetMapping(value = "/findByDescSubclasse/{descSubclasse}")
	public ResponseEntity<?> findByDescSubclasse(@PathVariable String descSubclasse) {
		return ResponseEntity.ok(cnae22Service.findByDescSubclasse(descSubclasse));
	}

	@PostMapping(value = "/salvarCnae22")
	public ResponseEntity<?> salvarCnae22(@RequestBody Cnae22 cnae) {
		return ResponseEntity.ok(cnae22Service.salvarCnae22(cnae));
	}

	@DeleteMapping(value = "/deletarCnae22/{idCnae}")
	public ResponseEntity<?> deletarCnae22(@PathVariable Long idCnae) {
		Boolean deletadoComSucesso = cnae22Service.deletarCnae22(idCnae);
		if (deletadoComSucesso) {
			return ResponseEntity.ok(deletadoComSucesso);
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(deletadoComSucesso);
		}

	}
}
