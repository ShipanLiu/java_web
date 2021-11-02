package Basic4_API.api1.api_Math;

public class MathDemo {
    public static void main(String[] args) {
        int abs = Math.abs(-10);
        System.out.println(abs); // 10

        double ceil = Math.ceil(10.1);
        System.out.println(ceil); // 11

        double floor = Math.floor(10.9);
        System.out.println(floor); // 10.0

        System.out.println(Math.round(10.1)); // 10
        System.out.println(Math.max(1, 2)); // 2

        System.out.println(Math.min(1, 2));
        System.out.println(Math.pow(2, 2));
        System.out.println(Math.random()); // [0.0, 1.0)



    }
}
