package br.com.ssantos.calc.visao;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class Display extends JPanel {

	private final JLabel label;

	public Display() {
		setBackground(new Color(46, 49, 50));
		label = new JLabel("1234,56");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courier", Font.PLAIN, 30));

		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 17));
		add(label);
	}

}
