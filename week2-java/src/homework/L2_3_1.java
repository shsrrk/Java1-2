package homework;

import java.util.Random;

public class L2_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Random r = new Random();
		 
		 int pos = 0;
		 int a = 1; 
		 
		 while(a<=3) {
		 
		 int number1 = r.nextInt(6)+1;
		 int number2 = r.nextInt(6)+1;
		 
		 int number = number1 + number2;
		 pos += number; 
		 
		 System.out.println(number + "�� ���Խ��ϴ�.");
		 System.out.println("���� ��ġ�� " + pos + "�Դϴ�.");
		 
		 a += 1;
		 
		 }
	}

}
