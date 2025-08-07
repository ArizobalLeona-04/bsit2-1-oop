public class Main {
    public static void main(String[] args)
    
        Student s1 = new Student("Alice Reyes", 19, "BSIT", 85, 90, 88);
        Student s2 = new Student("Bryan Cruz", 20, "BSCS", 65, 70, 60);
        Student s3 = new Student("Carla Dela Cruz", 18, "BSCE", 50, 55, 58);

        
        Student[] students = {s1, s2, s3};

        
        int passingCount = 0;

        
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

    
        System.out.println("Total number of students passing: " + passingCount);
    }
}
