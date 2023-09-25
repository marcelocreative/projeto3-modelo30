package br.com.mgsystems.services;

import br.com.mgsystems.dao.IClienteDAO;
import br.com.mgsystems.domain.Cliente;
import br.com.mgsystems.exceptions.DAOException;
import br.com.mgsystems.exceptions.MaisDeUmRegistroException;
import br.com.mgsystems.exceptions.TableException;
import br.com.mgsystems.services.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


}
