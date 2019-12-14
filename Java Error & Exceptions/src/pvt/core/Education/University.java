package pvt.core.Education;

import pvt.core.Interface.IAverage;
import pvt.core.MyException.FacultyException;
import pvt.core.abstractClasses.AbstractUniversity;

import java.util.ArrayList;

public class University extends AbstractUniversity implements IAverage {
    private final ArrayList<Faculty> faculties; // Composition

    public University(String nameUniversity, ArrayList<Faculty> facultiy) throws FacultyException {
        this.nameUniversity = nameUniversity;
        this.faculties = facultiy;
        if (facultiy.size() == 0) {
            throw new FacultyException(nameUniversity);
        }
    }

    // Work around
    // Fix it later but it work
    @Override
    public void AverageMarkSubject() {
        ArrayList<Double> averageMarkSub = new ArrayList<>();
        for (Faculty fac : faculties) {
            for (Student studentForeach : fac.getStudents()) {
                ArrayList<Subject> subjectForeach = studentForeach.getSubjects();
                for (Subject s : subjectForeach) {
                    averageMarkSub.addAll(s.getGrades());
                }
            }
        }
        System.out.println("Cредний балл оценок по " + " " + AverageMark(averageMarkSub));
    }
}


