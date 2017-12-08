package backend.sec.fco.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import backend.sec.fco.model.entidades.FonteRecurso;

@Repository
public interface FonteRecursoRepository extends JpaRepository<FonteRecurso, Long> {

}
