import java.util.Scanner;
public class Task2 {

    static int factorial(int n){
        int result = 1;
        for(int i=1;i<=n;i++){
            result*=i;
        }
        return result;
    }

    static int permutations(int n,int r){
        if(r > n){
            System.out.println("r cannot be greater than n");
            return -1;
        }
        return factorial(n) / factorial(n-r);
    }

    static int combinations(int n,int r){
        if(r > n){
            System.out.println("r cannot be greater than n");
            return -1;
        }
        return factorial(n) / (factorial(r)*factorial(n-r));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter n");
        int n = sc.nextInt();
            System.out.println("Enter r");
        int r = sc.nextInt();

        int combi = combinations(n,r);
        int permu = permutations(n,r);

        if(combi != -1){
            System.out.println("Combinations: "+combi);
        }
        if(permu != -1){
            System.out.println("Permutations: "+permu);
        }
    }
}