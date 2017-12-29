package pos_coffee;

import java.awt.*;
import javax.swing.*;

public class PanelChange {
	private static Component[] x;
	private static Container contentPane;

	private static MainPanel MainPanel;
	private static ProductMemberPanel ProductPanel;
	private static ProductMemberPanel MemberPanel;
	private static SalesPanel SalesPanel;

	protected int Num = 4;
	// 생성되는 Panel

	public static Component getPanel(int i) {
		return x[i];
	}// getPanel()

	public PanelChange(JPanel main) {
		x = new Component[Num];

		MainPanel = new MainPanel();
		ProductPanel = new ProductMemberPanel();
		MemberPanel = new ProductMemberPanel();
		SalesPanel = new SalesPanel();

		x[0] = MainPanel;
		x[1] = ProductPanel;
		x[2] = MemberPanel;
		x[3] = SalesPanel;

		contentPane = main;
		contentPane.add(MainPanel);
		contentPane.revalidate();
		contentPane.repaint();
	}// ViewControl()

	public static void viewPanel( int main) {// 화면전환을 실행하는 함수
		contentPane.removeAll();
		contentPane.add(x[main]);
		contentPane.revalidate();
		contentPane.repaint();
	}// viewPanel()
}// PanelChange
