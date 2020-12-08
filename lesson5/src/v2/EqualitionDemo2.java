import java.awt.*;

public class EqualitionDemo2 {

    interface Function {
        double f(double x);
    }

    static double rectangle(double x0, double xn, int N, double exp, Function f) {
        double S = 0;
        double dx = dx(xn, x0, N);

        for (int i = 0; i < N; i++) {
            double xi = x0 + dx * i;
            double si = f.f((xi + dx + xi) / 2) * dx;
            S = S + si;
        }
        return S;
    }

    static double dx(double xn, double x0, int N) {
        return (xn - x0) / N;
    }


    double form1(double x) {
        return (x);
    }

    static double form2(double x) {
        return (x * x + x);
    }

    public static void main(String[] args) {
        Function f1 = new ExpXMinusHalf();
        System.out.println(rectangle(0.01, 2, 100, 1e-5, f1));

        Function f2 = new Function() {

            @Override
            public double f(double x) {
                return x * (Math.sin(x));
            }
        };
        System.out.println(rectangle(0, 1, 100, 1e-5, f2));


        EqualitionDemo2 instance = new EqualitionDemo2();
        Function f3 = instance::form1;
        System.out.println((rectangle(1, 3, 100, 1e-5, f3)));

        Function f4 = EqualitionDemo2::form2;
        System.out.println((rectangle(3, 4, 100, 1e-5, f4)));

        Function f5 = x -> x * x;
        System.out.println((rectangle(0, 1, 100, 1e-5, f5)));
    }

    private static class ExpXMinusHalf implements Function {
        @Override
        public double f(double x) {
            return Math.exp(-x);
        }
    }

}
