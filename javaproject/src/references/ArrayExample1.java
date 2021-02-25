package references;

public class ArrayExample1 {
	public static void main(String[] args) {
		// intArys
		// for 반복문()
		// Math.random()*10+1
		int[] arr1 = new int[5];
	
		for (int i = 0; i <arr1.length; i++) {
			arr1[i] = (int)(Math.random() *10+1);
			System.out.println(arr1[i]);
		
		}
		
		int max = 0;
		for(int n1 = 0; n1< arr1.length; n1++) {
			if(arr1[n1]>max) {
				max = arr1[n1];
				
			}
		}
		System.out.println("max:" + max);
	}
}
