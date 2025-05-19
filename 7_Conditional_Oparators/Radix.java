public class Radix {
    public static void main(String[] args) {
        radix("010101");
        radix("");
        radix("1256");
        radix("3498");
        radix("F045");

    }

    public static void radix(String s){
        if (s.isEmpty() || s.equals("")) {
            System.out.println("Please pass the number");
        }
        else if(s.matches("[01]+")){
            System.out.println(s+" is binary number");
        }else if(s.matches("[0-7]+")){
            System.out.println(s+" is octal number");
        }else if(s.matches("[0-9]+")){
            System.out.println(s+" is decimal number");
        }else if(s.matches("[0-9A-Fa-f]+")){
            System.out.println(s+" is hexadecimal number");
        }else{
            System.out.println(s+" is Invalid radix number");
        }
    }
}
