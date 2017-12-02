package backend.sec.padrao.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import backend.sec.padrao.model.entidades.Agencia;

@Repository
public interface AgenciaRepository extends JpaRepository<Agencia, Long> {

	@Query("SELECT a FROM Agencia a WHERE a.banco.id = ?1")
	List<Agencia> findByBancoId(Long idBanco);

}
