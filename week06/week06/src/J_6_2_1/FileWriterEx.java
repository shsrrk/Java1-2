package J_6_2_1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		
		try {
			fout = new FileWriter ("c:\\temp\\test.txt");
			while(true) {
				String line = s.nextLine();
				if(line.length()==0) break;
				fout.write(line, 0,line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close(); //이게 있어야 파일이 저장됨;
		} catch(IOException e){
			System.out.println("입출력 오류");
		}
	}
}
