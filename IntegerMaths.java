import java.util.Scanner;
public class IntegerMaths {
    public static void main (String[] args){

        //Creating Scanner Object
        Scanner sc= new Scanner(System.in);

        //Get the user input
        System.out.println("Write the first integer: ");
        double firstInt=sc.nextInt();

        System.out.println("Write the second integer: ");
        double secondInt=sc.nextInt();

        double quotient=firstInt/secondInt;
        double remainder=firstInt%secondInt;

        System.out.println("The quotient of "+firstInt+ " and "+secondInt+" is "+quotient);
        System.out.println("The remainder of "+firstInt+" and "+secondInt+ " is "+remainder);

        sc.close();

    }
}
