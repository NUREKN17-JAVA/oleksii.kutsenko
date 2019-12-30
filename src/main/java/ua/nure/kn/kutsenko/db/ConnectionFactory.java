package ua.nure.kn.kutsenko.db;
import java.sql.Connection;

public interface ConnectionFactory {
    Connection createConnection() throws DataBaseException;
}
