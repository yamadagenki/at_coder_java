package life.sideworks.abc118.abc118c;

import java.util.Scanner;

/**
 * @author shengboxu
 */

public class Main {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int[] A = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        
        int ans = A[0];
        
        for (int i = 0; i < N; i++) {
            final Numeric numeric = new Numeric(ans, A[i]);
            ans = numeric.getGcd();
        }
        
        System.out.println(ans);
    }
    
    public static class Numeric {
        final private int a;
        final private int b;
        
        Numeric(final int a, final int b) {
            this.a = a < b ? a : b;
            this.b = (a + b) - this.a;
        }
        
        int getGcd() {
            int x = this.a;
            int y = this.b;
            
            int tmp;
            while ((tmp = x % y) != 0) {
                x = y;
                y = tmp;
            }
            return y;
        }
    
        int getLcm() {
            return a * b / getGcd();
        }
    }
}