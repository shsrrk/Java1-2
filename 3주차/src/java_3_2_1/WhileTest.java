package java_3_2_1;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		
		while(i<=100) {
			sum += i;
			i++;
			break;
		}
		
		
		
		for(int j=1; j<=100; j++) {
			sum += j;
			
			continue; //�ؤ��� �������� ���� ���� �Ŀ� ������ �ƴ��� Ȯ���غ���
		}
		
		
		
		do {
			
		} while(i<100); //do-while��.������ �ѹ��� �����Ų�ٴ� ������ �ִ�.

	}

}
