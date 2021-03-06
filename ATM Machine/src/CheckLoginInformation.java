import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CheckLoginInformation {
	// Initialize variable
	static int loginAttempt = 3;
	
	//Checks user input against the name stored as Admin 
	public static Boolean checkUsername(String username){
		//String username = txtUsername.getText();
		//System.out.println(username);
		return (username.equals("Admin"));
	}
	
	// Checks user input against the password
	public static Boolean checkPassowd(String password){
		//String password = txtPassword.getText();
		//System.out.println(password);
		return password.equals("password");
	}
	
	static void loginAttempts(JTextField txtUsername, JTextField txtPassword, JFrame frame){
		while (loginAttempt != 0) {
			String username = txtUsername.getText();
			String password = txtPassword.getText();
			
			Boolean loginUser = checkUsername(username);
			Boolean loginPass = checkPassowd(password);
			
			//JOptionPane.showMessageDialog(null, loginUser);
			//JOptionPane.showMessageDialog(null, loginPass);
			
			if (loginUser && loginPass) {
				JOptionPane.showMessageDialog(null, "Login successful!");
				break;
			}
			else {
				loginAttempt--;
				System.out.println("Attempts Left: " + loginAttempt);
				JOptionPane.showMessageDialog(null, "Incorrect login or password...You have " + loginAttempt + " attempts left.");
				LoginScreen.main(null);
				
			}
			
			if (loginAttempt == 0) {
				JOptionPane.showMessageDialog(null, "Exiting program");
				CloseProgram.closeProgram(frame);
			}
		}
	}

}
