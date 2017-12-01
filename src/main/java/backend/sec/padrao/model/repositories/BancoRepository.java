package backend.sec.padrao.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import backend.sec.padrao.model.entidades.Banco;

@Repository
public interface BancoRepository extends JpaRepository<Banco, Long> {

	@Query("SELECT b FROM Banco b WHERE b.nome LIKE %?1%")
	List<Banco> findByNomeLike(String nome);

}
