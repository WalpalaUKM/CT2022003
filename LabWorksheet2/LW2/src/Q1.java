public class Q1 {
    public static void main(String[] args) {

        int A=10,C=5;
        double B=3.65;
        double answa = Math.sqrt((Math.pow(B,2)+4*A*C));
        System.out.println(answa);

        double X=6.0,Y=2.65;
        double answb = Math.sqrt(X+(4*Math.pow(Y,3)));
        System.out.println(answb);

        double answc = Math.cbrt(X*Y);
        System.out.println(answc);

        double r = 5.0;
        double answd = Math.PI*Math.pow(r,2);
        System.out.println(answd);


    }
}
