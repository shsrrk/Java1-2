package java_4_4_1;

import java.util.*;

import java_4_4_1.SportCar;
import Java_4_1_1.Car;

public class CarGame_SportCar {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		Car myCar = new Car("���ȯ", 100, 20); //�� �ڵ���
		SportCar Acar = new SportCar("�ƶ���", 200, 30, "red");
		
		while(myCar.km < 5000) {
			System.out.println("����(1), �극��ũ(2), ����Ÿ� ǥ(3)");
			int input = s.nextInt();
			
			if (input==1) myCar.speedup();
			else if (input==2) myCar.speeddown();
			else if (input==3) myCar.printkm();
			
			int com = r.nextInt(5)+1;
			if (com==1) Acar.speedup();
			else if (com==2) Acar.speeddown();
			else if (com==3) Acar.printkm();
			else if (com==4) Acar.booster();
			else if (com==5) Acar.stop();
			
			
		}

	}

}
