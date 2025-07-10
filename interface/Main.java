

import java.util.*;

interface Function {
    void getPassword();
    boolean authentication();
    void proceedPayment(int amount);
    void successMessage(int amount);
}

class GooglePay implements Function {
    Scanner sc = new Scanner(System.in);
    int password;

    public void getPassword() {
        System.out.print("Enter Google Pay password: ");
        password = sc.nextInt();
    }

    public boolean authentication() {
        return password == 123456;
    }

    public void proceedPayment(int amount) {
        System.out.println("Google Pay: Processing payment of ₹" + amount);
    }

    public void successMessage(int amount) {
        System.out.println("Google Pay: Payment of ₹" + amount + " successful.");
    }
}

class PayPal implements Function {
    Scanner sc = new Scanner(System.in);
    int password;

    public void getPassword() {
        System.out.print("Enter PayPal password: ");
        password = sc.nextInt();
    }

    public boolean authentication() {
        return password == 123456;
    }

    public void proceedPayment(int amount) {
        System.out.println("PayPal: Processing payment of ₹" + amount);
    }

    public void successMessage(int amount) {
        System.out.println("PayPal: Payment of ₹" + amount + " successful.");
    }
}

class UPI implements Function {
    Scanner sc = new Scanner(System.in);
    int password;

    public void getPassword() {
        System.out.print("Enter UPI PIN: ");
        password = sc.nextInt();
    }

    public boolean authentication() {
        return password == 123456;
    }

    public void proceedPayment(int amount) {
        System.out.println("UPI: Processing payment of ₹" + amount);
    }

    public void successMessage(int amount) {
        System.out.println("UPI: Payment of ₹" + amount + " successful.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Function paymentMethod = null;

        System.out.println("Enter the number for proceeding payment \n1 - Google Pay \n2 - Pay pal \n3 - UPI Payment");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                paymentMethod = new GooglePay();
                break;
            case 2:
                paymentMethod = new PayPal();
                break;
            case 3:
                paymentMethod = new UPI();
                break;
            default:
                System.out.println("Invalid option.");
                return;
        }

        paymentMethod.getPassword();
        if (paymentMethod.authentication()) {
            System.out.print("Enter the amount to be sent: ₹");
            int amount = sc.nextInt();
            paymentMethod.proceedPayment(amount);
            paymentMethod.successMessage(amount);
        } else {
            System.out.println("Authentication failed. Payment not processed.");
        }
    }
}
