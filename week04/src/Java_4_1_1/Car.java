package Java_4_1_1;

public class Car {
	//�Ӽ�
	String name;
	
	public int speed; //���� �ӵ�
	public int max;
	public int acc;
	public int km;  //����Ÿ�
	
	//������ - ��������� �ʱ�ȭ ��Ŵ
	public Car(String n, int m, int a) {
		name = n;
		max = m;
		acc = a;
	}
	
	//���� �ൿ ����
	public void speedup() {
		speed += acc;
		if(speed>max) speed = max;
		System.out.println(name+ "�� ���� �ӵ��� "+speed);
	}
	
	public void speeddown() {
		speed -= acc;
		if (speed < 0)speed = 0;
		System.out.println(name+"�� ���� �ӵ��� "+speed);
	}
	
	public void printkm() {
		System.out.println(name+"�� ����Ÿ��� "+km);
	}
}
