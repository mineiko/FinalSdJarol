package app.repo;

import app.entidad.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RolesRepository extends CrudRepository<Role, Long> {
}
