package projetopooequipe.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class GerenciaConexaoSQLServer implements GerenciaConexao {

    private final String url;
    private final String user;
    private final String pass;
    private static GerenciaConexaoSQLServer instancia;

    private GerenciaConexaoSQLServer() {
        ResourceBundle rs = ResourceBundle.getBundle("projetopooequipe.util.banco");
        url = rs.getString("c1");
        user = rs.getString("c2");
        pass = rs.getString("c3");
    }

    public static GerenciaConexaoSQLServer getInstancia() {
        if (instancia == null) {
            instancia = new GerenciaConexaoSQLServer();
        }
        return instancia;
    }

    /**
     *
     * @return @throws ConexaoException
     */
    public Connection conectar() throws ConexaoException {
        Connection c;
        try {
            c = DriverManager.getConnection(url, user, pass);
            return c;
        } catch (SQLException e) {
            throw new ConexaoException(e);
        }
    }

    @Override
    public void desconectar(Connection c) throws ConexaoException {
        try {
            c.close();
        } catch (SQLException e) {
            throw new ConexaoException(e);
        }
    }

}
