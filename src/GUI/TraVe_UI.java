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
import javax.accessibility.Accessible;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;
import java.awt.SystemColor;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JToggleButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

public class TraVe_UI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtGaDen;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TraVe_UI frame = new TraVe_UI();
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
	public TraVe_UI() {
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
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mã vé: ");
		lblNewLabel.setBounds(25, 34, 200, 35);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		panel.add(lblNewLabel);
		
		txtGaDen = new JTextField();
		txtGaDen.setBounds(25, 80, 200, 26);
		txtGaDen.setColumns(10);
		panel.add(txtGaDen);
		
		JButton btnTim = new JButton("Tìm");
		btnTim.setBounds(25, 179, 200, 35);
		btnTim.setIcon(new ImageIcon(TraVe_UI.class.getResource("/img/9004811_zoom_magnifier_find_search.png")));
		btnTim.setForeground(Color.DARK_GRAY);
		btnTim.setBackground(Color.LIGHT_GRAY);
		btnTim.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(btnTim);
		
		JButton btnHuy = new JButton("Hủy");
		btnHuy.setBounds(25, 225, 200, 35);
		btnHuy.setIcon(new ImageIcon(TraVe_UI.class.getResource("/img/9004828_cancel_remove_delete_cross.png")));
		btnHuy.setBackground(Color.LIGHT_GRAY);
		btnHuy.setForeground(Color.DARK_GRAY);
		btnHuy.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(btnHuy);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		panel_2.add(rigidArea_2, BorderLayout.SOUTH);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(83, 169, 255));
		panel_2.add(panel_12, BorderLayout.NORTH);
		
		Component horizontalStrut_9 = Box.createHorizontalStrut(30);
		panel_12.add(horizontalStrut_9);
		
		JLabel lblNewLabel_6 = new JLabel("THÔNG TIN TRẢ VÉ");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6.setBackground(SystemColor.textHighlight);
		panel_12.add(lblNewLabel_6);
		
		Component horizontalStrut_9_1 = Box.createHorizontalStrut(30);
		panel_12.add(horizontalStrut_9_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		contentPane.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_4.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7.setBackground(Color.WHITE);
		panel_5.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		panel_7.add(panel_10);
		panel_10.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("Thông tin người mua vé");
		lblNewLabel_1.setForeground(new Color(83, 169, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_10.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Họ và tên: ");
		lblNewLabel_1_1.setForeground(new Color(39, 41, 69));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_10.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("CMND/CCCD: ");
		lblNewLabel_1_1_1.setForeground(new Color(39, 41, 69));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_10.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Số điện thoại:");
		lblNewLabel_1_1_2.setForeground(new Color(39, 41, 69));
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_10.add(lblNewLabel_1_1_2);
		
		JLabel lblHoVaTen = new JLabel("Đoàn Quang Quý");
		lblHoVaTen.setForeground(new Color(39, 41, 69));
		lblHoVaTen.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_10.add(lblHoVaTen);
		
		JLabel lblCMND = new JLabel("197458385");
		lblCMND.setForeground(new Color(39, 41, 69));
		lblCMND.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_10.add(lblCMND);
		
		JLabel lblSoDienThoai = new JLabel("0385177456");
		lblSoDienThoai.setForeground(new Color(39, 41, 69));
		lblSoDienThoai.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_10.add(lblSoDienThoai);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_7.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_11 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_11.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_11.setBackground(Color.WHITE);
		panel_8.add(panel_11, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1_2 = new JLabel("Thông tin vé mua");
		lblNewLabel_1_2.setForeground(new Color(83, 169, 255));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_11.add(lblNewLabel_1_2);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.WHITE);
		panel_8.add(panel_13, BorderLayout.CENTER);
		panel_13.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(Color.WHITE);
		panel_13.add(panel_14);
		panel_14.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_1_1_4_1_1 = new JLabel("Mã vé:");
		lblNewLabel_1_1_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_4_1_1.setForeground(new Color(39, 41, 69));
		lblNewLabel_1_1_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_14.add(lblNewLabel_1_1_4_1_1);
		
		JLabel lblHoVaTen_1_1_1 = new JLabel("VE034945");
		lblHoVaTen_1_1_1.setForeground(new Color(39, 41, 69));
		lblHoVaTen_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_14.add(lblHoVaTen_1_1_1);
		
		JLabel lblNewLabel_1_1_4_1 = new JLabel("Họ và tên Khách hàng: ");
		lblNewLabel_1_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_4_1.setForeground(new Color(39, 41, 69));
		lblNewLabel_1_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_14.add(lblNewLabel_1_1_4_1);
		
		JLabel lblHoVaTen_1_1_2 = new JLabel("Đoàn Quang Quý");
		lblHoVaTen_1_1_2.setForeground(new Color(39, 41, 69));
		lblHoVaTen_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_14.add(lblHoVaTen_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("CMND/CCCD: ");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1.setForeground(new Color(39, 41, 69));
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_14.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblHoVaTen_1_1_3 = new JLabel("197458377");
		lblHoVaTen_1_1_3.setForeground(new Color(39, 41, 69));
		lblHoVaTen_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_14.add(lblHoVaTen_1_1_3);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Đối tượng:");
		lblNewLabel_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1_1.setForeground(new Color(39, 41, 69));
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_14.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JLabel lblHoVaTen_1_1_4 = new JLabel("Sinh viên");
		lblHoVaTen_1_1_4.setForeground(new Color(39, 41, 69));
		lblHoVaTen_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_14.add(lblHoVaTen_1_1_4);
		
		JPanel panel_15 = new JPanel();
		panel_13.add(panel_15);
		
		JPanel panel_10_1 = new JPanel();
		panel_10_1.setBackground(Color.WHITE);
		panel_7.add(panel_10_1, BorderLayout.NORTH);
		panel_10_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		FlowLayout flowLayout = (FlowLayout) panel_3.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_10_1.add(panel_3, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1_3 = new JLabel("Thông tin người mua vé");
		lblNewLabel_1_3.setForeground(new Color(83, 169, 255));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_3.add(lblNewLabel_1_3);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_10_1.add(panel_9, BorderLayout.CENTER);
		panel_9.setLayout(new GridLayout(4, 3, 5, 10));
		
		JLabel lblNewLabel_1_1_4 = new JLabel("Họ và tên: ");
		lblNewLabel_1_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_4.setForeground(new Color(39, 41, 69));
		lblNewLabel_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_9.add(lblNewLabel_1_1_4);
		
		JLabel lblHoVaTen_1 = new JLabel("Đoàn Quang Quý");
		lblHoVaTen_1.setForeground(new Color(39, 41, 69));
		lblHoVaTen_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_9.add(lblHoVaTen_1);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		panel_9.add(horizontalStrut);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Số điện thoại:");
		lblNewLabel_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2_1.setForeground(new Color(39, 41, 69));
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_9.add(lblNewLabel_1_1_2_1);
		
		JLabel lblCMND_1 = new JLabel("197458385");
		lblCMND_1.setForeground(new Color(39, 41, 69));
		lblCMND_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_9.add(lblCMND_1);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		panel_9.add(horizontalStrut_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("CMND/CCCD: ");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setForeground(new Color(39, 41, 69));
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_9.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblSoDienThoai_1 = new JLabel("0385177456");
		lblSoDienThoai_1.setForeground(new Color(39, 41, 69));
		lblSoDienThoai_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_9.add(lblSoDienThoai_1);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		panel_9.add(horizontalStrut_2);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		panel_1.setBackground(new Color(240, 240, 240));
		
		Component verticalStrut = Box.createVerticalStrut(50);
		panel_1.add(verticalStrut);
		
		JLabel lblNewLabel_4 = new JLabel("Trả vé");
		lblNewLabel_4.setForeground(new Color(217, 108, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_1.add(lblNewLabel_4);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		panel_1.add(verticalStrut_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(240, 240, 240));
		contentPane.add(panel_6, BorderLayout.SOUTH);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.X_AXIS));
		
		Component horizontalGlue = Box.createHorizontalGlue();
		panel_6.add(horizontalGlue);
		
		Component verticalStrut_2 = Box.createVerticalStrut(40);
		panel_6.add(verticalStrut_2);
		
		JButton btnTiepTuc = new JButton("Tiếp tục");
		btnTiepTuc.setIcon(new ImageIcon(TraVe_UI.class.getResource("/img/9004839_next_right_direction_arrow.png")));
		btnTiepTuc.setForeground(Color.DARK_GRAY);
		btnTiepTuc.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTiepTuc.setBackground(Color.LIGHT_GRAY);
		panel_6.add(btnTiepTuc);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		panel_6.add(horizontalStrut_6);
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
