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

import backend.sec.padrao.controllers.resources.dto.EmpresaDto;
import backend.sec.padrao.controllers.resources.dto.EmpresaDtoConverter;
import backend.sec.padrao.model.entidades.Empresa;
import backend.sec.padrao.model.services.EmpresaService;

@RestController
@RequestMapping(value = "/empresa")
public class EmpresaResource {

	@Autowired
	private EmpresaService empresaService;

	@GetMapping(value = "/findById/{idEmpresa}")
	public ResponseEntity<?> findById(@PathVariable Long idEmpresa) {
		Empresa obj = empresaService.findById(idEmpresa);
		return ResponseEntity.ok(EmpresaDtoConverter.empresaToDto(obj));
	}

	@GetMapping(value = "/findAll")
	public ResponseEntity<?> findAll() {
		return ResponseEntity.ok(EmpresaDtoConverter.empresaListToDtoList(empresaService.findAll()));
	}

	@PostMapping(value = "/salvarEmpresa")
	public ResponseEntity<?> salvarEmpresa(@RequestBody EmpresaDto empresaDto) {
		Empresa obj = empresaService.salvarEmpresa(EmpresaDtoConverter.dtoToEmpresa(empresaDto));
		return ResponseEntity.ok(EmpresaDtoConverter.empresaToDto(obj));
	}

	@DeleteMapping(value = "/deletarEmpresa/{idEmpresa}")
	public ResponseEntity<?> deletarEmpresa(@PathVariable Long idEmpresa) {
		empresaService.deletarEmpresa(idEmpresa);
		return ResponseEntity.ok(true);
	}
}
