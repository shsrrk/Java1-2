package J_6_2_4;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedIOEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("c:\\temp\\test2.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out,5);  //5����Ʈ ������ �̾ƶ�  
			//�������� �ؼ��ؼ� �ѹ��� �ؼ��ϴ� �� ȿ�����̱⿡ ������ ������ ����.
			while((c=fin.read())!= -1) {
				out.write(c);
			}
			
			new Scanner(System.in).nextLine(); //�Է¹޾Ƽ� ������ �ڵ� ����
			out.flush(); //������ ȭ�鿡 �׿��ִ� �����͵��� ������ ������
			
			out.close();
			fin.close();
			
		} catch(IOException e) {
			
		}

	}

}
