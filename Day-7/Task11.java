import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal Number");
        Float f  = sc.nextFloat();
        String s = Float.toString(f);
        int index = s.indexOf(".");
        String num = s.replace(".","");
        String rev = "";

        for(int i=num.length()-1;i>=0;i--){
            rev = rev + (num.charAt(i));
        }
        
        String result="";

        for(int i=0;i<rev.length()+1;i++){
            if(i == index){
                result = result + ".";
            }  else if(i > index) {
                result = result + rev.charAt(i-1);
            } else {
                result = result + rev.charAt(i);
            }
        }
        System.out.println(result);
    }
}