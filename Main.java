public class Main{
    public static void main(String[] args){

        try {
            int a = 10;
            int b = 5;

            int result = a + b;
            System.out.println(result);
            
        } catch (ArithmeticException e) {
            System.out.println("An Error..");
        }
        finally{
            System.out.println("Finally block Always executed..");
        }
    }
}