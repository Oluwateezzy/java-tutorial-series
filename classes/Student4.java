public class Student4 {

    // boolean international = true;
    boolean international;
    double tutionFees = 1200.0;
    double internationalfee = 500.0;

    void compute() {
        if (international) {
            tutionFees = tutionFees + internationalfee;
        }

        System.out.println("tutionFees " + tutionFees);
    }

    public static void main(String[] args) {
        Student4 s = new Student4();
        s.compute();
    }
}
