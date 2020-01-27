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

public class HomeLogRec extends JFrame {

	private JPanel contentPane;
	private JTextField txtTrova;
	private JPanel panel_1;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JPanel panel_2;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void posthome() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeLogRec frame = new HomeLogRec();
					frame.setVisible(true);
					Home chiudi = new Home();
					chiudi.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	

	/**
	 * Create the frame.
	 */
	public HomeLogRec() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(HomeLogRec.class.getResource("/Images/logohome.png")));
		setTitle("Adojamme");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 911, 597);
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
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(HomeLogRec.class.getResource("/Images/slide1.jpg")));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 885, Short.MAX_VALUE)
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(355, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		txtTrova = new JTextField();
		txtTrova.setText("Trova");
		txtTrova.setForeground(new Color(204, 204, 204));
		txtTrova.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(HomeLogRec.class.getResource("/Images/logohome.png")));
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 102, 51));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(20)
					.addComponent(txtTrova, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
					.addGap(201)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
					.addGap(273)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(14)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(txtTrova, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE)))
					.addContainerGap())
		);
		
		menuBar = new JMenuBar();
		menuBar.setForeground(new Color(255, 255, 255));
		menuBar.setBackground(new Color(51, 102, 51));
		panel_1.add(menuBar);
		
		mnNewMenu = new JMenu("Recensione");
		mnNewMenu.setBackground(new Color(51, 102, 51));
		mnNewMenu.setForeground(new Color(255, 255, 255));
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Allogio");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RecensioneAllogio.RecAllogio();
			}
		});
		mntmNewMenuItem.setForeground(new Color(255, 255, 255));
		mntmNewMenuItem.setBackground(new Color(51, 102, 51));
		mnNewMenu.add(mntmNewMenuItem);
		
		mntmNewMenuItem_1 = new JMenuItem("Attrazione");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RecensioneAttrazione.recAttrazione();
			}
		});
		mntmNewMenuItem_1.setForeground(new Color(255, 255, 255));
		mntmNewMenuItem_1.setBackground(new Color(51, 102, 51));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		mntmNewMenuItem_2 = new JMenuItem("Cucina");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RecensioneCucina.recCucina();
			}
		});
		mntmNewMenuItem_2.setForeground(new Color(255, 255, 255));
		mntmNewMenuItem_2.setBackground(new Color(51, 102, 51));
		mnNewMenu.add(mntmNewMenuItem_2);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
