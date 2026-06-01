public class Student5 {

    static int computeCount;
    String name;
    String gender;
    int age;
    boolean international;

    Student5(String nName, String nGender, int nAge, boolean nInternational) {
        name = nName;
        gender = nGender;
        age = nAge;
        international = nInternational;

        compute();
    }

    Student5(String nName, String nGender, int nAge) {
        this(nName, nGender, nAge, false);
    }

    void compute() {
        computeCount = computeCount + 1;

        double internationalfee = 500.0, tutionFees = 1200.0;

        System.out.println("name " + name);
        System.out.println("gender " + gender);
        System.out.println("age " + age);
        System.out.println("computeCount " + computeCount);

        if (international) {
            tutionFees = tutionFees + internationalfee;
        }

        System.out.println("tutionFees " + tutionFees + "\n");
    }

    public static void main(String[] args) {
        new Student5("john", "male", 18, true);
        // student.name = "john";
        // student.gender = "male";
        // student.age = 18;
        // student.international = true;
        // student.compute();

        new Student5("ola", "male", 18);
        // student1.name = "ola";
        // student1.gender = "male";
        // student1.age = 18;
        // student1.compute();

         System.out.println("Student compute " + Student5.computeCount);
    }
}
