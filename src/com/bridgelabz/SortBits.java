package com.bridgelabz;
import java.util.*;
public class SortBits {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] sortedArr = sortByBits(arr);
        System.out.println(Arrays.toString(sortedArr)); // prints [0, 1, 2, 4, 8, 3, 5, 6, 7]
    }

    public static int[] sortByBits(int[] arr) {
        Arrays.sort(arr); // sort the array in ascending order first
        Integer[] boxedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Collections.sort(Arrays.asList(boxedArr), (a, b) -> {
            int countA = countBits(a);
            int countB = countBits(b);
            return countA != countB ? countA - countB : a - b; // if the counts are equal, sort by integer value
        });
        // convert the sorted boxed array back to primitive array
        return Arrays.stream(boxedArr).mapToInt(Integer::intValue).toArray();
    }

    public static int countBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }
}

