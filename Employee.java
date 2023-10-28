package softserve;

public class Employee {
    private String name;
    private double rate;
    private int hours;
    Employee(){}
    Employee(String name, double rate){
        this.name=name;
        this.rate=rate;
    }
    Employee(String name, double rate, int hours){
        this.name=name;
        this.rate=rate;
        this.hours=hours;
    }
    public String getName(){
        return this.name;
    }
    public double getRate(){
        return this.rate;
    }
    public int getHours(){
        return this.hours;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setRate(double rate){
        this.rate=rate;
    }
    public void setHours(int hours){
        this.hours=hours;
    }
    public double getSalary(){
        return this.rate*this.hours;
    }
    @Override
    public String toString(){
        return "Name:"+this.name+" Rate:"+this.rate+" Hours:"+this.hours;
    }
    public double getBonuses(){
        return getSalary()*0.1;
    }

}
