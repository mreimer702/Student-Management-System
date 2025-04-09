import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Global variables
    static ArrayList <Student> students = new ArrayList<>();
    static ArrayList <Teacher> teachers = new ArrayList<>();
    static ArrayList <Course> courses = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    private static int StudentId = 1;
    private static int TeacherId = 1;
    private static int CourseId = 1;

    public static void main(String[] args) {
        // Menu for SMS
        boolean inMenu = true;
        while(inMenu){
            System.out.println("Student Management System Program: ");
            
            System.out.println("1. Add a Student");
            System.out.println("2. Add a Teacher");
            System.out.println("3. Add a Course");
            System.out.println("4. Assign Courses to Students");
            System.out.println("5. Assign Courses to Teachers");
            System.out.println("6. View Student by ID");
            System.out.println("7. View every Student and Teacher");
            System.out.println("8. View every Course");
            System.out.println("9. Update Student");
            System.out.println("10. Delete Student");
            System.out.println("11. Exit");

            System.out.println("Input the number of your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    addStudent();
                    break;
                case 2:
                    addTeacher();
                    break;
                case 3:
                    addCourse();
                    break;
                case 4:
                    assignCourseToStudent();
                    break;
                case 5:
                    assignCourseToTeacher();
                    break;
                case 6:
                    getStudentById();
                    break;
                case 7:
                    getStudentsAndTeachers();
                    break;
                case 8:
                    getCourses();
                    break;
                case 9:
                    updateStudent();
                    break;
                case 10:
                    deleteStudent();
                    break;
                case 11:
                    System.out.println("Exiting the Student Management System");
                    inMenu = false;
                    break;
                default:
                    System.out.println("Invalid input. Please input a valid choice");
            }

        }
    }
    // Functions for the SMS
    public static void addStudent(){
        System.out.println("Enter student's name: ");
        String nameInput = scanner.nextLine();
        System.out.println("Enter student's age: ");
        int ageInput = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter student's email: ");
        String emailInput = scanner.nextLine();
        System.out.println("Enter student's grade: ");
        int gradeInput = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Course> studentCourses = new ArrayList<Course>(5);
        Student newStudent = new Student(nameInput, ageInput, emailInput, StudentId, gradeInput, studentCourses);
        students.add(newStudent);
        System.out.println(newStudent.getName() + " added successfully");
        StudentId ++;
    }

    public static void addTeacher(){
        System.out.println("Enter teacher's name: ");
        String nameInput = scanner.nextLine();
        System.out.println("Enter teacher's age: ");
        int ageInput = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter teacher's email: ");
        String emailInput = scanner.nextLine();
        System.out.println("Enter teacher's subject: ");
        String subjectInput = scanner.nextLine();
        ArrayList<Course> teacherCourses = new ArrayList<Course>(3);
        Teacher newTeacher = new Teacher(nameInput, ageInput, emailInput, TeacherId, subjectInput, teacherCourses);
        teachers.add(newTeacher);
        System.out.println(newTeacher.getName() + " added successfully");
        TeacherId ++;
    }

    public static void addCourse(){
        System.out.println("Enter the name of the course: ");
        String courseInput = scanner.nextLine();
        Course newCourse = new Course(courseInput, CourseId);
        courses.add(newCourse);
        System.out.println(newCourse.getCourseName() + " added successfully");
        CourseId ++;
    }

    public static void assignCourseToStudent() {
        getCourses();
        System.out.println("Enter Course ID to assign:");
        int courseId = scanner.nextInt();
        scanner.nextLine();

        Course selectedCourse = null;
        for (Course course : courses) {
            if (course.getCourseId() == courseId) {
                selectedCourse = course;
                break;
            }
        }

        if (selectedCourse == null) {
            System.out.println("Course not found.");
            return;
        }

        getStudentsAndTeachers();
        System.out.println("Enter Student ID to assign the course:");
        int studentId = scanner.nextInt();
        scanner.nextLine();

        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                student.getCourses().add(selectedCourse);
                System.out.println("Course assigned to " + student.getName());
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void assignCourseToTeacher() {
        getCourses();
        System.out.println("Enter Course ID to assign:");
        int courseId = scanner.nextInt();
        scanner.nextLine();

        Course selectedCourse = null;
        for (Course course : courses) {
            if (course.getCourseId() == courseId) {
                selectedCourse = course;
                break;
            }
        }

        if (selectedCourse == null) {
            System.out.println("Course not found.");
            return;
        }

        getStudentsAndTeachers();
        System.out.println("Enter Teacher ID to assign the course:");
        int teacherId = scanner.nextInt();
        scanner.nextLine();

        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId() == teacherId) {
                teacher.getCourses().add(selectedCourse);
                System.out.println("Course assigned to " + teacher.getName());
                return;
            }
        }
        System.out.println("Teacher not found.");
    }


    public static void getStudentById(){
        System.out.println("List of Students By ID");
        for (Student student: students){
            System.out.println(student.getStudentId() + ". " + student.getName());
        }
        System.out.println("Please enter the ID of the student you want to view: ");
        int idInput = scanner.nextInt();
        scanner.nextLine();
        for (Student student: students){
            if (idInput == student.getStudentId())
            {
                System.out.println(student.getStudentId() + ". " + student.getName());
                System.out.println("Age: " + student.getAge());
                System.out.println("Email: " + student.getEmail());
                System.out.println("Grade: " + student.getGrade());
            }
        }

    }
    public static void getStudentsAndTeachers(){
        System.out.println("List of Students By ID");
        for (Student student: students){
            System.out.println(student.getStudentId() + ". " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Email: " + student.getEmail());
            System.out.println("Grade: " + student.getGrade());
        }
        System.out.println("List of Teachers By ID");
        for (Teacher teacher: teachers){
            System.out.println(teacher.getTeacherId() + ". " + teacher.getName());
            System.out.println("Age: " + teacher.getAge());
            System.out.println("Email: " + teacher.getEmail());
            System.out.println("Subject: " + teacher.getSubject());
        }
    }

    public static void getCourses(){
        System.out.println("List of Courses By ID");
        for (Course course: courses){
            System.out.println(course.getCourseId() + ". " + course.getCourseName());
        }
    }

    public static void updateStudent() {
        System.out.println("Enter the ID of the student to update:");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Student student : students) {
            if (student.getStudentId() == id) {
                System.out.println("Enter new name (leave blank to keep current):");
                String name = scanner.nextLine();
                if (!name.isEmpty()) student.setName(name);

                System.out.println("Enter new age (or 0 to keep current):");
                int age = scanner.nextInt();
                scanner.nextLine();
                if (age > 0) student.setAge(age);

                System.out.println("Enter new email (leave blank to keep current):");
                String email = scanner.nextLine();
                if (!email.isEmpty()) student.setEmail(email);

                System.out.println("Enter new grade (or -1 to keep current):");
                int grade = scanner.nextInt();
                scanner.nextLine();
                if (grade >= 0) student.setGrade(grade);

                System.out.println("Student updated successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public static void deleteStudent(){
        System.out.println("Enter the student ID to delete:");
        int idToDelete = scanner.nextInt();
        scanner.nextLine();

        Student studentToDelete = null;
        for (Student student : students) {
            if (student.getStudentId() == idToDelete) {
                studentToDelete = student;
                break;
            }
        }
        if (studentToDelete != null) {
            students.remove(studentToDelete);
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student with ID " + idToDelete + " not found.");
        }
    }
}
