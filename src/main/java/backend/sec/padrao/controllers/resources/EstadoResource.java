package backend.sec.padrao.controllers.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import backend.sec.padrao.model.entidades.Estado;
import backend.sec.padrao.model.services.EstadoService;

@RestController
@RequestMapping(value = "/padrao/estado")
public class EstadoResource {

	@Autowired
	private EstadoService estadoService;

	@RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<?> findById(@PathVariable Integer id) {

		Estado obj = estadoService.findById(new Long(id));
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<?> findAll() {
		List<Estado> lista = estadoService.findAll();
		return ResponseEntity.ok().body(lista);
	}

}
