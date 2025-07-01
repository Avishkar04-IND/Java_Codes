class Printer {
    void print(int num) {
        System.out.println("Printing integer: " + num);
    }

    // Overloaded method: same name, different parameter type
    void print(String text) {
        System.out.println("Printing string: " + text);
    }

    // Overloaded method: same name, different number of parameters
    void print(int num1, int num2) {
        System.out.println("Printing two integers: " + num1 + ", " + num2);
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(100);
        p.print("Hello Java!");
        p.print(5, 15);
    }
}