/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopooequipe.util;

import java.sql.Connection;

public interface GerenciaConexao {

    public Connection conectar() throws ConexaoException;

    public void desconectar(Connection c) throws ConexaoException;

}
