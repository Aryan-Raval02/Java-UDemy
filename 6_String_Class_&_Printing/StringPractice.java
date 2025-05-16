public class StringPractice {
    public static void main(String[] args) {

        String str1 = "Java"; // This in String pool area

        String str2 = new String("Java"); // it creating in heap and literal in pool area

        String str3 = new String(new char[]{'H','e','l','l','o'});

        // Use of Start Index and End Index
        String str4 = new String(new byte[]{65,66,67,68,69},2,2);

        System.out.println(str4);

        System.out.println(str1==str2); // false beacuse str1 and str2 point to different object

        String name = new String("netbeans");
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.substring(3));
        System.out.println(name.substring(2, 4));
        System.out.println(name.replace('n', 'l'));
        System.out.println(name.startsWith("net"));
        System.out.println(name.endsWith("l"));
        System.out.println(name.indexOf("e"));
        System.out.println(name.lastIndexOf("e"));
        System.out.println(name.equals("netBeans"));
        System.out.println(name.equalsIgnoreCase("netBeans"));
        System.out.println(name.compareTo("netBeans"));
        System.out.println(name.valueOf(2));

        String match = "Aryan";

        System.out.println(match.matches("."));
        System.out.println(match.matches("[abc]"));
        System.out.println(match.matches("[^abc]"));
        System.out.println(match.matches("[A-Z][a-z]*"));

        System.out.println(match.matches("\\w"));
        System.out.println(match.matches("\\D"));
        System.out.println(match.matches("\\S"));

        System.out.println("-----------------------------");

        StringPractice.separateUsernameDomain("aryanraval299@gmail.com");

        System.out.println("-----------------------------");

        System.out.println("Binary Check : "+StringPractice.checkBinary(10110));
        System.out.println("Binary Check : "+StringPractice.checkBinary(12345));

        System.out.println("-----------------------------");

        System.out.println("HexaDecimal Check : "+StringPractice.checkHexaDecimal("11F0"));
        System.out.println("HexaDecimal Check : "+StringPractice.checkHexaDecimal("3faz"));
        
        System.out.println("-----------------------------");

        System.out.println("Date Check : "+StringPractice.checkDate("31/12/2000"));
        System.out.println("Date Check : "+StringPractice.checkDate("34/12/2003"));
        System.out.println("Date Check : "+StringPractice.checkDate("30/13/2003"));

        System.out.println("-----------------------------");

        System.out.println("Remove Special Characters : "+StringPractice.removeSpecialCharacters("a!B@c#1$2%3"));
        System.out.println("Remove Spaces : "+StringPractice.removeSpaces("    Aryan   Raval     Jagdishbhai    "));
        System.out.println("Number of Words in Strings : "+StringPractice.numberOfWordsInStrings("    Aryan   Raval     Jagdishbhai    "));
        
    }

    public static boolean checkGmail(String str){
        if(str.matches("gmail.*")){ // we can use startsWith() method.
            return true;
        }
        else{
            return false;
        }
    }

    public static void separateUsernameDomain(String str){
        int inter = str.indexOf("@");
        int dot = str.indexOf(".");
        String username = str.substring(0, inter);
        String domain = str.substring(inter+1);

        System.out.println("Username : "+username+"\nDomain Name : "+domain);

        if (StringPractice.checkGmail(domain)) {
            System.out.println("Email is Valid");
        }else{
            System.out.println("Email is not Valid");
        }
    }

    public static boolean checkBinary(int n){
        String str = n + ""; // we can use String.valueOf(n)

        if(str.matches("[01]+")){
            return true;
        }else{
            return false;
        }
    }

    public static boolean checkHexaDecimal(String str){
        if (str.matches("[0-9a-fA-F]+")) {
            return true;
        }else{
            return false;
        }
    }

    public static boolean checkDate(String str){

        if (str.matches("(0[0-9]|[12][0-9]|3[01])/([0][0-9]|[1][012])/([0-9]{4})")) {
            return true;
        }else{
            return false;
        }
    }

    public static String removeSpecialCharacters(String str){
        return str.replaceAll("[^a-zA-Z0-9]", "");   
    }

    public static String removeSpaces(String str){
        return (str.replaceAll("\\s+", " ")).trim();
    }

    public static int numberOfWordsInStrings(String str){
        String ans = StringPractice.removeSpaces(str);
        String[] words = ans.split(" ");
        return words.length;
    }
}

