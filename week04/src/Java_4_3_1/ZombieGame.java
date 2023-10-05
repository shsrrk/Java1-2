package Java_4_3_1;

import java.util.*;

public class ZombieGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		Hero me = new Hero("김승환", 1, 3);
		Zombie zom1 = new Zombie("극악무도한 좀비", 7);
		Zombie zom2 = new Zombie("무자비한 좀비", 15);
		
		for(;me.hp>=0;) {
			System.out.println("좀비를 피해 이 세상에서 살아남으십시오. 오른쪽 (1), 왼쪽(2), 점프(3)");
			int input = s.nextInt();
			
			if(input == 1) {
				me.RM();
			}
			
			if(input == 2) {
				me.LM();
			}
			
			if(input == 3) {
				me.Jump();
			}
			
			zom1.move();
			zom2.move();
			
			
			if(me.pos>=20) {
				System.out.println("축하합니다. 당신은 살아남았습니다.");
				break;
			}
			
			if((me.pos==zom1.pos)||(me.pos==zom2.pos)) {
				me.pos = 1;
				zom1.pos = 7;
				zom2.pos = 15;
				me.hp -= 1;
				System.out.println("넌 잡혔어 다시 해봐");
				System.out.println("(당신의 목숨은 "+me.hp+" 개 남았습니다)");
				System.out.println();
				
			}
			

		}

	}

}
