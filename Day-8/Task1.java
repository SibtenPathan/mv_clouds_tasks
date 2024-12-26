import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        System.out.println();
        String s = "Welcome to MV Clouds!";
        String result = "";
        for(int i=0;i<s.length();i++){
            if((String.valueOf(s.charAt(i))).equals(" ")){
                continue;
            } else {
                result+=s.charAt(i);
            }
        }
        System.out.println(result);
    }
}