import java.util.*;
public class BinarytoDecimal {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);

        int binary = sc.nextInt();

        int sum =0;
        int pow=0;
        while (binary > 0){
            int remainder = binary % 10;
            sum += remainder*(1 << pow);
            binary = binary/10;
            pow++;
        }

        System.out.println("binary to decimal is :"+sum);
    }
}
