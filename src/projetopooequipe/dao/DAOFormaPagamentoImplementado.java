/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopooequipe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import projetopooequipe.basica.FormaPagamento;
import projetopooequipe.util.ConexaoException;
import projetopooequipe.util.GerenciaConexao;

/**
 *
 * @author petrusdemelo
 */
public class DAOFormaPagamentoImplementado implements DAOFormaPagamento {

    private GerenciaConexao g;

    @Override
    public void incluir(FormaPagamento f) throws DAOException, ConexaoException {
        Connection c = g.conectar();
        String sql = "INSERT INTO FormaPagamento (descricao) values (?)";
        try {
            PreparedStatement pstm = c.prepareStatement(sql);
            pstm.setString(1, f.getDescricao());
            pstm.executeUpdate();
        } catch (SQLException e) {
            throw new DAOException();
        } finally {
            g.desconectar(c);
        }
    }

    @Override
    public FormaPagamento consultar(Integer id) throws DAOException, ConexaoException {
        Connection c = g.conectar();
        String sql = "SELECT * FROM FormaPagamento where id = ?";
        FormaPagamento fp = null;
        try {
            PreparedStatement pstm = c.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet result = pstm.executeQuery();
            if (result.next()) {
                fp = new FormaPagamento();
                fp.setId(result.getInt("id"));
                fp.setDescricao(result.getString("descricao"));
            }
            return fp;
        } catch (SQLException e) {
            throw new DAOException();
        } finally {
            g.desconectar(c);
        }
    }

    @Override
    public FormaPagamento consultar(String descricao) throws DAOException, ConexaoException {
        Connection c = g.conectar();
        String sql = "SELECT * FROM FormaPagamento where descricao = ?";
        FormaPagamento fp = null;
        try {
            PreparedStatement pstm = c.prepareStatement(sql);
            pstm.setString(1, descricao);
            ResultSet result = pstm.executeQuery();
            if (result.next()) {
                fp = new FormaPagamento();
                fp.setId(result.getInt("id"));
                fp.setDescricao(result.getString("descricao"));
            }
            return fp;
        } catch (SQLException e) {
            throw new DAOException();
        } finally {
            g.desconectar(c);
        }
    }

    @Override
    public void atualizar(FormaPagamento f) throws DAOException, ConexaoException {
        Connection c = g.conectar();
        String sql = "UPDATE FormaPagamento SET descricao = ? WHERE id = ?";
        try {
            PreparedStatement pstm = c.prepareStatement(sql);
            pstm.setString(1, f.getDescricao());
            pstm.setInt(2, f.getId());
            pstm.executeUpdate();
        } catch (SQLException e) {
            throw new DAOException();
        } finally {
            g.desconectar(c);
        }
    }

    @Override
    public void deletar(Integer id) throws DAOException, ConexaoException {
        Connection c = g.conectar();
        String sql = "DELETE from FormaPagamento WHERE id = ?";
        try {
            PreparedStatement pstm = c.prepareStatement(sql);
            pstm.setInt(1, id);
            pstm.executeUpdate();
        } catch (SQLException e) {
            throw new DAOException();
        } finally {
            g.desconectar(c);
        }
    }

    @Override
    public ArrayList<FormaPagamento> listar() throws DAOException, ConexaoException {
        Connection c = g.conectar();
        String sql = "SELECT * FROM FormaPagamento;";
        ArrayList<FormaPagamento> lista = new ArrayList();
        FormaPagamento fp;
        try {
            Statement stm = c.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()) {
                fp = new FormaPagamento();
                fp.setDescricao(rs.getString("descricao"));
                fp.setId(rs.getInt("id"));
                lista.add(fp);
            }
            return lista;
        } catch (SQLException e) {
            throw new DAOException(e);
        } finally {
            g.desconectar(c);
        }
    }

}
