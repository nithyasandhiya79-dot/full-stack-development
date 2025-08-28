class iOS {
    void startApp() {
        System.out.println("App started");
    }
    void increaseVolume() {
        System.out.println("Volume increased");
    }
    void shutdown() {
        System.out.println("Device shutting down");
    }
}
class iPhone extends iOS {
    void makeCall() {
        System.out.println("Making a call");
    }
    void sendSMS() {
        System.out.println("Sending SMS");
    }
}
class iPad extends iOS {
    void watchMovie() {
        System.out.println("Watching a movie");
    }
}
public class MyPhone {
    public static void main(String[] args) {
        iPhone myiPhone = new iPhone();
        myiPhone.startApp();
        myiPhone.increaseVolume();
        myiPhone.shutdown();
        myiPhone.makeCall();
        myiPhone.sendSMS();
    }
}