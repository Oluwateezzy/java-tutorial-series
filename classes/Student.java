public class Student {
    int id = 1000;
    int nextId = 1 + id;
    String name;


    void compute() {
        System.out.println(id);
        System.out.println(nextId);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.compute();
    }
}
