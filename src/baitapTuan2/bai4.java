package baitapTuan2;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class bai4 extends JFrame {
	public bai4 () {
		super("BorderLayout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(400,300);
		this.setVisible(true);
		
		JPanel pnBorder=new JPanel();
		pnBorder.setLayout(new BorderLayout());
		JPanel pnNorth=new JPanel();
		pnNorth.setBackground(Color.RED);
		pnBorder.add(pnNorth,BorderLayout.NORTH);
		JLabel lblN = new JLabel("North");
		pnNorth.add(lblN);
		
		JPanel pnSouth=new JPanel();
		pnSouth.setBackground(Color.RED);
		pnBorder.add(pnSouth,BorderLayout.SOUTH);
		JLabel lblS = new JLabel("South");
		pnSouth.add(lblS);
		
		JPanel pnWest=new JPanel();
		pnWest.setBackground(Color.BLUE);
		pnBorder.add(pnWest,BorderLayout.WEST);
		JLabel lblW = new JLabel("West");
		pnWest.add(lblW);
		
		JPanel pnEast=new JPanel();
		pnEast.setBackground(Color.BLUE);
		pnBorder.add(pnEast,BorderLayout.EAST);
		JLabel lblE = new JLabel("East");
		pnEast.add(lblE);
		
		JPanel pnCenter = new JPanel();
		pnCenter.setBackground(Color.YELLOW);
		pnBorder.add(pnCenter,BorderLayout.CENTER);
		JLabel lblC = new JLabel("Center");
		pnCenter.add(lblC);
		getContentPane().add(pnBorder);
		
		
		
		
		
		
	}
		
	public static void main(String[] args) {
		new bai4();
		// TODO Auto-generated method stub

	}

}
