class Student {
    private String name;
    private int rollNo;
    private String faculty;

    public Student(String name, int rollNo, String faculty) {
        this.name = name;
        this.rollNo = rollNo;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void displayProfile() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Faculty: " + faculty);
    }

    public static void main(String[] args) {
        Student s = new Student("Aadarsh", 101, "BCSIT");
        s.displayProfile();
    }
}
