import java.util.Scanner;
public class PrintYourName {
    public static void main (String[] args){

        // Creating Scanner Object
        Scanner sc= new Scanner(System.in);

        System.out.println("Write your name: ");
        String userName=sc.nextLine();

        System.out.println("Your name is: " +userName);
        sc.close();
    }
}
