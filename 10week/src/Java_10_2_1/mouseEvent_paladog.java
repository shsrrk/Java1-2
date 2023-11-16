package Java_10_2_1;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class mouseEvent_paladog extends JFrame{
	
	JLabel la = new JLabel();
	int ix = 10, iy = 10;
	
	public mouseEvent_paladog() {
		  this.setTitle("마우스 이벤트 프고르램");
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  Container c = this.getContentPane();
		  c.setLayout(null);
		  
		  ImageIcon image = new ImageIcon("C:\\Users\\217\\Downloads\\팔라독 이미지.png");
		  la.setIcon(image);
		  
		  la.setLocation(ix, iy);
		  la.setSize(192, 156);
		  c.add(la);
		  c.addMouseListener(new MyMouseListener());
		  c.addMouseMotionListener(new MyMouseMotionListener());
		  
		  
		  this.setSize(500,500);
		  this.setVisible(true);
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
				
				ix += 10;
				la.setLocation(ix, iy);
			}
		}

		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
		public void mouseReleased(MouseEvent e) {
			
		}
		public void mouseEntered(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.CYAN);
		}
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
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
		new mouseEvent_paladog();
	}

}
