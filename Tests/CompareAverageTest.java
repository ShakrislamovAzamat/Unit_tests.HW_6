import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CompareAverageTest {

    List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
    List<Integer> list2 = new ArrayList<>(Arrays.asList(9, 6, 7));

    @BeforeEach
    void MockSets() {
        FindAverage findAverage = mock(FindAverage.class);
        when(findAverage.getAverageOfListNumbers(list1)).thenReturn(2.0);
        when(findAverage.getAverageOfListNumbers(list2)).thenReturn(7.3);
    }

    @Test
    public void testCompareAverageWhenFirstNumIsBigger(){
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
