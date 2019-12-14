package pvt.core.MyException;

public class FacultyException extends Exception {
    private String noOneFacultyUniver;

    public FacultyException(String f) {
        this.noOneFacultyUniver = f;
    }

    @Override
    public String toString() {
        return "Нет ни одного факультета в >>>>>>>>>  " + noOneFacultyUniver + "  <<<<<<<<<<<";
    }
}
