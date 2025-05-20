public class Rectangle
{
    public int length,breadth;

    public void area(){
        System.out.println("Area of Rectangle : "+length*breadth);
    }

    public void perimeter(){
        System.out.println("Perimeter of Rectangle : "+2*(length+breadth));
    }

    public void isSquare(){
        if(length==breadth){
            System.out.println("This is Square");
        }else{
            System.out.println("This is Rectangle");
        }
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.length = 10;
        rectangle.breadth = 10;

        rectangle.area();
        rectangle.perimeter();
        rectangle.isSquare();
    }
}