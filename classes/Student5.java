public class Student5 {

    static int computeCount;
    String name;
    String gender;
    int age;
    boolean international;

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
        Student5 student = new Student5();
        student.name = "john";
        student.gender = "male";
        student.age = 18;
        student.international = true;
        student.compute();

        Student5 student1 = new Student5();
        student1.name = "ola";
        student1.gender = "male";
        student1.age = 18;
        student1.compute();

         System.out.println("Student compute " + Student5.computeCount);
    }
}
