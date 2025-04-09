import java.util.ArrayList;

class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    class Student extends Person{
        private int studentId;
        private int grade;
//        private ArrayList<Course> courses;

        public Student(String name, int age, String email, int studentId, int grade) {
            super(name, age, email);
            this.grade = grade;
            this.studentId = studentId;
        }

        public int getGrade() {
            return grade;
        }

        public int getStudentId() {
            return studentId;
        }

        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }
    }

    class Teacher extends Person{
        private int teacherId;
        private String subject;
//        private ArrayList<Course> courses;

        public Teacher(String name, int age, String email, int teacherId, String subject) {
            super(name, age, email);
            this.teacherId = teacherId;
            this.subject = subject;
//            this.courses = courses;
        }

        public int getTeacherId() {
            return teacherId;
        }

        public String getSubject() {
            return subject;
        }

//        public ArrayList<Course> getCourses() {
//            return courses;
//        }

        public void setTeacherId(int teacherId) {
            this.teacherId = teacherId;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

//        public void setCourses(ArrayList<Course> courses) {
//            this.courses = courses;
//        }
    }
}
