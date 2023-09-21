package java_3_1_2;

import java.util.*;

public class ZombieGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		int pos = 0;
		System.out.println("왼쪽(1), 오른쪽(2), 점프(3)");
		int input = s.nextInt();
		
		if(input==1) {
			pos -= 1;
			System.out.println("왼쪽으로 움직였습니다. 현재 위치는 "+pos+" 입니다.");
		}
		else if(input==2) {
			pos += 1;
			System.out.println("오른쪽으로 움직였습니다. 현재 위치는 "+pos+" 입니다.");
		}
		else if(input==3) {
			pos += r.nextInt(3)+1;
			System.out.println("점프했습니다. 현재 위치는 "+pos+" 입니다.");
		}
		else {
			System.out.println("잘못 입력했습니다. 다시 입력하세요.");
		}
	}

}
