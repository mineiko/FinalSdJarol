package app.repo;

import app.entidad.Copy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CopiesRepository extends CrudRepository<Copy, Long> {
}
