import  java.util.Scanner;
public class PrintStringByUser {
    public static void main(String[] args){

        //Creating Scanner Object
        Scanner sc=new Scanner(System.in);

        //Taking User Input
        System.out.println("Please enter a valid string: ");
        String userInput=sc.nextLine();

        System.out.println("The string given by the user is: "+userInput);

        sc.close();
    }
}
