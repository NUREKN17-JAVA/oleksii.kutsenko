package ua.nure.kn.kutsenko.usermanagement.domain.db;

import java.sql.Connection;

public interface ConnectionFactory {
	Connection createConnection() throws DatabaseException;
}
