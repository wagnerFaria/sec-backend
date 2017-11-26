package backend.sec.padrao.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import backend.sec.padrao.model.entidades.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {

}
