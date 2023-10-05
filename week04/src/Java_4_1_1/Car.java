package Java_4_1_1;

public class Car {
	//속성
	String name;
	
	public int speed; //현재 속도
	public int max;
	public int acc;
	public int km;  //주행거리
	
	//생성자 - 멤버변수를 초기화 시킴
	public Car(String n, int m, int a) {
		name = n;
		max = m;
		acc = a;
	}
	
	//동작 행동 가능
	public void speedup() {
		speed += acc;
		if(speed>max) speed = max;
		System.out.println(name+ "의 현재 속도는 "+speed);
	}
	
	public void speeddown() {
		speed -= acc;
		if (speed < 0)speed = 0;
		System.out.println(name+"의 현재 속도는 "+speed);
	}
	
	public void printkm() {
		System.out.println(name+"의 주행거리는 "+km);
	}
}
