public class DecimaltoOcatal {
    public static void main(String [] args)
    {
        int decimal = 214;

        String octal = "";

        while(decimal > 0)
        {
            int remainder = decimal % 8;

            decimal = decimal / 8;

            octal = remainder + octal;
        }

        System.out.println("ocatal conversion :"+octal);
    }
}
