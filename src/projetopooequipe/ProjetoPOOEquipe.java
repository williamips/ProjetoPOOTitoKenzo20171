/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopooequipe;

import java.sql.Connection;
import projetopooequipe.util.ConexaoException;
import projetopooequipe.util.GerenciaConexao;
import projetopooequipe.util.GerenciaConexaoSQLServer;

/**
 *
 * @author petrusdemelo
 */
public class ProjetoPOOEquipe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testaconexao();
        //testaInclusao();
    }

    private static void testaconexao() {
        GerenciaConexao g = GerenciaConexaoSQLServer.getInstancia();
        try {
            Connection c = g.conectar();
            g.desconectar(c);
            System.out.println("funcionou!");
        } catch (ConexaoException e) {
            System.out.println("DEU ERRO!");
        }
    }

}
