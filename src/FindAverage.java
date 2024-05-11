import java.util.List;

import static java.lang.Double.sum;

public class FindAverage {

    public double getAverageOfListNumbers(List<Integer> list) {
        double sum = 0;
        for (int number : list) {
            sum += number;
        }
        System.out.println(list + " " + (sum/list.size()));
        return sum / list.size();
    }


}
