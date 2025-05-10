// java.lang.* package automatically imported in our program

//when one class is public in a file then file name should be same as public class name.
//otherwise Compile time error.
public class First {
    public static void main(String[] args){
        System.out.println("Hello World First");
    }
}

//when we run Second2 class without main method then we will get runtime exception "Main method not Found"
class Second2{
    int x = 0;
}

//when we run Second2 class without main method then we will get runtime exception "Main method not Found"
class Second3 {
    public static void main(String[] args){
        System.out.println("Hello World3");
    }
}

