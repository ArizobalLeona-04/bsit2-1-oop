import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Student1");
        String student1 = scanner.nextLine();

        System.out.print("Name:");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        String age = scanner.nextLine();

        System.out.print("Course: ");
        String course = scanner.nextLine();

        System.out.print("Grades: ");
        String grades = scanner.nextLine();

        System.out.print("Average: ");
        String average = scanner.nextLine();

        System.out.print("Letter Grade: ");
        String lettergrade = scanner.nextLine();

        System.out.print("Status: ");
        String status = scanner.nextLine();


        System.out.println("Student1"  );
        System.out.println("Name: " + name );
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Grades: " + grades );
        System.out.println("Average: " + average);
        System.out.println("Letter Grade: " + lettergrade);


        System.out.print("\nSummary : I give up na sir TvT ");
        int Name = scanner.nextInt();

        System.out.print("Age: ");
        int Age = scanner.nextInt();


        System.out.print("Course: ");
        int Course = scanner.nextInt();




        int total = Name + Age + Course ;
        double Grades = (double) total / 400 * 100;
        String remarks = Grades >= 75 ? "PASSED" : "FAILED";




        scanner.close();
    }
}
