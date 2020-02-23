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

public class PostStruttura extends JFrame {

	private JPanel contentPane;
	private JTextField nomeStruttura;
	int xx, xy;
	private Controllore controllore_recensione;
	private JTextField textField_Indirizzo;

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("rawtypes")
	public PostStruttura(Controllore ctrl) {
		controllore_recensione = ctrl;
		setUndecorated(true);
		setTitle("Adojamme");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Recensione.class.getResource("/Images/logohome.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 105, 996, 606);
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
				PostStruttura.this.setLocation(x - xx, y - xy);
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

		JLabel lblStrutturaTitolo = new JLabel("Inserisci la tua struttura");
		lblStrutturaTitolo.setBounds(382, 32, 234, 20);
		lblStrutturaTitolo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblStrutturaTitolo.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblNome = new JLabel("Nome struttura");
		lblNome.setBounds(65, 99, 152, 17);
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 14));

		nomeStruttura = new JTextField();
		nomeStruttura.setBounds(65, 122, 296, 23);
		nomeStruttura.setColumns(10);

		String titolo = (String) nomeStruttura.getText();

		JLabel lblDescrizione = new JLabel("Descrizione");
		lblDescrizione.setBounds(65, 232, 156, 17);
		lblDescrizione.setFont(new Font("Tahoma", Font.BOLD, 14));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(65, 267, 296, 86);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(149, 11, 0, 82);

		@SuppressWarnings("rawtypes")
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(735, 266, 146, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Nessuno", "Pizzeria", "Braceria", "Enoteca",
				"Paninoteca", "Agriturismo", "Tosteria" }));

		JLabel lblTipologia2 = new JLabel("");
		lblTipologia2.setBounds(571, 266, 96, 17);
		lblTipologia2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		@SuppressWarnings("rawtypes")
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(735, 336, 146, 20);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "Nessuno", "Pizzeria", "Braceria", "Enoteca",
				"Paninoteca", "Agriturismo", "Tosteria" }));

		JLabel lblTipologia3 = new JLabel("");
		lblTipologia3.setBounds(571, 336, 75, 17);
		lblTipologia3.setFont(new Font("Tahoma", Font.PLAIN, 14));

		@SuppressWarnings("rawtypes")
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(735, 410, 146, 20);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "Nessuno", "Economico", "Normale", "Raffinato" }));

		JLabel lblFasciaDiPrezzo = new JLabel("Fascia di prezzo");
		lblFasciaDiPrezzo.setBounds(571, 410, 86, 17);
		lblFasciaDiPrezzo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Pannel_tipo_recensione.setLayout(null);
		Pannel_tipo_recensione.add(separator_1);
		Pannel_tipo_recensione.add(lblStrutturaTitolo);
		Pannel_tipo_recensione.add(nomeStruttura);
		Pannel_tipo_recensione.add(scrollPane);
		JTextArea testo_Descrizione = new JTextArea();
		scrollPane.setViewportView(testo_Descrizione);
		Pannel_tipo_recensione.add(lblFasciaDiPrezzo);
		Pannel_tipo_recensione.add(comboBox_2);
		Pannel_tipo_recensione.add(lblDescrizione);
		Pannel_tipo_recensione.add(lblNome);
		Pannel_tipo_recensione.add(lblTipologia2);
		Pannel_tipo_recensione.add(lblTipologia3);
		contentPane.setLayout(null);
		contentPane.add(separator);
		contentPane.add(lblNewLabel);
		contentPane.add(Pannel_tipo_recensione);

		String testoRecensione = (String) testo_Descrizione.getText();

		String[] tipologia = { "Seleziona", "Allogio", "Attrazione", "Ristorante" };

		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(735, 184, 146, 20);
		Pannel_tipo_recensione.add(comboBox_4);

		JComboBox comboBox_3 = new JComboBox(tipologia);
		comboBox_3.setBounds(735, 110, 146, 20);
		Pannel_tipo_recensione.add(comboBox_3);
		comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = (String) comboBox_3.getSelectedItem();
				if (name == tipologia[1]) {

					comboBox_4.setModel(new DefaultComboBoxModel(
							new String[] { "Seleziona", "Bed&Breakfast", "Ostello", "CasaVacanze", "Hotel" }));
					Pannel_tipo_recensione.remove(comboBox_1);
					Pannel_tipo_recensione.remove(comboBox);
					lblTipologia2.setText("");
					lblTipologia3.setText("");
				} else if (name == tipologia[2]) {

					comboBox_4.setModel(new DefaultComboBoxModel(new String[] { "Seleziona", "Parco a Tema",
							"Luogo Storico", "Museo", "Sito Archeologico" }));
					Pannel_tipo_recensione.remove(comboBox_1);
					Pannel_tipo_recensione.remove(comboBox);
					lblTipologia2.setText("");
					lblTipologia3.setText("");
				} else if (name == tipologia[3]) {
					comboBox_4.setModel(new DefaultComboBoxModel(
							new String[] { "Seleziona", "Tosteria", "Paninoteca", "Enoteca", "Pizzeria", "Braceria" }));
					lblTipologia2.setText("Cucina");
					comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "Nessuno", "Pizzeria", "Braceria",
							"Enoteca", "Paninoteca", "Agriturismo", "Tosteria" }));
					Pannel_tipo_recensione.add(comboBox_1);
					Pannel_tipo_recensione.add(comboBox);
					lblTipologia2.setText("Tipolodia");
					lblTipologia3.setText("Tipolodia");
				}

			}
		});
		String name = (String) comboBox_3.getSelectedItem();

		JLabel lblTipoStruttura = new JLabel("Tipo di struttura");
		lblTipoStruttura.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTipoStruttura.setBounds(571, 111, 123, 17);
		Pannel_tipo_recensione.add(lblTipoStruttura);

		JLabel lblNewLabel_5 = new JLabel("Tipologia");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(571, 186, 75, 14);
		Pannel_tipo_recensione.add(lblNewLabel_5);

		JLabel lblIndirizzo = new JLabel("Indirizzo");
		lblIndirizzo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIndirizzo.setBounds(65, 156, 152, 17);
		Pannel_tipo_recensione.add(lblIndirizzo);

		textField_Indirizzo = new JTextField();
		textField_Indirizzo.setColumns(10);
		textField_Indirizzo.setBounds(65, 184, 296, 23);
		Pannel_tipo_recensione.add(textField_Indirizzo);

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
				String nome = nomeStruttura.getText();
				String indirizzo = textField_Indirizzo.getText();
				String tipologia_struttura = (String) comboBox_4.getSelectedItem();
				String descrizione = (String) testo_Descrizione.getText();
				String tipologia = (String)comboBox_3.getSelectedItem();
				Db database = new Db();
				database.connect();
				database.postaStrutturaQuery(nome, indirizzo, tipologia_struttura, descrizione, tipologia);
				reset(comboBox_4,testo_Descrizione );
				controllore_recensione.struttura();
				setVisible(false);

			}
		});
		btnNewButton.setBounds(884, 533, 86, 23);
		contentPane.add(btnNewButton);
		btnNewButton.setBackground(new Color(51, 102, 51));
		btnNewButton.setForeground(new Color(255, 255, 255));

	}
	public void reset(JComboBox comboBox_4, JTextArea testo_Descrizione) {
		nomeStruttura.setText("");
		textField_Indirizzo.setText("");
		comboBox_4.setSelectedIndex(0);
		testo_Descrizione.setText("");
	}
}
