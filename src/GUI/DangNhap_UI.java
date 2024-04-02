package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

public class DangNhap_UI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTenDangNhap;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPasswordField txtPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DangNhap_UI frame = new DangNhap_UI();
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
	public DangNhap_UI() {
		setTitle("Đăng Nhập");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(DangNhap_UI.class.getResource("/img/BANNER.png")));
		lblNewLabel.setBounds(0, 0, 420, 501);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnDangNhap = new JButton("Đăng nhập");
		btnDangNhap.setBounds(51, 353, 246, 42);
		btnDangNhap.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDangNhap.setBackground(new Color(83, 169, 255));
		btnDangNhap.setForeground(new Color(255, 255, 255));
		btnDangNhap.setBorderPainted(false);
		panel_1.add(btnDangNhap);
		
		txtTenDangNhap = new JTextField();
		txtTenDangNhap.setBackground(new Color(248, 248, 248));
		txtTenDangNhap.setToolTipText("");
		txtTenDangNhap.setBounds(58, 167, 239, 33);
		txtTenDangNhap.setColumns(10);
		panel_1.add(txtTenDangNhap);
		
		JRadioButton rdbNhanVien = new JRadioButton("Nhân viên");
		rdbNhanVien.setForeground(new Color(83, 169, 255));
		rdbNhanVien.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbNhanVien.setBackground(Color.WHITE);
		rdbNhanVien.setBounds(140, 288, 81, 23);
		rdbNhanVien.setSelected(true);
		buttonGroup.add(rdbNhanVien);
		panel_1.add(rdbNhanVien);
		
		JRadioButton rdbQuanLy = new JRadioButton("Quản lý");
		rdbQuanLy.setForeground(new Color(83, 169, 255));
		rdbQuanLy.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbQuanLy.setBackground(Color.WHITE);
		rdbQuanLy.setBounds(223, 288, 74, 23);
		buttonGroup.add(rdbQuanLy);
		panel_1.add(rdbQuanLy);
		
		txtPass = new JPasswordField();
		txtPass.setBackground(new Color(248, 248, 248));
		txtPass.setBounds(58, 249, 239, 33);
		panel_1.add(txtPass);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBackground(new Color(83, 169, 255));
		btnNewButton_1.setBounds(51, 167, 18, 32);
		btnNewButton_1.setBorderPainted(false);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setEnabled(false);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1_1.setBounds(51, 249, 18, 32);
		btnNewButton_1_1.setBorderPainted(false);
		panel_1.add(btnNewButton_1_1);
		
		JCheckBox cBoxNho = new JCheckBox("Nhớ tôi");
		cBoxNho.setFont(new Font("Tahoma", Font.BOLD, 11));
		cBoxNho.setForeground(new Color(83, 169, 255));
		cBoxNho.setBackground(Color.WHITE);
		cBoxNho.setBounds(52, 288, 74, 23);
		panel_1.add(cBoxNho);
		
		JLabel lblNewLabel_1 = new JLabel("ĐĂNG NHẬP TÀI KHOẢN");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(83, 169, 255));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(51, 61, 246, 60);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tên đăng nhập: ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2.setBounds(51, 142, 246, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Mật khẩu: ");
		lblNewLabel_2_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(51, 224, 246, 14);
		panel_1.add(lblNewLabel_2_1);
		
		JButton btnQuenMK = new JButton("Quên mật khẩu ?");
		btnQuenMK.setForeground(Color.DARK_GRAY);
		btnQuenMK.setBackground(Color.WHITE);
		btnQuenMK.setBounds(51, 401, 246, 23);
		btnQuenMK.setBorderPainted(false);
		panel_1.add(btnQuenMK);
	}
}
