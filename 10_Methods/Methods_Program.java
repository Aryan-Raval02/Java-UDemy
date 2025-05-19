import java.util.Arrays;

public class Methods_Program{
    public static void main(String[] args) {

        double s = 0;
        for(String x : args){
            if(x.matches("[0-9\\.]+"))
                s=s+Double.parseDouble(x);
        }

        System.out.println("Sum is "+s);

        primeNumber(91);
        GCD(25, 25);

        System.out.println("Area is "+area(10, 10));
        System.out.println("Area is "+area(7));
        System.out.println("REverse of 123 is "+reverse(123));
        System.out.println("Revrese of [1,2,3,4,5] is "+Arrays.toString(reverse(new int[]{1,2,3,4,5})));
        System.out.println(validate("Aryan Raval"));
        System.out.println(validate("12Ary"));
        System.out.println(validate(6));
    }

    public static void primeNumber(int n){
        boolean flag = false;
        for(int i=2 ; i<=(Math.sqrt(n)) ; i++){
            if(n%i == 0){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println(n+" is not prime number");
        }else{
            System.out.println(n+" is prime number");
        }
    }

    public static void GCD(int m,int n){
        while(m!=n){
            if(m>n){
                m=m-n;
            }
            else{
                n=n-m;
            }
        }
        System.out.println("GCD is "+m);
    }

    public static double area(double l,double b){
        return l*b;
    }
    public static double area(double r){
        return Math.PI*r*r;
    }

    public static int reverse(int n){
        int rem,ans=0;
        while(n!=0){
            rem = n%10;
            ans = ans*10 + rem;
            n = n/10;
        }

        return ans;
    }
    public static int[] reverse(int[] n){
        int l = n.length-1;
        for(int i=0 ; i<=(n.length/2) ; i++){
            int temp = n[i];
            n[i] = n[l];
            n[l] = temp;
            l--;
        }
        return n;
    }

    public static boolean validate(String str){
        return str.matches("[a-zA-Z\\s]+");
    }
    public static boolean validate(int age){
        return age>=3 && age<=15;
    }
}