package Adojamme;

import Calssi.Struttura;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SpringLayout;

public class View extends JFrame {

	private JPanel contentPane;
	private Controllore controllore;
	private JTable tabella;
	

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "unchecked", "serial" })
	public View(Controllore ctrl) {
		controllore = ctrl;
		setUndecorated(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(View.class.getResource("/Images/logohome.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 525, 328);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		JButton btnNewButton = new JButton("Aggiorna");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 mostra_struttura();
			}
		});
		btnNewButton.setBounds(39, 294, 89, 23);
		contentPane.setLayout(null);
		btnNewButton.setBackground(new Color(51, 102, 51));
		btnNewButton.setForeground(Color.WHITE);

		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(27, 24, 445, 214);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);
		
		tabella = new JTable();
		tabella.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"nome", "indirizzo", "id_struttura", "id_proprietario"
			}
		){
			boolean[] columnEditables = new boolean[] {
					false, false, false, false, false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
		scrollPane.setViewportView(tabella);
		
		JButton btnNewButton_1 = new JButton("X");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBounds(473, 0, 52, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel avvisoErrore = new JLabel("");
		avvisoErrore.setForeground(Color.RED);
		avvisoErrore.setBounds(37, 249, 435, 23);
		contentPane.add(avvisoErrore);
		
		JButton btnNewButton_2 = new JButton("Ok");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int riga = tabella.getSelectedRow();
				int colonna = tabella.getSelectedColumn();
				String id_struttura = (String) tabella.getValueAt(riga, 2);
				System.out.println(id_struttura);
				Db database = new Db();
				Db.id_struttura = id_struttura;
				String id_recensore = database.postControllRecensione();
				int recensione_check = database.cercarecenioni(id_recensore, id_struttura);
				if(recensione_check == 1) {
					avvisoErrore.setText("recensione già effettuata");
				}
				else {
				setVisible(false);
				}
			}
		});
		btnNewButton_2.setBounds(397, 294, 75, 23);
		contentPane.add(btnNewButton_2);
	}
	public ArrayList<Struttura> listaStruttura(){
		Db database = new Db();
		return database.view();
	}
	public void mostra_struttura() {
		ArrayList<Struttura> list = listaStruttura();
		DefaultTableModel model = (DefaultTableModel)tabella.getModel();
		model.setRowCount(0);
		Object[] row = new Object[4];
		for (int i = 0; i<list.size();i++) {
			row[0] = list.get(i).getNome();
			row[1] = list.get(i).getIndirizzo();
			row[2] = list.get(i).getId_struttura();
			row[3] = list.get(i).getId_proprietario();
			model.addRow(row);
		}
 	}
	
}
