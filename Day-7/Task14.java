import java.util.Scanner;
public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Message");
        String message  = sc.nextLine();

        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        String encrypted = "";

        for(int i=0;i<message.length();i++){
            char x = message.charAt(i);
            if((String.valueOf(x)).equals(" ")){
                encrypted = encrypted + " ";
            } else {
                int index = s.indexOf(x);
            encrypted = encrypted + s.charAt((index+3)%52);
            }
            
        }

        System.out.println(encrypted);

        String decrypted = "";

        for(int i=0;i<message.length();i++){
            char x = encrypted.charAt(i);
            if((String.valueOf(x)).equals(" ")){
                decrypted = decrypted + " ";
            } else {
                int index = s.indexOf(x);
            if(index == 0){
                decrypted = decrypted + "x";
            } else if(index == 1){
                decrypted = decrypted + "y";
            } else if(index == 2){
                decrypted = decrypted + "z";
            } else {
            decrypted = decrypted + s.charAt(index-3);
            }
            }
        }

        System.out.println(decrypted);

    }
}