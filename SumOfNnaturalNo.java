public class SumOfNnaturalNo {

    public static int getSum(int num){
        if (num == 0){
            return num;
        }
        return num + getSum(num - 1);
    }
    public static void main(String [] args){
        int num = 10;

        System.out.println(getSum(num));
    }
}
