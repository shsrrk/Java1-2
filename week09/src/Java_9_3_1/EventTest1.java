package Java_9_3_1;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventTest1 extends JFrame{

	public EventTest1() {
		this.setTitle("이벤트 리스너!");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action!");
		c.add(btn);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) { //버튼 누르는 이벤트
				JButton b = (JButton)e.getSource(); //e.getSource가 어디서 온건지 모르니까 캐스팅을 해줘야한다.
				if(b.getText().equals("Action!")) //글자를 얻어왔는데 동일하면 
					b.setText("액션!");
				else 
					b.setText("Action!");
			}
		});  //추상클래스 액션을 연결시켜주는 문장
		
		setSize(350, 150);
		setVisible(true);
		
	}
	
	//내부클래스로 들어올 수 있음 - 장점은 같은 멤버변수로 쓸 수 있다. 변수들이 통일되게 사용되어 사용이 용이하다.
//	class MyActionListener implements ActionListener{
//		public void actionPerformed (ActionEvent e) { //버튼 누르는 이벤트
//			JButton b = (JButton)e.getSource(); //e.getSource가 어디서 온건지 모르니까 캐스팅을 해줘야한다.
//			if(b.getText().equals("Action!")) //글자를 얻어왔는데 동일하면 
//				b.setText("액션!");
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
	public void actionPerformed (ActionEvent e) { //버튼 누르는 이벤트
		JButton b = (JButton)e.getSource(); //e.getSource가 어디서 온건지 모르니까 캐스팅을 해줘야한다.
		if(b.getText().equals("Action!")) //글자를 얻어왔는데 동일하면 
			b.setText("액션!");
		else 
			b.setText("Action!");
	}
}