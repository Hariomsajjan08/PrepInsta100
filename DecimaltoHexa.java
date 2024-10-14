public class DecimaltoHexa {
    public static void main(String [] args)
    {
        int decimal = 2545;

        String hexa = "";

        while(decimal > 0)
        {
            int remainder = decimal % 16;

            decimal = decimal / 16;
            if (remainder >= 10){
                hexa = (char)(remainder + 55) + hexa;
            }
            else{
                hexa = remainder + hexa;
            }

            
        }

        System.out.println("ocatal conversion :"+hexa);
    }
}
