package Java_4_1_1;

import java.util.*;

public class CarGame {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		Car myCar = new Car("김승환", 100, 20); //내 자동차
		Car comCar = new Car("아브라함", 200, 10); //컴 자동차
		
		while(myCar.km < 5000) {
			System.out.println("엑셀(1), 브레이크(2), 주행거리 표(3)");
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
