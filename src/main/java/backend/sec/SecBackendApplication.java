package backend.sec;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import backend.sec.padrao.model.entidades.Estado;
import backend.sec.padrao.model.repositories.EstadoRepository;

@SpringBootApplication
public class SecBackendApplication implements CommandLineRunner {

	@Autowired
	private EstadoRepository estadoRepository;

	public static void main(String[] args) {
		SpringApplication.run(SecBackendApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		Estado mt = new Estado(null, "Mato Grosso", "MT");
		Estado mg = new Estado(null, "Minas Gerais", "MG");
		estadoRepository.save(Arrays.asList(mt, mg));
	}
}
