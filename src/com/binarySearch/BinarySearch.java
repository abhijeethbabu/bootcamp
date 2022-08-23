package com.binarySearch;

import javax.crypto.AEADBadTagException;

public class BinarySearch {

	public static void main (String[] args)  {
		System.out.println(binSearch(new int[] {1, 3, 5, 8}, 3));
		int[] a = {1, 3, 5, 6, 7, 9, 11};
		int[] b = { 99, 65, 43, 21, 12, 5, 2};
		System.out.println(binSearchOrder(a, 6));
		System.out.println(binSearchOrder(b, 5));
	}
	
	static int binSearch (int[] arr, int target) {
		int start  = 0, end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > target) start = mid + 1;
			else if (arr[mid] < target) end = mid - 1;
			else return mid;
		}
		return -1;
	}

	static int binSearchOrder (int[] arr, int target) {
		int start  = 0, end = arr.length - 1;
		int p = arr[start] > arr[end] ? 1 : -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > target) start = mid + p;
			else if (arr[mid] < target) end = mid - p;
			else return mid;
		}
		return -1;
	}
}
