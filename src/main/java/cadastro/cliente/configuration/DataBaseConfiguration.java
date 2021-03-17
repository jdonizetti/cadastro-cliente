package cadastro.cliente.configuration;

import javax.persistence.EntityManager;

import io.micronaut.context.annotation.Factory;

@Factory
public class DataBaseConfiguration {

	
	public EntityManager getEntityManager() {
		return null;
	}
}
