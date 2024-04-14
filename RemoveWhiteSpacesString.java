import java.util.Scanner;
public class RemoveWhiteSpacesString {
    public static void main (String[]args){

        //Creating Scanner Object
        Scanner sc=new Scanner(System.in);

        String impString=sc.nextLine();

        String isString="Hello World It's Me";

        System.out.println(isString.replace(" ",""));
        System.out.println(impString.replace(" ",""));

        sc.close();
    }
}
