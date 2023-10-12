package J_6_4_1;

import java.util.*;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Student> map = new HashMap<String, Student>();
		
		map.put("±è½ÂÈ¯", new Student(1, "010-2191-9222"));
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("ÀÌ¸§À» ¸»ÇØºÁ");
			String name = s.next();
			
			Student s1 = map.get(name);
			
			if(s1 == null) {		}
			else {
				System.out.println(s1.id + "," + s1.tel);
			}
			
		}

	}

}
