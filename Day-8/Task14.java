public class Task14 {
    public static void main(String[] args) {
        String s = null;
        try{
            System.out.println(s.length());
        }     
        catch(NullPointerException e){
            System.out.println("This is null pointer Exception");
        }
    }
}