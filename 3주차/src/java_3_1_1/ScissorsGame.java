package java_3_1_1;
import java.util.*;

public class ScissorsGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		System.out.println("����(1), ����(2), ��(3)");
		int me = s.nextInt();
		
		int com = r.nextInt(3)+1;
		
		if((me == 1)&&(com==1)) {
			System.out.println("��: ����, ��: ����, �����ϴ�.");
		}
		if((me == 1)&&(com==2)) {
			System.out.println("��: ����, ��: ����, ��ǻ�Ͱ� �̰���ϴ�.");
		}		
		if((me == 1)&&(com==3)) {
			System.out.println("��: ����, ��: ��, ���� �̰���ϴ�.");
		}		
		else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
		}

	}

}
