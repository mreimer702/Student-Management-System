import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList <Person.Student> students = new ArrayList<Person.Student>();
    static ArrayList <Person.Teacher> teachers = new ArrayList<Person.Teacher>();
    static ArrayList <Course> courses = new ArrayList<Course>();
    static  Scanner scanner = new Scanner(System.in);
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
                    System.out.println("Add a student");
                    break;
                case 2:
                    System.out.println("Add a teacher");
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
//    public static void addTodo(){
//        String todoInput = scanner.nextLine();
//        ToDo newTodo = new ToDo(todoInput, false);
//        toDoList.add(newTodo);
//        System.out.println(newTodo.getName() + " added to list");
//    }
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
