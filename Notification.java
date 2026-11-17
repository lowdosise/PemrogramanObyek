interface Notifiable {
    void send(String message);
}

class EmailNotification implements Notifiable {
    @Override
    public void send(String message) {
        System.out.println("Mengirim Email: " + message);
    }
}

class SMSNotification implements Notifiable {
    @Override
    public void send(String message) {
        System.out.println("Mengirim SMS: " + message);
    }
}

class WhatsAppNotification implements Notifiable {
    @Override
    public void send(String message) {
        System.out.println("Mengirim WhatsApp: " + message);
    }
}

class NotificationService {
    public void sendNotification(Notifiable channel, String message) {
        channel.send(message);
    }
}

public class Notification {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.sendNotification(new EmailNotification(), "Halo, ini email test!");
        service.sendNotification(new SMSNotification(), "Ini SMS test!");
        service.sendNotification(new WhatsAppNotification(), "Ini pesan WhatsApp test!");
    }
}