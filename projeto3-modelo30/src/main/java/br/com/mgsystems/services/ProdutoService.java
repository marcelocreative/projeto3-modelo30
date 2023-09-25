package br.com.mgsystems.services;

import br.com.mgsystems.dao.IProdutoDAO;
import br.com.mgsystems.domain.Produto;
import br.com.mgsystems.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
