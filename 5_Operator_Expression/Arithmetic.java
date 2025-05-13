//Squre root gives double value.

import java.util.Scanner;

public class Arithmetic
{
    public static void main(String[] args) {
        int a=10,b=5;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Add :"+(a+b));
        System.out.println("Sub :"+(a-b));
        System.out.println("Mul :"+(a*b));
        System.err.println("Div :"+(a/b));
        System.out.println("Mod :"+(a%b));

        char c='(';
        int x = 30;
        System.out.println(c+".."+(c-x));

        // System.out.print("Enter Base of Triangle : ");
        // double base = sc.nextDouble();
        // System.out.print("Enter Height of Triangle : ");
        // double height = sc.nextDouble();

        // CalculateAreaTriagle.areaOfTiangle1(base, height);

        // System.out.print("Enter Size of Side1 : ");
        // double side1 = sc.nextDouble();
        // System.out.print("Enter Size of Side2 : ");
        // double side2 = sc.nextDouble();
        // System.out.print("Enter Size of Side3 : ");
        // double side3 = sc.nextDouble();

        // CalculateAreaTriagle.areaOfTiangle2(side1, side2, side3);

        QuadraticEquation.equation(1,-4,4);

    }
}
class CalculateAreaTriagle
{
    public static void areaOfTiangle1(double b,double h)
    {
        double area = 1f/2*(b*h);
        System.out.println("Area of Triangle : "+area);
    }
    public static void areaOfTiangle2(double s1,double s2,double s3){
        double s = (s1+s2+s3)/2;

        double bs = s*(s-s1)*(s-s2)*(s-s3);

        System.out.println("Area : "+Math.sqrt(bs));
    }
}
class QuadraticEquation
{
    public static void equation(int a1,int b1,int c1)
    {
        int same = (int) Math.sqrt((b1*b1)-(4*a1*c1));
        int r1 = ((-b1) + same) / (2*a1);
        int r2 = ((-b1) - same) / (2*a1);

        System.out.println("R1 : "+r1+"..R2 : "+r2);
    }
}