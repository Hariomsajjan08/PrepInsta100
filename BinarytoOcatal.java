import java.util.*;
public class BinarytoOcatal {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);

        int binary = sc.nextInt();

        int decimal =0;
        int pow=0;
        while (binary > 0){
            int remainder = binary % 10;
            decimal += remainder*(1 << pow);
            binary = binary/10;
            pow++;
        }


        
        String octal ="";

        while (decimal > 0)
        {
            int val = decimal%8;
            decimal = decimal /8;

            octal = val + octal;
        }
        System.out.println("binary to octal conversion :"+octal);
    }
}
