interface ResultProcessor {
    void processResult();
}

class ITDepartment implements ResultProcessor {
    public void processResult() {
        System.out.println("IT grades calculated with assignments + exams.");
    }
}

class ScienceDepartment implements ResultProcessor {
    public void processResult() {
        System.out.println("Science grades calculated with  lab + theory.");
    }
}

class ResultTest {
    public static void main(String[] args) {
        ResultProcessor r1 = new ITDepartment();
        ResultProcessor r2 = new ScienceDepartment();
        r1.processResult();
        r2.processResult();
    }
}