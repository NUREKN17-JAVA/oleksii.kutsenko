package ua.nure.kn.kutsenko.db;

import junit.framework.TestCase;

public class DaoFactoryTest extends TestCase {

	public void testGetUserDao() {
			try {
				DaoFactory daoFactory = DaoFactory.getInstance();
				assertNotNull("DaoFactory instance is null", daoFactory);
				Dao Dao = daoFactory.getUserDao();
				assertNotNull("Dao<User> is null", Dao);
			} catch (RuntimeException e) {
				e.printStackTrace();
				fail(e.toString());
			}
	}

}
