
public class Email {
	// Encapsulation: Make them all private so people can't access them when they're not supposed to
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String alternateEmail;
	private int mailboxCapacity;
	
	// Constructor to receive the first and last name,
	public Email(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	// Ask for the department
	void getDepartment(String department)
	{
		
	}
	
	// Generate a random password
	String generatePassword()
	{
		return "abc";
	}
	
	// Set the mailbox capacity
	int setMailboxCapacity()
	{
		return 0;
	}
	
	// Set the alternate email
	String setAlternateEmail(String altEmail)
	{
		return "abc";
	}
	
	// Change the password
	String changePassword()
	{
		return "abc";
	}
	
}
