package cadastro.cliente.controller;

import javax.inject.Inject;

import cadastro.cliente.service.ClienteService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("cliente")
public class ClienteController {
	
	@Inject
	private ClienteService clienteService;
	
	@Get(processes = MediaType.TEXT_PLAIN)
	public String listar() {
		return this.clienteService.consultar();
	}

}
