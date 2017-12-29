package pos_coffee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TabPanel extends JFrame {
	protected JPanel Bottom;
	// 상단 부분
	protected JPanel Top;
	protected JButton mainBtn;
	protected JButton productBtn;
	protected JButton memberBtn;
	protected JButton salesBtn;
	protected JLabel dateClockLbl;

	// 하단 -> 메인 부분
	protected JPanel Main;

	public TabPanel() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1280, 1080);
		this.setLocation(50, 0);
		this.setTitle("::멀티챗::");

		Bottom = new JPanel();
		Bottom.setBackground(Color.white);
		Bottom.setLayout(new BorderLayout());
		this.getContentPane().add(Bottom);

		Top = new JPanel();
		Top.setBackground(Color.white);
		Top.setLayout(new FlowLayout());
		Bottom.add(Top, BorderLayout.NORTH);

		Font fnt = new Font("", Font.BOLD, 30);

		mainBtn = new JButton("메인");
		mainBtn.setFont(fnt);
		Top.add(mainBtn);

		productBtn = new JButton("상품");
		productBtn.setFont(fnt);
		Top.add(productBtn);

		memberBtn = new JButton("회원");
		memberBtn.setFont(fnt);
		Top.add(memberBtn);

		salesBtn = new JButton("매출");
		salesBtn.setFont(fnt);
		Top.add(salesBtn);

		dateClockLbl = new JLabel("시계랍니다.");
		dateClockLbl.setFont(fnt);
		Top.add(dateClockLbl);

		Main = new JPanel();
		Main.setBackground(Color.white);
		Bottom.add(Main, BorderLayout.CENTER);

		new PanelChange(Main);

		this.setVisible(true);
	}

	void addButtonActionListener(ActionListener listener) {
		mainBtn.addActionListener(listener);
		productBtn.addActionListener(listener);
		memberBtn.addActionListener(listener);
		salesBtn.addActionListener(listener);
		}
}
