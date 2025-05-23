abstract class AnonymousOuter
{
    abstract void display();
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        AnonymousOuter ao = new AnonymousOuter() {
            void display(){
                System.out.println("Aw...");
            }
        };
        ao.display();
    }  
}
