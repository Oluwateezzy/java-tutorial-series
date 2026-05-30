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

        char charInt = 65;
        char charHex = 0x0041;
        char charBin = 0b0100_0001;

        System.out.println("charInt " + charInt);
        System.out.println("charHex " + charHex);
        System.out.println("charBin " + charBin);
    }

    static void typeCasting() {
        System.out.println("\nInside typeCasting ...");
        // Explicit
        long y = 42;
        int x = (int) y;

        // information loss due to out of range assignment
        byte narrowdByte = (byte) 123456;
        System.out.println("narrowdByte " + narrowdByte);

        // Truncation
        int itruncated = (int) 0.99;
        System.out.println("itruncated " + itruncated);

        // implicit cast (int to long)
        y = x;

        // Implicit cast (char to int)
        char cChar = 'A';
        int iInt = cChar;
        System.out.println("iInt " + iInt);

        // byte to char using an implicit cast
        byte bByte = 65;
        cChar = (char) bByte;
        System.out.println("cChar " + cChar);
    }

    static int count = 25;

    static void arrays() {
        System.out.println("\nInside arrays ...");
        // int[] scores = new int[4];
        // scores[0] = 90;
        // scores[1] = 40;
        // scores[2] = 30;
        // scores[3] = 60;

        // int[] scores = new int[] {90, 40, 30, 60};

        int[] scores = {90, 40, 30, 60};


        System.out.println("score 1 " + scores[0]);
        System.out.println("score 2 " + scores[1]);
        System.out.println("score 3 " + scores[2]);
        System.out.println("score 4 " + scores[3]);

    }

    public static void main(String[] args) {
        // primitives();

        // System.out.println(1 - 0.9);
        // System.out.println(0.1 + 0.2);

        // double price = 1000;
        // double discountPercent = 0.9;
        // double discountAmount = price * discountPercent;

        // System.out.println(discountAmount);
        // System.out.println(price - discountAmount);
        // System.out.println(price * (1 - discountPercent));


        // BigDecimal first = new BigDecimal("0.1");
        // BigDecimal second = new BigDecimal("0.2");
        // System.out.println(first.add(second));

        // typeCasting();

        arrays();
    }
}
