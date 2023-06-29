package ch12;

import java.util.ArrayList;

// Ex12_1 참고
public class Practice12_4 {
    public static ArrayList<? extends Product> merge(
            ArrayList<? extends Product> list,
            ArrayList<? extends Product> list2
    ) {
        ArrayList<? extends Product> newList = new ArrayList<>(list);

        newList.addAll(list2);

        return newList;
    }
}
