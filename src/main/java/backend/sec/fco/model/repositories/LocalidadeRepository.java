package backend.sec.fco.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import backend.sec.fco.model.entidades.Localidade;

@Repository
public interface LocalidadeRepository extends JpaRepository<Localidade, Long> {

}
