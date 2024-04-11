public class NotificationFctory {
    public Notification needNotification(String notificationType){
        switch(notificationType){
            case "SMS":
            return SMSNotification();
            case "Push":
            return PushNotification();
            case "Email":
            return EmailNotification();
        }

        

    }
}
