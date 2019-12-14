package pvt.core.abstractClasses;

import pvt.core.Education.Subject;

import java.util.ArrayList;


public abstract class AbstractStudent {
    protected String nameStudent;
    protected ArrayList<Subject> subjects;

    public abstract void AverageMarkSubject();
}
