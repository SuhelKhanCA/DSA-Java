package Six6MonthsOfCode.Day12.ObjectSort;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        Student[] arrObj = {new Student(111, "bbb", "london"),
                            new Student(131, "aaaa", "nyc"),
                            new Student(121, "ccc", "Jaipur")};
        System.out.println("----------Unsorted---------");
        for (int i = 0; i < arrObj.length; i++) {
            System.out.println(arrObj[i]);
        }
        Arrays.sort(arrObj, 0, 2, new SortByRoll());
        // Arrays.sort(arrObj);
        System.out.println("\n----------Sorted by roll no------");
        for (int i = 0; i < arrObj.length; i++) {
            System.out.println(arrObj[i]);
        }
    }
}
