package ProblemSolving.DynamicArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<Integer> result = new ArrayList<>();
        List<List<Integer>> array = new ArrayList<List<Integer>>();

        Integer lastAnswer = 0;

        for (int i = 0; i < n; i++) {
            array.add(new ArrayList<>());
        }

        for (List<Integer> query : queries) {
            Integer type = query.get(0);
            Integer index = (query.get(1) ^ lastAnswer) % n;
            Integer value = query.get(2);
            Integer size = array.get(index).size();

            switch (type) {
                case 1:
                    array.get(index).add(value);
                    break;
                case 2:
                    lastAnswer = array.get(index).get(value % size);
                    result.add(lastAnswer);
                    break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 2;
        List<List<Integer>> queries = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();
        List<Integer> innerList2 = new ArrayList<>();
        List<Integer> innerList3 = new ArrayList<>();
        List<Integer> innerList4 = new ArrayList<>();
        List<Integer> innerList5 = new ArrayList<>();

        innerList.add(1);
        innerList.add(0);
        innerList.add(5);
        queries.add(innerList);

        innerList2.add(1);
        innerList2.add(1);
        innerList2.add(7);
        queries.add(innerList2);

        innerList3.add(1);
        innerList3.add(0);
        innerList3.add(3);
        queries.add(innerList3);

        innerList4.add(2);
        innerList4.add(1);
        innerList4.add(0);
        queries.add(innerList4);

        innerList5.add(2);
        innerList5.add(1);
        innerList5.add(1);
        queries.add(innerList5);

        System.out.println(queries);
        System.out.println(dynamicArray(n, queries));
    }
}
