public class Task4 {
    public static void main(String[] args) {
       for(int i=0;i<5;i++){
        for(int j=0;j<=i;j++){
            if(j==i || j == 0 || i==4){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
       }
    }
}