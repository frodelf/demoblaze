package deansOffice.students;

import java.time.LocalDate;
import java.util.ArrayList;

public class Group {
    private int id;
    private LocalDate creationDate;
    private ArrayList<Student> members= new ArrayList<>();

    private static ArrayList<Integer> ids = new ArrayList<>();
    public Group(int id, LocalDate creationDate){
        if (ids.contains(id) & ids!=null){
            System.out.println("Group Creation has failed: a group with this id already exists.");
            return;
        }
        this.id=id;
        ids.add(id);
        this.creationDate=creationDate;
    }
    public Group(int id, LocalDate creationDate, Student ...s){
        if (ids.contains(id) & ids!=null){
            System.out.println("Group Creation has failed: a group with this id already exists.");
            return;
        }
        this.id=id;
        ids.add(id);
        this.id=id;
        this.creationDate=creationDate;
        for (Student i:s) {
            this.members.add(i);
            i.setGroupId(this.id);
        }
    }
    public void addToGroup(Student ... s){
        for (Student i:s) {
            this.members.add(i);
            i.setGroupId(this.id);
        }
    }
    public void removeFromGroup(Student ... s){
        for (Student i:s) {
            this.members.remove(i);
            i.setGroupId(0);
        }
    }
    public String toString(){
        return "Id of the group: " + this.id + ". Creation Date: " + this.creationDate + " . Members of the group: " + this.membersToString();
    }
    public String membersToString(){
        StringBuilder result = new StringBuilder();
        for (Student s:members)
            result.append(s.getSurname()!=null ? " "+s.getSurname(): "");
        return result.toString();
    }
    public Group deleteGroup(){
        for (Student i:members) {
            this.members.remove(i);
            i.setGroupId(0);
        }
        return null;
    }
}
