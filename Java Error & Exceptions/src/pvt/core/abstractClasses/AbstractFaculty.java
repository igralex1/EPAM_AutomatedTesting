package pvt.core.abstractClasses;

import pvt.core.Education.Student;

import java.util.List;

public abstract class AbstractFaculty {
    protected String nameFaculty;
    protected List<Student> students;
    protected String group;

    public abstract void averageMarkSubject(String subjectName);
}
