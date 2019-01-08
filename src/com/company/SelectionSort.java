package com.company;
import

public class SelectionSort {
    public static void selectionSort(int[] arr)
    {
        int min = 0;
        for(int i = 0; i < arr.length; i++)
        {
            //confused on how to get the smallest number in the array
            //switch that number with the number at min
            //min + 1
            SortingUtil.minimum(arr,0);
            SortingUtil.swap(arr,i,min);
        }
    }
}
