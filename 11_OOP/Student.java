public class Student {
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;

    public int total(){
        return m1+m2+m3;
    }

    public double average(){
        return total()/3;
    }

    public char grade(){
        if(average()>=60){
            return 'A';
        }
        else if(average()<60){
            return 'B';
        }
        else{
            return 'C';
        }
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.roll = 123;
        s.name = "Aryan Raval";
        s.course = "BCA";
        s.m1 = 56;
        s.m2 = 67;
        s.m3 = 78;

        System.out.println("Total Marks : "+s.total());
        System.out.println("Average Marks : "+s.average());
        System.out.println("Grade : "+s.grade());
    }

}

