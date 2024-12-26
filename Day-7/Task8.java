public class Task8 {
    public static void main(String[] args) {
        int []a = {1,3,5,4,7,9};
        for(int i=0;i<a.length;i++){
            if(a[i]%2 == 0){
                System.out.println("False");
                System.exit(0);
            }
        
        }
        System.out.println("True");
    }
}