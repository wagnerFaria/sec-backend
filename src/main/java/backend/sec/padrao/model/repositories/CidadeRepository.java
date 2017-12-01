package backend.sec.padrao.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import backend.sec.padrao.model.entidades.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {

	@Query("SELECT c FROM Cidade c WHERE c.nome LIKE %?1%")
	public List<Cidade> findByNomeLike(String nome);

	@Query("SELECT c FROM Cidade c WHERE c.estado.id = ?1")
	public List<Cidade> findByEstadoId(Long idEstado);

}
