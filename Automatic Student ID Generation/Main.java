class StudentID {
    private static int counter = 101;
    private int id;
    private String name;

    public StudentID(String name) {
        this.name = name;
        this.id = ++counter;
    }

    public void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    public static void main(String[] args) {
        StudentID s1 = new StudentID("Aadarsh oli");
        StudentID s2 = new StudentID("Virat Kohli");
        s1.display();
        s2.display();
    }
}
