package pos_coffee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TabPanel extends JFrame {
	protected JPanel Bottom;
	// ��� �κ�
	protected JPanel Top;
	protected JButton mainBtn;
	protected JButton productBtn;
	protected JButton memberBtn;
	protected JButton salesBtn;
	protected JLabel dateClockLbl;

	// �ϴ� -> ���� �κ�
	protected JPanel Main;

	public TabPanel() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1280, 1080);
		this.setLocation(50, 0);
		this.setTitle("::��Ƽê::");

		Bottom = new JPanel();
		Bottom.setBackground(Color.white);
		Bottom.setLayout(new BorderLayout());
		this.getContentPane().add(Bottom);

		Top = new JPanel();
		Top.setBackground(Color.white);
		Top.setLayout(new FlowLayout());
		Bottom.add(Top, BorderLayout.NORTH);

		Font fnt = new Font("", Font.BOLD, 30);

		mainBtn = new JButton("����");
		mainBtn.setFont(fnt);
		Top.add(mainBtn);

		productBtn = new JButton("��ǰ");
		productBtn.setFont(fnt);
		Top.add(productBtn);

		memberBtn = new JButton("ȸ��");
		memberBtn.setFont(fnt);
		Top.add(memberBtn);

		salesBtn = new JButton("����");
		salesBtn.setFont(fnt);
		Top.add(salesBtn);

		dateClockLbl = new JLabel("�ð���ϴ�.");
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
