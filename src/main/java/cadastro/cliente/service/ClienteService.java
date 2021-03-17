package cadastro.cliente.service;

import javax.inject.Inject;
import javax.inject.Singleton;

import cadastro.cliente.repository.ClienteEntityRepository;

@Singleton
public class ClienteService {
	
	
	@Inject
	private ClienteEntityRepository clienteRepository;

	public String consultar() {
		this.clienteRepository.findAll();
		return "consulta ainda não implementada";
	}
}
