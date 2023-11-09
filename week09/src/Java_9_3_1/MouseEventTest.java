package Java_9_3_1;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventTest extends JFrame {
	
	JLabel la = new JLabel("|||||||||||||||||||||||||||");
	
	public MouseEventTest(){
			this.setTitle("���콺 ������");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //��¥ ���μ��� ����
			Container c = this.getContentPane();
			c.setLayout(null);
			
			la.setSize(100,10);
			la.setLocation(30,30);
			c.add(la);
			
//			c.addMouseListener(new MouseListener() {
//				//�߻�Ŭ������ �� �־�� ��
//				@Override
//				public void mouseClicked(MouseEvent e) {}
//
//				@Override
//				public void mousePressed(MouseEvent e) {
//					// TODO Auto-generated method stub
//					int x = e.getX();
//					int y = e.getY();
//					la.setLocation(x,y);
//					
//				}
//
//				@Override
//				public void mouseReleased(MouseEvent e) {}
//				@Override
//				public void mouseEntered(MouseEvent e) {}
//				@Override
//				public void mouseExited(MouseEvent e) {}
//				
//			});
			
			
			c.addMouseMotionListener(new MouseMotionListener() {
				
				@Override
				public void mouseMoved(MouseEvent e) {
					// TODO Auto-generated method stub
					int x = e.getX();
					int y = e.getY();
					la.setLocation(x,y);
				}
				
				@Override
				public void mouseDragged(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			
			
			
			
			setSize(500,500);
			setVisible(true);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new MouseEventTest();
	}

}
