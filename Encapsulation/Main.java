import java.util.*;

class BankAccount{
    private double balance=1000.0;
    private final int pin=23456;
    
    public boolean checkPassword(int password){
        return pin==password;
    }
    
    public void deposit(int depoamount){
        if(depoamount>0){
             balance=balance+depoamount;
             System.out.println("Balance after the deposit amount is: "+balance);
        }
        else{
            System.out.println("Invalid deposit amount.");
        }
    }
    
    public void withdraw(int withdramount){
        if(withdramount>0 && withdramount <= balance){
             balance=balance-withdramount;
             System.out.println("Balance after the deposit amount is: "+balance);
        }
        else{
            System.out.println("Invalid withdrawing amount.");
        }
    }
    
    public void display(){
        System.out.println("Balance is:"+balance);
    }
    
}
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        BankAccount bankacc=new BankAccount();
        
        System.out.println("Enter the password(5 digit):");
        int password=sc.nextInt();
        
        if(bankacc.checkPassword(password)){
            System.out.println("Access Granted");
            boolean running = true;
            
            while(running){
                System.out.println("Enter the option you want to perform\n 1 - deposit\n 2 - withdraw\n 3 - Display balance in the account\n 4 - exit");
                int n=sc.nextInt();
                
                switch(n){
                    case 1:
                        System.out.println("Enter the deposit amount:");
                        int depoamount=sc.nextInt();
                        bankacc.deposit(depoamount);
                        break;
                    case 2:
                        System.out.println("Enter the withdrawel amount:");
                        int withdramount=sc.nextInt();
                        bankacc.withdraw(withdramount);
                        break;
                    case 3:
                        bankacc.display();
                        break;
                    case 4:
                        System.out.println("Thanks for visiting us");
                        running = false;
                        break;
                    default:
                        System.out.println("You entered invalid option");
                        break;
                        
                }
            }
        }
        else{
            System.out.println("Invalid password pin");
        }
    }
}