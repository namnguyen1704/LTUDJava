package baitapTuan2;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class bai3 extends JFrame {
	public bai3 () {
		super ("BoxLayout");
		this.setSize(500,500);
		this.setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel pnBox=new JPanel();
		pnBox.setLayout(new BoxLayout(pnBox,BoxLayout.X_AXIS));
		JButton btn1 = new JButton("BoxLayout");
		btn1.setForeground(Color.RED);
		Font font=new Font("Arial",Font.BOLD / Font.ITALIC,25);
		btn1.setFont(font);pnBox.add(btn1);
		JButton btn2 = new JButton("X_AXIS");
		btn2.setForeground(Color.BLUE);
		btn2.setFont(font);pnBox.add(btn2);
		JButton btn3=new JButton("Y_AXIS");
		btn3.setFont(font);pnBox.add(btn3);
		Container con = getContentPane();
		con.add(pnBox);
		
	}
	

	public static void main(String[] args) {
		new bai3();
		// TODO Auto-generated method stub

	}

}
