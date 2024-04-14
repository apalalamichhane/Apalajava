public class MathMayhem {
    public static void main(String[]args){
        int x=5;
        int y=10;
        int z=-18;
        System.out.println(Math.max(x,y));
        System.out.println(Math.min(x,y));
        System.out.println(Math.sqrt(y));
        System.out.println(Math.abs(z));
        System.out.println(Math.random());

        int ranDom= (int) (Math.random()*50);
        System.out.println(ranDom);
    }
}
