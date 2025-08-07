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


public class Student {

    String name;
    int age;
    String course;
    double grade1, grade2, grade3;

    public Student(String name, int age, String course, double grade1, double grade2, double grade3) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    
    public void displayInfo() {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Course : " + course);
    }

    
    public double calculateAverage() {
        return (grade1 + grade2 + grade3) / 3;
    }

    
    public String getLetterGrade() {
        double avg = calculateAverage();
        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 60) return "D";
        else return "F";
    }

    
    public boolean isPassing() {
        return calculateAverage() >= 70;
    }
}
