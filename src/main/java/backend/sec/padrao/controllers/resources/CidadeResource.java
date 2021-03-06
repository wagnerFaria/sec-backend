package backend.sec.padrao.controllers.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend.sec.padrao.model.entidades.Cidade;
import backend.sec.padrao.model.services.CidadeService;

@RestController
@RequestMapping(value = "/padrao/cidade")
public class CidadeResource {

	@Autowired
	private CidadeService cidadeService;

	@GetMapping(value = "/findByNome/{nome}")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<?> findByNome(@PathVariable String nome) {
		List<Cidade> lista = cidadeService.findByNome(nome);
		return ResponseEntity.ok().body(lista);
	}

	@GetMapping(value = "/findById/{idCidade}")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<?> findById(@PathVariable Long idCidade) {
		Cidade obj = cidadeService.findById(idCidade);
		return ResponseEntity.ok(obj);
	}

	@GetMapping(value = "/findByEstadoId/{idEstado}")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<?> findByEstadoId(@PathVariable Long idEstado) {
		List<Cidade> lista = cidadeService.findByEstadoId(idEstado);
		return ResponseEntity.ok(lista);
	}

}
