package J_6_3_1;

import java.util.*;

public class PointVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Point> v = new Vector<Point>();
		
		Point p1 = new Point(10, 20);
		Point p2 = new Point(100, 200); //��ü ���� �� ���Ϳ� ����ִ� ��
		
		v.add(p1);  //p1 ��ſ� new Point(10,30) �־ �� => �̷��� �Ǹ� �ٷ� ��ü�� �����ؼ� �� �߰��ϴ� ���� ��
		v.add(p2);
		v.add(new Point(-10, -200));
		
		v.remove(1);
		
		for (int i = 0; i < v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p.toString());
		}
		
	}

}
