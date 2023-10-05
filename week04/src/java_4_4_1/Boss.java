package java_4_4_1;

import Java_4_2_1.Fighter;

public class Boss extends Fighter {
	
	public Boss(String name, int hp) {
		super(name, hp);
	}
	
	public int pilsal(int max) {
		this.hp -= 10;
		return max;
	}

}
