package com.company;

public class SelectionSort {
    public static void selectionSort(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            SortingUtil.swap(arr, i,(SortingUtil.minimum(arr, i)));
        }
    }
}
