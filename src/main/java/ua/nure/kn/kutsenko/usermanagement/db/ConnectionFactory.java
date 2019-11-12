package ua.nure.kn.kutsenko.usermanagement.db;

import java.sql.Connection;

public interface ConnectionFactory {
	Connection createConnection() throws DatabaseException;
}
