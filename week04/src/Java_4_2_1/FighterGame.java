package Java_4_2_1;

public class FighterGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float q = 0;
		float w = 0;
		float e = 0;

		for(int a = 0;a<1000;a++) {
			Fighter ryu = new Fighter("��", 100);
			Fighter ken = new Fighter("��", 200);
			
			
			while((ken.hp>0)&&(ryu.hp>0)) {
			//���� ���� ����
			ken.hp -= ryu.attack(20);
			
			//���� ���� ����
			ryu.hp -= ken.attack(10);
			}
			
			if((ken.hp<=0)&&(ryu.hp<=0)) {
				System.out.println("���º�!");
				e += 1;
			}
			else if(ken.hp<=0) {
				System.out.println("�� ��!");
				q += 1;
			}
			else if(ryu.hp<=0) {
				System.out.println("�� ��!");
				w += 1;
			}
			
			
		}
		
		System.out.println("���� ��: "+ (int)w +" ���� ��: "+(int)q+" ���º�: "+(int)e);
		System.out.println("���� �·�: "+ (w/1000) *100);
		System.out.println("���� �·�: "+ (q/1000) *100);
		System.out.println("���ºη�: "+ (e/1000) *100);
		

	}

}
