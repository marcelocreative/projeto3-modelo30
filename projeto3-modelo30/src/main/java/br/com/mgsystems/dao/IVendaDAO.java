package br.com.mgsystems.dao;

import br.com.mgsystems.dao.generic.IGenericDAO;
import br.com.mgsystems.domain.Venda;
import br.com.mgsystems.exceptions.DAOException;
import br.com.mgsystems.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
