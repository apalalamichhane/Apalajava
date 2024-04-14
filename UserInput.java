import java.util.Scanner;

public class UserInput {
    public static void main (String[] args){

        //Making Scanner Object

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number ");
        int num1=sc.nextInt();

        System.out.println("Enter second number ");
        int num2=sc.nextInt();

        int sum=num1+num2;
        System.out.println("The sum of num1 and num2 is "+ sum);

        sc.close();
    }
}