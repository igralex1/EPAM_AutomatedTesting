package pvt.core.Interface;

import java.util.ArrayList;

public interface IAverage {
    public default double AverageMark(ArrayList<Double> marks) {
        double sum = 0;
        for (double value : marks) {
            sum += value;
        }
        return sum / marks.size();
    }
}
