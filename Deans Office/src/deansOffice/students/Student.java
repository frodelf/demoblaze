package deansOffice.students;
import deansOffice.disciplines.Academics;
import java.util.ArrayList;

public class Student {
    private String surname;
    private String name;
    private int recordBookNumber;
    private static ArrayList<Integer> recordBookNumbers = new ArrayList<>();
    private static ArrayList<Academics> studentDisciplines = new ArrayList<>();
    private int groupId;
    public Student(String surname, String name, int recordBookNumber){
        if (recordBookNumbers.contains(recordBookNumber)){
            System.out.println("Student Creation has failed: a student with this record-book number already exists.");
            return;
        }
        this.surname=surname;
        this.name=name;
        this.recordBookNumber=recordBookNumber;
        recordBookNumbers.add(recordBookNumber);
        this.groupId=0;
    }
    public void setGroupId(int groupId){
        this.groupId=groupId;
    }
    public void addDiscipline(Academics a){
        if (studentDisciplines.contains(a)){
            System.out.println("This student already has this subject: cannot add.");
            return;
        }
        studentDisciplines.add(a);
    }
    public void removeDiscipline(Academics a){
        if (studentDisciplines.contains(a)){
            System.out.println("This student does not this subject: nothing to remove.");
            return;
        }
        studentDisciplines.remove(a);
    }
    public String getSurname(){
        return this.surname;
    }
    public String getAcademics(){
        StringBuilder sb = new StringBuilder();
        for (Academics a:studentDisciplines)
            sb.append(a.toString()+"\n");
        return sb.toString();
    }
}
