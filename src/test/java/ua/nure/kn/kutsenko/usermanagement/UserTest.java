package ua.nure.kn.kutsenko.usermanagement;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.security.InvalidParameterException;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class UserTest extends TestCase {

	private User user;
	private Date dateOfBirth;
	
	public UserTest() {
	}
	
	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();
		user = new User();
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(1984, Calendar.MAY, 26);
		dateOfBirth = calendar.getTime();
	}

	@Test
	public void testGetFullName() {
		user.setFirstName("John");
		user.setLastName("Doe");
		assertEquals("Doe, John", user.getFullName());
		
	}
	
	@Test
	public void testGetAge() {
		user.setDateOfBirth(dateOfBirth);
		assertEquals(2019 - 1984, user.getAge());
	}
	
	@Test
	public void testSetFutureDOB() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.DATE, 5);
		
		assertThrows(InvalidParameterException.class, () -> {
			user.setDateOfBirth(calendar.getTime());
		});
	}
	
	@Test
	public void test() {
		
	}
}
