class Person {
    String name = "Alex";
}

class Employee extends Person {
    int empId = 101;
}

class Manager extends Employee {
    
    void calculateBonus(int numberOfEmployees) {
        try {
            int bonusPerEmployee = 50000 / numberOfEmployees;
            System.out.println("Bonus per employee: " + bonusPerEmployee);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        
        // Showing inherited properties
        System.out.println("Name: " + m.name);
        System.out.println("Employee ID: " + m.empId);

        // Showing exception handling
        System.out.println("--- Calculating for 5 employees ---");
        m.calculateBonus(5);
        
        System.out.println("--- Calculating for 0 employees ---");
        m.calculateBonus(0);
    }
}