package homework;

import java.util.Scanner;

public class L2_4_1profilescan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		System.out.println("생년월일을 입력하세요");
		int birth = sc.nextInt();
		System.out.println("키를 입력하세요");
		double length = sc.nextDouble();
		
		System.out.println("당신의 이름은 "+name+" 이고 나이는 "+age+" 입니다.또한 생년월일은 "+birth+" 이고, 키는 "+length+" 입니다.");
	}

}
