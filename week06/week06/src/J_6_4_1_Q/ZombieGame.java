package J_6_4_1_Q;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class ZombieGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		byte b[] = new byte[4];
		
		Hero me = new Hero("김승환", 1, 3);
		Zombie zom1 = new Zombie("극악무도한 좀비", 10);
		Zombie zom2 = new Zombie("무자비한 좀비", 20);

		
		Vector<Zombie> zombies = new Vector<Zombie>();
		zombies.add(zom1);
		zombies.add(zom2);


		

			try {
				FileInputStream fin = new FileInputStream("C:\\Users\\217\\Desktop\\n주차\\zombie.sav");
				int n=0, c;
				while((c = fin.read())!= -1) {
					b[n] = (byte)c; 
					n++;
				}		
				
				
				System.out.println("나의 초기 위치는"+b[0]);
				System.out.println("생명 "+b[1]);
				System.out.println("극악무도한 좀비 "+b[2]);
				System.out.println("무자비한 좀비"+b[3]);
				
				
				me.pos = b[0];
				me.hp = b[1];
				zom1.pos = b[2];
				zom2.pos = b[3];
				
				fin.close();
			} catch(IOException e) {
				System.out.println( "아야야 저장된 값이 없다야. 확인 다시 해바라");
			}
			me.pos = (int)b[0];
		
		
		
		for(;me.hp>=0;) {
			System.out.println("좀비를 피해 이 세상에서 살아남으십시오. 왼쪽 (1), 오른쪽(2), 점프(3), 저장 및 종료(4)");
			int input = s.nextInt();
			
			//히어로의 입력
			if(input == 1) {
				me.LM();
			}
			else if(input == 2) {
				me.RM();
			}
			else if(input == 3) {
				me.Jump();
			}
			
			else if(input == 4) {
				//파일 저장하기
				File f1 = new File("C:\\Users\\217\\Desktop\\n주차\\zombie.sav");
				
				//바이트 배열에 저장할 값을 순서대로 넣어주면 됨
				b[0] = (byte)me.pos;
				b[1] = (byte)me.hp;
				b[2] = (byte)zom1.pos;
				b[3] = (byte)zom2.pos;
				
				FileOutputStream fout = null;
				
				try {
					fout = new FileOutputStream(f1);
					for (int i = 0; i < b.length; i++) {
						fout.write(b[i]);
					}
					System.out.println("다음에 또 오세용~");
					fout.close();
				} catch(IOException e) {
					System.out.println("파일에 저장할 수 없습니다. 확인바람.");
					e.getStackTrace(); //익센셥을 쭉 찍어줌
				}
				return;
			}
			
			//좀비의 이동
			for(int i=0; i<zombies.size();i++) {
				Zombie p = zombies.get(i);
				p.move();
				
				if(zombies.get(i).pos==me.pos) {
					me.pos = 1;
					
					zom1.pos = 10;
					zom2.pos = 20;

					
					me.hp -= 1;
					System.out.println("넌 잡혔어 다시 해봐");
					System.out.println("(당신의 목숨은 "+me.hp+" 개 남았습니다)");
					System.out.println();
				}
			}
			
			
			if(me.pos>=30) {
				System.out.println("축하합니다. 당신은 살아남았습니다.");
				break;
			}

		}

	}

}

