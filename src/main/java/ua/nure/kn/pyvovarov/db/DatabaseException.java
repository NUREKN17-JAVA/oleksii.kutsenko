package ua.nure.kn.susidskyi.db;

import java.sql.SQLException;

public class DataBaseException extends Exception {

    public DataBaseException(SQLException e) {
        super(e);
    }

    public DataBaseException(String s) {
        super(s);
    }
}