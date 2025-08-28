import java.io.*;
import java.util.*;
public class LearnMethods {
public void makeCall() {
System.out.println("Make Call");
}
public void sendSms() {
System.out.println("Send SMS");
}
public static void main(String[]args) {
System.out.println("Main Method");
 LearnMethods phone=new LearnMethods();
phone.makeCall();
phone.sendSms();
}
}

  