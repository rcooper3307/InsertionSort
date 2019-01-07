package com.company;

public class SelectionSort {
    public static void selectionSort(int[] arr)
    {
        int min = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] < arr[min])
            {
                arr[min] = arr[i]
            }
        }
    }
}
