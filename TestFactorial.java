public class TestFactorial {
    public static void main(String[] args) {
        try{
            if(Factorial.compute(5) != 120){
                throw new AssertionError("Test failed: Factorial of 5 is not 120");
            }

            if(Factorial.compute(0) != 1){
                throw new AssertionError("Test failed: Factorial of 0 is not 1");
            }

            System.out.println("All tests passed!");
        } catch (AssertionError e) {
            System.err.println("Test failed: " + e.getMessage());
        }
    }
}
