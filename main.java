package softserve;


public class main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Jane", 56, 40);
        Employee e2 = new Employee("James", 25.5,38);
        Employee e3 = new Employee("Jack", 45.5,30);
        System.out.println(e1.getName() + " " +e1.getSalary());
        System.out.println(e2.getName() + " " +e2.getSalary());
        System.out.println(e3.getName() + " " +e3.getSalary());



        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();
        p1.setName("Jack");
        p1.setBirthYear(1996);
        p2.setName("John");
        p2.setBirthYear(2000);
        p3.setName("Ann");
        p3.setBirthYear(1980);
        p4.setName("George");
        p4.setBirthYear(1999);
        p5.setName("Charlotte");
        p5.setBirthYear(2003);
    }
}
