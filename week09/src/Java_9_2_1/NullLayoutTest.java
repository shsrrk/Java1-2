package Java_9_2_1;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullLayoutTest extends JFrame{
	
	public NullLayoutTest() {
		this.setTitle("널레이아웃연습");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(null);
		
		JLabel la = new JLabel("널레이아웃");
		la.setLocation(100,100);
		la.setSize(100,20);
		la.setSize(100,20);
		
		c.add(la);
		
		this.setSize(300,300);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NullLayoutTest();
	}

}
