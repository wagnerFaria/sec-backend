package backend.sec.padrao.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import backend.sec.padrao.model.entidades.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
