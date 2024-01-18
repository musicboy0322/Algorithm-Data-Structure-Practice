package org.kyle.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // ASC
        int[] targetOne = {10, 2, 53, 21, 4, 49};
        for(int i = targetOne.length; i >= 0; i--) {
            for(int j = 0; j < i - 1; j++) {
                if(targetOne[j] > targetOne[j+1]) {
                    int temp = targetOne[j];
                    targetOne[j] = targetOne[j+1];
                    targetOne[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(targetOne));
        // DESC
        int[] targetTwo = {10, 2, 53, 21, 4, 49};
        for(int i = targetTwo.length; i >= 0; i--) {
            for(int j = 0; j < i - 1; j++) {
                if(targetTwo[j] < targetTwo[j+1]) {
                    int temp = targetTwo[j];
                    targetTwo[j] = targetTwo[j+1];
                    targetTwo[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(targetTwo));
    }
}
