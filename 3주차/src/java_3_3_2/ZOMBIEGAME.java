package java_3_3_2;

import java.util.*;

public class ZOMBIEGAME {
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Random r = new Random();
	        Scanner s = new Scanner(System.in);
	        int hero = 1;
	        int z1 = 7;
	        int z2 = 15;

	        while (hero < 20) {
	            System.out.println("����(1), ������(2), ����(3)�� �Է��ϼ���");
	            int input = s.nextInt();

	            if(input==1) {
	                hero = hero - 1;
	                if(hero==0) {
	                    hero = hero + 1;  //�ʹ����� ������ �ʰ� ó��
	                    System.out.println("��翩 ������ ���ư�����.");
	                }
	            }

	            else if(input==2) {
	                hero = hero+1;
	            }

	            else if(input==3) {
	                int jump = r.nextInt(3)+1;
	                hero=hero+jump;
	            }

	            System.out.println("���� Hero�� ��ġ�� " + hero + " �Դϴ�.");

	            //int z = r.nextInt(3)-1; //0,1,2, ������ ��  -1  ���ָ� -1,0,1�� ��
	            z1 = z1 + r.nextInt(3)-1;
	            z2 = z2 + r.nextInt(3)-1;
	            System.out.println("���� ������ ��ġ�� " + z1 +", " + z2 + " �Դϴ�.");

	            if((hero==z1)||(hero==z2)){
	                System.out.println("����� ���񿡰� �������ϴ�.");
	                System.out.println("ó�� ��ġ�� ���ư��ϴ�.");
	                hero = 1;
	            }


	        }

	        if(hero>=20) System.out.println("����� Ż�⿡ �����߽��ϴ�.");
	    }

	

}
