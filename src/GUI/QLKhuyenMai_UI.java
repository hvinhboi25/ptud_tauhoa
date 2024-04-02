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

public class QLKhuyenMai_UI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLKhuyenMai_UI frame = new QLKhuyenMai_UI();
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
	public QLKhuyenMai_UI() {
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
		
		JLabel lblNewLabel = new JLabel("Mã khuyến mãi: ");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBackground(Color.WHITE);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		panel.add(textField);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_2);
		
		JLabel lblNewLabel_1 = new JLabel("Tên khuyến mãi: ");
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		Component horizontalStrut_3_1 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_3_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Đối tượng áp dụng: ");
		lblNewLabel_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Người lớn", "Sinh viên", "Thương binh"}));
		panel.add(comboBox);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Chiết khấu:");
		lblNewLabel_1_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel.add(textField_2);
		
		Component horizontalStrut_3_2 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_3_2);
		
		JLabel lblNewLabel_2 = new JLabel("Ngày bắt đầu: ");
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_2);
		
		JDateChooser dateChooser = new JDateChooser();
		panel.add(dateChooser);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_4);
		
		JLabel lblNewLabel_3 = new JLabel("Ngày kết thúc:");
		lblNewLabel_3.setForeground(Color.DARK_GRAY);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_3);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		panel.add(dateChooser_1);
		
		Component horizontalStrut_4_1 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_4_1);
		
		JButton btnNewButton = new JButton("Thêm");
		panel.add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon(QLKhuyenMai_UI.class.getResource("/img/2191562_add_circle_cross_increase_plus_icon.png")));
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		
		Component verticalStrut_2 = Box.createVerticalStrut(40);
		panel.add(verticalStrut_2);
		
		JPanel panel_6 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_6.getLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		panel_6.setBackground(Color.WHITE);
		panel_2.add(panel_6, BorderLayout.NORTH);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(83, 169, 255));
		panel_6.add(panel_7);
		
		Component horizontalStrut_11 = Box.createHorizontalStrut(20);
		panel_7.add(horizontalStrut_11);
		
		JLabel lblNewLabel_5 = new JLabel("THÔNG TIN KHUYẾN MÃI");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_7.add(lblNewLabel_5);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		panel_7.add(horizontalStrut_5);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		panel_2.add(horizontalStrut_6, BorderLayout.WEST);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		panel_2.add(horizontalStrut_7, BorderLayout.EAST);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_4.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.X_AXIS));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_5.add(scrollPane_1);
		
		table = new JTable();
		table.setBackground(Color.WHITE);
		scrollPane_1.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 khuy\u1EBFn m\u00E3i", "T\u00EAn khuy\u1EBFn m\u00E3i", "\u0110\u1ED1i t\u01B0\u1EE3ng \u00E1p d\u1EE5ng", "Chi\u1EBFt kh\u1EA5u", "Ng\u00E0y b\u1EAFt \u0111\u1EA7u", "Ng\u00E0y k\u1EBFt th\u00FAc"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(109);
		table.getColumnModel().getColumn(1).setPreferredWidth(106);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_4.add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.X_AXIS));
		
		Component horizontalStrut_8 = Box.createHorizontalStrut(20);
		panel_3.add(horizontalStrut_8);
		
		textField_3 = new JTextField();
		panel_3.add(textField_3);
		textField_3.setColumns(40);
		
		Component horizontalStrut_9 = Box.createHorizontalStrut(20);
		panel_3.add(horizontalStrut_9);
		
		JButton btnTm = new JButton("Tìm");
		btnTm.setIcon(new ImageIcon(QLKhuyenMai_UI.class.getResource("/img/9004811_zoom_magnifier_find_search.png")));
		btnTm.setForeground(Color.DARK_GRAY);
		btnTm.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTm.setBackground(Color.LIGHT_GRAY);
		panel_3.add(btnTm);
		
		Component horizontalStrut = Box.createHorizontalStrut(100);
		panel_3.add(horizontalStrut);
		
		JButton btnSa = new JButton("Cập nhật");
		btnSa.setIcon(new ImageIcon(QLKhuyenMai_UI.class.getResource("/img/9004837_envelope_letter_email_mail_send.png")));
		btnSa.setForeground(Color.DARK_GRAY);
		btnSa.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSa.setBackground(Color.LIGHT_GRAY);
		panel_3.add(btnSa);
		
		Component horizontalStrut_12 = Box.createHorizontalStrut(20);
		panel_3.add(horizontalStrut_12);
		
		JButton btnHy = new JButton("Xóa");
		btnHy.setIcon(new ImageIcon(QLKhuyenMai_UI.class.getResource("/img/9004852_remove_bin_delete_trash.png")));
		btnHy.setForeground(Color.DARK_GRAY);
		btnHy.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnHy.setBackground(Color.LIGHT_GRAY);
		panel_3.add(btnHy);
		
		Component horizontalStrut_10 = Box.createHorizontalStrut(50);
		panel_3.add(horizontalStrut_10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		panel_1.setBackground(new Color(240, 240, 240));
		
		Component verticalStrut = Box.createVerticalStrut(50);
		panel_1.add(verticalStrut);
		
		JLabel lblNewLabel_4 = new JLabel("Quản lý khuyến mãi");
		lblNewLabel_4.setForeground(new Color(217, 108, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_1.add(lblNewLabel_4);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		panel_1.add(verticalStrut_1);
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
