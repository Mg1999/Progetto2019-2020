package Adojamme;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Calssi.Recensioni;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Home extends JFrame {

	private JPanel contentPane;
	private Controllore controllore_home;
	private JTable tabella_recensore;

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("serial")
	public Home(Controllore ctrl) {
		setTitle("Adojamme");
		controllore_home = ctrl;
		setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/Images/logohome.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1055, 626);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label_logo = new JLabel("");
		label_logo.setIcon(new ImageIcon(Home.class.getResource("/Images/logohome.png")));
		
		JButton button_accedi_home = new JButton("Accedi");
		button_accedi_home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controllore_home.acesso();
				setVisible(false);
			}
		});
		button_accedi_home.setBackground(new Color(51, 102, 51));
		button_accedi_home.setForeground(Color.WHITE);
		
		JButton button_register_home = new JButton("Registrati");
		button_register_home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controllore_home.rec();
				dispose();
			}
		});
		button_register_home.setBackground(new Color(255, 255, 255));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(102, 102, 102));
		separator.setBackground(new Color(102, 102, 102));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(157)
							.addComponent(separator, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label_logo, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
							.addGap(250)
							.addComponent(button_accedi_home)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_register_home)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(4))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(14)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(button_accedi_home)
								.addComponent(button_register_home)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(label_logo, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(20)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 11, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setEnabled(true);
		lblNewLabel_1.setIcon(new ImageIcon(Home.class.getResource("/Images/slide1.jpg")));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnNewButton = new JButton("Mostra recendsioni");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostra_recensioni();
			}
		});
		btnNewButton.setBackground(new Color(51, 102, 51));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 1025, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(225)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 534, Short.MAX_VALUE)
					.addGap(73)
					.addComponent(btnNewButton)
					.addGap(70))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(198)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
					.addGap(193))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addGap(48)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
					.addGap(25))
		);
		
		tabella_recensore = new JTable();
		tabella_recensore.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome Struttura", "Indirizzo", "Tipologia", "Titolo Recensione", "Recensione", "Valutazione"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(tabella_recensore);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 mostra_alloggi();
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon(Home.class.getResource("/Images/PowerdByMarco.png")));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mostra_ristorante();
			}
		});
		label.setIcon(new ImageIcon(Home.class.getResource("/Images/PoweredByVittorio.png")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mostra_attrazione();
			}
		});
		label_1.setIcon(new ImageIcon(Home.class.getResource("/Images/PoweredByAntonio.png")));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_3 = new JLabel("Allogio");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblRistorante = new JLabel("Ristorante");
		lblRistorante.setHorizontalAlignment(SwingConstants.CENTER);
		lblRistorante.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblAttrazione = new JLabel("Attrazione");
		lblAttrazione.setHorizontalAlignment(SwingConstants.CENTER);
		lblAttrazione.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(10)
							.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
							.addGap(117)
							.addComponent(lblRistorante, GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
							.addGap(117)
							.addComponent(lblAttrazione, GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
							.addGap(70))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 56, Short.MAX_VALUE)
							.addGap(92)
							.addComponent(label, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
							.addGap(87)
							.addComponent(label_1, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
							.addGap(60))))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3)
						.addComponent(lblAttrazione, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRistorante, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
	public ArrayList<Recensioni> listaRecensioni(){
		Db database = new Db();
		return database.recensoreprofiloTutte2();
	}
	public void mostra_recensioni() {
		ArrayList<Recensioni> list = listaRecensioni();
		DefaultTableModel model = (DefaultTableModel)tabella_recensore.getModel();
		model.setRowCount(0);
		Object[] row = new Object[6];
		for (int i = 0; i<list.size();i++) {
			row[0] = list.get(i).getNome_struttura();
			row[1] = list.get(i).getIndirizzo();
			row[2] = list.get(i).getTipologia();
			row[3] = list.get(i).getTitolo_recensione();
			row[4] = list.get(i).getRecensione();
			row[5] = list.get(i).getValutazione();
			model.addRow(row);
		}
 	}
	public ArrayList<Recensioni> lista_allogio(){
		Db database = new Db();
		return database.FiltroAlloggio();
	}
	public void mostra_alloggi() {
		ArrayList<Recensioni> list = lista_allogio();
		DefaultTableModel model = (DefaultTableModel)tabella_recensore.getModel();
		model.setRowCount(0);
		Object[] row = new Object[6];
		for (int i = 0; i<list.size();i++) {
			row[0] = list.get(i).getNome_struttura();
			row[1] = list.get(i).getIndirizzo();
			row[2] = list.get(i).getTipologia();
			row[3] = list.get(i).getTitolo_recensione();
			row[4] = list.get(i).getRecensione();
			row[5] = list.get(i).getValutazione();
			model.addRow(row);
		}
 	}
	public ArrayList<Recensioni> lista_attrazione(){
		Db database = new Db();
		return database.FiltroAttrazione();
	}
	public void mostra_attrazione() {
		ArrayList<Recensioni> list = lista_attrazione();
		DefaultTableModel model = (DefaultTableModel)tabella_recensore.getModel();
		model.setRowCount(0);
		Object[] row = new Object[6];
		for (int i = 0; i<list.size();i++) {
			row[0] = list.get(i).getNome_struttura();
			row[1] = list.get(i).getIndirizzo();
			row[2] = list.get(i).getTipologia();
			row[3] = list.get(i).getTitolo_recensione();
			row[4] = list.get(i).getRecensione();
			row[5] = list.get(i).getValutazione();
			model.addRow(row);
		}
 	}
	public ArrayList<Recensioni> lista_ristorante(){
		Db database = new Db();
		return database.FiltroRistorante();
	}
	public void mostra_ristorante() {
		ArrayList<Recensioni> list = lista_ristorante();
		DefaultTableModel model = (DefaultTableModel)tabella_recensore.getModel();
		model.setRowCount(0);
		Object[] row = new Object[6];
		for (int i = 0; i<list.size();i++) {
			row[0] = list.get(i).getNome_struttura();
			row[1] = list.get(i).getIndirizzo();
			row[2] = list.get(i).getTipologia();
			row[3] = list.get(i).getTitolo_recensione();
			row[4] = list.get(i).getRecensione();
			row[5] = list.get(i).getValutazione();
			model.addRow(row);
		}
 	}
}
