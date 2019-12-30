package ua.nure.kn.kutsenko.db;

import java.sql.SQLException;

class DataBaseException extends Exception {

    public DataBaseException(SQLException e) {
        super(e);
    }

    public DataBaseException(String s) {
        super(s);
    }
}