public class StudentTest {
     public static void main(String[] args) {
	      Student6 student1 = new Student6(1000, "Joan", "male", 18, 223_456_7890L, 3.8, 'B');
		  
		  Student6 student2 = new Student6(1001, "Raj", "male", 21, 223_456_9999L, 3.4, 'M', true);
		  
		  Student6 student3 = new Student6(1002, "Anita", "female", 20, 223_456_8888L, 4.0, 'M', true);
		  
		  System.out.println("Student.studentCount: " + Student6.studentCount);

          System.out.println("Student 1: " + student1.name);
          System.out.println("Student 2: " + student2.name);
          System.out.println("Student 3: " + student3.name);

          student1.updateProfile("john");
          System.out.println("Updated Student 1: " + student1.name);

          Student6 student4 = student1;

          System.out.println("Student 4: " + student4.name);

          student4.updateProfile("mike");
          System.out.println("Student 1: " + student1.name);

          student4 = student2;
          System.out.println("Student 4: " + student4.name);

          student2 = student1;
          System.out.println("Student 4: " + student4.name);
          System.out.println("Student 2: " + student2.name);

          student4 = new Student6();
          student4.updateProfile("Alex");
          System.out.println("Student 4: " + student4.name);
          System.out.println("Student 2: " + student2.name);
          System.out.println("Student 1: " + student1.name);
	  }
}
