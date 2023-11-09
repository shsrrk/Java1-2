package Java_9_1_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {
	
	public ContentPaneEx() {
		setTitle("JFrame 테스틋");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //진짜 프로세스 종료
		
		 Container c = this.getContentPane();
		 c.setBackground(Color.black);
		 
		 JButton btn1 = new JButton("더하기");
		 JButton btn2 = new JButton("빼기");
		 JButton btn3 = new JButton("곱하기ㅏ");
		 JButton btn4 = new JButton("나누기");
		 
		 c.add(btn1);
		 c.add(btn2);
		 c.add(btn3);
		 c.add(btn4);
		 
		 c.add(north, BorderLayout.NORTH);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
