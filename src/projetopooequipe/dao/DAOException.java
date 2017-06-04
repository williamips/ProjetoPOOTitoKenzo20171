/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopooequipe.dao;

import java.sql.SQLException;

/**
 *
 * @author petrusdemelo
 */
class DAOException extends Exception {

    public DAOException() {

    }

    public DAOException(String e) {
        super(e);
    }

    public DAOException(SQLException e) {
        super(e);
    }

    public DAOException(Exception e) {
        super(e);
    }
}
