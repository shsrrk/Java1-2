package Java_7_1_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Person> book = new Vector<Person>();
		Scanner s = new Scanner(System.in);
		File f = new File("c:\\temp\\phonebook.txt"); 
		BufferedReader br = null;
		BufferedWriter bw = null; 
		
		//������ ������ ������ �о ����Ŭ������ ����
		try {
			if(f.exists()) {
				br = new BufferedReader(new FileReader(f));
				while(true) {
					String line = br.readLine();
					if(line != null) {
						String t[] = line.split(" "); //���� ���⿡�� �迭�� ���̰�
						Person p = new Person(t[0], t[1], t[2]); //�������� �迭�� ���� �� ���
						book.add(p);
					}
					else break;
				}
				br.close();
			}
		} catch(IOException e) {
			System.out.println("���� �߻�");
		}
		
		while(true) {
			System.out.println("�Է�(1), �˻�(2), ����(3), ����Ʈ(4), ����(5), ����(6)");
			int input = s.nextInt();
			if(input==1) {
				System.out.println("�̸� ��ȭ��ȣ �̸޾��� �Է��ϼ���");
				String n = s.next();
				String p = s.next();
				String e = s.next();
				Person person = new Person(n, p, e);
				book.add(new Person(n ,p, e));
			}
			else if(input==2){
				System.out.println("�˻��� ����� �̸��� �Է��ϼ���");
				String name = s.next();
				
				for (int i = 0; i < book.size(); i++) {
					Person p = book.get(i);
					if(name.equals(p.name)) {
						System.out.println(p.name+" "+p.phone+" "+ p.email);
						break;
					}
				}
				
			}
			else if(input==3){
				System.out.println("������ ����� �̸��� �Է��ϼ���");
				String name = s.next();
				
				for (int i = 0; i < book.size(); i++) {
					Person p = book.get(i);
					if(name.equals(p.name)) {
						book.remove(i);
						System.out.println("��û�� ����� �����߽��ϴ�.");
						break;
					}
				}
			}
			else if(input==4){
				for (int i = 0; i < book.size(); i++) {
					Person p = book.get(i);
					System.out.println(p.name+" "+p.phone+" "+ p.email);
				}
			}
			else if(input==5){
				//������ �������ִ� ���
				try {
					bw = new BufferedWriter(new FileWriter(f)); //bufferedWriter�� ������ó�� ���� �Ű��� 
					for (int i = 0; i < book.size(); i++) {
						Person p = book.get(i);
						bw.write(p.name+" "+p.phone+" "+ p.email + "\r\n"); //�״�� �������ִ� �Լ�
					}
					bw.close();
					System.out.println("���Ͽ� �����߽��ϴ�.");
				} catch (IOException e){
					System.out.println("���ܹ߻�");
				}
			}
			else if(input==6){
				System.out.println("��ȭ��ȣ�θ� �����մϴ�.");
				break;
			}
			
		}
	}

}
