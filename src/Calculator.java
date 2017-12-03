//Author: Ovidio Castillo
//Purpose: To find number average, sum with array
// date: 11/27/2017
public class Calculator {

    public static double getAverage (double first, double second) {
        return(first+second)/2.0;
    }
    public static double getAverage (double first, double second, double third){
        return(first+second+third)/3;
    }
    public static double getSum (double first, double second){
        return first+second;
    }
    public static double getAverage(double []num) {
        double sum = 0.0;
        for (int n = 0; n < num.length; n++) {
            sum += num[n];
        }
        return (sum/num.length);
    }
    public static double getProduct(double first, double second) {
        return first*second;
    }
    public static int getProduct(int first, int second){
        return first*second;
    }


}
