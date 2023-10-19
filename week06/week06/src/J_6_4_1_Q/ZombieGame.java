package J_6_4_1_Q;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class ZombieGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		byte b[] = new byte[4];
		
		Hero me = new Hero("���ȯ", 1, 3);
		Zombie zom1 = new Zombie("�ؾǹ����� ����", 10);
		Zombie zom2 = new Zombie("���ں��� ����", 20);

		
		Vector<Zombie> zombies = new Vector<Zombie>();
		zombies.add(zom1);
		zombies.add(zom2);


		

			try {
				FileInputStream fin = new FileInputStream("C:\\Users\\217\\Desktop\\n����\\zombie.sav");
				int n=0, c;
				while((c = fin.read())!= -1) {
					b[n] = (byte)c; 
					n++;
				}		
				
				
				System.out.println("���� �ʱ� ��ġ��"+b[0]);
				System.out.println("���� "+b[1]);
				System.out.println("�ؾǹ����� ���� "+b[2]);
				System.out.println("���ں��� ����"+b[3]);
				
				
				me.pos = b[0];
				me.hp = b[1];
				zom1.pos = b[2];
				zom2.pos = b[3];
				
				fin.close();
			} catch(IOException e) {
				System.out.println( "�ƾ߾� ����� ���� ���پ�. Ȯ�� �ٽ� �عٶ�");
			}
			me.pos = (int)b[0];
		
		
		
		for(;me.hp>=0;) {
			System.out.println("���� ���� �� ���󿡼� ��Ƴ����ʽÿ�. ���� (1), ������(2), ����(3), ���� �� ����(4)");
			int input = s.nextInt();
			
			//������� �Է�
			if(input == 1) {
				me.LM();
			}
			else if(input == 2) {
				me.RM();
			}
			else if(input == 3) {
				me.Jump();
			}
			
			else if(input == 4) {
				//���� �����ϱ�
				File f1 = new File("C:\\Users\\217\\Desktop\\n����\\zombie.sav");
				
				//����Ʈ �迭�� ������ ���� ������� �־��ָ� ��
				b[0] = (byte)me.pos;
				b[1] = (byte)me.hp;
				b[2] = (byte)zom1.pos;
				b[3] = (byte)zom2.pos;
				
				FileOutputStream fout = null;
				
				try {
					fout = new FileOutputStream(f1);
					for (int i = 0; i < b.length; i++) {
						fout.write(b[i]);
					}
					System.out.println("������ �� ������~");
					fout.close();
				} catch(IOException e) {
					System.out.println("���Ͽ� ������ �� �����ϴ�. Ȯ�ιٶ�.");
					e.getStackTrace(); //�ͼ����� �� �����
				}
				return;
			}
			
			//������ �̵�
			for(int i=0; i<zombies.size();i++) {
				Zombie p = zombies.get(i);
				p.move();
				
				if(zombies.get(i).pos==me.pos) {
					me.pos = 1;
					
					zom1.pos = 10;
					zom2.pos = 20;

					
					me.hp -= 1;
					System.out.println("�� ������ �ٽ� �غ�");
					System.out.println("(����� ����� "+me.hp+" �� ���ҽ��ϴ�)");
					System.out.println();
				}
			}
			
			
			if(me.pos>=30) {
				System.out.println("�����մϴ�. ����� ��Ƴ��ҽ��ϴ�.");
				break;
			}

		}

	}

}

