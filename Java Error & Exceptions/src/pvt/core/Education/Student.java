package pvt.core.Education;

import pvt.core.Interface.IAverage;
import pvt.core.MyException.SubjectException;
import pvt.core.abstractClasses.AbstractStudent;

import java.util.ArrayList;

public class Student extends AbstractStudent implements IAverage {

    private ArrayList<Subject> subjects;

    public Student(String nameStudent, ArrayList<Subject> subjects) throws SubjectException {
        this.nameStudent = nameStudent;
        this.subjects = subjects;
        if (subjects.size() == 0) {
            throw new SubjectException(nameStudent);
        }
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    // Work around
    // Fix it but it work
    @Override
    public void averageMarkSubject() {
        ArrayList<Double> marksArray = new ArrayList<>();
        for (Subject sub : subjects) {
            marksArray.addAll(sub.getGrades());
        }
        System.out.println("Cредний балл по предметам у студента " + nameStudent + " " + averageMark(marksArray));
    }
}
