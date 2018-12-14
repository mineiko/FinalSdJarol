package app;
import app.entidad.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Access.class);
        config.exposeIdsFor(CopiesUser.class);
        config.exposeIdsFor(Copy.class);
        config.exposeIdsFor(Role.class);
        config.exposeIdsFor(User.class);
    }
}