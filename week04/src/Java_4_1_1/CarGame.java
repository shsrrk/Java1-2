package Java_4_1_1;

import java.util.*;

public class CarGame {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		Car myCar = new Car("���ȯ", 100, 20); //�� �ڵ���
		Car comCar = new Car("�ƺ����", 200, 10); //�� �ڵ���
		
		while(myCar.km < 5000) {
			System.out.println("����(1), �극��ũ(2), ����Ÿ� ǥ(3)");
			int input = s.nextInt();
			
			if (input==1) myCar.speedup();
			else if (input==2) myCar.speeddown();
			else if (input==3) myCar.printkm();
			
			int com = r.nextInt(3)+1;
			if (com==1) comCar.speedup();
			else if (com==2) comCar.speeddown();
			else if (com==3) comCar.printkm();
			
			
		}

	}

}
