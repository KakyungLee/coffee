package pos_coffee;

import java.awt.*;
import javax.swing.*;

public class PanelChange {
	private static Component[] x;
	private static Container contentPane;

	protected int Num =4;
	// �����Ǵ� Panel

	public static Component getPanel(int i) {
		return x[i];
	}// getPanel()

	public PanelChange(JPanel main) {
		      x = new Component[Num];

		      
		      
		      
		   contentPane = main;
		     // contentPane.add(/*ó�� */);
		      contentPane.revalidate();
		      contentPane.repaint();
		   }// ViewControl()

	public static void viewPanel(int prev, int next) {// ȭ����ȯ�� �����ϴ� �Լ�
		contentPane.remove(x[prev]);
		contentPane.add(x[next]);
		contentPane.revalidate();
		contentPane.repaint();
	}// viewPanel()
}// PanelChange
