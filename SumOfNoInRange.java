public class SumOfNoInRange {

    public static int getSum(int a, int b)
    {
        if (a > b) {
            return 0;
        }

        return a + getSum(a + 1, b);
        
    }
    public static void main(String [] args)
    {
        int a = 10;
        int b = 25;

        System.out.println(getSum(a,b));
    }
}
