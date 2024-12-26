import java.util.*;

class GfG {

    static int noOfWays(int n, int x) {

        if (n == 0 && x == 0) return 1;
        if (n == 0 || x <= 0) return 0;     
        int ans = 0;     

        for (int i = 1; i <= 6; i++) {
            ans += noOfWays(n - 1, x - i);
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int n = 3, x = 4;
        System.out.println(noOfWays(n, x));
    }
}