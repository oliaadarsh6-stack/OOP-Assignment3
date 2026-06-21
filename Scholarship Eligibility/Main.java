abstract class Scholarship {
    String studentName;
    public Scholarship(String studentName) { this.studentName = studentName; }
    abstract void checkEligibility();
}

class MeritScholarship extends Scholarship {
    public MeritScholarship(String studentName) { super(studentName); }
    @Override
    void checkEligibility() {
        System.out.println(studentName + " eligible for Merit Scholarship (CGPA > 3.6).");
    }
}

class NeedBasedScholarship extends Scholarship {
    public NeedBasedScholarship(String studentName) { super(studentName); }
    @Override
    void checkEligibility() {
        System.out.println(studentName + " eligible for Need-Based Scholarship (Low income).");
    }
}

class ScholarshipTest {
    public static void main(String[] args) {
        Scholarship s1 = new MeritScholarship("James Bond");
        Scholarship s2 = new NeedBasedScholarship("Ram Thakur");
        s1.checkEligibility();
        s2.checkEligibility();
    }
}
