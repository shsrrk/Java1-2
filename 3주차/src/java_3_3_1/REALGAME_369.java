package java_3_3_1;
import java.util.*;

public class REALGAME_369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		System.out.println("369 게임을 시작하겠습니다. 해당 숫자를 키패트로 입력하고, 박수는 (0)키, 박수 두 번은 (100) 입니다.");
		System.out.println("행운을 빕니다.");
		System.out.println("당신이 선입니다.")
		;
		String e = s.nextLine();
		System.out.println("369,369,삼육구,삼육구!");
		for(int i = 1; i < 100; i++ ) {
			int input = s.nextInt();
			
			//369 일때
			if((i/10==3)||(i/10==6)||(i/10==9)||(i%10==3)||(i%10==6)||(i%10==9)) {
				
					//십의 자리 일즤 자리 둘다 3의 배수
					if(((i/10==3)||(i/10==6)||(i/10==9))&&((i%10==3)||(i%10==6)||(i%10==9))) {
						if(input==100) {
							System.out.println("오케이! 계속가~");
							i += 1;
							System.out.println(i+"!");
							continue;
						}
						
						if(input!=100) {
							System.out.println("앗! 오답이다~~!1");
							e = s.nextLine();
							System.out.println("GMAE OVER");
						}//여기까지
					}
				
					if(input==0) {
						System.out.println("오케이! 계속가~");
						i += 1;
						System.out.println(i+"!");
						continue;
					}
					
				
					if(input!=0) {
						System.out.println("앗! 오답이다~~!2");
						e = s.nextLine();
						System.out.println("GMAE OVER");
					}
						
					}
			
			if((i/10!=3)&&(i%10!=3)) {
				if(i != input) {
					System.out.println("앗! 오답이다~~!3");
					e = s.nextLine();
					System.out.println("GMAE OVER");
				}
				i += 1;
				
				System.out.println(i+"!");
			}
			
			
			//끝
			if(i>99) {
				System.out.println("COM: 당신은 369 고수입니다.");
				e = s.nextLine();
				System.out.println("COM: 당신이 이겼습니다.");
				e = s.nextLine();
				System.out.println("CLEAR");
				return;
			}
		}

		

	}
}

//1-99 사이의 정수를 입력받자
//3, 6, 9 중 하나가 있는 경우는 "박수짝"을 출력하고 
//2개가 있는 경우에는 "박수짝짝"을 출력하는 프로그램을 작성하세요.
//예를들면 입력된 수가 13인 경우 "박수짝"을, 36인 경우 "박수짝짝"을 출력하세요.
