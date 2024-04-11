public class main {
    public static void main(String[] args) {
        
        NotificationFctory nf = new NotificationFctory();
        Notification obj =nf.needNotification("SMSNotification");
        obj.getNotification();
    }
}
