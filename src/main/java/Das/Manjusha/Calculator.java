package Das.Manjusha;

/**
 * Created by manjushadas on 5/20/16.
 */
public class Calculator {

        public static int sum(int value1, int value2) {
            return value1 + value2;
        }

        public static int multiply(int value1, int value2) {
            return value1 * value2;
        }

        public static int divide(int value1, int value2)throws DivisionByZeroException {
            if(value2==0) {
                throw new DivisionByZeroException("Number cannot be divided by Zero");
            }
            return value1 / value2;
        }

        public static int subtract(int value1, int value2) {
            return value1 - value2;
        }
    public static int squareRoot(int value1)throws ComplexNumberException{
        if(value1<0){
            throw new ComplexNumberException("Cannot compute squareRoot of complex numbers");
        }
        return (int)Math.sqrt(value1);
    }

}
