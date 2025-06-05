class ATM
{
    synchronized public void checkBalance(String name)
    {
        System.out.println(name + " Checking... ");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("Balance");
    }

    synchronized public void withdraw(String name, int amount)
    {
        System.out.println(name + " withdrawing... ");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println(amount);
    }   
}

class Customer extends Thread
{
    String name;
    int amount;
    ATM atm;
    Customer(String s, ATM m, int amt)
    {
        name = s;
        atm = m;
        amount = amt;
    }

    public void userATM()
    {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }

    public void run()
    {
        userATM();
    }

}

public class ATMmachine 
{
    public static void main(String[] args) 
    {
        ATM atm = new ATM();

        Customer c1 = new Customer("Aryan", atm, 1000);
        Customer c2 = new Customer("Harsh", atm, 2000);

        c1.start();
        c2.start();

    }    
}
