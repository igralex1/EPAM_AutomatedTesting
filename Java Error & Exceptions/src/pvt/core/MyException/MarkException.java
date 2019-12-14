package pvt.core.MyException;

public class MarkException extends Exception {
    private double detail;

    public MarkException(double d) {
        this.detail = d;
    }

    @Override
    public String toString() {
        return "Оценка ниже 0 или выше 10 >>>>>>>>>>>>  " + detail + "  <<<<<<<<<<<";
    }
}
