public class SubjectTest {
    public static void main(String[] args) {
        Subject[] subs = new Subject[3];
        subs[0] = new Subject("AX01", "DSA", "400");
        subs[1] = new Subject("AX02", "JAVA", "400");
        subs[2] = new Subject("AX03", "Spring Boot", "400");

        subs[2].setMarksObtain("396");

        for(Subject s : subs){
            System.out.println(s);
        }

    }
}
class Subject{
    private String subID;
    private String name;
    private String maxMarks;
    private String marksObtain;

    Subject(String subID, String name, String maxMarks){
        this.subID = subID;
        this.name = name;
        this.maxMarks = maxMarks;
    }

    public String getMarksObtain() {
        return marksObtain;
    }
    public String getMaxMarks() {
        return maxMarks;
    }
    public String getName() {
        return name;
    }
    public String getSubID() {
        return subID;
    }

    public void setMarksObtain(String marksObtain) {
        this.marksObtain = marksObtain;
    }

    public String toString(){
        return "Subject ID      : "+getSubID()+"\nSubject Name      : "+name+"\nMaximum Marks       : "+getMaxMarks()+"\nObtained Marks       : "+getMarksObtain();
    }

}
