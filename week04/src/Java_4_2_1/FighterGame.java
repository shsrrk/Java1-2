package Java_4_2_1;

public class FighterGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float q = 0;
		float w = 0;
		float e = 0;

		for(int a = 0;a<1000;a++) {
			Fighter ryu = new Fighter("·ù", 100);
			Fighter ken = new Fighter("ÄË", 200);
			
			
			while((ken.hp>0)&&(ryu.hp>0)) {
			//·ù°¡ ÄËÀ» °ø°İ
			ken.hp -= ryu.attack(20);
			
			//ÄËÀÌ ·ù¸¦ °ø°İ
			ryu.hp -= ken.attack(10);
			}
			
			if((ken.hp<=0)&&(ryu.hp<=0)) {
				System.out.println("¹«½ÂºÎ!");
				e += 1;
			}
			else if(ken.hp<=0) {
				System.out.println("·ù ½Â!");
				q += 1;
			}
			else if(ryu.hp<=0) {
				System.out.println("ÄË ½Â!");
				w += 1;
			}
			
			
		}
		
		System.out.println("ÄËÀÇ ½Â: "+ (int)w +" ·ùÀÇ ½Â: "+(int)q+" ¹«½ÂºÎ: "+(int)e);
		System.out.println("ÄËÀÇ ½Â·ü: "+ (w/1000) *100);
		System.out.println("·ùÀÇ ½Â·ü: "+ (q/1000) *100);
		System.out.println("¹«½ÂºÎ·ü: "+ (e/1000) *100);
		

	}

}
