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
    }
}
