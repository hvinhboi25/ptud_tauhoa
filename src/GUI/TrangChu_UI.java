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
import javax.swing.SpringLayout;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JEditorPane;

public class TrangChu_UI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNv;
	private JTextField txtChucVu;
	private JTextField txtHoVTen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrangChu_UI frame = new TrangChu_UI();
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
	public TrangChu_UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1525, 797);
		
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
		panel_2.setBackground(new Color(255, 255, 255));
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		panel_2.add(panel, BorderLayout.WEST);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(83, 169, 255));
		panel.add(panel_1, BorderLayout.NORTH);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(70);
		panel_1.add(horizontalStrut_1);
		
		JLabel lblNewLabel_1 = new JLabel("THÔNG TIN");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_1.add(lblNewLabel_1);
		
		Component horizontalStrut = Box.createHorizontalStrut(70);
		panel_1.add(horizontalStrut);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(null);
		
		JLabel lblAnhDaiDien = new JLabel("");
		lblAnhDaiDien.setIcon(new ImageIcon(TrangChu_UI.class.getResource("/img/black-and-gray-train-interior.jpg")));
		lblAnhDaiDien.setBounds(24, 24, 205, 186);
		panel_5.add(lblAnhDaiDien);
		
		JLabel lblNewLabel_3 = new JLabel("Mã: ");
		lblNewLabel_3.setForeground(Color.DARK_GRAY);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(24, 263, 28, 14);
		panel_5.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Chức vụ: ");
		lblNewLabel_3_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_1.setBounds(23, 408, 61, 14);
		panel_5.add(lblNewLabel_3_1);
		
		txtNv = new JTextField();
		txtNv.setText("NV04233456");
		txtNv.setEditable(false);
		txtNv.setBounds(24, 288, 205, 27);
		panel_5.add(txtNv);
		txtNv.setColumns(10);
		
		txtChucVu = new JTextField();
		txtChucVu.setText("Giám đốc");
		txtChucVu.setEditable(false);
		txtChucVu.setColumns(10);
		txtChucVu.setBounds(24, 433, 205, 25);
		panel_5.add(txtChucVu);
		
		JButton btnDangXuat = new JButton("Đăng xuất");
		btnDangXuat.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDangXuat.setBackground(new Color(170, 0, 0));
		btnDangXuat.setBounds(59, 501, 117, 27);
		panel_5.add(btnDangXuat);
		
		txtHoVTen = new JTextField();
		txtHoVTen.setText("Nguyễn Minh Long");
		txtHoVTen.setEditable(false);
		txtHoVTen.setColumns(10);
		txtHoVTen.setBounds(24, 356, 205, 27);
		panel_5.add(txtHoVTen);
		
		JLabel lblNewLabel_3_2 = new JLabel("Họ và tên: ");
		lblNewLabel_3_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_2.setBounds(24, 331, 77, 14);
		panel_5.add(lblNewLabel_3_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_2.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		FlowLayout flowLayout = (FlowLayout) panel_6.getLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		panel_3.add(panel_6, BorderLayout.NORTH);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(TrangChu_UI.class.getResource("/img/bannertang chu.png")));
		panel_6.add(lblNewLabel_2);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_3.add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(null);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBorder(new LineBorder(new Color(0, 0, 0)));
		horizontalBox.setBounds(110, 88, 1074, 1);
		panel_7.add(horizontalBox);
		
		JLabel lblNewLabel_4 = new JLabel("Tên Nhà Ga:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setForeground(new Color(39, 41, 69));
		lblNewLabel_4.setBounds(110, 54, 146, 23);
		panel_7.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Nhà ga Ban Mai");
		lblNewLabel_4_1.setForeground(new Color(39, 41, 69));
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_1.setBounds(268, 54, 146, 23);
		panel_7.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Địa Chỉ:");
		lblNewLabel_4_2.setForeground(new Color(39, 41, 69));
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_2.setBounds(110, 100, 146, 23);
		panel_7.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Giới thiệu:");
		lblNewLabel_4_3.setForeground(new Color(217, 108, 0));
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4_3.setBounds(38, 11, 146, 23);
		panel_7.add(lblNewLabel_4_3);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		horizontalBox_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		horizontalBox_1.setBounds(110, 136, 1074, 1);
		panel_7.add(horizontalBox_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("12.1A Nguyễn Văn Bảo, Gò Vấp, TP.Hồ Chí Minh");
		lblNewLabel_4_1_1.setForeground(new Color(39, 41, 69));
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_1_1.setBounds(268, 100, 516, 23);
		panel_7.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("Email: ");
		lblNewLabel_4_2_1.setForeground(new Color(39, 41, 69));
		lblNewLabel_4_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_2_1.setBounds(110, 148, 146, 23);
		panel_7.add(lblNewLabel_4_2_1);
		
		Box horizontalBox_1_1 = Box.createHorizontalBox();
		horizontalBox_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		horizontalBox_1_1.setBounds(110, 182, 1074, 1);
		panel_7.add(horizontalBox_1_1);
		
		JLabel lblNewLabel_4_2_1_1 = new JLabel("Hotline: ");
		lblNewLabel_4_2_1_1.setForeground(new Color(39, 41, 69));
		lblNewLabel_4_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_2_1_1.setBounds(110, 194, 146, 23);
		panel_7.add(lblNewLabel_4_2_1_1);
		
		Box horizontalBox_1_1_1 = Box.createHorizontalBox();
		horizontalBox_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		horizontalBox_1_1_1.setBounds(110, 228, 1074, 1);
		panel_7.add(horizontalBox_1_1_1);
		
		JLabel lblNewLabel_4_2_1_1_1 = new JLabel("Ngày Lập: ");
		lblNewLabel_4_2_1_1_1.setForeground(new Color(39, 41, 69));
		lblNewLabel_4_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_2_1_1_1.setBounds(110, 240, 146, 23);
		panel_7.add(lblNewLabel_4_2_1_1_1);
		
		Box horizontalBox_1_1_1_1 = Box.createHorizontalBox();
		horizontalBox_1_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		horizontalBox_1_1_1_1.setBounds(110, 274, 1074, 1);
		panel_7.add(horizontalBox_1_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("banmaiganhom3@gmail.com");
		lblNewLabel_4_1_1_1.setForeground(new Color(39, 41, 69));
		lblNewLabel_4_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_1_1_1.setBounds(268, 148, 516, 23);
		panel_7.add(lblNewLabel_4_1_1_1);
		
		JLabel lblNewLabel_4_1_1_2 = new JLabel("02479989789");
		lblNewLabel_4_1_1_2.setForeground(new Color(39, 41, 69));
		lblNewLabel_4_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_1_1_2.setBounds(268, 194, 516, 23);
		panel_7.add(lblNewLabel_4_1_1_2);
		
		JLabel lblNewLabel_4_1_1_3 = new JLabel("27/03/2021");
		lblNewLabel_4_1_1_3.setForeground(new Color(39, 41, 69));
		lblNewLabel_4_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_1_1_3.setBounds(268, 240, 516, 23);
		panel_7.add(lblNewLabel_4_1_1_3);
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_4.getLayout();
		flowLayout_3.setHgap(0);
		flowLayout_3.setVgap(0);
		panel_4.setBackground(new Color(240, 240, 240));
		contentPane.add(panel_4, BorderLayout.NORTH);
		
		Component verticalStrut_1 = Box.createVerticalStrut(50);
		panel_4.add(verticalStrut_1);
		
		JLabel lblNewLabel = new JLabel("Trang chủ");
		lblNewLabel.setForeground(new Color(217, 108, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_4.add(lblNewLabel);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		panel_4.add(verticalStrut);
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
