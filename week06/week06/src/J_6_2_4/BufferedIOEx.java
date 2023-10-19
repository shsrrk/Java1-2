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
			BufferedOutputStream out = new BufferedOutputStream(System.out,5);  //5바이트 까지만 뽑아라  
			//묶으으로 해석해서 한번에 해석하는 게 효율적이기에 버퍼의 단위를 쓴다.
			while((c=fin.read())!= -1) {
				out.write(c);
			}
			
			new Scanner(System.in).nextLine(); //입력받아서 강제로 코드 실행
			out.flush(); //나머지 화면에 쌓여있는 데이터들을 강제로 보내라
			
			out.close();
			fin.close();
			
		} catch(IOException e) {
			
		}

	}

}
