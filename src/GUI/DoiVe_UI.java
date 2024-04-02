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

public class DoiVe_UI extends JFrame {

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
					DoiVe_UI frame = new DoiVe_UI();
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
	public DoiVe_UI() {
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
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(200);
		horizontalStrut_1.setBackground(Color.LIGHT_GRAY);
		panel.add(horizontalStrut_1);
		
		JLabel lblNewLabel = new JLabel("Mã vé: ");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		panel.add(lblNewLabel);
		
		txtGaDen = new JTextField();
		txtGaDen.setColumns(10);
		panel.add(txtGaDen);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_2);
		
		JLabel lblNewLabel_1 = new JLabel("Loại vé: ");
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(240, 240, 240));
		panel.add(panel_3);
		
		JRadioButton rdbKhuHoi = new JRadioButton("Khứ hồi");
		rdbKhuHoi.setBackground(new Color(240, 240, 240));
		buttonGroup.add(rdbKhuHoi);
		panel_3.add(rdbKhuHoi);
		
		JRadioButton rdbMotChieu = new JRadioButton("Một chiều");
		rdbMotChieu.setBackground(new Color(240, 240, 240));
		buttonGroup.add(rdbMotChieu);
		panel_3.add(rdbMotChieu);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_3);
		
		JLabel lblNewLabel_2 = new JLabel("Ngày đi mới: ");
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_2);
		
		JDateChooser dateNgayDi = new JDateChooser();
		panel.add(dateNgayDi);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_4);
		
		JLabel lblNewLabel_3 = new JLabel("Ngày về mới:");
		lblNewLabel_3.setForeground(Color.DARK_GRAY);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_3);
		
		JDateChooser datNgayVe = new JDateChooser();
		panel.add(datNgayVe);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut);
		
		JButton btnTim = new JButton("Tìm");
		btnTim.setIcon(new ImageIcon(DoiVe_UI.class.getResource("/img/9004811_zoom_magnifier_find_search.png")));
		btnTim.setForeground(Color.DARK_GRAY);
		btnTim.setBackground(Color.LIGHT_GRAY);
		btnTim.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(btnTim);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut_5);
		
		JButton btnHuy = new JButton("Hủy");
		btnHuy.setIcon(new ImageIcon(DoiVe_UI.class.getResource("/img/9004828_cancel_remove_delete_cross.png")));
		btnHuy.setBackground(Color.LIGHT_GRAY);
		btnHuy.setForeground(Color.DARK_GRAY);
		btnHuy.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(btnHuy);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		panel_2.add(rigidArea_2, BorderLayout.SOUTH);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(83, 169, 255));
		panel_2.add(panel_12, BorderLayout.NORTH);
		
		JLabel lblNewLabel_6 = new JLabel("THÔNG TIN ĐỔI VÉ");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6.setBackground(SystemColor.textHighlight);
		panel_12.add(lblNewLabel_6);
		
		Component horizontalStrut_9 = Box.createHorizontalStrut(25);
		panel_2.add(horizontalStrut_9, BorderLayout.WEST);
		
		Component horizontalStrut_10 = Box.createHorizontalStrut(25);
		panel_2.add(horizontalStrut_10, BorderLayout.EAST);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		contentPane.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_4.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_5.add(panel_7);
		panel_7.setLayout(new BoxLayout(panel_7, BoxLayout.Y_AXIS));
		
		JPanel panel_10 = new JPanel();
		panel_7.add(panel_10);
		panel_10.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_10.add(panel_9);
		panel_9.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10));
		
		JPanel panel_16_10 = new JPanel();
		panel_16_10.setBackground(Color.WHITE);
		panel_9.add(panel_16_10);
		panel_16_10.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnToaSo10 = new JButton("");
		btnToaSo10.setIcon(new ImageIcon(DoiVe_UI.class.getResource("/img/trainCar.png")));
		btnToaSo10.setBorderPainted(false);
		btnToaSo10.setBackground(Color.WHITE);
		panel_16_10.add(btnToaSo10);
		
		JLabel lblNewLabel_7_9 = new JLabel("10");
		lblNewLabel_7_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_9.setBackground(Color.WHITE);
		panel_16_10.add(lblNewLabel_7_9);
		
		JPanel panel_16_9 = new JPanel();
		panel_16_9.setBackground(Color.WHITE);
		panel_9.add(panel_16_9);
		panel_16_9.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnToaSo9 = new JButton("");
		btnToaSo9.setIcon(new ImageIcon(DoiVe_UI.class.getResource("/img/trainCar.png")));
		btnToaSo9.setBorderPainted(false);
		btnToaSo9.setBackground(Color.WHITE);
		panel_16_9.add(btnToaSo9);
		
		JLabel lblNewLabel_7_8 = new JLabel("9");
		lblNewLabel_7_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_8.setBackground(Color.WHITE);
		panel_16_9.add(lblNewLabel_7_8);
		
		JPanel panel_16_8 = new JPanel();
		panel_16_8.setBackground(Color.WHITE);
		panel_9.add(panel_16_8);
		panel_16_8.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnToaSo8 = new JButton("");
		btnToaSo8.setIcon(new ImageIcon(DoiVe_UI.class.getResource("/img/trainCar.png")));
		btnToaSo8.setBorderPainted(false);
		btnToaSo8.setBackground(Color.WHITE);
		panel_16_8.add(btnToaSo8);
		
		JLabel lblNewLabel_7_7 = new JLabel("8");
		lblNewLabel_7_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_7.setBackground(Color.WHITE);
		panel_16_8.add(lblNewLabel_7_7);
		
		JPanel panel_16_7 = new JPanel();
		panel_16_7.setBackground(Color.WHITE);
		panel_9.add(panel_16_7);
		panel_16_7.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnToaSo7 = new JButton("");
		btnToaSo7.setIcon(new ImageIcon(DoiVe_UI.class.getResource("/img/trainCar.png")));
		btnToaSo7.setBorderPainted(false);
		btnToaSo7.setBackground(Color.WHITE);
		panel_16_7.add(btnToaSo7);
		
		JLabel lblNewLabel_7_6 = new JLabel("7");
		lblNewLabel_7_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_6.setBackground(Color.WHITE);
		panel_16_7.add(lblNewLabel_7_6);
		
		JPanel panel_16_6 = new JPanel();
		panel_16_6.setBackground(Color.WHITE);
		panel_9.add(panel_16_6);
		panel_16_6.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnToaSo6 = new JButton("");
		btnToaSo6.setIcon(new ImageIcon(DoiVe_UI.class.getResource("/img/trainCar.png")));
		btnToaSo6.setBorderPainted(false);
		btnToaSo6.setBackground(Color.WHITE);
		panel_16_6.add(btnToaSo6);
		
		JLabel lblNewLabel_7_5 = new JLabel("6");
		lblNewLabel_7_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_5.setBackground(Color.WHITE);
		panel_16_6.add(lblNewLabel_7_5);
		
		JPanel panel_16_5 = new JPanel();
		panel_16_5.setBackground(Color.WHITE);
		panel_9.add(panel_16_5);
		panel_16_5.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnToaSo5 = new JButton("");
		btnToaSo5.setIcon(new ImageIcon(DoiVe_UI.class.getResource("/img/trainCar.png")));
		btnToaSo5.setBorderPainted(false);
		btnToaSo5.setBackground(Color.WHITE);
		panel_16_5.add(btnToaSo5);
		
		JLabel lblNewLabel_7_4 = new JLabel("5");
		lblNewLabel_7_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_4.setBackground(Color.WHITE);
		panel_16_5.add(lblNewLabel_7_4);
		
		JPanel panel_16_4 = new JPanel();
		panel_16_4.setBackground(Color.WHITE);
		panel_9.add(panel_16_4);
		panel_16_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnToaSo4 = new JButton("");
		btnToaSo4.setIcon(new ImageIcon(DoiVe_UI.class.getResource("/img/trainCar.png")));
		btnToaSo4.setBorderPainted(false);
		btnToaSo4.setBackground(Color.WHITE);
		panel_16_4.add(btnToaSo4);
		
		JLabel lblNewLabel_7_3 = new JLabel("4");
		lblNewLabel_7_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_3.setBackground(Color.WHITE);
		panel_16_4.add(lblNewLabel_7_3);
		
		JPanel panel_16_3 = new JPanel();
		panel_16_3.setBackground(Color.WHITE);
		panel_9.add(panel_16_3);
		panel_16_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnToaSo3 = new JButton("");
		btnToaSo3.setIcon(new ImageIcon(DoiVe_UI.class.getResource("/img/trainCar.png")));
		btnToaSo3.setBorderPainted(false);
		btnToaSo3.setBackground(Color.WHITE);
		panel_16_3.add(btnToaSo3);
		
		JLabel lblNewLabel_7_2 = new JLabel("3");
		lblNewLabel_7_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_2.setBackground(Color.WHITE);
		panel_16_3.add(lblNewLabel_7_2);
		
		JPanel panel_16_2 = new JPanel();
		panel_16_2.setBackground(Color.WHITE);
		panel_9.add(panel_16_2);
		panel_16_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnToaSo2 = new JButton("");
		btnToaSo2.setIcon(new ImageIcon(DoiVe_UI.class.getResource("/img/trainCar.png")));
		btnToaSo2.setBorderPainted(false);
		btnToaSo2.setBackground(Color.WHITE);
		panel_16_2.add(btnToaSo2);
		
		JLabel lblNewLabel_7_1 = new JLabel("2");
		lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_1.setBackground(Color.WHITE);
		panel_16_2.add(lblNewLabel_7_1);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(Color.WHITE);
		panel_9.add(panel_16);
		panel_16.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnToaSo1 = new JButton("");
		btnToaSo1.setIcon(new ImageIcon(DoiVe_UI.class.getResource("/img/trainCar.png")));
		btnToaSo1.setBackground(Color.WHITE);
		btnToaSo1.setBorderPainted(false);
		panel_16.add(btnToaSo1);
		
		JLabel lblNewLabel_7 = new JLabel("1");
		lblNewLabel_7.setBackground(Color.WHITE);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_16.add(lblNewLabel_7);
		
		JPanel panel_16_1 = new JPanel();
		panel_16_1.setBackground(Color.WHITE);
		panel_9.add(panel_16_1);
		panel_16_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnDauTau = new JButton("");
		btnDauTau.setIcon(new ImageIcon(DoiVe_UI.class.getResource("/img/train2.png")));
		btnDauTau.setBackground(Color.WHITE);
		btnDauTau.setBorderPainted(false);
		panel_16_1.add(btnDauTau);
		
		JLabel lblTenTauGT = new JLabel("SE 3");
		lblTenTauGT.setHorizontalAlignment(SwingConstants.CENTER);
		panel_16_1.add(lblTenTauGT);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.WHITE);
		panel_10.add(panel_11);
		panel_11.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_5 = new JLabel("Toa số 1: Ngồi mềm điều hòa");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_11.add(lblNewLabel_5);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(176, 222, 255));
		panel_7.add(panel_8);
		panel_8.setLayout(new GridLayout(2, 2, 0, 5));
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(Color.WHITE);
		panel_15.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Khoang s\u1ED1 1", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(83, 169, 255)));
		panel_8.add(panel_15);
		panel_15.setLayout(new GridLayout(2, 6, 0, 0));
		
		JCheckBox cho1 = new JCheckBox("1");
		cho1.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho1.setBackground(new Color(213, 237, 255));
		panel_15.add(cho1);
		
		JCheckBox cho2 = new JCheckBox("2");
		cho2.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho2.setBackground(new Color(213, 237, 255));
		panel_15.add(cho2);
		
		JCheckBox cho3 = new JCheckBox("3");
		cho3.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho3.setBackground(new Color(213, 237, 255));
		panel_15.add(cho3);
		
		JCheckBox cho4 = new JCheckBox("4");
		cho4.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho4.setBackground(new Color(213, 237, 255));
		panel_15.add(cho4);
		
		JCheckBox cho5 = new JCheckBox("5");
		cho5.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho5.setBackground(new Color(213, 237, 255));
		panel_15.add(cho5);
		
		JCheckBox cho6 = new JCheckBox("6");
		cho6.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho6.setBackground(new Color(213, 237, 255));
		panel_15.add(cho6);
		
		JCheckBox cho7 = new JCheckBox("7");
		cho7.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho7.setBackground(new Color(213, 237, 255));
		panel_15.add(cho7);
		
		JCheckBox cho8 = new JCheckBox("8");
		cho8.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho8.setBackground(new Color(213, 237, 255));
		panel_15.add(cho8);
		
		JCheckBox cho9 = new JCheckBox("9");
		cho9.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho9.setBackground(new Color(213, 237, 255));
		panel_15.add(cho9);
		
		JCheckBox cho10 = new JCheckBox("10");
		cho10.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho10.setBackground(new Color(213, 237, 255));
		panel_15.add(cho10);
		
		JCheckBox cho11 = new JCheckBox("11");
		cho11.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho11.setBackground(new Color(213, 237, 255));
		panel_15.add(cho11);
		
		JCheckBox cho12 = new JCheckBox("12");
		cho12.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho12.setBackground(new Color(213, 237, 255));
		panel_15.add(cho12);
		
		JCheckBox cho13 = new JCheckBox("13");
		cho13.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho13.setBackground(new Color(213, 237, 255));
		panel_15.add(cho13);
		
		JCheckBox cho14 = new JCheckBox("14");
		cho14.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho14.setBackground(new Color(213, 237, 255));
		panel_15.add(cho14);
		
		JPanel panel_15_1 = new JPanel();
		panel_15_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Khoang s\u1ED1 3", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(83, 169, 255)));
		panel_15_1.setBackground(Color.WHITE);
		panel_8.add(panel_15_1);
		panel_15_1.setLayout(new GridLayout(2, 6, 0, 0));
		
		JCheckBox cho29 = new JCheckBox("29");
		cho29.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho29.setBackground(new Color(213, 237, 255));
		panel_15_1.add(cho29);
		
		JCheckBox cho30 = new JCheckBox("30");
		cho30.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho30.setBackground(new Color(213, 237, 255));
		panel_15_1.add(cho30);
		
		JCheckBox cho3_1 = new JCheckBox("31");
		cho3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho3_1.setBackground(new Color(213, 237, 255));
		panel_15_1.add(cho3_1);
		
		JCheckBox cho32 = new JCheckBox("32");
		cho32.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho32.setBackground(new Color(213, 237, 255));
		panel_15_1.add(cho32);
		
		JCheckBox cho33 = new JCheckBox("33");
		cho33.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho33.setBackground(new Color(213, 237, 255));
		panel_15_1.add(cho33);
		
		JCheckBox cho34 = new JCheckBox("34");
		cho34.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho34.setBackground(new Color(213, 237, 255));
		panel_15_1.add(cho34);
		
		JCheckBox cho35 = new JCheckBox("35");
		cho35.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho35.setBackground(new Color(213, 237, 255));
		panel_15_1.add(cho35);
		
		JCheckBox cho36 = new JCheckBox("36");
		cho36.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho36.setBackground(new Color(213, 237, 255));
		panel_15_1.add(cho36);
		
		JCheckBox cho37 = new JCheckBox("37");
		cho37.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho37.setBackground(new Color(213, 237, 255));
		panel_15_1.add(cho37);
		
		JCheckBox cho38 = new JCheckBox("38");
		cho38.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho38.setBackground(new Color(213, 237, 255));
		panel_15_1.add(cho38);
		
		JCheckBox cho39 = new JCheckBox("39");
		cho39.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho39.setBackground(new Color(213, 237, 255));
		panel_15_1.add(cho39);
		
		JCheckBox cho40 = new JCheckBox("40");
		cho40.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho40.setBackground(new Color(213, 237, 255));
		panel_15_1.add(cho40);
		
		JCheckBox cho41 = new JCheckBox("41");
		cho41.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho41.setBackground(new Color(213, 237, 255));
		panel_15_1.add(cho41);
		
		JCheckBox cho42 = new JCheckBox("42");
		cho42.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho42.setBackground(new Color(213, 237, 255));
		panel_15_1.add(cho42);
		
		JPanel panel_15_2 = new JPanel();
		panel_15_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Khoang s\u1ED1 2", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(83, 169, 255)));
		panel_15_2.setBackground(Color.WHITE);
		panel_8.add(panel_15_2);
		panel_15_2.setLayout(new GridLayout(2, 6, 0, 0));
		
		JCheckBox cho15 = new JCheckBox("15");
		cho15.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho15.setBackground(new Color(213, 237, 255));
		panel_15_2.add(cho15);
		
		JCheckBox cho16 = new JCheckBox("16");
		cho16.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho16.setBackground(new Color(213, 237, 255));
		panel_15_2.add(cho16);
		
		JCheckBox cho17 = new JCheckBox("17");
		cho17.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho17.setBackground(new Color(213, 237, 255));
		panel_15_2.add(cho17);
		
		JCheckBox cho4_2 = new JCheckBox("18");
		cho4_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho4_2.setBackground(new Color(213, 237, 255));
		panel_15_2.add(cho4_2);
		
		JCheckBox cho19 = new JCheckBox("19");
		cho19.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho19.setBackground(new Color(213, 237, 255));
		panel_15_2.add(cho19);
		
		JCheckBox cho20 = new JCheckBox("20");
		cho20.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho20.setBackground(new Color(213, 237, 255));
		panel_15_2.add(cho20);
		
		JCheckBox cho21 = new JCheckBox("21");
		cho21.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho21.setBackground(new Color(213, 237, 255));
		panel_15_2.add(cho21);
		
		JCheckBox cho22 = new JCheckBox("22");
		cho22.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho22.setBackground(new Color(213, 237, 255));
		panel_15_2.add(cho22);
		
		JCheckBox cho23 = new JCheckBox("23");
		cho23.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho23.setBackground(new Color(213, 237, 255));
		panel_15_2.add(cho23);
		
		JCheckBox cho24 = new JCheckBox("24");
		cho24.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho24.setBackground(new Color(213, 237, 255));
		panel_15_2.add(cho24);
		
		JCheckBox cho25 = new JCheckBox("25");
		cho25.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho25.setBackground(new Color(213, 237, 255));
		panel_15_2.add(cho25);
		
		JCheckBox cho26 = new JCheckBox("26");
		cho26.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho26.setBackground(new Color(213, 237, 255));
		panel_15_2.add(cho26);
		
		JCheckBox cho27 = new JCheckBox("27");
		cho27.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho27.setBackground(new Color(213, 237, 255));
		panel_15_2.add(cho27);
		
		JCheckBox cho28 = new JCheckBox("28");
		cho28.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho28.setBackground(new Color(213, 237, 255));
		panel_15_2.add(cho28);
		
		JPanel panel_15_3 = new JPanel();
		panel_15_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Khoang s\u1ED1 4", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(83, 169, 255)));
		panel_15_3.setBackground(Color.WHITE);
		panel_8.add(panel_15_3);
		panel_15_3.setLayout(new GridLayout(2, 6, 0, 0));
		
		JCheckBox cho43 = new JCheckBox("43");
		cho43.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho43.setBackground(new Color(213, 237, 255));
		panel_15_3.add(cho43);
		
		JCheckBox cho44 = new JCheckBox("44");
		cho44.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho44.setBackground(new Color(213, 237, 255));
		panel_15_3.add(cho44);
		
		JCheckBox cho45 = new JCheckBox("45");
		cho45.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho45.setBackground(new Color(213, 237, 255));
		panel_15_3.add(cho45);
		
		JCheckBox cho46 = new JCheckBox("46");
		cho46.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho46.setBackground(new Color(213, 237, 255));
		panel_15_3.add(cho46);
		
		JCheckBox cho47 = new JCheckBox("47");
		cho47.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho47.setBackground(new Color(213, 237, 255));
		panel_15_3.add(cho47);
		
		JCheckBox cho48 = new JCheckBox("48");
		cho48.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho48.setBackground(new Color(213, 237, 255));
		panel_15_3.add(cho48);
		
		JCheckBox cho49 = new JCheckBox("49");
		cho49.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho49.setBackground(new Color(213, 237, 255));
		panel_15_3.add(cho49);
		
		JCheckBox cho50 = new JCheckBox("50");
		cho50.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho50.setBackground(new Color(213, 237, 255));
		panel_15_3.add(cho50);
		
		JCheckBox cho51 = new JCheckBox("51");
		cho51.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho51.setBackground(new Color(213, 237, 255));
		panel_15_3.add(cho51);
		
		JCheckBox cho52 = new JCheckBox("52");
		cho52.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho52.setBackground(new Color(213, 237, 255));
		panel_15_3.add(cho52);
		
		JCheckBox cho53 = new JCheckBox("53");
		cho53.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho53.setBackground(new Color(213, 237, 255));
		panel_15_3.add(cho53);
		
		JCheckBox cho54 = new JCheckBox("54");
		cho54.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho54.setBackground(new Color(213, 237, 255));
		panel_15_3.add(cho54);
		
		JCheckBox cho55 = new JCheckBox("55");
		cho55.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho55.setBackground(new Color(213, 237, 255));
		panel_15_3.add(cho55);
		
		JCheckBox cho56 = new JCheckBox("56");
		cho56.setFont(new Font("Tahoma", Font.BOLD, 15));
		cho56.setBackground(new Color(213, 237, 255));
		panel_15_3.add(cho56);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.WHITE);
		panel_4.add(panel_13, BorderLayout.NORTH);
		panel_13.setLayout(new GridLayout(0, 5, 0, 0));
		
		Component verticalStrut_4 = Box.createVerticalStrut(200);
		verticalStrut_4.setBackground(Color.WHITE);
		panel_13.add(verticalStrut_4);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(Color.WHITE);
		panel_13.add(panel_14);
		panel_14.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnTau1 = new JButton("");
		btnTau1.setForeground(Color.WHITE);
		btnTau1.setBackground(Color.WHITE);
		btnTau1.setIcon(new ImageIcon(DoiVe_UI.class.getResource("/img/tau.png")));
		btnTau1.setBorderPainted(false);
		panel_14.add(btnTau1);
		
		JPanel panel_14_1 = new JPanel();
		panel_14_1.setBackground(Color.WHITE);
		panel_14_1.setLayout(null);
		panel_13.add(panel_14_1);
		
		JPanel panel_14_2 = new JPanel();
		panel_14_2.setBackground(Color.WHITE);
		panel_13.add(panel_14_2);
		panel_14_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnTau2 = new JButton("");
		btnTau2.setIcon(new ImageIcon(DoiVe_UI.class.getResource("/img/tau.png")));
		btnTau2.setBackground(Color.WHITE);
		btnTau2.setForeground(Color.WHITE);
		btnTau2.setBorderPainted(false);
		panel_14_2.add(btnTau2);
		
		Component verticalStrut_4_1 = Box.createVerticalStrut(100);
		verticalStrut_4_1.setBackground(Color.WHITE);
		panel_13.add(verticalStrut_4_1);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		panel_1.setBackground(new Color(240, 240, 240));
		
		Component verticalStrut = Box.createVerticalStrut(50);
		panel_1.add(verticalStrut);
		
		JLabel lblNewLabel_4 = new JLabel("Đổi vé");
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
		btnTiepTuc.setIcon(new ImageIcon(DoiVe_UI.class.getResource("/img/9004839_next_right_direction_arrow.png")));
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
