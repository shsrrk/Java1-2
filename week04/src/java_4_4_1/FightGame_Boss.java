package java_4_4_1;

import java.util.Random;

import Java_4_2_1.Fighter;

public class FightGame_Boss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		float q = 0;
		float w = 0;
		float e = 0;

		for(int a = 0;a<1000;a++) {
			Fighter me = new Fighter("��ȯ", 200);
			Boss bo = new Boss("����", 300);
			
			
			while((me.hp>0)&&(bo.hp>0)) {
			//���� ������ ����
			bo.hp -= me.attack(15);
			
			//������ ���� ����
			int p = r.nextInt(5);
			if(p==0) bo.pilsal(20);
			else bo.attack(20);
			}
			
			if((me.hp<=0)&&(bo.hp<=0)) {
				System.out.println("���º�!");
				e += 1;
			}
			else if(bo.hp<=0) {
				System.out.println("��!");
				q += 1;
			}
			else if(me.hp<=0) {
				System.out.println("�й�!");
				w += 1;
			}
			
			
		}
		
		System.out.println("���� ��: "+ (int)w +" ���� ��: "+(int)q+" ���º�: "+(int)e);
		System.out.println("���� �·�: "+ (w/1000) *100);
		System.out.println("���� �·�: "+ (q/1000) *100);
		System.out.println("���ºη�: "+ (e/1000) *100);
		

	}

}
