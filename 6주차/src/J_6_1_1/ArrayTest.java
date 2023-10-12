package J_6_1_1;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int [10];
		String name[] = new String[10];
		
		array[0] = 10;
		array[3] = 30;
		int sum = 0;
		
		for(int i = 0; i<array.length; i++) {
			sum += array[i];
			System.out.println(array[i] + " ");
		}
		

	}

}
