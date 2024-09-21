public class LargestElementArray {

	public static void main(String[] args) {
		int []  arr = {1, 15, 20, 21, 16, -12, 31};
		int i;
		int max = arr[0];
		 for ( i=1; i < arr.length ; ++i ) {
			 if(arr[i] > max) {
				 max = arr[i];
				 
			 }
		 }
		 System.out.println("index of largest element :     "+(i-1));
		 System.out.println("largest elelment :  "+max);
	}

}
