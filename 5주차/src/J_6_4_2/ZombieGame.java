package J_6_4_2;

import java.util.*;

public class ZombieGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		Hero me = new Hero("김승환", 1, 3);
		Zombie zom1 = new Zombie("극악무도한 좀비", 10);
		Zombie zom2 = new Zombie("무자비한 좀비", 20);
		Zombie zom3 = new Zombie("자학의 좀비", 30);
		Zombie zom4 = new Zombie("불멸의 좀비", 40);
		
		Vector<Zombie> zombies = new Vector<Zombie>();
		zombies.add(zom1);
		zombies.add(zom2);
		zombies.add(zom3);
		zombies.add(zom4);
		
		
		for(;me.hp>=0;) {
			System.out.println("좀비를 피해 이 세상에서 살아남으십시오. 왼쪽 (1), 오른쪽(2), 점프(3)");
			int input = s.nextInt();
			
			//히어로의 입력
			if(input == 1) {
				me.LM();
			}
			
			if(input == 2) {
				me.RM();
			}
			
			if(input == 3) {
				me.Jump();
			}
			
			//좀비의 이동
			for(int i=0; i<zombies.size();i++) {
				Zombie p = zombies.get(i);
				p.move();
				
				if(zombies.get(i).pos==me.pos) {
					me.pos = 1;
					
					zom1.pos = 10;
					zom2.pos = 20;
					zom3.pos = 30;
					zom4.pos = 40;
					
					me.hp -= 1;
					System.out.println("넌 잡혔어 다시 해봐");
					System.out.println("(당신의 목숨은 "+me.hp+" 개 남았습니다)");
					System.out.println();
				}
			}
			
			
			if(me.pos>=50) {
				System.out.println("축하합니다. 당신은 살아남았습니다.");
				break;
			}

		}

	}

}
