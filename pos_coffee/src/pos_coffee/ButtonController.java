package pos_coffee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ButtonController {
	private final TabPanel t;

	public ButtonController(TabPanel tab) {
		this.t = tab;
	}

	void appMain() {
		t.addButtonActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();
				if (obj == t.mainBtn) {
					t.Main.setBackground(Color.red);

				} else if (obj == t.productBtn) {
					t.Main.setBackground(Color.blue);

				} else if (obj == t.memberBtn) {
					t.Main.setBackground(Color.black);

				} else if (obj == t.salesBtn) {
					t.Main.setBackground(Color.white);
				}
			}// actionPerformed
		});
	}

	public static void main(String[] args) {
		ButtonController app = new ButtonController(new TabPanel());
		app.appMain();

	}// main
}
