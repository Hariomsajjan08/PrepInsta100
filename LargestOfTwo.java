import java.util.Scanner;
public class LargestOfTwo {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();

        String res = (a > b) ? "a is greater":(a < b) ? "b is graeter " : " a and b are equal";

        System.out.println(res);
    }
}
