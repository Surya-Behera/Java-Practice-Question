package com.practice.java_practice.SortingAlgorithms;

public class Merge_sort {
    public static void main(String[] args) {
        int[] arr = {21, 32, 34, 4, 39, 45};

        // Printing the original array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

        int si = 0;
        int ei = arr.length - 1;

        // Call the Sort function to perform merge sort
        Sort(arr, si, ei);

        // Printing the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Merge Sort function
    private static void Sort(int[] arr, int si, int ei) {
        // Base case: if the start index is greater than or equal to the end index, return
        if (si >= ei) {
            return;
        }

        // Find the middle index
        int mid = (si + ei) / 2;

        // Recursively sort the left half and the right half
        Sort(arr, si, mid);
        Sort(arr, mid + 1, ei);

        // Merge the two halves
        Merge(arr, si, mid, ei);
    }

    // Merge function to merge two sorted halves
    private static void Merge(int[] arr, int si, int mid, int ei) {
        // Temporary array to store merged results
        int[] merged = new int[ei - si + 1];

        int idx1 = si;  // Starting index for the left half
        int idx2 = mid + 1;  // Starting index for the right half
        int x = 0;  // Index for the merged array

        // Merge the two halves
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // If there are remaining elements in the left half, add them
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        // If there are remaining elements in the right half, add them
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        // Copy the merged array back into the original array

        int j = 0;
        for (int i = si; i <= ei; i++) {
            arr[i] = merged[j++];
        }
    }
}
