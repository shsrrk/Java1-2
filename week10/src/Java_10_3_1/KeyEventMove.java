package Java_10_3_1;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyEventMove extends JFrame{
	
	JLabel la = new JLabel("상하좌우 이동하기");
	int ix = 10, iy = 10;
	Container c;
	
	public KeyEventMove() {
		this.setTitle("마우스 이벤트 프고르램");
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  Container c = this.getContentPane();
		  c.setLayout(null);
		  
		  la.setSize(200,20);
		  la.setLocation(ix,iy);
		  
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
			if(keycode == KeyEvent.VK_UP){
				iy -= 10;
				la.setLocation(ix,iy);
			}
			else if(keycode == KeyEvent.VK_DOWN){
				iy += 10;
				la.setLocation(ix,iy);
				
			}
			else if(keycode == KeyEvent.VK_LEFT){
				ix -= 10;
				la.setLocation(ix,iy);
			}
			else if(keycode == KeyEvent.VK_RIGHT){
				ix += 10;
				la.setLocation(ix,iy);
			}
			else if(keycode == KeyEvent.VK_F1){
				c.setBackground(Color.green);
			}
			else if(e.getKeyChar()=='%') {
				c.setBackground(Color.yellow);
			}
			else if(keycode == KeyEvent.VK_ENTER) {
				
			}
		}
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEventMove();
	}

}
