package life.sideworks.tools;

/**
 * @author xushengbo
 */

public class Numeric {
    final private int a;
    final private int b;
    
    public Numeric(final int a, final int b) {
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