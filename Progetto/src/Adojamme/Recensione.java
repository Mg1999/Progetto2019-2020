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
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class Recensione extends JFrame {

	private JPanel contentPane;
	private JTextField txtTrova;
	private JTextField textField;
	int xx ,xy;
	private Controllore controllore_recensione;

	/**
	 * Launch the application.
	 */
//	public static void RecAllogio() {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					RecensioneAllogio frame = new RecensioneAllogio();
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
	public Recensione(Controllore ctrl) {
		controllore_recensione = ctrl;
		setTitle("Adojamme");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Recensione.class.getResource("/Images/logohome.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 996, 606);
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
				Recensione.this.setLocation(x -xx, y-xy);
			}
		});
		contentPane.setBackground(new Color(102, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		txtTrova = new JTextField();
		txtTrova.setBounds(15, 16, 159, 20);
		txtTrova.setText("Trova");
		txtTrova.setForeground(new Color(204, 204, 204));
		txtTrova.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(429, 16, 139, 25);
		lblNewLabel.setIcon(new ImageIcon(Recensione.class.getResource("/Images/logohome.png")));
		
		JPanel Pannel_tipo_recensione = new JPanel();
		Pannel_tipo_recensione.setBounds(5, 59, 970, 468);
		Pannel_tipo_recensione.setBackground(new Color(255, 255, 255));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(180, 16, 245, 2);
		separator.setForeground(new Color(102, 102, 102));
		separator.setBackground(new Color(102, 102, 102));
		
		JLabel lblNewLabel_1 = new JLabel("Raccontaci la tua esperienza");
		lblNewLabel_1.setBounds(382, 32, 234, 20);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_2 = new JLabel("Titolo della recensione");
		lblNewLabel_2.setBounds(65, 99, 152, 17);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textField = new JTextField();
		textField.setBounds(65, 122, 296, 20);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Scrivi la tua recensione");
		lblNewLabel_3.setBounds(65, 160, 156, 17);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(65, 195, 296, 86);
		
		JLabel lblNewLabel_4 = new JLabel("Nota costruttiva");
		lblNewLabel_4.setBounds(65, 308, 113, 17);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(65, 343, 297, 87);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(149, 11, 0, 82);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(793, 266, 146, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nessuno", "1", "2", "3", "4", "5"}));
		
		JLabel lblSelezione = new JLabel("da selezionare");
		lblSelezione.setBounds(635, 266, 96, 17);
		lblSelezione.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(793, 336, 146, 20);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Nessuno", "1", "2", "3", "4", "5"}));
		
		JLabel lblServizio = new JLabel("Servizio");
		lblServizio.setBounds(635, 336, 46, 17);
		lblServizio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(793, 410, 146, 20);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Nessuno", "1", "2", "3", "4", "5"}));
		
		JLabel lblQualitprezzo = new JLabel("Qualit\u00E0/prezzo");
		lblQualitprezzo.setBounds(635, 410, 86, 17);
		lblQualitprezzo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JTextPane textPane_1 = new JTextPane();
		scrollPane_1.setViewportView(textPane_1);
		
		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		Pannel_tipo_recensione.setLayout(null);
		Pannel_tipo_recensione.add(separator_1);
		Pannel_tipo_recensione.add(lblNewLabel_1);
		Pannel_tipo_recensione.add(textField);
		Pannel_tipo_recensione.add(scrollPane);
		Pannel_tipo_recensione.add(lblSelezione);
		Pannel_tipo_recensione.add(lblServizio);
		Pannel_tipo_recensione.add(lblQualitprezzo);
		Pannel_tipo_recensione.add(comboBox_1);
		Pannel_tipo_recensione.add(comboBox);
		Pannel_tipo_recensione.add(comboBox_2);
		Pannel_tipo_recensione.add(scrollPane_1);
		Pannel_tipo_recensione.add(lblNewLabel_3);
		Pannel_tipo_recensione.add(lblNewLabel_4);
		Pannel_tipo_recensione.add(lblNewLabel_2);
		contentPane.setLayout(null);
		contentPane.add(txtTrova);
		contentPane.add(separator);
		contentPane.add(lblNewLabel);
		contentPane.add(Pannel_tipo_recensione);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Seleziona", "Allogio", "Attrazione", "Ristorante"}));
		comboBox_3.setBounds(793, 110, 146, 20);
		Pannel_tipo_recensione.add(comboBox_3);
		
		JLabel lblNewLabel_6 = new JLabel("Tipo di recensione");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setBounds(635, 111, 123, 17);
		Pannel_tipo_recensione.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("Tipologia");
		lblNewLabel_5.setBounds(635, 186, 75, 14);
		Pannel_tipo_recensione.add(lblNewLabel_5);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(793, 183, 146, 20);
		Pannel_tipo_recensione.add(comboBox_4);
		
		JButton btnNewButton_1 = new JButton("X");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(930, 0, 50, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Pubblica");
		btnNewButton.setBounds(884, 533, 86, 23);
		contentPane.add(btnNewButton);
		btnNewButton.setBackground(new Color(51, 102, 51));
		btnNewButton.setForeground(new Color(255, 255, 255));
	}
}
