package deansOffice;

import deansOffice.disciplines.Academics;
import deansOffice.students.Group;
import deansOffice.students.Student;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Clarkson", "jeremy", 1);
        Student s2 = new Student("May", "James", 1);
        Group gr1 = new Group(1, LocalDate.now());
        gr1.addToGroup(s1);
        gr1.addToGroup(s2);
        Academics a1 = new Academics("Economics", LocalDateTime.of(2023, 12, 10, 12,0),
                "Exam");
        System.out.println(gr1);
        s1.addDiscipline(a1);
        System.out.println(s1.getAcademics());

    }
//    Подумайте над таким завданням: Припустимо, що нам треба зробити додаток для роботи деканата певного факультету.
//    Для цього нам треба створити класи: студент з полями прізвище, ім'я, номер залікової книжки, група.
//    Для кожного студента зберіається інформація про його успішність у вигляді: предмет, дата заліку/екзамену, оцінка (якщо це екзамен) та здано/не здано (для заліку),
//    фактична дата здачі.
//    Деканат має можливість створювати групи, вказуючи номер групи та рік створення групи; додавати студентів до групи;
//    вилучати студентів з групи; для кожного студента додавати предмет (назву та тип оцінювання - екзамен чи залік);
//    назначати дату здачі предмету; додавати оцінку для предмету з фактичною датою здачі
}
