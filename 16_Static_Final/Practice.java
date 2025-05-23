import java.util.Calendar;

class Student
{
    private String rollNo;
    private static int count = 1;
    private String generateRollNo(){
        Calendar cal = Calendar.getInstance();
        String rn = "UG_"+cal.get(Calendar.YEAR)+"_"+count;
        count++;
        return rn;
    }
    public Student()
    {
        rollNo = generateRollNo();
    }
    public void displayRollNo(){
        System.out.println(rollNo);
    }
}
public class Practice {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.displayRollNo();
        Student s2 = new Student();
        s2.displayRollNo();
    }
}
