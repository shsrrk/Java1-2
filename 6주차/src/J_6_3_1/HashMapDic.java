package J_6_3_1;

import java.util.*;

public class HashMapDic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> dic = new HashMap<String, String>();
		
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		
		
		//학번 => 학생이름 검색
		HashMap<Integer, String> stu = new HashMap<Integer, String>();
		stu.put(20232486, "김승환"); //숫자만 써고 객체로 integer 로 변환되기에 그냥 넣어도 됨
		
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("찾고싶은 단어는?");
			String eng = s.next();
			if(eng.equals("exit")){
				System.out.println("종료합니다.");//exit 라는 단어를 받으면 종료한다는 것으로 받음
				break;
			}
			String kor = dic.get(eng);
			if(kor==null) System.out.println("없는 단어여");
			else System.out.println(kor);
		}
	}

}
