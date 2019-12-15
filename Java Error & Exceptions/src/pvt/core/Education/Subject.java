package pvt.core.Education;

import pvt.core.MyException.MarkException;
import pvt.core.abstractClasses.AbstractSubject;

import java.util.ArrayList;
import java.util.Collection;

public class Subject extends AbstractSubject {
    private int minGrade = 0;
    private int maxGrade = 10;

    private String nameSubject;
    protected ArrayList<Double> grades = new ArrayList<>();

    public Subject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    @Override
    public void append(double newGrade) throws MarkException {
        if (newGrade > maxGrade || newGrade < minGrade) {
            throw new MarkException(newGrade);
        }
        this.grades.add(newGrade);
    }


    @Override
    public String toString() {
        return nameSubject;
    }

    public Collection<? extends Double> getGrades() {
        return grades;
    }

    public String getNameSubject() {
        return nameSubject;
    }
}
