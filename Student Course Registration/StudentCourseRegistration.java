import java.util.ArrayList;

class Course {
    String courseName;

    Course(String courseName) {
        this.courseName = courseName;
    }
}

class StudentCourse {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    StudentCourse(String name) {
        this.name = name;
    }

    void registerCourse(Course c) {
        courses.add(c);
    }

    void displayCourses() {
        System.out.println("Courses of " + name + ":");
        for (Course c : courses) {
            System.out.println(c.courseName);
        }
    }

    public static void main(String[] args) {
        StudentCourse s = new StudentCourse("Aadarsh");

        s.registerCourse(new Course("Java"));
        s.registerCourse(new Course("CyberSecurity"));

        s.displayCourses();
    }
}