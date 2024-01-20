public class StudentManagementSystem {
    public static void main(String[] args) {
        // Create instances for Student Management System
        Teacher teacher1 = new Teacher("Mrs. Smith", "Mathematics");
        Course mathCourse = new Course("Math101", "Mathematics", teacher1);

        Student student1 = new Student("John Doe", "12345");
        Student student2 = new Student("Alice Smith", "67890");

        mathCourse.enrollStudent(student1);
        mathCourse.enrollStudent(student2);

        // Display course details and enrolled students
        mathCourse.displayCourseDetails();
        mathCourse.displayEnrolledStudents();
    }
}

class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }
}

class Course {
    private String code;
    private String name;
    private Teacher teacher;
    private Student[] enrolledStudents;
    private int studentCount;

    public Course(String code, String name, Teacher teacher) {
        this.code = code;
        this.name = name;
        this.teacher = teacher;
        this.enrolledStudents = new Student[50]; // Assuming a course can have at most 50 students
        this.studentCount = 0;
    }

    public void enrollStudent(Student student) {
        if (studentCount < enrolledStudents.length) {
            enrolledStudents[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("Course is full. Cannot enroll more students.");
        }
    }

    public void displayCourseDetails() {
        System.out.println("Course Code: " + code);
        System.out.println("Course Name: " + name);
        System.out.println("Teacher: " + teacher.getName());
        System.out.println("Subject: " + teacher.getSubject() + "\n");
    }

    public void displayEnrolledStudents() {
        System.out.println("Enrolled Students:");
        for (int i = 0; i < studentCount; i++) {
            System.out.println("Student Name: " + enrolledStudents[i].getName());
            System.out.println("Student ID: " + enrolledStudents[i].getStudentId() + "\n");
        }
    }
}

class Student {
    private String name;
    private String studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }
}
