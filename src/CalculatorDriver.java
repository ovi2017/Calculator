
public class CalculatorDriver {
    public static void main(String [] args) {
        double [] num = new double[5];
        num[0] = 5.0;
        num[1] = 5.0;
        num[2] = 6.0;
        num[3] = 7.0;
        num[4] = 8.0;

        System.out.println("The Average is: "+ Calculator.getAverage(num));
        System.out.println("The sum is: " +Calculator.getSum(5.0,3.0));
        System.out.println("The Product is: " + Calculator.getProduct(10.0, 20.0));
    }
}
