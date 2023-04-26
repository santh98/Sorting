package com.bridgelabz;
import java.util.Arrays;

public class DesSort {
    public class SortByBits {
        public static void main(String[] args) {
            int[] arr = {1024,512,256,128,64,32,16,8,4,2,1};
            int[] sortedArr = sortByBits(arr);
            System.out.println(Arrays.toString(sortedArr)); // prints [1024,512,256,128,64,32,16,8,4,2,1]
        }

        public static int[] sortByBits(int[] arr) {
            Arrays.sort(arr);
            return arr;
        }
    }
}
