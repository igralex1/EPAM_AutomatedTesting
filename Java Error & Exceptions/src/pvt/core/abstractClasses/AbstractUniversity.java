package pvt.core.abstractClasses;

import pvt.core.Education.Faculty;

import java.util.List;

public abstract class AbstractUniversity {
    protected String nameUniversity;
    protected List<Faculty> faculties;

    public abstract void AverageMarkSubject();
}
