import java.util.Scanner;

public class LoopsProgram{
    static Scanner sc  = new Scanner(System.in);
    public static void main(String[] args) {

        multiplicationTable();
        sumOfNnumbers(5);
        factorialOfNumbers(1);
        factorialOfNumbers(5);

        System.out.println("-----------------------");

        displayDigits(234);
        lengthOfNumber(2345);
        armstring(153);
        reverseNumber(123);
        palindrome(123);
        digitToWord(1700);

        seriesAP(); // Arithmetic progression : a a+d a+2d a+3d ...   
        seriesGP(); // Geometric progression : a a*d a*d*d a*d*d*d ...
        seriesFibonacci();
        
        pattern1(5);
        pattern2(5);
        pattern3(5);
    }

    public static void multiplicationTable(){
        System.out.print("Enter a Number for Multiplication : ");
        int n = sc.nextInt();
        for(int i=1 ; i<=10 ; i++){
            System.out.println(n+" x "+(i)+" = "+(i*n));
        }
    }

    public static void sumOfNnumbers(int n){
        int sum = 0;
        if(n == 0){
            System.out.println("Sum of "+n+" numbers : "+sum);
            return;
        }
        for(int i=1 ; i<=n ; i++){
            sum = sum + i;
        }
        System.out.println("Sum of "+n+" numbers : "+sum);
    }

    public static void factorialOfNumbers(int n){
        int fact = 1;
        if(n == 1 || n == 0){
            System.out.println("Factorial of "+n+" number : "+fact);
            return;
        }
        for(int i=2 ; i<=n ; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of "+n+" number : "+fact);
    }

    public static void displayDigits(int n){
        int num = n; 
        while(num!=0){ // while(n>0)
            int rem = num%10;
            num = num/10;
            System.out.println(rem);
        }
    }

    public static void lengthOfNumber(int num){
        int n = num;
        int count = 0;
        while(num!=0){
            num = num/10;
            count++;
        }
        System.out.println("Length of "+n+" : "+count);
    }

    public static void armstring(int n){
        int num = n;
        int arm = 0;
        while(num!=0){
            int rem = num % 10;
            arm = arm + (rem*rem*rem);
            num = num / 10;
        }

        if(num == arm){
            System.out.println(n+" is not armstrong");
        }else{
            System.out.println(n+" is armstrong");
        }
    }

    public static void reverseNumber(int n){
        int num = n;
        int rev = 0;
        while(num!=0){
            int rem = num % 10;
            rev = rev*10 + rem;
            num = num / 10;
        }

        System.out.println("Reverse of "+n+": "+rev);
    }

    public static void palindrome(int n){
        int num = n;
        int rev = 0;
        while(num!=0){
            int rem = num % 10;
            rev = rev*10 + rem;
            num = num / 10;
        }

        if(n==rev){
            System.out.println(n+" is palindrome");
        }else{
            System.out.println(n+" is not palindrome");
        }
    }

    public static void digitToWord(int n){
        int num = n;
        String rev = "";
        while(num!=0){
            int rem = num % 10;
            rev = rev + rem;
            num = num / 10;
        }

        System.out.print(n+" : ");
        for(int i = rev.length()-1 ; i>=0 ; i--){
            switch (rev.charAt(i)) {
                case '0' : System.out.print("Zero ");
                         break;
                case '1' : System.out.print("One ");
                         break;
                case '2' : System.out.print("Two ");
                         break;
                case '3' : System.out.print("Three ");
                         break;
                case '4' : System.out.print("Four ");
                         break;
                case '5' : System.out.print("Five ");
                         break;
                case '6' : System.out.print("Six ");
                         break;
                case '7' : System.out.print("Seven ");
                         break;
                case '8' : System.out.print("Eight ");
                         break;
                case '9' : System.out.print("Nine ");
                         break;
            }
        }
        System.out.println();
    }

    public static void seriesAP(){ //Arithmetic Progression : a a+d a+2d a+3d ...
        System.out.println("--------------------------------");
        System.out.print("Enter Starting Number : ");
        int a = sc.nextInt();

        System.out.print("Enter Common differnece : ");
        int d = sc.nextInt();

        System.out.print("Enter Number Of Terms : ");
        int n = sc.nextInt();

        for(int i=1 ; i<=n ; i++){
            System.out.print(a+" ");
            a = a+d;
        }
        System.out.println();
    }

    public static void seriesGP(){ //Geometric Progression : a ad ad*d ad*d*d ...
        System.out.println("--------------------------------");
        System.out.print("Enter Starting Number : ");
        int a = sc.nextInt();

        System.out.print("Enter Common Ratio : ");
        int d = sc.nextInt();

        System.out.print("Enter Number Of Terms : ");
        int n = sc.nextInt();

        for(int i=1 ; i<=n ; i++){
            System.out.print(a+" ");
            a = a*d;
        }
        System.out.println();
    }

    public static void seriesFibonacci(){
        System.out.println("--------------------------------");
        int a=0,b=1,c;

        System.out.print("Enter Number Of Terms : ");
        int n = sc.nextInt();

        for(int i=1 ; i<=n ; i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println();
    }

    public static void pattern1(int n){
        System.out.println("---------------------------------");
        // for(int i=1 ; i<=n ; i++){
        //     for(int s=n ; s>n+1-i ; s--){
        //         System.out.print("  ");
        //     }
        //     for(int j=i ; j<=n ; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=n ; j++){
                if (i<=j) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        System.out.println("----------------------------------");

        for(int i=1 ; i<=n ; i++){
            for(int j=n ; j>=1 ; j--){
                if(i<j){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        System.out.println("----------------------------------");

        for(int i=1 ; i<=n ; i++){
            for(int j=n ; j>=1 ; j--){
                if(i<j){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            for(int k=1 ; k<n ; k++){
                if (i<=k) {
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    } 
}