package Java_7_3_1_GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {
	
	public ContentPaneEx() {
		this.setTitle("����Ʈ �Ұ� ������");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //â �ݱ⸦ ������ �� ���μ����� ����ȴ�.
		Container c = getContentPane();
		c.setBackground(Color.cyan);
		c.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("OK");
		c.add(b1);
		c.add(new JButton("Cancle"));
		c.add(new JButton("Ignore"));
		
		this.setSize(300, 150);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContentPaneEx co = new ContentPaneEx();
	}

}
