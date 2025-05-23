package bts.sio.api.repository;

import bts.sio.api.model.Entreprise;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrepriseRepository  extends CrudRepository<Entreprise, Long> {
}
