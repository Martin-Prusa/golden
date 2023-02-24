package cz.martin;

public class Main {
    // ax^2 + bx + c
    static int fa = 1;
    static int fb = -6;
    static int fc = 15;

    public static double calculate(double x) {
        return fa*x*x + fb*x + fc;
    }
    public static void main(String[] args) {
        double goldenRatio = (-1 + Math.sqrt(5)) / 2;

        double a = 0;
        double b = 10;


        //double y1 = calculate(x1);
        //double y2 = calculate(x2);
        double avg = 0;


        for (int i = 0; i < 20; i++)  {
            double d = goldenRatio*(b-a);
            double x1 = a+d;
            double x2 = b-d;
            if(x1 < x2) {
                a = x2;
                x2 = x1;
            } else {
                b = x1;
                x1 = x2;
            }
            avg = (x1+x2) / 2;
        }

        System.out.println(avg);

    }
}