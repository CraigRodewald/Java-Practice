import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginClass {

	private JFrame frame;
	private JTextField txtPassword;
	private JTextField txtUsername;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginClass window = new LoginClass();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Boolean loginUser = CheckLoginInformation.checkUsername(txtUsername);
				Boolean loginPass = CheckLoginInformation.checkPassowd(txtPassword, txtUsername);
				
				JOptionPane.showMessageDialog(null, loginUser);
				JOptionPane.showMessageDialog(null, loginPass);
			}
		});
		btnLogin.setBounds(171, 191, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(190, 144, 127, 20);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setToolTipText("");
		txtUsername.setBounds(190, 110, 127, 20);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(111, 113, 69, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(111, 147, 69, 14);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblTriggerplz = new JLabel("TriggerPLZ Bank");
		lblTriggerplz.setFont(new Font("Coolvetica Rg", Font.PLAIN, 25));
		lblTriggerplz.setBounds(134, 25, 172, 54);
		frame.getContentPane().add(lblTriggerplz);
	}
}