import java.util.List;

public class Student extends Person{
    private int studentId;
    private int grade;
    private List<Course> courses;

    public Student(String name, int age, String email, int studentId, int grade, List<Course> courses) {
        super(name, age, email);
        this.studentId = studentId;
        this.grade = grade;
        this.courses = courses;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
