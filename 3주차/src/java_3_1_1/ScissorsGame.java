package java_3_1_1;
import java.util.*;

public class ScissorsGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		System.out.println("가위(1), 바위(2), 보(3)");
		int me = s.nextInt();
		
		int com = r.nextInt(3)+1;
		
		if((me == 1)&&(com==1)) {
			System.out.println("나: 가위, 컴: 가위, 비겼습니다.");
		}
		if((me == 1)&&(com==2)) {
			System.out.println("나: 가위, 컴: 바위, 컴퓨터가 이겼습니다.");
		}		
		if((me == 1)&&(com==3)) {
			System.out.println("나: 가위, 컴: 보, 내가 이겼습니다.");
		}		
		else {
			System.out.println("잘못 입력하셨습니다");
		}

	}

}
