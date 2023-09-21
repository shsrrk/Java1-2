package java_3_2_1;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		
		while(i<=100) {
			sum += i;
			i++;
			break;
		}
		
		
		
		for(int j=1; j<=100; j++) {
			sum += j;
			
			continue; //밑ㅇ로 내려가지 말고 위의 식에 참인지 아닌지 확인해봐라
		}
		
		
		
		do {
			
		} while(i<100); //do-while문.무조건 한번은 실행시킨다는 이점이 있다.

	}

}
