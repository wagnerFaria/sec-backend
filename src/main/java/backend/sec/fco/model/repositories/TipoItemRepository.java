package backend.sec.fco.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import backend.sec.fco.model.entidades.TipoItem;

@Repository
public interface TipoItemRepository extends JpaRepository<TipoItem, Long> {

}
