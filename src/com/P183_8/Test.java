package com.P183_8;

import java.util.Random;
import java.util.Scanner;

public class Test {
	int wideth1, wideth2, height1, height2;
	int[] jzj;
	int[][] temp, juzhen1, juzhen2, jzh;
	Random r;

	public static void main(String[] args) {
		new Test();
	}

	public Test() {
		System.out.println("输入矩阵的大小：");
		Scanner reader = new Scanner(System.in);
		wideth1 = reader.nextInt();
		height1 = reader.nextInt();
		wideth2 = reader.nextInt();
		height2 = reader.nextInt();
		reader.close();
		juzhen1 = new int[wideth1][height1];
		juzhen2 = new int[wideth2][height2];

		r = new Random();

		for (int i = 0; i < juzhen1.length; i++) {
			for (int j = 0; j < juzhen1[i].length; j++) {
				juzhen1[i][j] = r.nextInt(10);
				System.out.print(juzhen1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < juzhen2.length; i++) {
			for (int j = 0; j < juzhen2[i].length; j++) {
				juzhen2[i][j] = r.nextInt(11);
				System.out.print(juzhen2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		if (wideth1 != wideth2 | height1 != height2) {
			System.out.println("矩阵无法相加");
		} else {
			jzh = new int[wideth1][height1];
			for (int i = 0; i < juzhen1.length; i++) {
				for (int j = 0; j < juzhen1[i].length; j++) {
					jzh[i][j] = juzhen1[i][j] + juzhen2[i][j];
					System.out.print(jzh[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

		if (height1 != wideth2) {
			System.out.println("矩阵无法相乘");
		} else {
			temp = new int[height1 * wideth2][wideth2];
			for (int i = 0; i < juzhen1.length; i++) {
				for (int j = 0; j < juzhen1[i].length; j++) {
					for (int j2 = 0; j2 < temp[i].length; j2++) {
						temp[i][j2] = juzhen1[i][j] * juzhen2[j][i];
					}
				}
			}
			jzj = new int[height1 * wideth2];
			for (int i = 0; i < temp.length; i++) {
				for (int j = 0; j < temp[i].length; j++) {
					jzj[i] += temp[i][j]; 
					System.out.print(jzj[i] + " ");
				}
				System.out.println();
			}
		}
	}
}
