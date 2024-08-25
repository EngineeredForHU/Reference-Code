import java.util.*;

public class Practice {
    public static void main(String[] args) {
        int endNum = 10;

        beginEnd(endNum);
    }

    static void beginEnd(int endNum) {
        List<Integer> newList = new ArrayList<Integer>();

        for (int i = 1; i < endNum; i++){
            newList.add(i);
            System.out.println(newList);
        }
        System.out.println(newList.get(10));

    }
}