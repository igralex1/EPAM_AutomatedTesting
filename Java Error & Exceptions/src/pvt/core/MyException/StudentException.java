package pvt.core.MyException;

public class StudentException extends Exception {
    private String noneStudentInFaculty;

    public StudentException(String f) {
        this.noneStudentInFaculty = f;
    }

    @Override
    public String toString() {
        return "Студент отсутствует на факултете >>>>>>>>>>>  " + noneStudentInFaculty + "  <<<<<<<<<<<<<<<<<<";
    }
}
