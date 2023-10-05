package java_4_4_1;

import java.util.*;

import java_4_4_1.SportCar;
import Java_4_1_1.Car;

public class CarGame_SportCar {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		Car myCar = new Car("김승환", 100, 20); //내 자동차
		SportCar Acar = new SportCar("아라비아", 200, 30, "red");
		
		while(myCar.km < 5000) {
			System.out.println("엑셀(1), 브레이크(2), 주행거리 표(3)");
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
