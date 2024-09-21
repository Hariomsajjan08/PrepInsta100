import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int num = sc.nextInt();
        
       
        String res = (num & 1) == 1 ? "odd" : "even";

        System.out.println(res);
        
        sc.close();
    }
}
