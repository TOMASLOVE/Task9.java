import static java.lang.Math.*;

public class Task{
    public static int add(int n1, int n2) {
        return Math.addExact(n1,n2);
    }

    public static int subtract(int n1, int n2) {
        return Math.subtractExact(n1,n2);
    }

    public static int multiply(int n1, int n2) {
        return Math.multiplyExact(n1,n2);
    }

    public static float divide(int n1, int n2) {
        return Math.floorDiv(n1,n2);
    }

    public static void main(String[] args) {
        // Demonstrate the math operations here
        System.out.println(add(255,155));
        System.out.println(subtract(255,155));
        System.out.println(multiply(255,55));
        System.out.println(divide(255,55));
    } 
}
