package J_6_2_1;

import java.util.Vector;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		
		
		//순차적으로 스택이 쌓여서 자료가 쌓임
		v.add(Integer.valueOf(10)); //다음과 같은 형식이 정석
		v.add(20);
		v.add(-100);
		
		int n = v.size();  //사이즈는 얼마나 되느냐
		int c = v.capacity();  //용량은 얼마나 되느냐
		
		v.add(2,100);  //지정 자리에 추가
		int sum = 0;
		
		for (int i = 0; i < v.size(); i++) {
			int a = v.get(i);
			sum += a;
		}
		
		Integer a = v.get(1); //1번방의 자료를 가져와라/ integer 를 넣은 이유는 a라는 객체를 가져왔기 때문인 거고
		int aa = a.intValue(); //그 객체를 가져온 integer에 20이 있고 이는 곧 int aa에 20을 넣는다는 말이다.
		
		v.remove(1);
		int L = v.lastElement();
		v.removeAllElements();
	}

}
