import javax.swing.JTextField;

public class CheckLoginInformation {
	
	// User will be asked to enter a username and password to log in to give access to rest of program
	// User will be allowed to enter a correct username and password 3 times before an error message will show and exit program
	
	public static Boolean checkUsername(JTextField txtUsername){
		String username = txtUsername.toString();
		
		//return (username == "Admin");
		return txtUsername.equals(username);
	}
	
	public static Boolean checkPassowd(JTextField txtPassword, JTextField txtUsername){
		String password = txtPassword.toString();
		
		return password == "password";
	}

}