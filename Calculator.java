class Calculator {
    int value;

    // Default Constructor
    Calculator() {
        value = 10;
    }

    // Overloaded Constructor
    Calculator(int v) {
        value = v;
    }

    // Method with two parameters
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator(50);

        System.out.println("Calc1 value: " + calc1.value);
        System.out.println("Calc2 value: " + calc2.value);

        System.out.println("Sum of 2 numbers: " + calc1.add(5, 10));
        System.out.println("Sum of 3 numbers: " + calc1.add(5, 10, 15));
    }
}