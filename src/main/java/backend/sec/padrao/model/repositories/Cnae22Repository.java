package backend.sec.padrao.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import backend.sec.padrao.model.entidades.Cnae22;

@Repository
public interface Cnae22Repository extends JpaRepository<Cnae22, Long> {

}
