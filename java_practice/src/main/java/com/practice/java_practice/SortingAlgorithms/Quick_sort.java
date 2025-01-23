package com.practice.java_practice.SortingAlgorithms;


public class Quick_sort {

    public static void main(String[] args) {
        int[] arr = {21, 32, 34, 4, 39, 45};

        // Printing the original array
        System.out.print("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Call the quickSort function to perform quick sort
        quickSort(arr, 0, arr.length - 1);

        // Printing the sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Quick Sort function
    private static void quickSort(int[] arr, int low, int high) {
        // Base case: If the array has only one element or no elements to sort, return
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the two subarrays
            quickSort(arr, low, pivotIndex - 1);  // Left subarray
            quickSort(arr, pivotIndex + 1, high); // Right subarray
        }
    }

    // Partition function: This function selects a pivot and rearranges the array
    private static int partition(int[] arr, int low, int high) {
        // We choose the last element as the pivot (this is one common approach)
        int pivot = arr[high];
        int i = low - 1;  // i will track the smaller element index

        // Rearranging the array so that elements smaller than pivot come to the left
        // and elements larger than pivot come to the right.
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and arr[high] to place the pivot in the correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the pivot index
        return i + 1;
    }
}
