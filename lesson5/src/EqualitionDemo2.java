import java.util.function.DoubleUnaryOperator;

import static java.lang.Math.sin;
import static sun.awt.image.PixelConverter.Argb.instance;

public class EqualitionDemo2 {

    double InXCubeMinus2(double x) {
        return Math.log((x * x * x) - 2);
    }


    double Function(double x) {
        return sin(x);
    }

    double solveEquation(double x, double y, double c) {
        double result = 0, h = (x - y) / c;

        for(int i = 0; i < c; i++) {
            result += Function(x + h * (i + 0.5));
        }

        result *= h;
        return result;

    }


    public static void main(String[] args) {
//        Function f1 = new ExpXMinusHalf();
//        System.out.println(solveEquation(0.01, 2, 1e-5, f1));

        EqualitionDemo.Function f1 = Math::x*y;
        System.out.println(solveEquation(1, 3, f1));

    }


}
