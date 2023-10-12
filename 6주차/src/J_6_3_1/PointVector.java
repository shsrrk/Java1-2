package J_6_3_1;

import java.util.*;

public class PointVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Point> v = new Vector<Point>();
		
		Point p1 = new Point(10, 20);
		Point p2 = new Point(100, 200); //객체 생성 후 백터에 집어넣는 것
		
		v.add(p1);  //p1 대신에 new Point(10,30) 넣어도 됨 => 이렇게 되면 바로 객체를 생성해서 방 추가하는 것이 됨
		v.add(p2);
		v.add(new Point(-10, -200));
		
		v.remove(1);
		
		for (int i = 0; i < v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p.toString());
		}
		
	}

}
