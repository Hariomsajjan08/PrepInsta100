public class OctaltoBinary {
    public static void main(String [] args)
    {
       int octal = 12;
       
       int decimal = 0;
       int pow=0;

       while (octal > 0)
       {
        int rem = octal % 10;
        decimal += rem * Math.pow(8,pow);
        octal = octal /10;
        pow++;
       }

       String binary = "";

        while (decimal > 0){
            int remainder= decimal % 2;
            decimal = decimal /2;
            binary = remainder + binary;
        }

       System.out.println("octal to binary is  : "+binary);
    }
}
