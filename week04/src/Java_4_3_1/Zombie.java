package Java_4_3_1;

import java.util.Random;

public class Zombie {
	Random r = new Random();
	String name;
	int pos;
	
	public Zombie(String name, int pos) {
		this.name = name;
		this.pos = pos;
	}
	
	public void move() {
		pos += r.nextInt(2)-1;
		if(pos<1) pos += 1;
		System.out.println("���� "+name+"�� ��ġ�� "+pos+"�Դϴ�.");
	}
}