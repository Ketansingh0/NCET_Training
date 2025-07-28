public class University {
    public static void main(String[] args) {
        // Creating a student object
        Student s = new Student();

        // Setting student details
        s.setName("Ketan Singh");
        s.setRollNo(101);
        s.setDepartment("Computer Science");
        s.setCgpa(8.5);

        // Displaying student details
        System.out.println("--- Student Details ---");
        System.out.println("Name       : " + s.getName());
        System.out.println("Roll No    : " + s.getRollNo());
        System.out.println("Department : " + s.getDepartment());
        System.out.println("CGPA       : " + s.getCgpa());
    }
}
