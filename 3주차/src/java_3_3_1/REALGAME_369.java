package java_3_3_1;
import java.util.*;

public class REALGAME_369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		System.out.println("369 ������ �����ϰڽ��ϴ�. �ش� ���ڸ� Ű��Ʈ�� �Է��ϰ�, �ڼ��� (0)Ű, �ڼ� �� ���� (100) �Դϴ�.");
		System.out.println("����� ���ϴ�.");
		System.out.println("����� ���Դϴ�.")
		;
		String e = s.nextLine();
		System.out.println("369,369,������,������!");
		for(int i = 1; i < 100; i++ ) {
			int input = s.nextInt();
			
			//369 �϶�
			if((i/10==3)||(i/10==6)||(i/10==9)||(i%10==3)||(i%10==6)||(i%10==9)) {
				
					//���� �ڸ� �ϣp �ڸ� �Ѵ� 3�� ���
					if(((i/10==3)||(i/10==6)||(i/10==9))&&((i%10==3)||(i%10==6)||(i%10==9))) {
						if(input==100) {
							System.out.println("������! ��Ӱ�~");
							i += 1;
							System.out.println(i+"!");
							continue;
						}
						
						if(input!=100) {
							System.out.println("��! �����̴�~~!1");
							e = s.nextLine();
							System.out.println("GMAE OVER");
						}//�������
					}
				
					if(input==0) {
						System.out.println("������! ��Ӱ�~");
						i += 1;
						System.out.println(i+"!");
						continue;
					}
					
				
					if(input!=0) {
						System.out.println("��! �����̴�~~!2");
						e = s.nextLine();
						System.out.println("GMAE OVER");
					}
						
					}
			
			if((i/10!=3)&&(i%10!=3)) {
				if(i != input) {
					System.out.println("��! �����̴�~~!3");
					e = s.nextLine();
					System.out.println("GMAE OVER");
				}
				i += 1;
				
				System.out.println(i+"!");
			}
			
			
			//��
			if(i>99) {
				System.out.println("COM: ����� 369 ����Դϴ�.");
				e = s.nextLine();
				System.out.println("COM: ����� �̰���ϴ�.");
				e = s.nextLine();
				System.out.println("CLEAR");
				return;
			}
		}

		

	}
}

//1-99 ������ ������ �Է¹���
//3, 6, 9 �� �ϳ��� �ִ� ���� "�ڼ�¦"�� ����ϰ� 
//2���� �ִ� ��쿡�� "�ڼ�¦¦"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
//������� �Էµ� ���� 13�� ��� "�ڼ�¦"��, 36�� ��� "�ڼ�¦¦"�� ����ϼ���.
