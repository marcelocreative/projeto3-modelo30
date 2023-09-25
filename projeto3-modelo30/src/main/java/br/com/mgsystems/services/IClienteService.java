package br.com.mgsystems.services;

import br.com.mgsystems.domain.Cliente;
import br.com.mgsystems.exceptions.DAOException;
import br.com.mgsystems.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

}
