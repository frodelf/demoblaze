package deansOffice.disciplines;

import java.time.LocalDateTime;

public class Academics {
    private String disciplineName;
    private LocalDateTime time;
    private String controlType;
    private double grade;
    private boolean pass;
    public Academics(String disciplineName, LocalDateTime time, String controlType){
        this.disciplineName=disciplineName;
        this.time=time;
        this.controlType=controlType;
    }
    public void setGrade(double grade){
        this.grade=grade;
    }
    public void setPass(boolean pass){
        this.pass=pass;
    }
    public String toString(){
        return "Name of the discipline: " + this.disciplineName + ". Control type: " + this.controlType + "."
                + ((this.time!=null) ? " Time:"+ this.time : "Time has not been set up yet.") +
                ((this.pass=true) ? " Pass: passed" : "Pass: not passed" + ". Grade: " + this.grade);
    }
}
