
class Singleton {
    
    private static Singleton singleInstance;

     {
        System.out.println("Singleton instance created!");
    }

    public static Singleton getInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton(); // create instance only once
        }
        return singleInstance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}


public class Main {
    public static void main(String[] args) {
        // Get the single instance of Singleton
        Singleton obj1 = Singleton.getInstance();
        obj1.showMessage();

        // Get the same instance again
        Singleton obj2 = Singleton.getInstance();

        // Check if both references point to the same object
        if (obj1 == obj2) {
            System.out.println("Both objects are the same instance!");
        } else {
            System.out.println("Different instances created!");
        }
    }
}