package Java_4_2_1;

import java.util.Random;

public class Fighter {
	Random r = new Random();
	public String name;
	public int hp;
	
	//생성자 (멤버변수 초기화, 클래스 이름과 동일, 반환값 없음)
	public Fighter(String name, int hp){ //변수의 이름을 똑같이 하고 싶으면  this 를 쓰는데 이름이 같은 걸 쓰지 않는다면 뭐 쓰든 상관어븜
		this.name = name;
		this.hp = hp;
	}
	
	public int attack(int max) {
		int power = r.nextInt(max)+1; //1~max 랜덤하게 발생해서 리턴
		return power;
	}

}
