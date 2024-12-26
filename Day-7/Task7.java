public class Task7 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("(x,y) = ("+x+","+y+")");

        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("(x,y) = ("+x+","+y+")");
    }
}