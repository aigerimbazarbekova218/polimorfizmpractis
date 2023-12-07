import java.util.Arrays;

public class Maximum {
    private int a;
    private int b;
    private int c;
    private int []maximum;

    public Maximum(int a, int b, int c, int[] maximum) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.maximum = maximum;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int[] getMaximum() {
        return maximum;
    }

    public void setMaximum(int[] maximum) {
        this.maximum = maximum;
    }
    public void max(int a,int b){
        System.out.println(Math.max(a, b));

    }
    public  void max1(int a,int b,int c){
        if(a>b && a>c) {
            System.out.println(a);

        }else if(b>a && b>c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
    public void maximum(int [] maximum){
        int max = maximum[0];
        for (int i = 0; i < maximum.length; i++) {
            if(maximum[i]>max){
                max=maximum[i];
            }
        }
        System.out.println(max);
    }

    @Override
    public String toString() {
        return "Maximum{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", maximum=" + Arrays.toString(maximum) +
                '}';
    }
}
