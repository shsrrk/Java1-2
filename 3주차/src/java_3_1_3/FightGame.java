package java_3_1_3;
import java.util.*;

public class FightGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner s = new Scanner(System.in); 
		
		int WH = 15;
		int WD = r.nextInt(10)+16;
		int SH = 20;
		int SD = r.nextInt(5)+11;
		
		System.out.println("�����Ϸ��� 1�� �Է��ϼ���.");
		int input = s.nextInt();
		String E = s.nextLine();
		
		if(input==1) {
			System.out.println("�̾�~~~~~~!");
				E = s.nextLine();
			SH -= WD;
			System.out.println("����� HP�� "+SH+" �� �Ǿ����ϴ�.");
			if(SH<=0) {
				System.out.println("���� �׾����ϴ�.");
				E = s.nextLine();
				System.out.println("CLEAR");
				return;
			}
			
			System.out.println("�׷��� ��밡 �ݰ��ߴ�.");
			System.out.println("�̾�!!!!");
				E = s.nextLine();
			WH -= SD;
			System.out.println("�� HP�� "+WH+" �� �Ǿ����ϴ�.");
			
			if(WH<=0) {
				System.out.println("�Ʊ��� �׾����ϴ�.");
				E = s.nextLine();
				System.out.println("GAME OVER");
				return;
			}
			
			if ((WH>0)&&(SH>0)) {
				System.out.println("���� ȸ���� �ϰݿ� ���� �ʴ� ��븦 ���� ��ź�մϴ�.");
				E = s.nextLine();
				System.out.println("������ ���� ���ϴ�.");
			}
		}
		
		else {
			System.out.println("�߸��� ���������� ���� �߲��Ͽ����ϴ�. ��ƴ�� Ÿ ��밡 �������� �����մϴ�. ");
			System.out.println("GAME OVER");
		}

	}

}
