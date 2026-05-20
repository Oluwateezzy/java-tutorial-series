class Student2 {
    int id = 1000;
    float gpa = 3.8f;
    double gpa2 = 3.8434394343979497937993;

    void compute() {
      int nextId = this.id + 1;

      System.out.println("id " + id);
      System.out.println("NextId " + nextId);
      System.out.println("gpa " + gpa);
      System.out.println("gpa2 " + gpa2);
   }

   public static void main(String[] var0) {
      Student2 var1 = new Student2();
      var1.compute();
   }
}