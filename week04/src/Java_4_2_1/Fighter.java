package Java_4_2_1;

import java.util.Random;

public class Fighter {
	Random r = new Random();
	public String name;
	public int hp;
	
	//������ (������� �ʱ�ȭ, Ŭ���� �̸��� ����, ��ȯ�� ����)
	public Fighter(String name, int hp){ //������ �̸��� �Ȱ��� �ϰ� ������  this �� ���µ� �̸��� ���� �� ���� �ʴ´ٸ� �� ���� ������
		this.name = name;
		this.hp = hp;
	}
	
	public int attack(int max) {
		int power = r.nextInt(max)+1; //1~max �����ϰ� �߻��ؼ� ����
		return power;
	}

}
