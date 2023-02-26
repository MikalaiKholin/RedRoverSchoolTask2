public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b=5;

        System.out.printf("a + b = %d%n", a + b);
        System.out.printf("a - b = %d%n", a - b);
        System.out.printf("a / b = %d%n", a / b);
        System.out.printf("a * b = %d%n", a * b);
        System.out.printf("the remainder of the division a and b %d%n", a % b);
        System.out.printf("is a an even number? %b%n", a % 2 == 0);
        System.out.printf("is b an even number? %b%n", b % 2 == 0);
    }
}