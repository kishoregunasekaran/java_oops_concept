import java.util.*;

class Fooditem {
    String item_name;
    int quantity;
    double price;
    double sum;

    Fooditem(String item_name, int quantity, double price) {
        this.item_name = item_name;
        this.quantity = quantity;
        this.price = price;
        this.sum = quantity * price;
    }
}

abstract class Calculation {
    public abstract double calculationSum(Fooditem[] fooditems);

    public abstract void displayAll(Fooditem[] fooditems);
}

class CalculationOperation extends Calculation {
    public double calculationSum(Fooditem[] fooditems) {
        double total = 0;
        for (Fooditem x : fooditems) {
            x.sum = x.quantity * x.price;
            total += x.sum;
        }
        return total;
    }

    public void displayAll(Fooditem[] fooditems) {
        System.out.println("\n---Your Ordered Food Items---");
        for (Fooditem x : fooditems) {
            System.out.println("Item: " + x.item_name + ", Quantity: " + x.quantity + ", Price: ₹" + x.price
                    + ", Total: ₹" + x.sum);
        }
    }
}

abstract class PaymentProcess {
    protected double totalAmount;

    PaymentProcess(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public abstract void paymentReceipt();

    public void successMessage() {
        System.out.println("Payment Successful!");
    }
}

class UPI extends PaymentProcess {
    UPI(double totalAmount) {
        super(totalAmount);
    }

    public void paymentReceipt() {
        System.out.println("Paying ₹" + totalAmount + " via UPI...");
    }
}

class AddingFooditems {
    public Fooditem[] addItems() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Kishore's Food App");
        System.out.print("Enter the number of items you want to order: ");
        int n = sc.nextInt();
        sc.nextLine();

        Fooditem[] fooditems = new Fooditem[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter item name: ");
            String item_name = sc.nextLine();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Enter price per item: ₹");
            double price = sc.nextDouble();
            sc.nextLine();

            fooditems[i] = new Fooditem(item_name, quantity, price);
        }

        return fooditems;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AddingFooditems adding = new AddingFooditems();
        Fooditem[] fooditems = adding.addItems();

        CalculationOperation cal = new CalculationOperation();
        cal.displayAll(fooditems);
        double total = cal.calculationSum(fooditems);
        System.out.println("Total Bill Amount: ₹" + total);

        System.out.print("\nPress 1 to Proceed to Payment or 2 to Cancel Order: ");
        int option = sc.nextInt();

        if (option == 1) {
            PaymentProcess pay = new UPI(total);
            pay.paymentReceipt();
            pay.successMessage();
        } else if (option == 2) {
            System.out.println("Order Cancelled. Thank you!");
        } else {
            System.out.println("Invalid option.");
        }
    }
}
