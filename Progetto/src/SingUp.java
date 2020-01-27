import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SingUp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	int xx, xy;

	/**
	 * Launch the application.
	 */
	public static void registraAccount() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SingUp frame = new SingUp();
					frame.setUndecorated(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SingUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 904, 576);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx = e.getX();
				xy = e.getY();
			}
		});
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				SingUp.this.setLocation(x - xx, y - xy);
			}
		});
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 102, 51));
		panel.setBounds(0, 0, 366, 600);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(SingUp.class.getResource("/Images/Out-of-office.png")));
		lblNewLabel.setBounds(0, 0, 366, 257);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("Benvenuto.....");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_4.setBounds(107, 316, 129, 22);
		panel.add(lblNewLabel_4);
		
		JLabel lblraccontaciLaTua = new JLabel("....raccontaci la tua esperienza.");
		lblraccontaciLaTua.setForeground(Color.WHITE);
		lblraccontaciLaTua.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblraccontaciLaTua.setBounds(21, 384, 298, 22);
		panel.add(lblraccontaciLaTua);
		
		JLabel lblNewLabel_1 = new JLabel("Registrati");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_1.setBounds(594, 80, 99, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(442, 162, 55, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblCognome = new JLabel("Cognome");
		lblCognome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCognome.setBounds(442, 219, 75, 21);
		contentPane.add(lblCognome);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmail.setBounds(442, 280, 55, 14);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword.setBounds(442, 335, 75, 21);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(553, 157, 235, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(553, 212, 235, 28);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(553, 275, 235, 28);
		contentPane.add(textField_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(553, 333, 235, 28);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Registrazione");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(51, 102, 51));
		btnNewButton.setBounds(553, 416, 235, 33);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("X");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(Color.RED);
		button.setBounds(855, 0, 50, 23);
		contentPane.add(button);
	}

}
