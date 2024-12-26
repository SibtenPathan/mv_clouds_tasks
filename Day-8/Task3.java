import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        System.out.println();
        int []a = {98,32,72,94,75,73,92,36,28,34};
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;

        for(int num : a){
            if(num > largest){
                slargest = largest;
                largest = num;
            } else if(num > slargest && num !=largest){
                slargest = num;
            }
        }
        System.out.println("largest: " + largest);
        System.out.println("second largest: " + slargest);

    }
}