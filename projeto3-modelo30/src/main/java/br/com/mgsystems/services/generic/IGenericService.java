package br.com.mgsystems.services.generic;

import java.io.Serializable;
import java.util.Collection;

import br.com.mgsystems.dao.Persistente;
import br.com.mgsystems.exceptions.DAOException;
import br.com.mgsystems.exceptions.TipoChaveNaoEncontradaException;

public interface IGenericService <T extends Persistente, E extends Serializable> {
	
	/**
     * M�todo para cadastrar novos registro no banco de dados
     *
     * @param entity a ser cadastrado
     * @return retorna verdadeiro para cadastrado e falso para n�o cadastrado
	 * @throws DAOException 
     */
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    /**
     * M�todo para excluir um registro do banco de dados
     *
     * @param valor chave �nica do dado a ser exclus�o
     * @throws DAOException 
     */
    public void excluir(E valor) throws DAOException;

    /**
     *M�todo para alterar um registro no bando de dados.
     *
     * @param entity a ser atualizado
     * @throws DAOException 
     */
    public void alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    /**
     * M�todo para consultar um registro no banco de dados
     *
     * @param valor chave �nica do dado a ser consultado
     * @return
     * @throws DAOException 
     */
    public T consultar(E valor) throws DAOException;

    /**
     * M�todo que ir� retornar todos os registros do banco de dados de uma determinado dado ou tabela
     *
     * @return Registros encontrados
     * @throws DAOException 
     */
    public Collection<T> buscarTodos() throws DAOException;

}
