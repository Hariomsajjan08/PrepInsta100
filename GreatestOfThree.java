import java.util.Scanner;
public class GreatestOfThree {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String res = ( a > b) ? ((a > c) ? "a is greater":"c is greater"):((b > c) ? " b is greater":"c is greater");

        System.out.println(res);
    }
}
