public class Main {
    public static void main(String[] args) {
      int n=5;
      //upper 
      for(int i=1;i<=n;i++){
        //1st half
        for(int j=1;j<=i;j++){
          if(j==1||j==i){
            System.out.print("*");
          }else{
            System.out.print(" ");
          }
        }
        //spaces
        int s=2*n-2*i;
        for(int j=1;j<=s;j++){
          System.out.print(" ");
      }
      //2nd half
      for(int j=1;j<=i;j++){
        if(j==i||j==1){
          System.out.print("*");
        } else{
          System.out.print(" ");
        }
      }
      System.out.println();
      }
     //lower
           for(int i=n;i>=1;i--){
        //1st half
        for(int j=1;j<=i;j++){
          if(j==1||j==i){
            System.out.print("*");
          }else{
            System.out.print(" ");
          }
        }
        //spaces
        int s=2*n-2*i;
        for(int j=1;j<=s;j++){
          System.out.print(" ");
      }
      //2nd half
      for(int j=1;j<=i;j++){
        if(j==i||j==1){
          System.out.print("*");
        } else{
          System.out.print(" ");
        }
      }
      System.out.println();
     }
  }
}