import java.util.Scanner;
public class CalculateTheSquare {
    public static void main(String[]args){

        //Creating the scanner object
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number: ");
        double numberSq=sc.nextInt();

        double result=numberSq * numberSq;

        System.out.println("The square of "+numberSq+" is "+ result);

        sc.close();
    }
}
