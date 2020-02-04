package Adojamme;

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
	private JTextField textField_nome;
	private JTextField textField_Cognome;
	private JTextField textField_email;
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
		
		JLabel label_registrati_singUp = new JLabel("Registrati");
		label_registrati_singUp.setFont(new Font("Tahoma", Font.PLAIN, 21));
		label_registrati_singUp.setBounds(594, 80, 99, 21);
		contentPane.add(label_registrati_singUp);
		
		JLabel label_Nome = new JLabel("Nome");
		label_Nome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_Nome.setBounds(442, 162, 55, 14);
		contentPane.add(label_Nome);
		
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
		
		textField_nome = new JTextField();
		textField_nome.setBounds(553, 157, 235, 28);
		contentPane.add(textField_nome);
		textField_nome.setColumns(10);
		
		textField_Cognome = new JTextField();
		textField_Cognome.setColumns(10);
		textField_Cognome.setBounds(553, 212, 235, 28);
		contentPane.add(textField_Cognome);
		
		textField_email = new JTextField();
		textField_email.setColumns(10);
		textField_email.setBounds(553, 275, 235, 28);
		contentPane.add(textField_email);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(553, 333, 235, 28);
		contentPane.add(passwordField);
		
		JButton button_registrati = new JButton("Registrazione");
		button_registrati.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeLogRec.posthome();
				dispose();
			}
		});
		button_registrati.setForeground(new Color(255, 255, 255));
		button_registrati.setBackground(new Color(51, 102, 51));
		button_registrati.setBounds(553, 416, 235, 33);
		contentPane.add(button_registrati);
		
		JButton button_X = new JButton("X");
		button_X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_X.setForeground(Color.WHITE);
		button_X.setBackground(Color.RED);
		button_X.setBounds(855, 0, 50, 23);
		contentPane.add(button_X);
	}

}
