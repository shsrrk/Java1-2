package Java_4_3_1;

import java.util.*;

public class ZombieGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		Hero me = new Hero("���ȯ", 1, 3);
		Zombie zom1 = new Zombie("�ؾǹ����� ����", 7);
		Zombie zom2 = new Zombie("���ں��� ����", 15);
		
		for(;me.hp>=0;) {
			System.out.println("���� ���� �� ���󿡼� ��Ƴ����ʽÿ�. ������ (1), ����(2), ����(3)");
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
				System.out.println("�����մϴ�. ����� ��Ƴ��ҽ��ϴ�.");
				break;
			}
			
			if((me.pos==zom1.pos)||(me.pos==zom2.pos)) {
				me.pos = 1;
				zom1.pos = 7;
				zom2.pos = 15;
				me.hp -= 1;
				System.out.println("�� ������ �ٽ� �غ�");
				System.out.println("(����� ����� "+me.hp+" �� ���ҽ��ϴ�)");
				System.out.println();
				
			}
			

		}

	}

}
