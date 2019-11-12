package ua.nure.kn.kutsenko.usermanagement.db;

import java.util.Date;

import org.dbunit.DatabaseTestCase;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.nure.kn.kutsenko.usermanagement.User;

class HsqldbUserDaoTest extends DatabaseTestCase {

	private static final String lastName = "Doe";
	private static final String firstName = "John";
	private HsqldbUserDao dao;
	private ConnectionFactory connectionFactory;
	
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();
		dao = new HsqldbUserDao(connectionFactory);
	}

	@Test
	public void testCreate() throws DatabaseException {
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setDateOfBirth(new Date());
		
		assertNull(user.getId());
		try {
			User userToCheck = dao.create(user);
			assertNotNull(userToCheck);
			assertNotNull(userToCheck.getId());
			assertEquals(user.getFirstName(), userToCheck.getFirstName());
			assertEquals(user.getLastName(), userToCheck.getLastName());
			assertEquals(user.getDateOfBirth(), userToCheck.getDateOfBirth());
		} catch (DatabaseException e) {
			fail(e.toString());
		}
	}
	
	protected void tearDown()  throws Exception {
		super.tearDown();
	}

	@Override
	protected IDatabaseConnection getConnection() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected IDataSet getDataSet() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
