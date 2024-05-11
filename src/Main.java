import java.util.List;

public class Main {
    private static final int SIZE = 2;
    private static final int BOUND = 10;

    public static void main(String[] args) {
        List<Integer> list1 = new CreateList().createListOfNumbers(SIZE, BOUND);
        List<Integer> list2 = new CreateList().createListOfNumbers(SIZE, BOUND);
        System.out.println(new CompareAverages().compareAveragesOfLists(list1, list2));
    }
}