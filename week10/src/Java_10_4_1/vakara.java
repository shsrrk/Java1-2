package Java_10_4_1;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

import Java_10_3_1.KeyEventMove;

public class vakara extends JFrame{
		Random r = new Random();
		Container c;
		JLabel la[];
		JLabel re;

		
		public vakara() {
			this.setTitle("슬롯머신");
			  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			  c = this.getContentPane();
			  c.setLayout(null);
			  
			  la = new JLabel[3];
			  la[0] = new JLabel(" 0 ");
			  la[1] = new JLabel(" 0 ");
			  la[2] = new JLabel(" 0 ");
			  re = new JLabel("시작하세유");
			  re.setSize(100,100);
			  re.setLocation(220,200);
			  
			  for (int i = 0; i < la.length; i++) {
				la[i].setHorizontalAlignment(JLabel.CENTER);
				la[i].setOpaque(true);
				la[i].setBackground(Color.magenta);
				la[i].setBackground(Color.yellow);
				la[i].setFont(new Font("Tahoma", Font.ITALIC, 30));
				
				la[i].setSize(100,100);
				la[i].setLocation(100+(i*100), 100);
				
				c.add(la[i]);
				c.add(re);
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
				if(keycode == KeyEvent.VK_ENTER) {
					int a = r.nextInt(5);
					int b = r.nextInt(5);
					int c = r.nextInt(5);
					
					la[0].setText(a+"");
//					la[0].setText(Integer.toString(a));
					la[1].setText(b+"");
					la[2].setText(c+"");
					if((a==b)&&(b==c)) {
						re.setText("축하합니다.");
					}
					else{
						re.setText("아쉽습니다.");
					}
					
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			new vakara();
		}

	}



