package J_6_3_1;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		
		char buf[] = new char[1024];
		try {
			fin = new FileReader("c:\\windows\\system.ini"); //������ ���� ���� �ִ� ��� ������  try-catch���� �� ����� �Ѵ�. 
			
			int n=0, c;
			while((c = fin.read()) != -1) {
				//System.out.print((char)c);
				buf[n] = (char)c;
				n++;
			}
			String line = String.valueOf(buf);
			String a[] = line.split(" ");
			int pos = Integer.parseInt(a[0]);
			int life = Integer.parseInt(a[1]);
			int zom1 = Integer.parseInt(a[2]);
			int zom2 = Integer.parseInt(a[3]);
			
			System.out.println(line);
			
			fin.close();
		} catch(IOException e) {
			System.out.println("�ش� ������ ã�� �� �����ϴ�."); //try-catch ���� ���ٸ� ������ �׾����
		}

	}

}
