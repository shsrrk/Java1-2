package homework;

import java.util.Scanner;

public class L2_4_1profilescan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		String name = sc.next();
		System.out.println("���̸� �Է��ϼ���");
		int age = sc.nextInt();
		System.out.println("��������� �Է��ϼ���");
		int birth = sc.nextInt();
		System.out.println("Ű�� �Է��ϼ���");
		double length = sc.nextDouble();
		
		System.out.println("����� �̸��� "+name+" �̰� ���̴� "+age+" �Դϴ�.���� ��������� "+birth+" �̰�, Ű�� "+length+" �Դϴ�.");
	}

}
