public class IfElse {
    public static void main(String[]args){
        int myAge=25;
        int votingAge=18;

        if (myAge>=votingAge) {
            System.out.println("You can vote!!");
        } else{
            System.out.println("You can't vote :(");
        }

        int fwance=55;
        int hellooos=55;

        String result= (fwance==hellooos) ? "They are equal" : "They are not equal";
        System.out.println(result);
    }
}
