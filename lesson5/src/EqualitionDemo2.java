import java.util.function.DoubleUnaryOperator;

import static java.lang.Math.sin;
import static sun.awt.image.PixelConverter.Argb.instance;

public class EqualitionDemo2 {

    interface Function {
        double f(double x);
    }


    public class Rectangle {

        static double comRectangle (double x0, double xn, int N,Function f) {
            double S = 0;
            double dx = dx(xn, x0, N);


            for (int i = 0; i < N; i++) {
                double xi = x0 + dx * i;
                double si = f.apply((xi + dx + xi) / 2) * dx;
                S = S + si;
            }
            return S;
        }

        static double dx (double xn,double x0, int N)
        {
            return (xn-x0)/N;
        }

        static double Fx (double x)
        {
            return (xn-x0)/N;
        }


//        public static void main(String[] args) {
//            Fx f1 = new f1();
//            System.out.println(comRectangle(1, 3, 1e-5, f1));
//            return x;
//            Fx f2 = new f(){
//                @Override
//                public double f(double x) {
//                    return x;
//                }
//            };
//            System.out.println(comRectangle(2, 3, 1e-5, f2));
//
//            instance f {double apply (double x);}
//            // instance method reference
//            Fx f3 = instance::lnXCubeMinus2;
//            System.out.println(comRectangle(1, 3, 1e-5, f3));
//
//            // static method reference
//            Fx f4 = Math::tan;
//            System.out.println(comRectangle(2, 4, 1e-5, f4));
//
//            // lambda expression
//            Fx f5 = x -> x*x*x - 8*x + 2;
//            System.out.println(comRectangle(1, 5, 1e-5, f5));
//        }
//
//        private static class ExpXMinusHalf implements Fx {
//            @Override
//            public double f(double x) {
//                return Math.exp(-x) - 0.5;
//            }
//        }
//
//

    }
}
