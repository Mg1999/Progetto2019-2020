package Adojamme;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField email_field_login;
	private JPasswordField password_Field_Login;
	int xx,xy;
	private Controllore controll;
	
	
	/**
	 * Launch the application.
	 */
//	public static void accediAccount() {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Login frame = new Login();
//					frame.setUndecorated(true);
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	

	/**
	 * Create the frame.
	 */
	public Login(Controllore ctrl) {
		controll = ctrl;
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 505);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				xx = arg0.getX();
				xy = arg0.getY();
			}
		});
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				int x = arg0.getXOnScreen();
				int y = arg0.getYOnScreen();
				Login.this.setLocation(x -xx, y-xy);
			}
		});
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 102, 51));
		panel.setBounds(0, 0, 363, 523);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/Images/Out-of-office.png")));
		lblNewLabel_2.setBounds(0, 0, 363, 236);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Accedi.....");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_3.setBounds(156, 268, 85, 22);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("....e raccontaci della");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_4.setBounds(26, 322, 193, 29);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("tua esperienza");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_5.setBackground(new Color(255, 255, 255));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(122, 380, 138, 22);
		panel.add(lblNewLabel_5);
		
		JLabel label_accedi_Login = new JLabel("Accedi");
		label_accedi_Login.setFont(new Font("Tahoma", Font.PLAIN, 21));
		label_accedi_Login.setForeground(new Color(0, 0, 0));
		label_accedi_Login.setBounds(595, 66, 61, 20);
		contentPane.add(label_accedi_Login);
		
		JLabel Label_email_login = new JLabel("E-mail");
		Label_email_login.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Label_email_login.setForeground(new Color(0, 0, 0));
		Label_email_login.setBounds(408, 149, 79, 20);
		contentPane.add(Label_email_login);
		
		email_field_login = new JTextField();
		email_field_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//user = email_field_login.getText();
			}
		});
		email_field_login.addKeyListener(new KeyAdapter() {
			
		});
		email_field_login.setBounds(519, 146, 206, 31);
		contentPane.add(email_field_login);
		email_field_login.setColumns(10);
		
		
		
		JLabel label_Password_Login = new JLabel("Password\r\n");
		label_Password_Login.setForeground(Color.BLACK);
		label_Password_Login.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_Password_Login.setBounds(408, 244, 79, 20);
		contentPane.add(label_Password_Login);
		
		password_Field_Login = new JPasswordField();
		password_Field_Login.setBounds(519, 241, 206, 31);
		contentPane.add(password_Field_Login);
		
		JLabel labelerror = new JLabel("");
		labelerror.setForeground(Color.RED);
		labelerror.setBounds(519, 302, 137, 14);
		contentPane.add(labelerror);
		
		
		
		JButton button_accedi_login = new JButton("Accedi");
		button_accedi_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String email = "AAAA";
				String email_giusta = "admin";
				String password = "AAAA";
				String password_giusta = "admin";
				// ... @ ... . ...
				email = email_field_login.getText();
				password = password_Field_Login.getText();
				
			if ((email.equalsIgnoreCase(email_giusta)) && ((password.equals(password_giusta)))) {
				controll.Log();
				setVisible(false);
			} else {
					labelerror.setText("e-mail o password errati, riprova");
			}	
						
				
				
				
			}
		});
		
		
		button_accedi_login.setBackground(new Color(51, 102, 51));
		button_accedi_login.setForeground(new Color(255, 255, 255));
		button_accedi_login.setBounds(519, 356, 206, 31);
		contentPane.add(button_accedi_login);
		
		JButton button_X_Login = new JButton("X");
		button_X_Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		button_X_Login.setBackground(Color.RED);
		button_X_Login.setForeground(new Color(255, 255, 255));
		button_X_Login.setBounds(795, 0, 50, 23);
		contentPane.add(button_X_Login);
		
		
	}
	
}
