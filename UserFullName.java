import java.util.Scanner;

public class UserFullName {
    public static void main (String[] args){
        //Creating Scanner Object
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first name: ");
        String firstName=sc.nextLine();

        System.out.println("Enter last name: ");
        String lastname=sc.nextLine();

        System.out.println("Hello "+firstName + " " +lastname);

        sc.close();

    }
}
