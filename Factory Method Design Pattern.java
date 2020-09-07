
interface Notification { 
    void notifyUser(); 
}

// now the imlementation classes will be 

class SMSNotification implements Notification { 
  
    @Override
    public void notifyUser() 
    { 
        // TODO Auto-generated method stub 
        System.out.println("Sending an SMS notification"); 
    } 
} 

class EmailNotification implements Notification { 
  
    @Override
    public void notifyUser() 
    { 
        // TODO Auto-generated method stub 
        System.out.println("Sending an e-mail notification"); 
    } 
} 



class PushNotification implements Notification { 
  
    @Override
    public void notifyUser() 
    { 
        // TODO Auto-generated method stub 
        System.out.println("Sending a push notification"); 
    } 
} 

// now create Factory to instantiate concrete Class

class NotificationFactory { 
    public Notification createNotification(String channel) 
    { 
        if (channel == null || channel.isEmpty()) 
            return null; 
        if ("SMS".equals(channel)) { 
            return new SMSNotification(); 
        } 
        else if ("EMAIL".equals(channel)) { 
            return new EmailNotification(); 
        } 
        else if ("PUSH".equals(channel)) { 
            return new PushNotification(); 
        } 
        return null; 
    } 
} 

// Now this will create and get concrete class object

public class NotificationService { 
    public static void main(String[] args) 
    { 
        NotificationFactory notificationFactory = new NotificationFactory(); 
        Notification notification = notificationFactory.createNotification("SMS"); 
        notification.notifyUser(); 
    } 
} 

