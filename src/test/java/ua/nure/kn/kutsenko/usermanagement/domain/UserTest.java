package ua.nure.kn.kutsenko.usermanagement.domain;

import junit.framework.TestCase;

import java.util.Calendar;

public class UserTest extends TestCase {

	private static final int DAY_OF_BIRTH = 13;
	private static final int DAY_OF_BIRTH_1 = 17;
	private static final int DAY_OF_BIRTH_2 = 1;
	private static final int DAY_OF_BIRTH_3 = 20;

	private static final int MONTH_OF_BIRTH = Calendar.MAY;
	private static final int YEAR_OF_BIRTH = 2000;
	private static final int ETHALON_AGE = 19;

	private static final int MONTH_OF_BIRTH_1 = Calendar.SEPTEMBER;
	private static final int YEAR_OF_BIRTH_1 = 1999;
	private static final int ETHALON_AGE_1 = 20;


	private static final int MONTH_OF_BIRTH_2 = Calendar.OCTOBER;
	private static final int ETHALON_AGE_3 = 18;


	private User user;

	// Test #1 User's full name
	public void testGetFullName() {
		user.setFirstName("John");
		user.setLastName("Doe");
		assertEquals("Doe, John", user.getFullName());
	}
	// Test #2 Getting age
	public void testGetAge() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH, DAY_OF_BIRTH);
		user.setDateOfBirth(calendar.getTime());
		assertEquals(ETHALON_AGE, user.getAge());
	}
	// Test #3 Getting age if birthday is later than now
	public void testGetAge1() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(YEAR_OF_BIRTH_1, MONTH_OF_BIRTH_1, DAY_OF_BIRTH);
		user.setDateOfBirth(calendar.getTime());
		assertEquals(ETHALON_AGE_1, user.getAge());
	}
	//Test #4 Getting age if birthday is today
	public void testGetAgeToday() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH_2, DAY_OF_BIRTH_1);
		user.setDateOfBirth(calendar.getTime());
		assertEquals(ETHALON_AGE, user.getAge());
	}
	//Test #5 Getting age if birthday in this month but earlier then now
	public void testGetAgeDayBefore() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH_2, DAY_OF_BIRTH_2);
		user.setDateOfBirth(calendar.getTime());
		assertEquals(ETHALON_AGE, user.getAge());
	}
	// Test #6 Getting age if birthday in this month and later
	public void testGetAgeDayAfter() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH_2, DAY_OF_BIRTH_3);
		user.setDateOfBirth(calendar.getTime());
		assertEquals(ETHALON_AGE, user.getAge());
	}
	protected void setUp() throws Exception {
		super.setUp();
		user = new User();
	}
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}