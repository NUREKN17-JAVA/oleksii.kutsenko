package ua.nure.kn.kutsenko.usermanagement.db;

import java.util.Collection;

import ua.nure.kn.kutsenko.usermanagement.User;

public interface UserDao {
	User create(User entity) throws DatabaseException;
	
	void update(User entity) throws DatabaseException;
	
	void delete(User entity) throws DatabaseException;
	
	User find(Long id) throws DatabaseException;
	
	Collection<User> findAll() throws DatabaseException;
}
