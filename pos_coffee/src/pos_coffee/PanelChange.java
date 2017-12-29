package pos_coffee;

import java.awt.*;
import javax.swing.*;

public class PanelChange {
	private static Component[] x;
	private static Container contentPane;

	protected int Num =4;
	// 생성되는 Panel

	public static Component getPanel(int i) {
		return x[i];
	}// getPanel()

	public PanelChange(JPanel main) {
		      x = new Component[Num];

		      
		      
		      
		   contentPane = main;
		     // contentPane.add(/*처음 */);
		      contentPane.revalidate();
		      contentPane.repaint();
		   }// ViewControl()

	public static void viewPanel(int prev, int next) {// 화면전환을 실행하는 함수
		contentPane.remove(x[prev]);
		contentPane.add(x[next]);
		contentPane.revalidate();
		contentPane.repaint();
	}// viewPanel()
}// PanelChange
