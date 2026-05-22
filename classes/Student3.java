class Student3 {

    char degree = 'B';
    Character deg = 'B';
    Character valB = Character.valueOf(degree);

    void compute() {
        System.out.println("degree " + degree);
        System.out.println("deg " + deg);
        System.out.println("valB " + valB);
    }

    public static void main(String[] args) {
        Student3 s = new Student3();
        s.compute();
    }
}