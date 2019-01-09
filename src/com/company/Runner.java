package com.company;

public class Runner {

    public static void main(String[] args) {
	// write your code here
        int[] testArr = SortingUtil.randIntArray(30);
        System.out.print("Before: ");
        for (int num:testArr)
        {
            System.out.print(num + " ");
        }


        System.out.println();
        //Sorting method
        SelectionSort.selectionSort(testArr);
        //Print of the array after the sort
        System.out.print("After: ");
        for (int num:testArr)
        {
            System.out.print(num+" ");
        }

    }
}
