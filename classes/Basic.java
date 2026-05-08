class Basic {
    // 1. Naming rules for classes/methods/variables
        // a) First character: letter, underscore (_), or dollar sign ($)
        // b) Remaining characters: letter, digit, underscore (_), or dollar sign ($)
        // c) No reserved keywords or literal values (true, false, null)

    int id1 = 0;

    // 2. java is case-sensitive
    int id = 0;
    int Id = 0;
    int ID = 0;

    void foo() {}
    void Foo() {}

    // 3. Printing to console
    static void print() {
        System.out.println("\n\nInside print...");
        System.out.println("Hello, world!!");
        System.out.println();
        System.out.print("Hello, Print!!");
        System.out.println("Hello");
        System.out.print(" ");
        System.out.print("World!!");
    }

    public static void main(String[] args) {
        print();

        int i = 6;
        int j = 2;

        System.out.println(i + j);
        System.out.println(i - j);
        System.out.println(i * j);
        System.out.println(i / j);
        System.out.println(i % j);
    }

    // Comments or to disabling code
}