package java_3_3_2;

import java.util.*;

public class ZOMBIEGAME {
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Random r = new Random();
	        Scanner s = new Scanner(System.in);
	        int hero = 1;
	        int z1 = 7;
	        int z2 = 15;

	        while (hero < 20) {
	            System.out.println("왼쪽(1), 오른쪽(2), 점프(3)를 입력하세요");
	            int input = s.nextInt();

	            if(input==1) {
	                hero = hero - 1;
	                if(hero==0) {
	                    hero = hero + 1;  //맵밖으로 나가지 않게 처리
	                    System.out.println("용사여 앞으로 나아가세요.");
	                }
	            }

	            else if(input==2) {
	                hero = hero+1;
	            }

	            else if(input==3) {
	                int jump = r.nextInt(3)+1;
	                hero=hero+jump;
	            }

	            System.out.println("현재 Hero의 위치는 " + hero + " 입니다.");

	            //int z = r.nextInt(3)-1; //0,1,2, 나오던 게  -1  해주면 -1,0,1이 됨
	            z1 = z1 + r.nextInt(3)-1;
	            z2 = z2 + r.nextInt(3)-1;
	            System.out.println("현재 좀비의 위치는 " + z1 +", " + z2 + " 입니다.");

	            if((hero==z1)||(hero==z2)){
	                System.out.println("당신은 좀비에게 잡혔습니다.");
	                System.out.println("처음 위치로 돌아갑니다.");
	                hero = 1;
	            }


	        }

	        if(hero>=20) System.out.println("당신은 탈출에 성공했습니다.");
	    }

	

}
