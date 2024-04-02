package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.Box;
import javax.swing.SwingConstants;
import javax.swing.JTree;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import com.toedter.calendar.JYearChooser;
import com.toedter.components.JSpinField;
import com.toedter.components.JLocaleChooser;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.CardLayout;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ThongTinDatVe_UI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable table;
	private JTextField textField_5;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThongTinDatVe_UI frame = new ThongTinDatVe_UI();
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
	public ThongTinDatVe_UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 532);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("THÔNG TIN NGƯỜI ĐẶT VÉ");
		lblNewLabel_4.setForeground(new Color(160, 35, 38));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(lblNewLabel_4, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel_1.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Họ và tên: ");
		lblNewLabel.setBounds(60, 10, 84, 19);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_6.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(183, 10, 456, 19);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(textField);
		textField.setColumns(50);
		
		JPanel panel_6_1 = new JPanel();
		panel_6_1.setBackground(Color.WHITE);
		panel.add(panel_6_1);
		panel_6_1.setLayout(null);
		
		JLabel lblCmndcccd = new JLabel("CMND/CCCD: ");
		lblCmndcccd.setBounds(60, 10, 109, 19);
		lblCmndcccd.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_6_1.add(lblCmndcccd);
		
		textField_1 = new JTextField();
		textField_1.setBounds(183, 10, 456, 19);
		textField_1.setColumns(50);
		panel_6_1.add(textField_1);
		
		JPanel panel_6_2 = new JPanel();
		panel_6_2.setBackground(Color.WHITE);
		panel.add(panel_6_2);
		panel_6_2.setLayout(null);
		
		JLabel lblSinThoi = new JLabel("Số điện thoại: ");
		lblSinThoi.setBounds(60, 10, 111, 19);
		lblSinThoi.setHorizontalAlignment(SwingConstants.CENTER);
		lblSinThoi.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_6_2.add(lblSinThoi);
		
		textField_2 = new JTextField();
		textField_2.setBounds(183, 10, 456, 19);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(50);
		panel_6_2.add(textField_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		contentPane.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_2.add(panel_8, BorderLayout.CENTER);
		
		JLabel lblNewLabel_3 = new JLabel("THÔNG TIN NHÂN VIÊN");
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setForeground(new Color(160, 35, 38));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2.add(lblNewLabel_3, BorderLayout.NORTH);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_4.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.X_AXIS));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_5.add(scrollPane_1);
		
		table = new JTable();
		table.setBackground(Color.WHITE);
		scrollPane_1.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 nh\u00E2n vi\u00EAn", "H\u1ECD t\u00EAn", "Gi\u1EDBi t\u00EDnh", "Ng\u00E0y sinh", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i", "\u0110\u1ECBa ch\u1EC9", "H\u1EC7 s\u1ED1 l\u01B0\u01A1ng", "T\u00ECnh tr\u1EA1ng", "Ch\u1EE9c v\u1EE5"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(109);
		table.getColumnModel().getColumn(1).setPreferredWidth(106);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(240, 240, 240));
		panel_4.add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.X_AXIS));
		
		Component horizontalStrut_9 = Box.createHorizontalStrut(20);
		panel_3.add(horizontalStrut_9);
		
		textField_5 = new JTextField();
		panel_3.add(textField_5);
		textField_5.setColumns(10);
		
		Component horizontalStrut_8 = Box.createHorizontalStrut(20);
		panel_3.add(horizontalStrut_8);
		
		JButton btnTmKim = new JButton("Tìm kiếm");
		btnTmKim.setIcon(new ImageIcon(ThongTinDatVe_UI.class.getResource("/img/9004811_zoom_magnifier_find_search.png")));
		btnTmKim.setForeground(Color.DARK_GRAY);
		btnTmKim.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTmKim.setBackground(Color.LIGHT_GRAY);
		panel_3.add(btnTmKim);
		
		Component horizontalStrut = Box.createHorizontalStrut(100);
		panel_3.add(horizontalStrut);
		
		JButton btnSa = new JButton("Cập nhật");
		btnSa.setIcon(new ImageIcon(ThongTinDatVe_UI.class.getResource("/img/9004837_envelope_letter_email_mail_send.png")));
		btnSa.setForeground(Color.DARK_GRAY);
		btnSa.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSa.setBackground(Color.LIGHT_GRAY);
		panel_3.add(btnSa);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(50);
		panel_3.add(horizontalStrut_7);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
