import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;
import java.util.HashMap;

class Account implements Serializable
{
    String accNo;
    String name;
    double balance;

    Account(){}

    Account(String a, String n, double b)
    {
        accNo = a;
        name = n;
        balance = b;
    }

    public String toString()
    {
        return "Account No : "+accNo+"\nName : "+name+"\nBalance : "+balance+"\n";
    }
}

public class MenuDrivenAccount 
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        Account acc = null;
        HashMap<String,Account> hm = new HashMap<>();

        try
        {
            FileInputStream fis = new FileInputStream("K:/Accounts.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int count = ois.readInt();

            for(int i = 0;i < count;i++)
            {
                acc = (Account) ois.readObject();
                System.out.println(acc);
                hm.put(acc.accNo, acc);
            }

            fis.close();
            ois.close();
        }
        catch(Exception e)
        {

        }

        FileOutputStream fos = new FileOutputStream("K:/Accounts.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        System.out.println("Menu");

        int choice;
        String accno,name;
        double balance;

        do
        {
            System.out.println("--------------------------------------");
            System.out.println("1. Create Account");
            System.out.println("2. Delete Account");
            System.out.println("3. View Account");
            System.out.println("4. View All Account");
            System.out.println("5. Save Accounts");
            System.out.println("6. Exit");
            
            System.out.println("--------------------------------------");
            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();

            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            switch(choice)
            {
                case 1: System.out.println("--------------------------------------");
                        System.out.print("Enter Account No : ");
                        accno = sc.nextLine();
                        System.out.print("Enter Holder Name : ");
                        name = sc.nextLine();
                        System.out.print("Enter Balance : ");
                        balance = sc.nextDouble();

                        acc = new Account(accno, name, balance);
                        hm.put(accno, acc);

                        System.out.println("Account Created for "+ name);
                        break;
                
                case 2: System.out.println("--------------------------------------");
                        System.out.print("Enter Account No : ");
                        accno = sc.nextLine();
                        hm.remove(accno);
                        break;

                case 3: System.out.println("--------------------------------------");
                        System.out.print("Enter Account No :");
                        accno = sc.nextLine();
                        acc = hm.get(accno);
                        System.out.println(acc);
                        break;

                case 4: System.out.println("--------------------------------------");
                        for(Account a : hm.values())
                        {
                            System.out.println(a);
                        }
                        break;

                case 5:
                case 6: System.out.println("--------------------------------------");
                        oos.writeInt(hm.size());
                        for(Account a : hm.values())
                        {
                            oos.writeObject(a);
                        }
                        break;

                default:System.out.println("--------------------------------------");
                        System.out.println("Invalid Choice!");
            }

        }while(choice != 6);

        oos.close();
        oos.flush();
        fos.close();
    }    
}