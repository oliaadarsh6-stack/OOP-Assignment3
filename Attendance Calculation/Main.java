class Attendance {
    public void calculateAttendance(int classesAttended, int totalClasses) {
        double percentage = (classesAttended * 100.0) / totalClasses;
        System.out.println("Attendance: " + percentage + "%");
    }
}

class ITAttendance extends Attendance {
    @Override
    public void calculateAttendance(int classesAttended, int totalClasses) {
        double percentage = (classesAttended * 100.0) / totalClasses;
        System.out.println("IT Attendance: " + percentage + "%");
    }
}

class ScienceAttendance extends Attendance {
    @Override
    public void calculateAttendance(int classesAttended, int totalClasses) {
        double percentage = (classesAttended * 100.0) / totalClasses;
        System.out.println("Science Attendance: " + percentage + "%");
    }
}

class AttendanceTest {
    public static void main(String[] args) {
        Attendance a1 = new ITAttendance();
        Attendance a2 = new ScienceAttendance();
        a1.calculateAttendance(35, 55);
        a2.calculateAttendance(47, 55);
    }
}