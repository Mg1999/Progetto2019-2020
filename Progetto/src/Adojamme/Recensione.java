package Adojamme;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
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
import javax.swing.JTextArea;

public class Recensione extends JFrame {

	private JPanel contentPane;
	private JTextField titoloRecensione;
	int xx ,xy;
	private Controllore controllore_recensione;
	

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("rawtypes")
	public Recensione(Controllore ctrl) {
		controllore_recensione = ctrl;
		setUndecorated(true);
		setTitle("Adojamme");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Recensione.class.getResource("/Images/logohome.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(180, 195, 996, 606);
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
		
		titoloRecensione = new JTextField();
		titoloRecensione.setBounds(65, 122, 296, 23);
		titoloRecensione.setColumns(10);
		
		String titolo = (String)titoloRecensione.getText();
		
		JLabel lblNewLabel_3 = new JLabel("Scrivi la tua recensione");
		lblNewLabel_3.setBounds(65, 232, 156, 17);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(65, 267, 296, 86);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(149, 11, 0, 82);
		
		@SuppressWarnings("rawtypes")
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(735, 266, 146, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nessuno", "1", "2", "3", "4", "5"}));
		
		JLabel lblSelezione = new JLabel("da selezionare");
		lblSelezione.setBounds(571, 266, 96, 17);
		lblSelezione.setFont(new Font("Tahoma", Font.PLAIN, 14));
		@SuppressWarnings("rawtypes")
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(735, 336, 146, 20);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Nessuno", "1", "2", "3", "4", "5"}));
		
		JLabel lblServizio = new JLabel("Servizio");
		lblServizio.setBounds(571, 336, 46, 17);
		lblServizio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		@SuppressWarnings("rawtypes")
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(735, 410, 146, 20);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		
		JLabel lblQualitprezzo = new JLabel("Qualit\u00E0/prezzo");
		lblQualitprezzo.setBounds(571, 410, 86, 17);
		lblQualitprezzo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Pannel_tipo_recensione.setLayout(null);
		Pannel_tipo_recensione.add(separator_1);
		Pannel_tipo_recensione.add(lblNewLabel_1);
		Pannel_tipo_recensione.add(titoloRecensione);
		Pannel_tipo_recensione.add(scrollPane);
		
		JTextArea testo_r = new JTextArea();
		scrollPane.setViewportView(testo_r);
		Pannel_tipo_recensione.add(lblSelezione);
		Pannel_tipo_recensione.add(lblServizio);
		Pannel_tipo_recensione.add(lblQualitprezzo);
		Pannel_tipo_recensione.add(comboBox_1);
		Pannel_tipo_recensione.add(comboBox);
		Pannel_tipo_recensione.add(comboBox_2);
		Pannel_tipo_recensione.add(lblNewLabel_3);
		Pannel_tipo_recensione.add(lblNewLabel_2);
		contentPane.setLayout(null);
		contentPane.add(separator);
		contentPane.add(lblNewLabel);
		contentPane.add(Pannel_tipo_recensione);
		
		String testoRecensione = (String)testo_r.getText();
		
		String[] tipologia = {"Seleziona", "Allogio", "Attrazione", "Ristorante"};
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(735, 183, 146, 20);
		Pannel_tipo_recensione.add(comboBox_4);
		
		JComboBox comboBox_3 = new JComboBox(tipologia);
		comboBox_3.setBounds(735, 110, 146, 20);
		Pannel_tipo_recensione.add(comboBox_3);
		comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = (String)comboBox_3.getSelectedItem();
				if (name == tipologia[1]) {
					
					comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Seleziona", "Bed&Breakfast", "Ostello", "CasaVacanze", "Hotel"}));
					lblSelezione.setText("Allogio");
				}else if (name == tipologia[2]) {
					
					comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Seleziona","Parco a Tema", "Luogo Storico", "Museo", "Sito Archeologico"}));
					lblSelezione.setText("Attrazione");
					}
					else if(name == tipologia[3]){
						comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Seleziona", "Tosteria", "Paninoteca", "Enoteca", "Pizzeria", "Braceria"}));
						lblSelezione.setText("Cucina");
					}
					
			}
		});
		@SuppressWarnings("unused")
		String name = (String)comboBox_3.getSelectedItem();
	
		JLabel lblNewLabel_6 = new JLabel("Tipo di recensione");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setBounds(571, 111, 123, 17);
		Pannel_tipo_recensione.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("Tipologia");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(571, 186, 75, 14);
		Pannel_tipo_recensione.add(lblNewLabel_5);
		
		JButton bottoneVedi = new JButton("Vedi");
		bottoneVedi.setForeground(new Color(255, 255, 255));
		bottoneVedi.setBackground(new Color(51, 102, 51));
		bottoneVedi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name_tip = (String)comboBox_4.getSelectedItem();
				Db.tipologia_strutture = name_tip;
				if (( name_tip == tipologia[0])||(name_tip == null)) {
					controllore_recensione.errore_inserimento();
					
			}else {
				controllore_recensione.view();
				}
				
		}
		});
		bottoneVedi.setBounds(891, 182, 69, 23);
		Pannel_tipo_recensione.add(bottoneVedi);
		
		JLabel avvisoErrore = new JLabel("");
		avvisoErrore.setForeground(Color.RED);
		avvisoErrore.setBounds(65, 413, 313, 14);
		Pannel_tipo_recensione.add(avvisoErrore);
		
		
		
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String titolo = (String)titoloRecensione.getText();
				String testo = (String)testo_r.getText();
				String tipologia = (String)comboBox_4.getSelectedItem();
				String servizio = (String)comboBox_1.getSelectedItem();
				String qualita= (String)comboBox_2.getSelectedItem();
				String selezionare = (String)comboBox.getSelectedItem();
				Db database =new Db();
				database.connect();
				String id_struttura = Db.id_struttura;
				String id_recensore = database.postControllRecensione();
				int recensione_check = database.cercarecenioni(id_recensore, id_struttura);
				if(recensione_check == 1) {
					avvisoErrore.setText("recensione già effettuata");
				}
				else {
					database.postaRecensioneQuery( titolo, testo, tipologia, servizio, qualita, selezionare);
					controllore_recensione.Log();
					setVisible(false);
					titoloRecensione.setText("");
					testo_r.setText("");
					comboBox_4.setSelectedIndex(0);
					comboBox_1.setSelectedIndex(0);
					comboBox_2.setSelectedIndex(0);
					comboBox.setSelectedIndex(0);
				}
				
			}
		});
		btnNewButton.setBounds(884, 533, 86, 23);
		contentPane.add(btnNewButton);
		btnNewButton.setBackground(new Color(51, 102, 51));
		btnNewButton.setForeground(new Color(255, 255, 255));
		
	}
	
}
