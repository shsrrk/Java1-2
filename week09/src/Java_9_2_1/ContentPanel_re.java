package Java_9_2_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ContentPanel_re extends JFrame {
	
	public ContentPanel_re() {
		setTitle("JFrame 테스틋");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //진짜 프로세스 종료
		 
		 JPanel north = new JPanel();
		 JPanel center = new JPanel();
		 
		 
		 Container c = this.getContentPane(); //지정 패널에 따라서 객체를 새로 만들고 적용해야 함
		 c.setBackground(Color.gray);
		 north.setBackground(Color.black);
		 
		 
		 JButton btn1 = new JButton("open");
		 JButton btn2 = new JButton("read");
		 JButton btn3 = new JButton("close");
		 
		 north.add(btn1);
		 north.add(btn2);
		 north.add(btn3);
		 
		 
		 center.setLayout(null);
		 
		 JLabel l1 = new JLabel("Hello");
		 l1.setSize(50,20);
		 l1.setLocation(95,10);
		 
		 JLabel l2 = new JLabel("java");
		 l2.setSize(50,20);
		 l2.setLocation(20,160);
		 
		 JLabel l3 = new JLabel("love");
		 l3.setSize(50,20);
		 l3.setLocation(200,130);
		 
		 
		 center.add(l1);
		 center.add(l2);
		 center.add(l3);
		 
		 
		 c.add(north , BorderLayout.NORTH);
		 c.add(center, BorderLayout.CENTER);
		 
		 this.setSize(300,300);
		 this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPanel_re();
	}

}
