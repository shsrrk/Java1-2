package J_6_1_1;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		
		try {
			fin = new FileReader("c:\\windows\\system.ini"); //������ ���� ���� �ִ� ��� ������  try-catch���� �� ����� �Ѵ�. 
			
			int c;
			while((c = fin.read()) != -1) {
				System.out.print((char)c);
			}
			
			fin.close();
		} catch(IOException e) {
			System.out.println("�ش� ������ ã�� �� �����ϴ�."); //try-catch ���� ���ٸ� ������ �׾����
		}

	}

}
