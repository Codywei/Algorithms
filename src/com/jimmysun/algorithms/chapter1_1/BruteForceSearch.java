package com.jimmysun.algorithms.chapter1_1;

public class BruteForceSearch {
	public static int rank(int key, int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[]args){
		int []a={1,2,3,4,5,6,7,8,9};
		int b=rank(6,a);
		System.out.println(b);

	}
}
