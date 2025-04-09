import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList <Person.Student> students = new ArrayList<>();
    static ArrayList <Person.Teacher> teachers = new ArrayList<>();
    static ArrayList <Course> courses = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    private static int StudentId = 1;
    private static int TeacherId = 1;
    public static void main(String[] args) {

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
            System.out.println("8. View every course");
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
                    System.out.println("Add a course");
                    break;
                case 4:
                    System.out.println("Assign Courses to Students");
                    break;
                case 5:
                    System.out.println("Assign Courses to Teachers");
                    break;
                case 6:
                    System.out.println("View Student by ID");
                    break;
                case 7:
                    System.out.println("View every Student and Teacher");
                    break;
                case 8:
                    System.out.println("View every course");
                    break;
                case 9:
                    System.out.println("Update Student");
                    break;
                case 10:
                    System.out.println("Delete Student");
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
        Person person = new Person(nameInput, ageInput, emailInput);
        Person.Student newStudent = person.new Student(nameInput, ageInput, emailInput, StudentId, gradeInput);
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
        Person person = new Person(nameInput, ageInput, emailInput);
        Person.Teacher newTeacher = person.new Teacher(nameInput, ageInput, emailInput, TeacherId, subjectInput);
        teachers.add(newTeacher);
        System.out.println(newTeacher.getName() + " added successfully");
        TeacherId ++;
    }
//
//    public static void viewTodo(){
//        int count = 1;
//        for (ToDo task: toDoList){
//            System.out.println(count + "." + task.getName() + ": Has it been completed yet? " + task.isCompleted());
//            count ++;
//        }
//    }
//
//    public static void CompleteTodo(){
//        viewTodo();
//        System.out.println("Which task do you want to mark as completed? ");
//        int input = scanner.nextInt() - 1;
//        scanner.nextLine();
//        toDoList.get(input).setCompleted(!toDoList.get(input).isCompleted());
//    }
}
