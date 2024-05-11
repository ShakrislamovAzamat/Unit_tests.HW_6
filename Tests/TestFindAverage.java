import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestFindAverage {

    @Test
    public void testFindAverage (){
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        FindAverage findAverage = new FindAverage();

        double result = findAverage.getAverageOfListNumbers(list);

        double expected = list.stream().mapToInt(e -> e).average().getAsDouble();

        assertEquals(expected, result, 0.01);
    }
}
