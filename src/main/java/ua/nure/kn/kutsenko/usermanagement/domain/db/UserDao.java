package ua.nure.kn.kutsenko.usermanagement.domain.db;

import ua.nure.kn.kutsenko.usermanagement.domain.User;

import java.util.Collection;

interface UserDao {
	User create(User user) throws DatabaseException;

	void update(User user) throws DatabaseException;

	void delete(User user) throws DatabaseException;

	User find(Long id) throws DatabaseException;

	Collection findAll() throws DatabaseException;

	void setConnectionFactory(ConnectionFactory connectionFactory);
}
