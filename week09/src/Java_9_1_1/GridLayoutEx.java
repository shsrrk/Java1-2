package Java_9_1_1;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame {
	
	public GridLayoutEx() {
		this.setTitle("그리드레잇아웃 테스트");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //진짜 프로세스 종료
		
		GridLayout grid = new GridLayout(4, 2, 5, 5);
		grid.setVgap(5);
		
		Container c = getContentPane();
		c.setLayout(grid);
		c.add(new Label(" 이름"));
		c.add(new JTextField(""));
		c.add(new Label(" 학생"));
		c.add(new JTextField(""));
		c.add(new Label(" 학과"));
		c.add(new JTextField(""));
		c.add(new Label(" 과목"));
		c.add(new JTextField(""));
		setSize(300,200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutEx();
	}

}
