public class Main {
    public static void main(String[] args) {
        // Create 3 Student objects
        Student s1 = new Student("Alice Reyes", 19, "BSIT", 85, 90, 88);
        Student s2 = new Student("Bryan Cruz", 20, "BSCS", 65, 70, 60);
        Student s3 = new Student("Carla Dela Cruz", 18, "BSCE", 50, 55, 58);

        // Array of students
        Student[] students = {s1, s2, s3};

        // Counter for passing students
        int passingCount = 0;

        // Display info
        for (Student s : students) {
            s.displayInfo();
            System.out.printf("Average Grade: %.2f\n", s.calculateAverage());
            System.out.println("Letter Grade : " + s.getLetterGrade());
            if (s.isPassing()) {
                System.out.println("Status       : PASSING\n");
                passingCount++;
            } else {
                System.out.println("Status       : FAILING\n");
            }
        }

        // Summary
        System.out.println("Total number of students passing: " + passingCount);
    }
}
