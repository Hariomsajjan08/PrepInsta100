public class SmallestElementArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50};

        int min = arr[0];
        int i;
        for (i =1; i< arr.length ; i++){
            if (arr[i] < min) {
                min = arr[i];
        }
        
    }
    System.out.println("Smallest element in the array is " + min);
}
}