package J_6_2_1;

import java.util.Vector;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		
		
		//���������� ������ �׿��� �ڷᰡ ����
		v.add(Integer.valueOf(10)); //������ ���� ������ ����
		v.add(20);
		v.add(-100);
		
		int n = v.size();  //������� �󸶳� �Ǵ���
		int c = v.capacity();  //�뷮�� �󸶳� �Ǵ���
		
		v.add(2,100);  //���� �ڸ��� �߰�
		int sum = 0;
		
		for (int i = 0; i < v.size(); i++) {
			int a = v.get(i);
			sum += a;
		}
		
		Integer a = v.get(1); //1������ �ڷḦ �����Ͷ�/ integer �� ���� ������ a��� ��ü�� �����Ա� ������ �Ű�
		int aa = a.intValue(); //�� ��ü�� ������ integer�� 20�� �ְ� �̴� �� int aa�� 20�� �ִ´ٴ� ���̴�.
		
		v.remove(1);
		int L = v.lastElement();
		v.removeAllElements();
	}

}
