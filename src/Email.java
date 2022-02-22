import java.util.Scanner;

public class Email {
	// Encapsulation: Make them all private so people can't access them when they're not supposed to
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private String alternateEmail;
	private String companySuffix = "fakecompany.com";
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	
	// Constructor to receive the first and last name,
	public Email(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		
		// Call a method asking for the department, returns the department
		this.department = setDepartment();
		
		// Call a method that returns a random password
		this.password = generatePassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		// Combine elements to generate email
		this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	}
	
	// Ask for the department
	private String setDepartment()
	{
		System.out.print("Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department Code:\n");
		Scanner in = new Scanner(System.in);
		int departmentChoice = in.nextInt();
		
		if (departmentChoice == 1)
		{
			return "sales";
		}
		else if (departmentChoice == 2)
		{
			return "development";
		}
		else if (departmentChoice == 3)
		{
			return "accounting";
		}
		else
		{
			return "none";
		}
	}
	
	// Generate a random password
	private String generatePassword(int length)
	{
		// all the possibilities we can choose from for the password to be made up with. 
		// Basically, we'll choose random characters from this array of characters and mix them together into a password
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";
		char[] password = new char[length];
		
		for (int i = 0; i < length; i++)
		{
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		
		return new String(password);
	}
	
	/** SETTERS **/
	
	// Set the mailbox capacity
	public void setMailboxCapacity(int capacity)
	{
		this.mailboxCapacity = capacity;
	}
	
	// Set the alternate email
	public void setAlternateEmail(String altEmail)
	{
		this.alternateEmail = altEmail;
	}
	
	// Change the password
	public void changePassword(String newPassword)
	{
		this.password = newPassword;
	}
	
	/** GETTERS **/
	public int getMailboxCapacity() { return mailboxCapacity; }
	public String getAlternateEmail() { return alternateEmail; }
	public String getPassword() { return password; } // Probably not a good idea to have this method
	
	public String showInfo()
	{
		return "Display Name: " + firstName + " " + lastName + "\n" +
				"Company Email: " + email + "\n" +
				"Mailbox Capacity: " + mailboxCapacity + "mb";
	}
}
