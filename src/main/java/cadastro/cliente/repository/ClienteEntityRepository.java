package cadastro.cliente.repository;

import cadastro.cliente.entity.ClienteEntity;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface ClienteEntityRepository extends CrudRepository<ClienteEntity, Long> {

}
