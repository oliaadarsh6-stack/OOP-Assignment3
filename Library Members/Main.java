class Member {
    String name;
    public Member(String name) { this.name = name; }
    public void borrowingLimit() {
        System.out.println("General borrowing limit.");
    }
}

class StudentMember extends Member {
    public StudentMember(String name) { super(name); }
    @Override
    public void borrowingLimit() {
        System.out.println(name + " can borrow 7 books.");
    }
}

class TeacherMember extends Member {
    public TeacherMember(String name) { super(name); }
    @Override
    public void borrowingLimit() {
        System.out.println(name + " can borrow 18 books.");
    }
}

class LibraryTest {
    public static void main(String[] args) {
        Member m1 = new StudentMember("Aadarsh oli");
        Member m2 = new TeacherMember("Virat Kohli");
        m1.borrowingLimit();
        m2.borrowingLimit();
    }
}
