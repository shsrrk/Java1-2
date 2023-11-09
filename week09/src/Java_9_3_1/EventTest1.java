package Java_9_3_1;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventTest1 extends JFrame{

	public EventTest1() {
		this.setTitle("�̺�Ʈ ������!");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action!");
		c.add(btn);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) { //��ư ������ �̺�Ʈ
				JButton b = (JButton)e.getSource(); //e.getSource�� ��� �°��� �𸣴ϱ� ĳ������ ������Ѵ�.
				if(b.getText().equals("Action!")) //���ڸ� ���Դµ� �����ϸ� 
					b.setText("�׼�!");
				else 
					b.setText("Action!");
			}
		});  //�߻�Ŭ���� �׼��� ��������ִ� ����
		
		setSize(350, 150);
		setVisible(true);
		
	}
	
	//����Ŭ������ ���� �� ���� - ������ ���� ��������� �� �� �ִ�. �������� ���ϵǰ� ���Ǿ� ����� �����ϴ�.
//	class MyActionListener implements ActionListener{
//		public void actionPerformed (ActionEvent e) { //��ư ������ �̺�Ʈ
//			JButton b = (JButton)e.getSource(); //e.getSource�� ��� �°��� �𸣴ϱ� ĳ������ ������Ѵ�.
//			if(b.getText().equals("Action!")) //���ڸ� ���Դµ� �����ϸ� 
//				b.setText("�׼�!");
//			else 
//				b.setText("Action!");
//		}
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EventTest1();
	}

}


class MyActionListener implements ActionListener{
	public void actionPerformed (ActionEvent e) { //��ư ������ �̺�Ʈ
		JButton b = (JButton)e.getSource(); //e.getSource�� ��� �°��� �𸣴ϱ� ĳ������ ������Ѵ�.
		if(b.getText().equals("Action!")) //���ڸ� ���Դµ� �����ϸ� 
			b.setText("�׼�!");
		else 
			b.setText("Action!");
	}
}