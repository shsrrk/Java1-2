package J_6_1_1;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		
		try {
			fin = new FileReader("c:\\windows\\system.ini"); //파일이 없을 수도 있는 경우 때문에  try-catch문을 꼭 써줘야 한다. 
			
			int c;
			while((c = fin.read()) != -1) {
				System.out.print((char)c);
			}
			
			fin.close();
		} catch(IOException e) {
			System.out.println("해당 파일을 찾을 수 없습니다."); //try-catch 문이 없다면 파일이 죽어버림
		}

	}

}
