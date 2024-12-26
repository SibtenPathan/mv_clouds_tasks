public class Task10 {

    public static void main(String args[]){
    int n = 5;
        for (int i = 1; i <= n; i++) {
          
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
          
            for (int k = 1; k <= (2 * i - 1); k++) {
               
                if (k == 1 || k == (2 * i - 1)) {
                    System.out.print("*");
                }
                
                else {
                    if(k%2==0){
                        System.out.print(i-1);
                    } else {
                        System.out.print("*");
                    }
                }
            }

            System.out.println("");
        }
    }
    
}