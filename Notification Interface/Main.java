interface Notification {
    void sendNotification(String message);
}

class EmailNotification implements Notification {
    public void sendNotification(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SMSNotification implements Notification {
    public void sendNotification(String message) {
        System.out.println("SMS sent: " + message);
    }
}

class NotificationTest {
    public static void main(String[] args) {
        Notification n1 = new EmailNotification();
        Notification n2 = new SMSNotification();
        n1.sendNotification("Exam Tomorrow");
        n2.sendNotification("Fee Due");
    }
}