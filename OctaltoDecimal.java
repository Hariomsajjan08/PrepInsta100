import java.util.Scanner;

public class OctaltoDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an octal number: ");
        String str = sc.nextLine(); // Input the octal number as a string

        // Convert octal to decimal
        int decimal = Integer.parseInt(str, 8);

        // Close the scanner
        sc.close();

        // Output the result
        System.out.println("Decimal conversion is: " + decimal);
    }
}
