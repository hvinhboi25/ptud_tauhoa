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

public class QLNhanVien_UI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLNhanVien_UI frame = new QLNhanVien_UI();
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
	public QLNhanVien_UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1372, 797);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.WHITE);
		menuBar.setBackground(Color.LIGHT_GRAY);
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Trang Chủ");
		mnNewMenu.setIcon(new ImageIcon(TrangChu_UI.class.getResource("/img/icons8-home-64.png")));
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 18));
		mnNewMenu.setBackground(Color.WHITE);
		mnNewMenu.setForeground(Color.DARK_GRAY);
		mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Quản Lý Vé");
		mnNewMenu_1.setIcon(new ImageIcon(TrangChu_UI.class.getResource("/img/1055019_news_article_information_newspaper_periodical_icon.png")));
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 18));
		mnNewMenu_1.setForeground(Color.DARK_GRAY);
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Khách Hàng");
		mnNewMenu_2.setIcon(new ImageIcon(TrangChu_UI.class.getResource("/img/1055000_profle_person_profile_user_icon.png")));
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 18));
		mnNewMenu_2.setForeground(Color.DARK_GRAY);
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("Khuyến Mãi");
		mnNewMenu_3.setIcon(new ImageIcon(TrangChu_UI.class.getResource("/img/1055101_calendar_date_event_icon.png")));
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.BOLD, 18));
		mnNewMenu_3.setForeground(Color.DARK_GRAY);
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu_4 = new JMenu("Chuyến Tàu");
		mnNewMenu_4.setIcon(new ImageIcon(TrangChu_UI.class.getResource("/img/iconqlv.png")));
		mnNewMenu_4.setFont(new Font("Segoe UI", Font.BOLD, 18));
		mnNewMenu_4.setForeground(Color.DARK_GRAY);
		menuBar.add(mnNewMenu_4);
		
		JMenu mnNewMenu_5 = new JMenu("Thống Kê");
		mnNewMenu_5.setFont(new Font("Segoe UI", Font.BOLD, 18));
		mnNewMenu_5.setForeground(Color.DARK_GRAY);
		mnNewMenu_5.setIcon(new ImageIcon(TrangChu_UI.class.getResource("/img/1055011_graph_pie chart_icon.png")));
		menuBar.add(mnNewMenu_5);
		
		JMenu mnNewMenu_6 = new JMenu("Quản Lý Nhân Viên");
		mnNewMenu_6.setIcon(new ImageIcon(TrangChu_UI.class.getResource("/img/1055082_contacts_address book_icon.png")));
		mnNewMenu_6.setFont(new Font("Segoe UI", Font.BOLD, 18));
		mnNewMenu_6.setForeground(Color.DARK_GRAY);
		menuBar.add(mnNewMenu_6);
		
		JMenu mnNewMenu_7 = new JMenu("Trợ Giúp");
		mnNewMenu_7.setIcon(new ImageIcon(TrangChu_UI.class.getResource("/img/372890_faq_full_question_round_icon.png")));
		mnNewMenu_7.setBackground(Color.WHITE);
		mnNewMenu_7.setForeground(Color.DARK_GRAY);
		mnNewMenu_7.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnNewMenu_7);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 240, 240));
		contentPane.add(panel_2, BorderLayout.WEST);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		panel_2.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_1);
		
		JLabel lblNewLabel = new JLabel("Mã nhân viên:");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBackground(Color.WHITE);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		panel.add(textField);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_2);
		
		JLabel lblNewLabel_1 = new JLabel("Họ và tên: ");
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		Component horizontalStrut_3_1 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_3_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Giới tính: ");
		lblNewLabel_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nam", "Nữ"}));
		panel.add(comboBox);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_3);
		
		JLabel lblNewLabel_2 = new JLabel("Ngày sinh: ");
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_2);
		
		JDateChooser dateChooser = new JDateChooser();
		panel.add(dateChooser);
		
		Component horizontalStrut_4_1 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_4_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Số điện thoại: ");
		lblNewLabel_2_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_2_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel.add(textField_2);
		
		Component horizontalStrut_4_2 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_4_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Địa chỉ:");
		lblNewLabel_2_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_2_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel.add(textField_3);
		
		Component horizontalStrut_4_3 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_4_3);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Hệ số lương: ");
		lblNewLabel_2_1_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_2_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		panel.add(textField_4);
		
		Component horizontalStrut_4_4 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_4_4);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Tình trạng: ");
		lblNewLabel_1_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_1_1_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Còn làm", "Nghĩ hưu"}));
		panel.add(comboBox_1);
		
		Component horizontalStrut_4_5 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_4_5);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Chức vụ: ");
		lblNewLabel_1_1_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_1_1_1_1);
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.X_AXIS));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Nhân viên");
		buttonGroup.add(rdbtnNewRadioButton);
		panel_6.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Quản lý");
		buttonGroup.add(rdbtnNewRadioButton_1);
		panel_6.add(rdbtnNewRadioButton_1);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_4);
		
		JButton btnNewButton = new JButton("Thêm");
		panel.add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon(QLNhanVien_UI.class.getResource("/img/9022821_user_circle_plus_duotone_icon.png")));
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		panel.add(verticalStrut);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(83, 169, 255));
		panel_2.add(panel_7, BorderLayout.NORTH);
		
		JLabel lblNewLabel_3 = new JLabel("THÔNG TIN NHÂN VIÊN");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_7.add(lblNewLabel_3);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		panel_2.add(horizontalStrut_5, BorderLayout.WEST);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		panel_2.add(horizontalStrut_6, BorderLayout.EAST);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.CENTER);
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
		btnTmKim.setIcon(new ImageIcon(QLNhanVien_UI.class.getResource("/img/9004811_zoom_magnifier_find_search.png")));
		btnTmKim.setForeground(Color.DARK_GRAY);
		btnTmKim.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTmKim.setBackground(Color.LIGHT_GRAY);
		panel_3.add(btnTmKim);
		
		Component horizontalStrut = Box.createHorizontalStrut(100);
		panel_3.add(horizontalStrut);
		
		JButton btnSa = new JButton("Cập nhật");
		btnSa.setIcon(new ImageIcon(QLNhanVien_UI.class.getResource("/img/9004837_envelope_letter_email_mail_send.png")));
		btnSa.setForeground(Color.DARK_GRAY);
		btnSa.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSa.setBackground(Color.LIGHT_GRAY);
		panel_3.add(btnSa);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(50);
		panel_3.add(horizontalStrut_7);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		panel_1.setBackground(new Color(240, 240, 240));
		
		JLabel lblNewLabel_4 = new JLabel("Quản lý Nhân Viên");
		lblNewLabel_4.setForeground(new Color(217, 108, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_1.add(lblNewLabel_4);
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
