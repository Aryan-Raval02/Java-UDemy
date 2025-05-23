public class StaticBlock
{
    static int s;

    StaticBlock(){}

    static{
        System.out.println("Static Block 1 Value of s : "+s);
        s = 10;
    }

    public static void main(String[] args) {
        StaticBlock sb  = new StaticBlock();
        sb.display();
    }

    static{
        System.out.println("Static Block 2 Value of s : "+s);
        s = 20;
    }

    void display(){
         System.out.println("Method Value of s : "+s);
    }

    
}