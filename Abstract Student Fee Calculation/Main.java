abstract class Student {
    abstract double calculateFee();
}

class Undergraduate extends Student {
    double calculateFee() {
        return 50000;
    }
}

class Graduate extends Student {
    double calculateFee() {
        return 80000;
    }
}

public class Main {
    public static void main(String[] args) {
        Student u = new Undergraduate();
        Student g = new Graduate();

        System.out.println("Undergraduate Fee: " + u.calculateFee());
        System.out.println("Graduate Fee: " + g.calculateFee());
    }
}
