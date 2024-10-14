import java.util.*;
public class FindQuadrant {
   public static void main (String [] args)
   {
    Scanner sc = new Scanner(System.in);
    int x= sc.nextInt();
    int y = sc.nextInt();

    if ( x >0 && y >0)
    {
        System.out.println("points is in 1st quadrant");
    }
    else if (x > 0 && y < 0)
    {
        System.out.println("points is in 4th quadrant");
    }
    else if (x < 0 && y > 0)
    {
        System.out.println("points is in 2nd quadrant");
    }
    else if (x < 0 && y < 0){
        System.out.println("points is in 3rd quadrant");
    }

    else if ( x != 0 && y == 0){
        System.out.println("points is on x axis");
    }
    else if ( x == 0 && y != 0)
    {
        System.out.println("points is on y axis");
    }
    else {
        System.out.println("points is on origin 0,0");
    }
   } 
}
