public class Factorial {
    public static int compute(int n) {
        if(n < 0) throw new IllegalArgumentException("Negative numbers are not allowed");
        long result = 1;
        for(int i = 2; i <= n; i++) {
            result *= i;
        }

        return (int) result;
    }

    public static void main(String args[]){
        System.out.println("Factorial of 5 is: " + compute(5));
    }
}
