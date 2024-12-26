import java.util.Scanner;
public class Task12 {
    public static void main(String[] args) {
        String s = "my name is khan";
        String rev = "";
        String []a = s.split(" ");
        for(int i=(a.length-1);i>=0;i--){
            rev+= a[i]+" ";
        }
        System.out.println(rev);
    }
}