public class Lcm {
    public static void main (String [] args)
    {
        int num1 = 12; int num2 = 14;

        int max = num1 > num2 ? num1 : num2;
        int lcm = 0;
        for (int i= max; i <= num1 * num2; i++){
            if (i % num1 == 0 && i % num2 == 0){
                lcm = i;
                break;
            }
        }
        System.out.println("LCM OF TWO NUMBERS IS "+lcm);
    }
}
