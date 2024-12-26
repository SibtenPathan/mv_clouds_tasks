import java.util.Scanner;
public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int len = String.valueOf(num).length();
        int result = 0;
        int temp = num;
        for(int i=0;i<len;i++){
            int x = temp%10;
            temp = temp/10;
            result+=Math.pow(x,len);
        }
        if(result == num){
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}