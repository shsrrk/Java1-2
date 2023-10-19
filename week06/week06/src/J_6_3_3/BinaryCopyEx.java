package J_6_3_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryCopyEx {
	public static void main(String[] args) {
		File src = new File("C:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");
		File dest = new File("C:\\Users\\217\\Desktop\\n����\\copyimg.jpg");
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest); 
			byte buf[] = new byte[1024*10];
			
			while((c = fi.read()) != -1) {
				int n = fi.read(buf);
				fo.write(buf, 0, n);
				if(n < buf.length) break;
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+ "�� " + 
					dest.getPath()+ "�� �����Ͽ����ϴ�.");
		} catch (IOException e) {
			System.out.println("���� ���� ����");
		}
	}
}
