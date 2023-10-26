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
		
		//파일이 있으면 파일을 읽어서 벡터클래스에 저장
		try {
			if(f.exists()) {
				br = new BufferedReader(new FileReader(f));
				while(true) {
					String line = br.readLine();
					if(line != null) {
						String t[] = line.split(" "); //각각 띄어쓰기에서 배열을 멕이고
						Person p = new Person(t[0], t[1], t[2]); //배정받은 배열로 띄어쓰기 후 출력
						book.add(p);
					}
					else break;
				}
				br.close();
			}
		} catch(IOException e) {
			System.out.println("예외 발생");
		}
		
		while(true) {
			System.out.println("입력(1), 검색(2), 삭제(3), 리스트(4), 저장(5), 종료(6)");
			int input = s.nextInt();
			if(input==1) {
				System.out.println("이름 전화번호 이메알을 입력하세요");
				String n = s.next();
				String p = s.next();
				String e = s.next();
				Person person = new Person(n, p, e);
				book.add(new Person(n ,p, e));
			}
			else if(input==2){
				System.out.println("검색할 사람의 이름을 입력하세요");
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
				System.out.println("삭제할 사람의 이름을 입력하세요");
				String name = s.next();
				
				for (int i = 0; i < book.size(); i++) {
					Person p = book.get(i);
					if(name.equals(p.name)) {
						book.remove(i);
						System.out.println("요청한 사람을 삭제했습니다.");
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
				//파일을 저장해주는 기술
				try {
					bw = new BufferedWriter(new FileWriter(f)); //bufferedWriter는 파이프처럼 차면 옮겨줌 
					for (int i = 0; i < book.size(); i++) {
						Person p = book.get(i);
						bw.write(p.name+" "+p.phone+" "+ p.email + "\r\n"); //그대로 저장해주는 함수
					}
					bw.close();
					System.out.println("파일에 저장했습니다.");
				} catch (IOException e){
					System.out.println("예외발생");
				}
			}
			else if(input==6){
				System.out.println("전화번호부를 종료합니다.");
				break;
			}
			
		}
	}

}
