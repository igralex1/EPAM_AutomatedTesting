/*
 * В университете есть несколько факультетов, в которых учатся студенты, объединенные в группы.
 *
 * У каждого студента есть несколько учебных предметов по которым он получает оценки.
 *
 * Необходимо реализовать иерархию студентов, групп и факультетов.
 *
 *
 * Посчитать средний балл по всем предметам студента
 *
 * Посчитать средний балл по конкретному предмету в конкретной группе и на конкретном факультете
 *
 * Посчитать средний балл по предмету для всего университета
 *
 *
 * Оценка ниже 0 или выше 10
 *
 * Отсутствие студентов в группе
 *
 * Отсутствие групп на факультете
 *
 * Отсутствие факультетов в университете
 *
 * Отсутсвие предметов у студента (должен быть хотя бы один)
 *
 */


package pvt.core;

import pvt.core.Education.Faculty;
import pvt.core.Education.Student;
import pvt.core.Education.Subject;
import pvt.core.Education.University;
import pvt.core.MyException.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws MarkException, StudentException, FacultyException, SubjectException, GroupException {

        // Student Peter
        ArrayList<Subject> subjects_01 = new ArrayList<Subject>();
        Subject history_01 = new Subject("history");
        Subject math_01 = new Subject("math");
        Subject literature_01 = new Subject("literature");

        history_01.append(5.0);
        history_01.append(4.0);
        history_01.append(2.0);
        math_01.append(4.0);
        literature_01.append(0.0);
        subjects_01.add(history_01);
        subjects_01.add(math_01);
        subjects_01.add(literature_01);

        Student student_01 = new Student("Peter", subjects_01);
        // Student Kate
        ArrayList<Subject> subjects_02 = new ArrayList<Subject>();
        Subject history_02 = new Subject("history");
        Subject math_02 = new Subject("math");
        Subject literature_02 = new Subject("literature");
        history_02.append(7.0);
        math_02.append(5.0);
        literature_02.append(6.0);
        subjects_02.add(history_02);
        subjects_02.add(math_02);
        subjects_02.add(literature_02);

        Student student_02 = new Student("Kate", subjects_02);

        ArrayList<Student> students_0 = new ArrayList<Student>();
        students_0.add(student_01);
        students_0.add(student_02);

        Faculty faculty_0 = new Faculty("Faculty programming", "00000", students_0);


        // Student Pavel
        ArrayList<Subject> subjects_11 = new ArrayList<Subject>();
        Subject history_11 = new Subject("history");
        Subject math_11 = new Subject("math");
        Subject literature_11 = new Subject("literature");
        history_11.append(3.0);
        math_11.append(2.0);
        literature_11.append(6.0);
        subjects_11.add(history_11);
        subjects_11.add(math_11);
        subjects_11.add(literature_11);

        Student student_11 = new Student("Pavel", subjects_11);

        // Student Marina
        ArrayList<Subject> subjects_12 = new ArrayList<Subject>();
        Subject history_12 = new Subject("history");
        Subject math_12 = new Subject("math");
        Subject literature_12 = new Subject("literature");
        history_12.append(9.0);
        math_12.append(6.0);
        literature_12.append(8.0);
        subjects_12.add(history_12);
        subjects_12.add(math_12);
        subjects_12.add(literature_12);

        Student student_12 = new Student("Marina", subjects_12);

        ArrayList<Student> students_1 = new ArrayList<Student>();
        students_1.add(student_11);
        students_1.add(student_12);

        Faculty faculty_1 = new Faculty("Faculty history", "11111", students_1);


        ArrayList<Faculty> faculties = new ArrayList<Faculty>();
        faculties.add(faculty_0);
        faculties.add(faculty_1);
        University university = new University("BSUIR", faculties);

        System.out.println("---------------------------------------------------");
        student_01.AverageMarkSubject();
        System.out.println();
        faculty_0.AverageMarkSubject("history");
        faculty_0.AverageMarkSubject("literature");
        faculty_0.AverageMarkSubject("math");
        System.out.println();
        university.AverageMarkSubject();
        System.out.println("---------------------------------------------------");
//        Call exception
//        Оценка ниже 0 или выше 10
        try {
            history_01.append(-1.2);
        } catch (MarkException e) {
            System.out.println("Перехвачено исключение : " + e);
        }
        try {
            history_01.append(12.2);
        } catch (MarkException e) {
            System.out.println("Перехвачено исключение : " + e);
        }
//        Отсутствие студентов в группе

        try {
            ArrayList<Student> studentsException = new ArrayList<Student>();
            Faculty facultyException = new Faculty("Faculty Literature", "no", studentsException);
        } catch (StudentException e) {
            System.out.println("Перехвачено исключение : " + e);
        }

//        Отсутствие групп на факультете
        try {
            Faculty groupException = new Faculty("BNTU", "", students_0);
        } catch (GroupException e) {
            System.out.println("Перехвачено исключение : " + e);
        }
//        Отсутствие факультетов в университете
        try {
            ArrayList<Faculty> facultiesException = new ArrayList<>();
            University universityException = new University("BSU", facultiesException);

        } catch (FacultyException e) {
            System.out.println("Перехвачено исключение : " + e);
        }
//        Отсутсвие предметов у студента (должен быть хотя бы один)
        try {
            ArrayList<Subject> subjectsException = new ArrayList<>();
            Student studentException = new Student("Евгений", subjectsException);
        } catch (SubjectException e) {
            System.out.println("Перехвачено исключение : " + e);
        }

    }
}
