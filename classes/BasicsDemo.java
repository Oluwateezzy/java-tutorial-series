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
    }
}
