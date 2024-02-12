public class AK_43_Course {
    static int maxCapacity = 100;
    String courseName;
    int enrollments;

    String[] enrolledStudents;
    AK_43_Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity) {
        AK_43_Course.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName) {
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }

    void unenrollStudent(String studentName) {
        System.out.println("Student removed");
        enrollments--;
    }


}
