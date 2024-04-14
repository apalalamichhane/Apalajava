import java.util.Scanner;
public class MultiplyFloatingPoint {
    public static void main(String[] args){

        //Creating Scanner Object
        Scanner sc=new Scanner(System.in);

        //Taking User Input
        System.out.println("Enter one floating point number: ");
        double firstNum=sc.nextDouble();

        System.out.println("Enter another floating point number: ");
        double secondNum=sc.nextDouble();

        //Making the multiply formula
        double result=firstNum*secondNum;

        //Getting the result
        System.out.println("The answer of the multiplication is: "+ result);

        sc.close();

    }
}
