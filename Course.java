public class Course {
    static int maxCapacity = 100;
    String courseName;
    int enrollments;

    String[] enrolledStudents;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }
    void enrollStudents(String studentName) {
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }

    void unenrollStudents(String studentName) {
        System.out.println("Student removed");
        enrollments--;
    }
    public static void main(String[] args) {
        // Create a Course object
        Course javaCourse = new Course("Java Programming");

        // Enroll students
        javaCourse.enrollStudents("Alice");
        javaCourse.enrollStudents("Bob");

        // Print confirmation
        System.out.println("Students enrolled in " + javaCourse.courseName + ": " + javaCourse.enrollments);
    }

    
    
}
