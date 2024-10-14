public class HexadecimaltoDecimal {
    public static void main(String[] args) {
        String hex = "c9"; // Example hexadecimal value
        hex = hex.toUpperCase(); // Convert to uppercase for matching with 'digits'

        String digits = "0123456789ABCDEF";
        int decimal = 0;

        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i); 

            
            int value = digits.indexOf(ch);

            
            decimal = 16 * decimal + value;
        }

        System.out.println("Decimal conversion is: " + decimal);
    }
}
