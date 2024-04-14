import java.util.Scanner;
public class FindSimpleInterest {
    public static  void main(String[] args){

        //Creating Scanner Object
        Scanner sc=new Scanner(System.in);

        System.out.println("Write the value of p: ");
        double valueP=sc.nextDouble();
        System.out.println("Write the value of t: ");
        double valueT=sc.nextDouble();
        System.out.println("Write the value of r: ");
        double valueR=sc.nextDouble();

        double result= valueP*valueT*valueR / 100 ;
        System.out.println("The simple interest is: "+result);

        sc.close();

    }
}
