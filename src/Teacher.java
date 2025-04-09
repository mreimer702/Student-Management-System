import java.util.List;

public class Teacher  extends Person{
        private int teacherId;
        private String subject;
        private List<Course> courses;

        public Teacher(String name, int age, String email, int teacherId, String subject, List<Course> courses) {
            super(name, age, email);
            this.teacherId = teacherId;
            this.subject = subject;
            this.courses = courses;
        }

        public int getTeacherId() {
            return teacherId;
        }

        public String getSubject() {
            return subject;
        }

       public List<Course> getCourses() {
            return courses;
        }

        public void setTeacherId(int teacherId) {
            this.teacherId = teacherId;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public void setCourses(List<Course> courses) {
            this.courses = courses;
        }
}
