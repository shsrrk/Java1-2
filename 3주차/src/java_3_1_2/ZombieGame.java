package java_3_1_2;

import java.util.*;

public class ZombieGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		int pos = 0;
		System.out.println("����(1), ������(2), ����(3)");
		int input = s.nextInt();
		
		if(input==1) {
			pos -= 1;
			System.out.println("�������� ���������ϴ�. ���� ��ġ�� "+pos+" �Դϴ�.");
		}
		else if(input==2) {
			pos += 1;
			System.out.println("���������� ���������ϴ�. ���� ��ġ�� "+pos+" �Դϴ�.");
		}
		else if(input==3) {
			pos += r.nextInt(3)+1;
			System.out.println("�����߽��ϴ�. ���� ��ġ�� "+pos+" �Դϴ�.");
		}
		else {
			System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է��ϼ���.");
		}
	}

}
