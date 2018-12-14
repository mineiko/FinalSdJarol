package app.repo;

import app.entidad.Access;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AccessRepository extends CrudRepository<Access, Long> {

}
