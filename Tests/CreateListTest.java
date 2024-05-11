import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreateListTest {

    @Test
    public void testCreatedList() {

        CreateList createList = new CreateList();
        int size = 5;
        int bound = 99;

        List<Integer> testList = new CreateList().createListOfNumbers(size, bound);

        assertEquals(size, testList.size());
    }
}
