package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

    public static void main(String[] args) {
        List<Integer> studentsList = new ArrayList<>();
        studentsList.add(90);
        studentsList.add(80);
        studentsList.add(70);
        studentsList.add(60);
        studentsList.add(50);

        int total = 0;
        for (int i = 0; i < studentsList.size(); i++) {
            total += studentsList.get(i);
        }

        double average = (double) total / studentsList.size();
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
