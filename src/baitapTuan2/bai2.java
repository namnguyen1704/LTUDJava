package baitapTuan2;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class bai2 extends JFrame {
	public bai2 () {
		super ("FlowLayout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(400,300);
		this.setVisible(true);
		JPanel pnFlow=new JPanel();
		pnFlow.setLayout(new FlowLayout());
		pnFlow.setBackground(Color.PINK);
		JButton btn1=new JButton("FlowLayout");
		JButton btn2=new JButton("Add các control");
		JButton btn3=new JButton("Trên 1 dòng");
		JButton btn4=new JButton("Hết chỗ chứa");
		JButton btn5=new JButton("Thì xuống dưới");
		pnFlow.add(btn1);
		pnFlow.add(btn2);
		pnFlow.add(btn3);
		pnFlow.add(btn4);
		pnFlow.add(btn5);
		java.awt.Container con = getContentPane();
		con.add(pnFlow);
		
		
		
		
		
		
	}
	

	public static void main(String[] args) {
		new bai2();
		
		// TODO Auto-generated method stub

	}

}
