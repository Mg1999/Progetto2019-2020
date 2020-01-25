import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.Toolkit;
import javax.swing.JButton;

public class SingUP extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	int pos_x=0;
	int pos_y=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SingUP frame = new SingUP();
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
	public SingUP() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SingUP.class.getResource("/Images/Logo.png")));
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 592);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {

				pos_x = e.getX();
				pos_y = e.getY();
			}
		});
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {

				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				SingUP.this.setLocation(x - pos_x, y -pos_y);
			}
		});
		contentPane.setBackground(new Color(102, 102, 102));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 102, 51));
		panel.setBounds(0, 0, 401, 593);
		contentPane.add(panel);
		panel.setLayout(null);
		JLabel lblNewLabel_2 = new JLabel("");
		
		
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
			
				
				pos_x = e.getX();
				pos_y = e.getY();
			}
		});
		lblNewLabel_2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				
				int x = arg0.getXOnScreen();
				int y = arg0.getYOnScreen();
				SingUP.this.setLocation(x - pos_x, y -pos_y);
			}
		});
		
		
		lblNewLabel_2.setIcon(new ImageIcon(SingUP.class.getResource("/Images/Out-of-office.png")));
		lblNewLabel_2.setBounds(0, 0, 401, 267);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Benvenuto.....");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(139, 327, 171, 29);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("....Aiutaci con le tue eperienza!");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_4.setBounds(28, 398, 343, 35);
		panel.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(526, 156, 276, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(423, 158, 77, 24);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(526, 229, 276, 33);
		contentPane.add(textField_1);
		
		JLabel lblCognome = new JLabel("Cognome");
		lblCognome.setForeground(Color.WHITE);
		lblCognome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCognome.setBounds(423, 231, 77, 24);
		contentPane.add(lblCognome);
		
		JLabel lblOassword = new JLabel("E-mail");
		lblOassword.setForeground(Color.WHITE);
		lblOassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblOassword.setBounds(423, 299, 84, 24);
		contentPane.add(lblOassword);
		
		JLabel lblNewLabel_1 = new JLabel("    Crea il tuo Account");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(531, 62, 322, 48);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword.setBounds(423, 367, 77, 24);
		contentPane.add(lblPassword);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(526, 297, 276, 33);
		contentPane.add(textField_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(526, 365, 276, 33);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_5 = new JLabel("X");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setBounds(825, 11, 28, 18);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("REGISTRATI");
		btnNewButton.setBackground(new Color(51, 102, 51));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(526, 449, 276, 33);
		contentPane.add(btnNewButton);
	}
}
