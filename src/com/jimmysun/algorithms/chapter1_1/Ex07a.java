package com.jimmysun.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex07a {
	public static void main(String[] args) {
		double t = 9.0;
		while (Math.abs(t - 9.0 / t) > .001) {

			t = (9.0 / t + t) / 2.0;
			System.out.println(t);
		}
		StdOut.printf("%.5f\n", t);
	}
}
