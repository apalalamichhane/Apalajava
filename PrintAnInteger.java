import java.util.Scanner;
public class PrintAnInteger {
    public static void main (String[]args){

        //Creating Scanner Object
        Scanner sc= new Scanner(System.in);

        //Taking user input
        System.out.println("Please enter an integer: ");
        int userInput=sc.nextInt();

        System.out.println("The integer entered by the user is: "+ userInput);

        sc.close();
    }
}
