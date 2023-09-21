package java_3_1_3;
import java.util.*;

public class FightGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner s = new Scanner(System.in); 
		
		int WH = 15;
		int WD = r.nextInt(10)+16;
		int SH = 20;
		int SD = r.nextInt(5)+11;
		
		System.out.println("공격하려면 1을 입력하세요.");
		int input = s.nextInt();
		String E = s.nextLine();
		
		if(input==1) {
			System.out.println("이얍~~~~~~!");
				E = s.nextLine();
			SH -= WD;
			System.out.println("상대의 HP가 "+SH+" 가 되었습니다.");
			if(SH<=0) {
				System.out.println("적이 죽었습니다.");
				E = s.nextLine();
				System.out.println("CLEAR");
				return;
			}
			
			System.out.println("그러자 상대가 반격했다.");
			System.out.println("이얍!!!!");
				E = s.nextLine();
			WH -= SD;
			System.out.println("내 HP가 "+WH+" 가 되었습니다.");
			
			if(WH<=0) {
				System.out.println("아군이 죽었습니다.");
				E = s.nextLine();
				System.out.println("GAME OVER");
				return;
			}
			
			if ((WH>0)&&(SH>0)) {
				System.out.println("각자 회심의 일격에 죽지 않는 상대를 보며 감탄합니다.");
				E = s.nextLine();
				System.out.println("각자의 길을 갑니다.");
			}
		}
		
		else {
			System.out.println("잘못된 움직임으로 발을 삐끗하였습니다. 그틈을 타 상대가 전력으로 공격합니다. ");
			System.out.println("GAME OVER");
		}

	}

}
