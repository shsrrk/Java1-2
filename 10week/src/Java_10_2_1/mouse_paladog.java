package Java_10_2_1;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Java_10_2_1.KeyEventExe.MyKeyListener;

public class mouse_paladog extends JFrame{
	
	JLabel la = new JLabel();
	int zx = 300; 
	int zy = 200;
	
	public mouse_paladog() {
		  this.setTitle("마우스 이벤트 프고르램");
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  Container c = this.getContentPane();
		  c.addMouseListener(new MyMouseListener());
		  c.addMouseMotionListener(new MyMouseMotionListener());
		  c.setLayout(null);
		  
		  ImageIcon image = new ImageIcon("image/paladog_walk.gif");
		  la.setIcon(image);
		  la.setSize(300, 300);
		  la.setLocation(zx, zy);
		  
		  c.add(la);
		  c.addMouseListener(new MyMouseListener());
		  c.addMouseMotionListener(new MyMouseMotionListener());
		  c.addKeyListener(new MyKeyListener());
		  
		  
		  this.setSize(500,500);
		  this.setVisible(true);
		  
		  c.setFocusable(true);
		  c.requestFocus();
	}
	
	//마우스이벤트를 처리해주는 리스너
	class MyMouseListener implements MouseListener{
		public void mouseClicked(MouseEvent e) {
			if(e.getClickCount()==2) {
//				int r = (int)(Math.random()*256);
//				int g = (int)(Math.random()*256);
//				int b = (int)(Math.random()*256);
//				Component c = (Component)e.getSource();
//				c.setBackground(new Color(r,g,b));
				
				zx += 10;
				la.setLocation(zx, zy);
			}
		}

		public void mousePressed(MouseEvent e) {

		}
		public void mouseReleased(MouseEvent e) {
			
		}
		public void mouseEntered(MouseEvent e) {
	
		}
		public void mouseExited(MouseEvent e) {

		}
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
				zy -= 10;
				la.setLocation(zx,zy);
			}
			else if(keycode == KeyEvent.VK_DOWN){
				zy += 10;
				la.setLocation(zx,zy);
				
			}
			else if(keycode == KeyEvent.VK_LEFT){
				zx -= 10;
				la.setLocation(zx,zy);
			}
			else if(keycode == KeyEvent.VK_RIGHT){
				zx += 10;
				la.setLocation(zx,zy);
			}
		}
			
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	class MyMouseMotionListener implements MouseMotionListener{
		public void mouseDragged(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y);
		}
		public void mouseMoved(MouseEvent e) {
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new mouse_paladog();
	}

}
