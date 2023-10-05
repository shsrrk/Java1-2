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
			Fighter me = new Fighter("½ÂÈ¯", 200);
			Boss bo = new Boss("º¸½º", 300);
			
			
			while((me.hp>0)&&(bo.hp>0)) {
			//³»°¡ º¸½º¸¦ °ø°Ý
			bo.hp -= me.attack(15);
			
			//º¸½º°¡ ³ª¸¦ °ø°Ý
			int p = r.nextInt(5);
			if(p==0) bo.pilsal(20);
			else bo.attack(20);
			}
			
			if((me.hp<=0)&&(bo.hp<=0)) {
				System.out.println("¹«½ÂºÎ!");
				e += 1;
			}
			else if(bo.hp<=0) {
				System.out.println("½Â!");
				q += 1;
			}
			else if(me.hp<=0) {
				System.out.println("ÆÐ¹è!");
				w += 1;
			}
			
			
		}
		
		System.out.println("ÄËÀÇ ½Â: "+ (int)w +" ·ùÀÇ ½Â: "+(int)q+" ¹«½ÂºÎ: "+(int)e);
		System.out.println("ÄËÀÇ ½Â·ü: "+ (w/1000) *100);
		System.out.println("·ùÀÇ ½Â·ü: "+ (q/1000) *100);
		System.out.println("¹«½ÂºÎ·ü: "+ (e/1000) *100);
		

	}

}
