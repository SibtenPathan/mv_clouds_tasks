import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        System.out.println();
        char []a = {'b','c','a','d'};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++)
            if(a[i] > a[j]){
                char temp = a[i];
                a[i] = a[j];
                a[j] = temp; 
            }
        }
        for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
        }
    }
}