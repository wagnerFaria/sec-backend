package backend.sec.padrao.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import backend.sec.padrao.model.entidades.Cnae22;

@Repository
public interface Cnae22Repository extends JpaRepository<Cnae22, Long> {

	@Query("SELECT c FROM Cnae22 c WHERE c.descSubclasse LIKE %?1%")
	List<Cnae22> findByDescSubclasse(String descSubclasse);

}
