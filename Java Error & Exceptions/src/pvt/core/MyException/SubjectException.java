package pvt.core.MyException;

public class SubjectException extends Exception {
    private String noneSubStudent;

    public SubjectException(String s) {
        noneSubStudent = s;
    }

    @Override
    public String toString() {
        return "Отсутствуют предметы у >>>>>>>>  " + noneSubStudent + "  <<<<<<<<";
    }
}
