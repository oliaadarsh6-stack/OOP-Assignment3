class Employee {
    void displayDetails() {
        System.out.println("Employee Details");
    }
}

class Teacher extends Employee {
    @Override
    void displayDetails() {
        System.out.println("Teaching Staff");
    }
}

class AdminStaff extends Employee {
    @Override
    void displayDetails() {
        System.out.println("Administrative Staff");
    }
}

class Main {
    public static void main(String[] args) {
        Employee e1 = new Teacher();
        Employee e2 = new AdminStaff();

        e1.displayDetails();
        e2.displayDetails();
    }
}