package Java_9_1_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {
	
	public ContentPaneEx() {
		setTitle("JFrame �׽�ƶ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //��¥ ���μ��� ����
		
		 Container c = this.getContentPane();
		 c.setBackground(Color.black);
		 
		 JButton btn1 = new JButton("���ϱ�");
		 JButton btn2 = new JButton("����");
		 JButton btn3 = new JButton("���ϱ⤿");
		 JButton btn4 = new JButton("������");
		 
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
