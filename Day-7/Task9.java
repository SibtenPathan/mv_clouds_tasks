import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s  = sc.nextLine();
        System.out.println("Enter location");
        int num = sc.nextInt();
        String []a = s.split(" ");
        System.out.println(a[num-1]);
    }
}