import java.util.Scanner;

public class Student {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        long rollNo = sc.nextLong();

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter address: ");
        String address = sc.nextLine();

        System.out.println("\n--- Student Details ---");
        System.out.println("Name     : " + name);
        System.out.println("Roll No  : " + rollNo);
        System.out.println("CGPA     : " + cgpa);
        System.out.println("Address  : " + address);

        sc.close();
    }
}
