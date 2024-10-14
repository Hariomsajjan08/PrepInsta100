public class DecimaltoBinary {
    public static void main(String [] args)
    {
        int decimal = 15;

        String binary = "";

        while (decimal > 0){
            int remainder= decimal % 2;
            decimal = decimal /2;
            binary = remainder + binary;
        }

        System.out.println("binary conversion is :"+binary);
    }
}
