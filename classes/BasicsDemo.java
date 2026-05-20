import java.math.BigDecimal;

public class BasicsDemo {
    static void print() {
        System.out.println("\n\nInside print...");
        System.out.println("Hello, world!!");
        System.out.println();
        System.out.print("Hello, Print!!");
        System.out.println("Hello");
        System.out.print(" ");
        System.out.print("World!!");
    }
    static void primitives() {
        System.out.println("\n\nInside Primitives...");
        int intHex = 0x0041;
        System.out.println("intHex " + intHex);

        int intBinary = 0b01000001;
        System.out.println("intBinary " + intBinary);

        int octBinary = 0101;
        System.out.println("octBinary " + octBinary);
    }

    public static void main(String[] args) {
        primitives();

        System.out.println(1 - 0.9);
        System.out.println(0.1 + 0.2);

        double price = 1000;
        double discountPercent = 0.9;
        double discountAmount = price * discountPercent;

        System.out.println(discountAmount);
        System.out.println(price - discountAmount);
        System.out.println(price * (1 - discountPercent));


        BigDecimal first = new BigDecimal("0.1");
        BigDecimal second = new BigDecimal("0.2");
        System.out.println(first.add(second));

    }
}
