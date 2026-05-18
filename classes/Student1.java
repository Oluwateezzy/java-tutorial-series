public class Student1 {
    int id = 1000;
    byte age = 18;
    short rank = 165;
    long phone = 223_456_7890L;
    int minValue = Integer.MIN_VALUE;
    int maxValue = Integer.MAX_VALUE;
    byte byteMinValue = Byte.MIN_VALUE;
    byte byteMaxValue = Byte.MAX_VALUE;
    short shortMinValue = Short.MIN_VALUE;
    short shortMaxValue = Short.MAX_VALUE;
    long longMinValue = Long.MIN_VALUE;
    long longMaxValue = Long.MAX_VALUE;

    void compute() {
        int nextId = id + 1;
        System.out.println("id " + id);
        System.out.println("NextId " + nextId);
        System.out.println("age " + age);
        System.out.println("phone " + phone);
        System.out.println("minValue " + minValue);
        System.out.println("maxValue " + maxValue);
        System.out.println("byteMinValue " + byteMinValue);
        System.out.println("byteMaxValue " + byteMaxValue);
        System.out.println("shortMinValue " + shortMinValue);
        System.out.println("shortMaxValue " + shortMaxValue);
        System.out.println("longMinValue " + longMinValue);
        System.out.println("longMaxValue " + longMaxValue);
    }
    public static void main(String[] args) {
        Student1 student = new Student1();
        student.compute();
    }
}
