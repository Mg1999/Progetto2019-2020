package Adojamme;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class RecensioneAttrazione extends JFrame {

	private JPanel contentPane;
	private JTextField txtTrova;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void recAttrazione() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecensioneAttrazione frame = new RecensioneAttrazione();
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
	public RecensioneAttrazione() {
		setTitle("Adojamme");
		setIconImage(Toolkit.getDefaultToolkit().getImage(RecensioneAttrazione.class.getResource("/Images/logohome.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1001, 623);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		txtTrova = new JTextField();
		txtTrova.setText("Trova");
		txtTrova.setForeground(new Color(204, 204, 204));
		txtTrova.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(RecensioneAttrazione.class.getResource("/Images/logohome.png")));
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(102, 102, 102));
		separator.setBackground(new Color(102, 102, 102));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		
		JButton btnNewButton = new JButton("Pubblica");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(51, 102, 51));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtTrova, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 121, Short.MAX_VALUE)
					.addGap(334)
					.addComponent(btnNewButton)
					.addGap(21))
				.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtTrova, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 501, GroupLayout.PREFERRED_SIZE)
					.addGap(30))
		);
		
		JLabel lblNewLabel_1 = new JLabel("Raccontaci la tua esperienza");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Titolo recensione");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Scrivi recensione");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblNewLabel_4 = new JLabel("Nota costruttiva");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nessuno", "1", "2", "3", "4", "5"}));
		
		JLabel lblNewLabel_5 = new JLabel("Allogio");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Nessuno", "1", "2", "3", "4", "5"}));
		
		JLabel lblServizio = new JLabel("Servizio");
		lblServizio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Nessuno", "1", "2", "3", "4", "5"}));
		
		JLabel lblQualitprezzo = new JLabel("Qualit\u00E0/prezzo");
		lblQualitprezzo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(386)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(396))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(68, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_4)
								.addComponent(lblNewLabel_3))
							.addGap(427))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(textField, Alignment.LEADING)
								.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
								.addComponent(lblNewLabel_2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblQualitprezzo)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addComponent(lblServizio)
									.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
										.addComponent(lblNewLabel_5)
										.addGap(66))))))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
							.addComponent(comboBox_1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(comboBox, 0, 127, Short.MAX_VALUE))
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
					.addGap(78))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1)
					.addGap(68)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_5))
							.addGap(50)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblServizio, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
							.addGap(52)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblQualitprezzo, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(27)
							.addComponent(lblNewLabel_3)
							.addGap(18)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
							.addGap(39)
							.addComponent(lblNewLabel_4)
							.addGap(18)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(38, Short.MAX_VALUE))
		);
		
		JTextPane textPane_1 = new JTextPane();
		scrollPane_1.setViewportView(textPane_1);
		
		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}

}
