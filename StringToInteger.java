import java.util.Scanner;
public class StringToInteger {
    public static void main (String[]args){

        //Creating Scanner Object
        Scanner sc=new Scanner(System.in);

        //Taking UserInput

        System.out.println("Write a string to convert into integer: ");
        String userInput=sc.nextLine();

        int nextConvert= Integer.parseInt(userInput);

        System.out.println("The integer is "+nextConvert);

        sc.close();

    }
}
