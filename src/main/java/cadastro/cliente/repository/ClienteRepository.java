package cadastro.cliente.repository;

import java.util.List;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cadastro.cliente.entity.ClienteEntity;
import io.micronaut.transaction.annotation.TransactionalAdvice;

@Singleton
public class ClienteRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public ClienteRepository(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@TransactionalAdvice
	public List<ClienteEntity> listar() {
		return this.entityManager.createQuery("Select cliente FROM ClienteEntity cliente", ClienteEntity.class).getResultList();
	}
}
