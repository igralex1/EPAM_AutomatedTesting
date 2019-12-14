package pvt.core.MyException;

public class GroupException extends Exception {
    private String noneGroupFaculty;

    public GroupException(String n) {
        this.noneGroupFaculty = n;
    }

    @Override
    public String toString() {
        return "Отсутствует группа на >>>>>>  " + noneGroupFaculty + "  <<<<<<<<";
    }
}
