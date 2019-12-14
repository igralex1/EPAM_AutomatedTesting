package pvt.core.abstractClasses;

import pvt.core.MyException.MarkException;

import java.util.ArrayList;

public abstract class AbstractSubject {
    protected String nameSubject;
    protected ArrayList<Double> grades;

    public abstract void append(double newElement) throws MarkException;
}
