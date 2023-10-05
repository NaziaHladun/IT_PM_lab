package gradle_lab;

public class App {
    public static void main(String[] args) {
        double num1 = 10.5;
        double num2 = 5.2;
        
        double additionResult = add(num1, num2);
        double subtractionResult = subtract(num1, num2);
        double multiplicationResult = multiply(num1, num2);
        double divisionResult = divide(num1, num2);
        
        System.out.println("Addition: " + additionResult);
        System.out.println("Subtraction: " + subtractionResult);
        System.out.println("Multiplication: " + multiplicationResult);
        System.out.println("Division: " + divisionResult);
    }
    
    public static double add(double a, double b) {
        return a + b; //щось поміняв
    }
    
    public static double subtract(double a, double b) { 
        return a - b;
    }
    
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
    
}