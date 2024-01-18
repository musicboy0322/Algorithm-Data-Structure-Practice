package org.kyle.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // ASC
        int[] targetOne = {10, 2, 53, 21, 4, 49};
        for(int i = 0; i < targetOne.length; i++) {
            int min = i;
            for(int j = i + 1; j < targetOne.length; j++) {
                if(targetOne[min] > targetOne[j]) {
                    min = j;
                }
            }
            int temp = targetOne[min];
            targetOne[min] = targetOne[i];
            targetOne[i] = temp;
        }
        System.out.println(Arrays.toString(targetOne));
        // DESC
        int[] targetTwo = {10, 2, 53, 21, 4, 49};
        for(int i = 0; i < targetTwo.length; i++) {
            int max = i;
            for(int j = i + 1; j < targetTwo.length; j++){
                if(targetTwo[max] < targetTwo[j]) {
                    max = j;
                }
            }
            int temp = targetTwo[max];
            targetTwo[max] = targetTwo[i];
            targetTwo[i] = temp;
        }
        System.out.println(Arrays.toString(targetTwo));
    }
}