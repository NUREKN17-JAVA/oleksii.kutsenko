package ua.nure.kn.kutsenko.usermanagement;

import java.security.InvalidParameterException;
import java.util.Calendar;
import java.util.Date;

public class User {
	private Long id;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		if ((new Date()).compareTo(dateOfBirth) < 0) {
			throw new InvalidParameterException("Date of birth cann\'t be greater than today");
		}
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getFullName() {
		return getLastName() + ", " + getFirstName();
	}
	
	public int getAge() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		int currentYear = calendar.get(Calendar.YEAR);
		
		calendar.setTime(getDateOfBirth());
		int year = calendar.get(Calendar.YEAR);
		return currentYear - year;
	}
	
}
