package Java_10_2_1;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyEventExe extends JFrame {
	
	JLabel la[];

	public KeyEventExe() {
		this.setTitle("마우스 이벤트 프고르램");
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  Container c = this.getContentPane();
		  c.setLayout(new FlowLayout());
		  la = new JLabel[3]; 
		  
		  la[0] = new JLabel("getKeyCode() ");
		  la[1] = new JLabel("getKeyChar() ");
		  la[2] = new JLabel("getKeyText() ");
		  
		  for (int i = 0; i < la.length; i++) {
			la[i].setOpaque(true);
			la[i].setBackground(Color.yellow);
			c.add(la[i]);
		}
		  
		  c.addKeyListener(new MyKeyListener());
		  this.setSize(500,500);
		  this.setVisible(true);
		  
		  c.setFocusable(true);
		  c.requestFocus();
	}
	
	class MyKeyListener implements KeyListener{
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void keyPressed(KeyEvent e) {
			int keycode = e.getKeyCode();
			char keychar = e.getKeyChar();
			String keytext = e.getKeyText(keycode);
			
			la[0].setText(Integer.toString(keycode));
//			la[0].setText(Integer));
			la[1].setText(Character.toString(keychar));
			la[2].setText(keytext);
		}
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEventExe();
	}

}
