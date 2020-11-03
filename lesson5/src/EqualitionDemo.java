public class EqualitionDemo {


    interface Function {
        double f(double x);
    }


    double InXCubeMinus2(double x) {
        return Math.log((x * x * x) - 2);
    }

    static double solveEquation(double left, double right, double eps, Function func) {
        while (true) {
            double m = (right + left) / 2;
            if (func.f(m) == 0)
                return m;
            if ((m - left) < eps)
                return m;
            if (Math.signum(func.f(left)) == Math.signum(func.f(m)))
                left = m;
            else right = m;
        }


    }


    public static void main(String[] args) {
        Function f1 = new ExpXMinusHalf();
        System.out.println(solveEquation(0.01, 2, 1e-5, f1));


        //абстрактный класс дальше, он должен быть реализован в точке вызова
        //anonimus
        Function f2 = new Function() {
            @Override
            public double f(double x) {
                return Math.sin(x) - 0.75;
            }
        };
        System.out.println(solveEquation(2, 3, 1e-5, f2));

        EqualitionDemo instance = new EqualitionDemo();

        //instance method reference
        Function f3 = instance::InXCubeMinus2;
        System.out.println(solveEquation(1, 3, 1e-5, f3));

        //static method reference
        Function f4 = Math::tan;
        System.out.println(solveEquation(2, 4, 1e-5, f4));

        //Lambda
        Function f5 = x -> x * x * x - 8 * x + 2;
        System.out.println(solveEquation(1, 5, 1e-5, f5));

    }

    private static class ExpXMinusHalf implements Function {

        @Override
        public double f(double x) {
            return Math.exp(-x) - 0.5;
        }
    }


}
