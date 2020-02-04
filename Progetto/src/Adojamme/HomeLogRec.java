package Adojamme;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextPane;

public class HomeLogRec extends JFrame {

	private JPanel contentPane;
	private JTextField barra_ricerca;
	private JPanel panel_2;
	private JLabel label_slide;
	private JPanel panel_3;
	private JLabel label_nome_allogio;
	private JLabel label_nome_ristorante;
	private JLabel label_nome_attrazione;
	private JLabel logo_allogio;
	private JLabel logo_ristorante;
	private JLabel logo_attrazione;
	private JScrollPane scrollPane;
	private JPanel panel_4;
	private Controllore controllore;

	/**
	 * Launch the application.
	 */
//	public static void posthome() {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					HomeLogRec frame = new HomeLogRec();
//					frame.setVisible(true);
//					Home chiudi = new Home();
//					chiudi.setVisible(false);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	
	
	

	/**
	 * Create the frame.
	 */
	public HomeLogRec(Controllore ctrl) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(HomeLogRec.class.getResource("/Images/logohome.png")));
		setTitle("Adojamme");
		controllore = ctrl;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 626);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 102, 102));
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
				.addComponent(panel_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
		);
		
		label_slide = new JLabel("");
		label_slide.setHorizontalAlignment(SwingConstants.CENTER);
		label_slide.setIcon(new ImageIcon(HomeLogRec.class.getResource("/Images/slide1.jpg")));
		
		panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		
		label_nome_allogio = new JLabel("Allogio");
		label_nome_allogio.setHorizontalAlignment(SwingConstants.CENTER);
		label_nome_allogio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		label_nome_ristorante = new JLabel("Ristorante");
		label_nome_ristorante.setHorizontalAlignment(SwingConstants.CENTER);
		label_nome_ristorante.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		label_nome_attrazione = new JLabel("Attrazione");
		label_nome_attrazione.setHorizontalAlignment(SwingConstants.CENTER);
		label_nome_attrazione.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		logo_allogio = new JLabel("");
		logo_allogio.setIcon(new ImageIcon(HomeLogRec.class.getResource("/Images/PowerdByMarco.png")));
		logo_allogio.setHorizontalAlignment(SwingConstants.CENTER);
		
		logo_ristorante = new JLabel("");
		logo_ristorante.setIcon(new ImageIcon(HomeLogRec.class.getResource("/Images/PoweredByVittorio.png")));
		logo_ristorante.setHorizontalAlignment(SwingConstants.CENTER);
		
		logo_attrazione = new JLabel("");
		logo_attrazione.setIcon(new ImageIcon(HomeLogRec.class.getResource("/Images/PoweredByAntonio.png")));
		logo_attrazione.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 525, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(10)
							.addComponent(label_nome_allogio, GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
							.addGap(117)
							.addComponent(label_nome_ristorante, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(117)
							.addComponent(label_nome_attrazione, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(70))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(logo_allogio, GroupLayout.PREFERRED_SIZE, 79, Short.MAX_VALUE)
							.addGap(92)
							.addComponent(logo_ristorante, GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
							.addGap(87)
							.addComponent(logo_attrazione, GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
							.addGap(60))))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 64, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(logo_attrazione, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(logo_ristorante, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(logo_allogio, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(label_nome_allogio)
						.addComponent(label_nome_attrazione, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_nome_ristorante, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_3.setLayout(gl_panel_3);
		
		scrollPane = new JScrollPane();
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addComponent(label_slide, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 885, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
					.addContainerGap(220, Short.MAX_VALUE)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 525, GroupLayout.PREFERRED_SIZE)
					.addGap(229))
				.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
					.addGap(202)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
					.addGap(185))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(label_slide, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		scrollPane.setViewportView(panel_4);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 585, Short.MAX_VALUE)
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 295, Short.MAX_VALUE)
		);
		panel_4.setLayout(gl_panel_4);
		panel_2.setLayout(gl_panel_2);
		
		barra_ricerca = new JTextField();
		barra_ricerca.setText("Trova");
		barra_ricerca.setForeground(new Color(204, 204, 204));
		barra_ricerca.setColumns(10);
		
		JLabel label_logo = new JLabel("");
		label_logo.setHorizontalAlignment(SwingConstants.CENTER);
		label_logo.setIcon(new ImageIcon(HomeLogRec.class.getResource("/Images/logohome.png")));
		
		JButton btnNewButton = new JButton("Recensione");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controllore.recensione();
			}
		});
		btnNewButton.setBackground(new Color(51, 102, 51));
		btnNewButton.setForeground(Color.WHITE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(20)
					.addComponent(barra_ricerca, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
					.addGap(201)
					.addComponent(label_logo, GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
					.addGap(275)
					.addComponent(btnNewButton)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(14)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
							.addComponent(barra_ricerca, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_logo, GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE)))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
