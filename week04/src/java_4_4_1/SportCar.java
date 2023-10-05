package java_4_4_1;

import Java_4_1_1.Car;

public class SportCar extends Car {
	
	protected String color;
	//»ý¼ºÀÚ
	public SportCar(String n, int m, int a, String c) {
		super(n, m, a);
		this.color = c;
	}
	
	public void booster() {
		speed = max;
	}
	
	public void stop() {
		speed = 0;
	}

}
