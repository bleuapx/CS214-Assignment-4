import java.util.Scanner;

public class DistanceCalculation
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
         
        System.out.println("Enter the first coordinate value:");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
         
        System.out.println("Enter the second coordinate values:");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
         
        int diffX = x2 - x1;
        int diffY = y2 - y1;
         
        double distance = Math.sqrt(diffX * diffX + diffY * diffY);
         
        System.out.println("The distance between (" + x1 + "," + y1 + 
            ") and (" + x2 + "," + y2 + ") is " + distance);
     }
}