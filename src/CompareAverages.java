import java.util.ArrayList;
import java.util.List;

public class CompareAverages {

    private FindAverage findAverage = new FindAverage();

    public String compareAveragesOfLists(List<Integer> list1, List<Integer> list2) {

        double averageList1 = findAverage.getAverageOfListNumbers(list1);
        double averageList2 = findAverage.getAverageOfListNumbers(list2);

        String result;

        if (averageList1 > averageList2) {
            result = "Первый список имеет большее среднее значение";
        } else if (averageList1 < averageList2) {
            result = "Второй список имеет большее среднее значение";
        } else result = "Средние значения равны";
        return result;
    }
}
