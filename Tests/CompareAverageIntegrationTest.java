import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareAverageIntegrationTest {

    List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
    List<Integer> list2 = new ArrayList<>(Arrays.asList(9, 6, 7));

    @Test
    public void testCompareAverageWhenFirstNumIsBigger() {
        String result = new CompareAverages().compareAveragesOfLists(list2, list1);

        assertEquals("Первый список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareAverageWhenSecondNumIsBigger(){
        String result = new CompareAverages().compareAveragesOfLists(list1, list2);

        assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareAverageWhenNumsIsEqual(){
        String result = new CompareAverages().compareAveragesOfLists(list1, list1);

        assertEquals("Средние значения равны", result);
    }
}
