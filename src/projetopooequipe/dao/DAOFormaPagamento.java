/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopooequipe.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import projetopooequipe.basica.FormaPagamento;
import projetopooequipe.util.ConexaoException;

/**
 *
 * @author petrusdemelo
 */
public interface DAOFormaPagamento {

    public void incluir(FormaPagamento f) throws DAOException, ConexaoException;

    /**
     *
     * @param id
     * @return
     * @throws DAOException
     * @throws ConexaoException
     */
    public FormaPagamento consultar(Integer id) throws DAOException, ConexaoException;

    public FormaPagamento consultar(String descricao) throws DAOException, ConexaoException;

    public void atualizar(FormaPagamento f) throws DAOException, ConexaoException;

    public void deletar(Integer id) throws DAOException, ConexaoException;

    public ArrayList<FormaPagamento> listar() throws DAOException, ConexaoException;

}
