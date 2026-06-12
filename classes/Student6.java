  
  class Student6 {
      static int studentCount;
	  
      int id;
	  String name;
	  String gender;
	  int age;
	  long phone;	  
	  double gpa;	  
	  char degree;
	  
	  boolean international;
	  double tuitionFees = 12000.0;
	  double internationalFees = 5000.0;
	  
	  Student6(int newId, String newName, String newGender, int newAge, long newPhone, double newGpa, 
					char newDegree) {		  
	      this(newId, newName, newGender, newAge, newPhone, newGpa, newDegree, false);		  
	  }
	  
	  Student6(int newId, String newName, String newGender, int newAge, long newPhone, double newGpa, 
					char newDegree, boolean isInternational) {
		  id = newId;
		  name = newName;
		  gender = newGender;
		  age = newAge;
		  phone = newPhone;
		  gpa = newGpa;
		  degree = newDegree;
		  international = isInternational;
		  
		  studentCount = studentCount + 1;
		  int nextId = id + 1;		  
		  
		  if (international) {
		      tuitionFees = tuitionFees + internationalFees;
			  //return;
		  }	
		  
	      System.out.println("\nid: " + id);
		  System.out.println("nextId: " + nextId);
		  System.out.println("name: " + name);
		  System.out.println("gender: " + gender);
		  System.out.println("age: " + age);
		  System.out.println("phone: " + phone);
		  System.out.println("gpa: " + gpa);
		  System.out.println("degree: " + degree);
		  System.out.println("tuitionFees: " + tuitionFees);
		  System.out.println("studentCount: " + studentCount);
	  }
	  
	  Student6() {}
	

	  public static void main(String[] args) {
	      Student6 student1 = new Student6(1000, "John", "male", 18, 223_456_7890L, 3.8, 'B');
		  
		  Student6 student2 = new Student6(1001, "Raj", "male", 21, 223_456_9999L, 3.4, 'M', true);
		  
		  Student6 student3 = new Student6(1002, "Anita", "female", 20, 223_456_8888L, 4.0, 'M', true);
		  
		  System.out.println("Student.studentCount: " + Student6.studentCount);
	  }
  }