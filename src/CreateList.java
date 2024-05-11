import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateList {
    private final Random random = new Random();

    public ArrayList<Integer> createListOfNumbers(int size, int bound) {

        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            newList.add(random.nextInt(bound));
        }
        return newList;
    }

}
