package ua.nure.kn.kutsenko.usermanagement.db;

import java.util.Collection;

import ua.nure.kn.kutsenko.usermanagement.User;

public class HsqldbUserDao implements Dao<User> {

	ConnectionFactory connectionFactory;
	
	public HsqldbUserDao(ConnectionFactory connectionFactory) {
		this.connectionFactory = connectionFactory;
	}
	
	@Override
	public User create(User entity) throws DatabaseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(User entity) throws DatabaseException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User entity) throws DatabaseException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User find(Long id) throws DatabaseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<User> findAll() throws DatabaseException {
		// TODO Auto-generated method stub
		return null;
	}

}
