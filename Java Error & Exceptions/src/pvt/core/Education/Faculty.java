package pvt.core.Education;

import pvt.core.Interface.IAverage;
import pvt.core.MyException.GroupException;
import pvt.core.MyException.StudentException;
import pvt.core.abstractClasses.AbstractFaculty;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends AbstractFaculty implements IAverage {
    private List<Student> students;
    private String group;

    public Faculty(String nameFaculty, String group, List<Student> students) throws StudentException, GroupException {
        this.nameFaculty = nameFaculty;
        this.students = students;
        this.group = group;
        if (students.size() == 0) {
            throw new StudentException(nameFaculty);
        }
        if (group == "") {
            throw new GroupException(nameFaculty);
        }
    }

    // Work around
    // Fix it but it work
    @Override
    public void AverageMarkSubject(String subjectName) {
        ArrayList<Double> averageMarkSub = new ArrayList<>();
        for (Student s : students) {
            ArrayList<Subject> subjectsForeach = s.getSubjects();
            for (Subject subjectForeach : subjectsForeach) {
                if (subjectForeach.getNameSubject() == subjectName) {
                    averageMarkSub.addAll(subjectForeach.getGrades());
                }
            }
        }
        System.out.println("Cредний балл оценок по " + subjectName + " " + AverageMark(averageMarkSub));
    }

    public List<Student> getStudents() {
        return students;
    }
}
